package compiler

import (
	// Formatting

	"strconv"
	"unicode" // Unicode Utility functions
)

// Token Struct
type Token struct {
	Tok  string
	Dat  string
	Name string
}

// Symbol Struct
type Symbol struct {
	Name string // AKA Etiqueta
	Type string // Tipo
	// For Function Symbols
	NumParams  int      // numParam
	ParamTypes []string // TipoParamXX
	// ParamMode  []string // ModoParamXX @unnecessary @cleanup
	// ? quiza podriamos poner este con el Type ?
	ReturnType string // TipoRetorno
	Param      int    // Param @info No se que es esto
	Despl      int
}

// Token List
const (
	TYPEBOOL    string = "TYPEBOOL"    //0
	LOOPDOW     string = "LOOPDOW"     //1
	DECLFUNC    string = "DECLFUNC"    //2
	CONDIF      string = "CONDIF"      //3
	IOIN        string = "IOIN"        //4
	TYPEINT     string = "TYPEINT"     //5
	IOOUT       string = "IOOUT"       //6
	RET         string = "RET"         //7
	TYPESTR     string = "TYPESTR"     //8
	DECLVAR     string = "DECLVAR"     //9
	LOOPWHL     string = "LOOPWHL"     //10
	VALINT      string = "VALINT"      //11: Regular expression
	SEPSTR      string = "SEPSTR"      //12
	ID          string = "ID"          //13: Regular Expression
	OPDIVASSIGN string = "OPDIVASSIGN" //14
	OPASSIGN    string = "OPASSIGN"    //15
	SEPCOM      string = "SEPCOM"      //16
	SEPSCOM     string = "SEPSCOM"     //17
	SEPLPAR     string = "SEPLPAR"     //18
	SEPRPAR     string = "SEPRPAR"     //19
	SEPLCURL    string = "SEPLCURL"    //20
	SEPRCURL    string = "SEPRCURL"    //21
	OPDIV       string = "OPDIV"       //22
	OPOR        string = "OPOR"        //23
	OPLT        string = "OPLT"        //24
	DELEOF      string = "EOF"         //25: Can't use io.EOF directly, but that's what we should use later on should we need it
	ERROR       string = "ERR"         //27: Extra in case of error
)

// peek
func peek(str string, idx int) byte {
	if idx < len(str)+1 {
		return str[idx]
	}
	return 0
}

func findInSymbolSlice(arr []Symbol, str string) int {
	for i, s := range arr {
		if s.Name == str {
			return i
		}
	}
	return -1
}

// GenerateTokens: receives file contents, returns Token Slice and Symbol Table
func GenerateTokens(data string) ([]Token, [][]Symbol) {

	tokens := make([]Token, 0)
	tables := make([][]Symbol, 1)
	var lastTable int = 0
	var currTable int = 0
	var prevTable int = 0
	var currstr string = ""

	// FLAGS
	var isComment bool = false
	var isLowerScope bool = false
	var isFuncDecl bool = false

	for i := 0; i < len(data); i++ {
		ch := data[i]

		// Check if new Line
		if ch == '\n' {
			tokens = append(tokens, Token{Tok: ERROR, Dat: " ", Name: string(ch)})
		}

		// Comment Check
		if isComment {
			if ch == '*' && peek(data, i+1) == '/' {
				isComment = false // i i+1 i+2
				i++               // *  /  ...
			}
			continue
		}

		switch ch {
		case '=':
			{
				if tokens[len(tokens)-1].Tok == OPDIV {
					tokens = tokens[:len(tokens)-1]
					tokens = append(tokens, Token{Tok: OPDIVASSIGN, Dat: " ", Name: string(ch)})
				} else {
					tokens = append(tokens, Token{Tok: OPASSIGN, Dat: " ", Name: string(ch)})
				}
			}
			break
		case '/':
			{
				if peek(data, i+1) == '*' {
					isComment = true
				} else {
					tokens = append(tokens, Token{Tok: OPDIV, Dat: " ", Name: string(ch)})
				}
			}
			break
		case ',':
			{
				tokens = append(tokens, Token{Tok: SEPCOM, Dat: " ", Name: string(ch)})
			}
			break
		case ';':
			{
				tokens = append(tokens, Token{Tok: SEPSCOM, Dat: " ", Name: string(ch)})
			}
			break
		case '(':
			{
				tokens = append(tokens, Token{Tok: SEPLPAR, Dat: " ", Name: string(ch)})
				if isFuncDecl {
					lastTable++
					if lastTable >= len(tables) {
						var newTable []Symbol = make([]Symbol, 0)
						tables = append(tables, newTable)
					}
					// fmt.Println(tables[lastTable])
					prevTable = currTable
					currTable = lastTable
				}
			}
			break
		case ')':
			{
				tokens = append(tokens, Token{Tok: SEPRPAR, Dat: " ", Name: string(ch)})
				currTable = prevTable
				isFuncDecl = false
			}
			break
		case '{':
			{
				tokens = append(tokens, Token{Tok: SEPLCURL, Dat: " ", Name: string(ch)})
				isLowerScope = true
			}
			break
		case '}':
			{
				tokens = append(tokens, Token{Tok: SEPRCURL, Dat: " ", Name: string(ch)})
				isLowerScope = false
			}
			break
		case '<':
			{
				tokens = append(tokens, Token{Tok: OPLT, Dat: " ", Name: string(ch)})
			}
			break
		case '|':
			{
				newToken := Token{Tok: ERROR, Dat: " "}
				if peek(data, i+1) == '|' {
					newToken.Tok = OPOR
					i++
				}
				tokens = append(tokens, newToken)
			}
			break
		}

		runesita := rune(ch)

		// STRING
		if ch == '"' {
			for cont := true; cont; cont = (ch != '"' && i+1 < len(data)) {
				currstr += string(ch)
				// fmt.Println(string(ch))
				i++
				ch = data[i]
			}
			currstr += string(ch)
			tokens = append(tokens, Token{Tok: SEPSTR, Dat: currstr, Name: currstr})
			currstr = "" // Reset
			// i++
		} else if unicode.IsDigit(runesita) { // INT
			for unicode.IsDigit(runesita) {
				currstr += string(ch)
				i++
				if i < len(data) { // -_-
					ch = data[i]
					runesita = rune(ch)
				}
			}

			tokens = append(tokens, Token{Tok: VALINT, Dat: currstr, Name: currstr})
			i--          // @Ghetto Fix, not rly a fix -_-
			currstr = "" // Reset
		} else if unicode.IsLetter(runesita) || ch == '_' { // ID or RESERVED
			// ^[a-zA-Z_$][a-zA-Z_$0-9]*$
			for cond := true; cond; cond = (unicode.IsLetter(runesita) || unicode.IsDigit(runesita) || ch == '_') {
				currstr += string(ch)
				i++
				if i < len(data) {
					// fmt.Println("if") // @alejax wtf es esto?? xDDD
					// @kevinalberto no me acuerdo realmente o.o
					ch = data[i]
					runesita = rune(ch)
				} else {
					break
				}
			}

			i-- // @Ghetto Fix, not rly a fix -_-

			switch currstr {
			case "var":
				{
					tokens = append(tokens, Token{Tok: DECLVAR, Dat: " ", Name: currstr})
				}
				break
			case "function":
				{
					tokens = append(tokens, Token{Tok: DECLFUNC, Dat: " ", Name: currstr})
					isFuncDecl = true
				}
				break
			case "boolean":
				{
					tokens = append(tokens, Token{Tok: TYPEBOOL, Dat: " ", Name: currstr})
				}
				break
			case "int":
				{
					tokens = append(tokens, Token{Tok: TYPEINT, Dat: " ", Name: currstr})
				}
				break
			case "string":
				{
					tokens = append(tokens, Token{Tok: TYPESTR, Dat: " ", Name: currstr})
				}
				break
			case "if":
				{
					tokens = append(tokens, Token{Tok: CONDIF, Dat: " ", Name: currstr})
				}
				break
			case "do":
				{
					tokens = append(tokens, Token{Tok: LOOPDOW, Dat: " ", Name: currstr})
				}
				break
			case "while":
				{
					tokens = append(tokens, Token{Tok: LOOPWHL, Dat: " ", Name: currstr})
				}
				break
			case "return":
				{
					tokens = append(tokens, Token{Tok: RET, Dat: " ", Name: currstr})
				}
				break
			case "input":
				{
					tokens = append(tokens, Token{Tok: IOIN, Dat: " ", Name: currstr})
				}
				break
			case "print":
				{
					tokens = append(tokens, Token{Tok: IOOUT, Dat: " ", Name: currstr})
				}
				break
			default:
				{
					// If it is between {} and it's not a declaration, we ignore
					idx := findInSymbolSlice(tables[currTable], currstr)
					if idx == -1 && !isLowerScope && (tokens[len(tokens)-1].Tok == DECLFUNC || tokens[len(tokens)-2].Tok == DECLFUNC) {
						idx = len(tables[currTable])
						sym := Symbol{Name: currstr, Type: "Function", NumParams: 0, Param: 0, ParamTypes: make([]string, 0), ReturnType: "TYPEVOID"}
						if tokens[len(tokens)-2].Tok == DECLFUNC {
							sym.ReturnType = tokens[len(tokens)-1].Tok
						}
						tables[currTable] = append(tables[currTable], sym)
					} else if idx == -1 && !isLowerScope && ((tokens[len(tokens)-1].Tok == TYPEBOOL) || (tokens[len(tokens)-1].Tok == TYPESTR) || (tokens[len(tokens)-1].Tok == TYPEINT)) {
						idx = len(tables[currTable])
						sym := Symbol{Name: currstr, Type: tokens[len(tokens)-1].Tok, NumParams: 0, Param: 0, ParamTypes: make([]string, 0), ReturnType: ""}
						tables[currTable] = append(tables[currTable], sym)
					} else if idx == -1 && !isLowerScope {
						// errmsg := fmt.Sprintf("No existe el id: \"%s\"", currstr)
						// ErrorSintaxis(errmsg)
						// os.Exit(1)
					}
					data := ""
					if idx != -1 && !isLowerScope {
						data = strconv.Itoa(idx)
					}
					tokens = append(tokens, Token{Tok: ID, Dat: data, Name: currstr})
				}
			}

			currstr = "" // Reset
		}

	} // END OF MAIN LOOP

	tokens = append(tokens, Token{Tok: DELEOF, Dat: " ", Name: currstr})
	return tokens, tables
}
