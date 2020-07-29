package main

import (
	"fmt"
	"io/ioutil"
	"os"
)

func check(msg string, err error) {
	if err != nil {
		fmt.Println(msg)
		panic(err)
	}
}

func main() {
	var tokensprpath string = os.Args[1]
	var tokenspath string = os.Args[2]
	tokenspr, err := ioutil.ReadFile(tokensprpath)
	tokens, err2 := ioutil.ReadFile(tokenspath)
	check("No se ha podidio leer el fichero1", err)
	check("No se ha podidio leer el fichero2", err2)
	verify(string(tokenspr), string(tokens))
}

func verify(tokenspr string, tokens string) int {
	var line int = 0
	currstr := ""
	/*if len(tokenspr) != len(tokens) {
		fmt.Println("Ficheros no coinciden")
		return 1
	}*/
	for i, ch := range tokenspr {
		currstr += string(ch)
		if ch == '\n' {
			line++
		}
		if tokenspr[i] != tokens[i] {
			fmt.Printf("Ficheros no coinciden\nError en linea %d\n", line)
			return 2
		}
	}
	fmt.Println("Ficheros coinciden")
	return 0
}
