package main

import (
	"Cumpiler/compiler" // Lexer/
	"fmt"
	"io/ioutil" // IO Stuff, writeFile and more
	"os"        // Argument Parsing
)

func checkError(msg string, err error) {
	if err != nil {
		fmt.Println(msg)
		panic(err)
	}
}

func main() {
	var test string = os.Args[1] // Obtenemos fichero
	filepath := fmt.Sprintf("tests/Test%s/code.txt", test)
	destpath := fmt.Sprintf("tests/Test%s/tokens.txt", test)
	tablespath := fmt.Sprintf("tests/Test%s/tables.txt", test)
	rulespath := fmt.Sprintf("tests/Test%s/rules.txt", test)
	// var destpath string = os.Args[2]   // Nombre de Fichero destino
	// var tablespath string = os.Args[3] // Nombre de Fichero destino de Tabla
	// var rulespath string = os.Args[4]  // Nombre de fichero destino de las reglas
	f, err := ioutil.ReadFile(filepath)
	// Comprobamos si se pudo abrir el archivo
	checkError("ERROR while reading file", err)
	tokens, symtable := compiler.GenerateTokens(string(f))
	fmt.Println("Tokens Generados")
	// ENTREGA 1: Write token list to file
	// @TODO: Symbol Table
	res := ""
	//fmt.Println("Tokens Obtenidos:\n=============================================================")
	for _, tik := range tokens {
		//fmt.Println(tik.Tok, tik.Dat)
		if tik.Tok == "ERR" { // por alguna puta razon no funciona poner ERROR
			continue
		}
		res += fmt.Sprintf("<%s,%s>\n", tik.Tok, tik.Dat)
	}

	// ENTREGA 2: Parser
	tokens, symtable, result := compiler.RunParser(tokens, symtable)

	//fmt.Println("=============================================================")
	symbols := ""
	//symbolsfmtLexico := ""
	//fmt.Println("Tabla de Simbolos:\n##########################################################")
	for idx, tabl := range symtable {
		symbols += fmt.Sprintf("CONTENIDO DE LA TABLA #%d: \n----------------\n", idx+1)
		//symbolsLexico += fmt.Sprintf("CONTENIDO DE LA TABLA #%d: \n", idx+1)
		for idx2, sym := range tabl {
			symbols += fmt.Sprintf("* LEXEMA: '%s'\n* TIPO: '%s'\n* POS: '%d'\n* DESPLZ: '%d'\n* NUMPARAMS: '%d'\n* PARAMTYPES: '%v'\n-------------------------\n", sym.Name, sym.Type, idx2+1, sym.Despl, sym.NumParams, sym.ParamTypes)
			//symbolsLexico += fmt.Sprintf("* LEXEMA: '%s'\n------------------------------\n", sym.Name)
		}
	}
	//fmt.Println("################################################################")

	// Escritura de Tokens
	err = ioutil.WriteFile(destpath, []byte(res), 0644)
	checkError("ERROR while writing file", err)

	// Escritura de la Tabla de Simbolos (Segun Lexico)
	err = ioutil.WriteFile(tablespath, []byte(symbols), 0644)
	checkError("ERROR while writing file", err)

	// Escritura de las reglas del sintactico
	err = ioutil.WriteFile(rulespath, []byte(result), 0777)
	checkError("ERROR while writing file", err)

	// DEBUG: Print de las cosas a consola para que sean legibles
	//fmt.Println(res)           // Tokens Obtenidos
	//fmt.Println(symbolsLexico) // Tabla de Simbolos Segun Lexico
	//fmt.Println(symbols)       // Tabla de Simbolos COmpleta
}
