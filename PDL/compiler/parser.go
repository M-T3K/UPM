package compiler

/**
* Propongo escribir las reglas con formato en un buffer y al encontrar EOF, pasarlo a un archivo de texto
 */

import (
	"fmt"
	"os"
)

// Flags (quiza hay uno que nos podriamos ahorrar (˵ ͡° ͜ʖ ͡°˵) )
var flagFunc int = 0
var flagTab int = 0
var flagAux int = 0
var flagDecl int = 0
var params int = 0
var line int = 1 // starts at L1
var callFunc int = 0
var flagRet int = 0
var idFunc string = ""
var opTypes []string = make([]string, 0)
var typeParam []string = make([]string, 0)
var typeParamCall []string = make([]string, 0)

// Tokens Variable Global conteniendo todos los Tokens
var Tokens []Token

// SymbolTable Variable Global conteniendo una matriz de simbolos
var SymbolTable [][]Symbol
var result string = "Descendente"

// CurrentToken stores the current index in the Token List
var CurrentToken int

// RunParser Initialize and run Parser
func RunParser(tokens []Token, symtable [][]Symbol) ([]Token, [][]Symbol, string) {
	CurrentToken = 0       // Init to 0
	Tokens = tokens        // List of Tokens
	SymbolTable = symtable // Symbol Table
	P()                    // call Subroutine
	result += "\n"
	fmt.Printf("Procesado completo")
	return Tokens, SymbolTable, result
}

// @TODO: redo this function
// addToSymbolTable: añade a la tabla de simbolos en el indice especificado el simbolo
// 					 devolvera el indice de ese simbolo. Si el simbolo ya esta en la
// 					 tabla, devolvera la posicion de ese simbolo. Sino, devolvera la
// 					 la nueva posicion del simbolo.
func addToSymbolTable() int {
	exist := false
	var posTS int
	var sym Symbol
	sym.Name = Tokens[CurrentToken].Name
	numTabla := flagTab

	for true {
		for idx, s := range SymbolTable[numTabla] {
			if s.Name == sym.Name {
				posTS = idx
				exist = true
				return posTS
			}
		}

		if exist == false && flagFunc == 1 && numTabla != 0 {
			numTabla = 0
		} else {
			break
		}
	}

	if exist == false && flagFunc == 1 && flagDecl == 1 {
		SymbolTable[flagTab] = append(SymbolTable[flagTab], sym)
		posTS = len(SymbolTable[flagTab]) - 1
	} else if exist == false && (flagFunc == 0 || flagDecl == 0) {
		msg := fmt.Sprintf("No existe el id \"%s\"", Tokens[CurrentToken].Name)
		ErrorSintaxis(msg)
	} else if exist == true && callFunc == 1 {

	}

	return posTS
}

//Busca el tipo del id pasado como parametro, y lo retorna
func searchType(id string) string {
	for i := 0; i < len(SymbolTable); i++ {
		for j := 0; j < len(SymbolTable[i]); j++ {
			if SymbolTable[i][j].Name == id {
				return SymbolTable[i][j].Type
			}
		}
	}
	return "ERRORRR"
}

//Compara que todos los elementos de la operacion son del mismo tipo,
//y sino da error y se para la ejecucion del programa
func compareTypes(firstType string) {
	for i := 2; i < len(opTypes); i++ {
		if !(opTypes[i] == firstType || (firstType == TYPEINT && (opTypes[i] == VALINT)) || (firstType == TYPESTR && (opTypes[i] == SEPSTR)) || firstType == TYPEBOOL && (opTypes[2] == opTypes[i])) {
			ErrorSintaxis("Error en los tipos")
		}
	}
	opTypes = make([]string, 0)
}

//Busca los tipos de los parametros de idCall(id de una funcion) y los
//compara con los tipos de los parametros de la llamada a la funcion,
//y si no coinciden da error y se para la ejecucion del programa
func compareTypesCall(idCall string) {
	var aux []string
	for i := 0; i < len(SymbolTable); i++ {
		for j := 0; j < len(SymbolTable[i]); j++ {
			if SymbolTable[i][j].Name == idCall {
				aux = SymbolTable[i][j].ParamTypes
				break
			}
		}
	}
	for i := 0; i < len(typeParamCall); i++ {
		if typeParamCall[i] != aux[i] {
			ErrorSintaxis("Error en los tipos de los parametros")
		}
	}
}

func comp(tokenSt string) int {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	var posTS int

	if token == ID {
		posTS = addToSymbolTable()
	}

	if token == tokenSt {
		CurrentToken++
		for Tokens[CurrentToken].Tok == ERROR {
			line++
			CurrentToken++
		}
	} else {
		msg := fmt.Sprintf("se esperaba '%s'", tokenSt)
		ErrorSintaxis(msg)
	}

	return posTS
}

func ErrorSintaxis(msg string) {
	fmt.Printf("ERROR en L%d: %s\n", line, msg)
	os.Exit(1)
}

func setType(tipo string, posTS int) {
	SymbolTable[flagTab][posTS].Type = tipo
	SymbolTable[flagTab][posTS].Despl = posTS
}

func setParam(tipo string, posTS int) {
	SymbolTable[0][posTS].NumParams = params
}

func setTypeParam(tipo string, posTS int) {
	SymbolTable[0][posTS].ParamTypes = typeParam
}

//P starting parsing procedure
func P() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	for token == ERROR {
		line++
		CurrentToken++
		token = Tokens[CurrentToken].Tok
	}
	if token == "EOF" {
		result += " 4"
		// Termina
	} else if token == "DECLFUNC" {
		result += " 2"
		F()
		P()
	} else if token == "ID" || token == "CONDIF" || token == "IOIN" || token == "IOOUT" || token == "RET" {
		result += " 3"
		S()
		P()
	} else if token == "DECLVAR" {
		result += " 1"
		D()
		P()
	} else {
		ErrorSintaxis("")
	}
}

// F procedure that deals with functions
func F() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "DECLFUNC" {
		flagDecl = 1
		result += " 9"
		comp("DECLFUNC")
		FTipo := J()
		idFunc = Tokens[CurrentToken].Name
		posTS := comp("ID")
		flagDecl = 0
		setType(FTipo, posTS)
		flagFunc = 1
		flagTab = flagAux + 1
		flagAux = flagTab
		comp("SEPLPAR")
		params = 1
		A()
		setTypeParam(FTipo, posTS)
		setParam(FTipo, posTS)
		typeParam = make([]string, 0)
		params = 0
		comp("SEPRPAR")
		comp("SEPLCURL")
		C()
		if flagRet == 0 && searchType(idFunc) != "" {
			ErrorSintaxis("falta el return de la funcion")
		}
		comp("SEPRCURL")
		// params = -1
		flagRet = 0
		idFunc = ""
		flagFunc = 0
		flagTab = 0
	} else {
		ErrorSintaxis("")
	}
}

// J Procedure that gives type to a function
func J() string {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	var FTipo string
	if token == "TYPEBOOL" || token == "TYPEINT" || token == "TYPESTR" {
		result += " 10"
		FTipo = T()
	} else if token == "ID" {
		//FTipo = "VOID"
		result += " 11"
	} else {
		ErrorSintaxis("")
	}

	return FTipo
}

// A procedure that gives type to function arguments
func A() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "TYPEBOOL" || token == "TYPEINT" || token == "TYPESTR" {
		result += " 13"
		ATipo := T()
		typeParam = append(typeParam, ATipo)
		flagDecl = 1
		posTS := comp("ID")
		flagDecl = 0
		setType(ATipo, posTS)
		AI()
	} else if token == "SEPRPAR" {
		result += " 12"
	} else {
		ErrorSintaxis("")
	}
}

// C Procedure that deals with lower scopes (everything between {...})
func C() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "DECLVAR" {
		result += " 16"
		D()
		C()
	} else if token == "ID" || token == "CONDIF" || token == "IOIN" || token == "IOOUT" || token == "RET" {
		result += " 17"
		S()
		C()
	} else if token == "SEPRCURL" {
		result += " 18"
	} else {
		ErrorSintaxis("")
	}
}

// S Procedure: arithmeticological operations, if and return statements, and IO
func S() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "ID" {
		result += " 19"
		E()
		comp("SEPSCOM")
	} else if token == "CONDIF" {
		result += " 20"
		comp("CONDIF")
		comp("SEPLPAR")
		E()
		comp("SEPRPAR")
		B()
	} else if token == "IOIN" {
		result += " 22"
		comp("IOIN")
		comp("SEPLPAR")
		E()
		comp("SEPRPAR")
		comp("SEPSCOM")
	} else if token == "IOOUT" {
		result += " 23"
		comp("IOOUT")
		comp("SEPLPAR")
		E()
		comp("SEPRPAR")
		comp("SEPSCOM")
	} else if token == "RET" {
		result += " 24"
		comp("RET")
		if Tokens[CurrentToken].Tok != SEPSCOM && flagFunc == 0 {
			ErrorSintaxis("")
		} else if flagFunc == 1 {
			flagRet = 1
		}
		E()
		comp("SEPSCOM")
	} else {
		ErrorSintaxis("")
	}
}

// D proc: Variable Declaration
func D() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "DECLVAR" {
		result += " 5"
		comp("DECLVAR")
		DTipo := T()
		flagDecl = 1
		posTS := comp("ID")
		flagDecl = 0
		setType(DTipo, posTS)
		comp("SEPSCOM")
	} else {
		ErrorSintaxis("")
	}
}

// T proc: Handles static Typing
func T() string {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	TTipo := token
	if token == "TYPEBOOL" {
		result += " 8"
		comp("TYPEBOOL")
	} else if token == "TYPESTR" {
		result += " 7"
		comp("TYPESTR")
	} else if token == "TYPEINT" {
		result += " 6"
		comp("TYPEINT")
	} else {
		ErrorSintaxis("")
	}

	return TTipo
}

// AI proc: additional function arguments after the first argument
func AI() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "SEPCOM" {
		params++
		result += " 15"
		comp("SEPCOM")
		AITipo := T()
		typeParam = append(typeParam, AITipo)
		flagDecl = 1
		posTS := comp("ID")
		flagDecl = 0
		setType(AITipo, posTS)
		AI()
	} else if token == "SEPRPAR" {
		result += " 14"
	} else {
		ErrorSintaxis("")
	}
}

// B proc: IF statement {}
func B() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "SEPLCURL" {
		result += " 21"
		comp("SEPLCURL")
		C()
		comp("SEPRCURL")
	} else {
		ErrorSintaxis("")
	}
}

// L proc: function parameters
func L(idCall string) {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "ID" {
		result += " 26"
		callFunc = 1
		tokName := Tokens[CurrentToken].Name
		comp("ID")
		typeParamCall = append(typeParamCall, searchType(tokName))
		LI()
		compareTypesCall(idCall)
		typeParamCall = make([]string, 0)
		callFunc = 0
	} else if token == "SEPRPAR" {
		result += " 25"
	} else {
		ErrorSintaxis("")
	}
}

// LI proc: additional parameters after the first one
func LI() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "SEPCOM" {
		result += " 28"
		comp("SEPCOM")
		tokName := Tokens[CurrentToken].Name
		comp("ID")
		typeParamCall = append(typeParamCall, searchType(tokName))
		LI()
	} else if token == "SEPRPAR" {
		result += " 27"
	} else {
		ErrorSintaxis("")
	}
}

// SC proc: Do While
func SC() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "LOOPDOW" {
		result += " 30"
		comp("LOOPDOW")
		comp("SEPLCURL")
		C()
		comp("SEPRCURL")
		W()
	} else {
		ErrorSintaxis("")
	}
}

// W proc: While loop
func W() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "LOOPWHL" {
		result += " 31"
		comp("LOOPWHL")
		comp("SEPLPAR")
		E()
		comp("SEPRPAR")
		comp("SEPSCOM")
	} else {
		ErrorSintaxis("")
	}
}

// E proc:Arithmeticological operations and gay shit
func E() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "SEPLPAR" || token == "SEPSTR" || token == "VALINT" || token == "ID" {
		result += " 32"
		if token == ID {
			opTypes = append(opTypes, searchType(Tokens[CurrentToken].Name))
		} else if token != SEPLPAR {
			opTypes = append(opTypes, token)
		}
		Z()
		EI()
		compareTypes(opTypes[0])
	} else if token == "SEPRPAR" || token == "SEPSCOM" {
		result += " 29"
	} else {
		ErrorSintaxis("")
	}
}

// EI proc: More operational gayness
func EI() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "OPOR" {
		result += " 34"
		comp("OPOR")
		Z()
		EI()
	} else if token == "SEPRPAR" || token == "SEPSCOM" {
		result += " 33"
	} else {
		ErrorSintaxis("")
	}
}

// Z proc: Less than
func Z() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "SEPLPAR" || token == "SEPSTR" || token == "VALINT" || token == "ID" {
		result += " 35"

		U()
		ZI()
	} else {
		ErrorSintaxis("")
	}
}

// ZI proc: Less than gayness
func ZI() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "OPLT" {
		result += " 37"
		comp("OPLT")
		U()
		ZI()
	} else if token == "SEPRPAR" || token == "SEPSCOM" || token == "OPOR" {
		result += " 36"
	} else {
		ErrorSintaxis("")
	}
}

// U proc: Div
func U() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "SEPLPAR" || token == "SEPSTR" || token == "VALINT" || token == "ID" {
		result += " 38"

		O()
		UI()
	} else {
		ErrorSintaxis("")
	}
}

// UI proc: more DIV gayness
func UI() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "OPDIV" {
		result += " 40"
		comp("OPDIV")
		O()
		UI()
	} else if token == "SEPRPAR" || token == "SEPSCOM" || token == "OPLT" || token == "OPOR" {
		result += " 39"
	} else {
		ErrorSintaxis("")
	}
}

// O proc: DIVASSIGN
func O() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "SEPLPAR" || token == "SEPSTR" || token == "VALINT" || token == "ID" {
		result += " 41"

		M()
		OI()
	} else {
		ErrorSintaxis("")
	}
}

// OI proc: more DIVASSIGN gayness
func OI() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "OPDIVASSIGN" {
		result += " 43"
		comp("OPDIVASSIGN")
		M()
		OI()
	} else if token == "SEPRPAR" || token == "OPDIV" || token == "SEPSCOM" || token == "OPLT" || token == "OPOR" {
		result += " 42"
	} else {
		ErrorSintaxis("")
	}
}

// M proc: OPASSIGN
func M() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "SEPLPAR" || token == "SEPSTR" || token == "VALINT" || token == "ID" {
		result += " 44"

		V()
		MI()
	} else {
		ErrorSintaxis("")
	}
}

// MI proc: more OPASSIGN gayness
func MI() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "OPASSIGN" {
		result += " 46"
		comp("OPASSIGN")
		V()
		MI()
	} else if token == "SEPRPAR" || token == "OPDIV" || token == "OPDIVASSIGN" || token == "SEPSCOM" || token == "OPLT" || token == "OPOR" {
		result += " 45"
	} else {
		ErrorSintaxis("")
	}
}

// V proc: magical shit
func V() {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	idCall := Tokens[CurrentToken].Name
	if token == "ID" {
		result += " 47"
		opTypes = append(opTypes, searchType(idCall))
		comp("ID")
		VI(idCall)
	} else if token == "VALINT" {
		result += " 48"
		opTypes = append(opTypes, token)
		comp("VALINT")
	} else if token == "SEPSTR" {
		result += " 49"
		opTypes = append(opTypes, token)
		comp("SEPSTR")
	} else if token == "SEPLPAR" {
		result += " 50"
		comp("SEPLPAR")
		E()
		comp("SEPRPAR")
	} else {
		ErrorSintaxis("")
	}
}

// VI proc: moar magical shit
func VI(idCall string) {
	token := Tokens[CurrentToken].Tok // @info: Change to Token data type if necessary
	if token == "SEPLPAR" {
		result += " 51"
		comp("SEPLPAR")
		L(idCall)
		comp("SEPRPAR")
	} else if token == "SEPRPAR" || token == "OPASSIGN" || token == "OPDIV" || token == "OPDIVASSIGN" || token == "SEPSCOM" || token == "OPLT" || token == "OPOR" {
		result += " 52"
	} else {
		ErrorSintaxis("")
	}
}
