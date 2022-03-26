/* 
     Segunda Practica de Programacion Declarativa
                      ISO PROLOG
  |-AUTORES----------------------------------------|
  | AUTOR1                                         |
  | AUTOR2                                         |
  |________________________________________________|

*/

% Declaraciones Necesarias

:- module(_,_,[assertions]). % Necesario para poder importar los hechos con nombres y predicados

alumno_prode('APEL','APEL','NAME','MAT').
alumno_prode('APEL','APEL','NAME','MAT').

:- doc(title, "Practica 2 - ISO Prolog").
:- doc(author, "FULLNAME").
:- doc(author, "FULLNAME").

:- use_module(library(lists)). % https://ciao-lang.org/legacy/files/ciao/ciao_html/ciao_48.html
:- use_module(library(iso_misc)).

:- doc(module," Esta practica consiste en poder generar automaticamente una lista de instrucciones que provoque que la maquina transite desde un estado inicial conocido hacia un estado final determinado. Puede ser que alguno de estos estados tenga contenido indeterminado. Esto se representara mediante el simbolo * (comodin).

@subsection{Predicados pedidos en la practica}

@begin{verbatim}
:- pred eliminar_comodines(Registros, RegistrosSinComodines, ListaSimbolos)
#``Comprueba que una estructura es de tipo reg/n que resulta de sustituir los comodines que aparecen en Registros por variables. ListaSimbolos es una lista que contiene todos los simbolos utilizados en Registros, permitiendo redundancias.''.
@end{verbatim}

@begin{verbatim}
:- pred ejecutar_instruccion(EstadoActual, Instruccion, EstadoSiguiente)
#``Hace la transicion entre estados: EstadoActual y EstadoSiguiente, mediante una ejecucion de instruccion.''.
@end{verbatim}

@begin{verbatim}
:- pred generador_de_codigo(EstadoInicial, EstadoFinal, ListaDeInstrucciones)
#``Comprueba si ListaDeInstrucciones unifica con una lista de instrucciones de la CPU, que desde EstadoInicial permite transitar a EstadoFinal.''.
@end{verbatim}


@subsection{Predicados auxiliares}

@begin{verbatim}
:- pred same_len(L,L2)
#``Comprueba si L y L2 tienen la misma longitud.''.
@end{verbatim}

@begin{verbatim}
:- pred check_registers(Registers)
#``Comprueba que Registers sea una estructura de verdad.''.
@end{verbatim}

@begin{verbatim}
:- pred replace(E1,L1,E2,L2)
#``Reemplaza un elemento E1 de la lista L1 por un elemento E2 en la lista L2.''.
@end{verbatim}

@begin{verbatim}
:- pred eliminar_comodines_aux(Regs,RegsSinCom,S)
#``Descarta los comodines.''.
@end{verbatim}

@begin{verbatim}
:- pred do_swap(EstadoInicial,EstadoFinal,Regi,Regj)
#``Comprueba que el swap sea el adecuado.''.
@end{verbatim}

@begin{verbatim}
:- pred do_move(EstadoInicial,EstadoFinal,Regi)
#``Comprueba que el move sea el adecuado.''.
@end{verbatim}


").

% =============================================
% Auxiliares                                  |
% =============================================

:- pred same_len(L,L2)
   #"Este predicado comprueba que @var{L} y @var{L2} tengan la misma longitud. @includedef{same_len/2}".
same_len(L,L2) :- 
    length(L, N),
    length(L2,N). % No necesitamos mas cosas porque N debe unificar
    % length(L2,N2),
    % N =:= N2.    

:- pred check_registers(Registers)
   #"Este predicado comprueba que @var{Registers} sea una estructura de verdad. @includedef{check_registers/1}".
check_registers(Registers) :-
    compound(Registers), % Comprobamos que sea una estructura de verdad, creo que no es necesario pero es buena practica
    functor(Registers, regs, A), % Comprobamos que siga una estructura Regs
    A > 0. % Comprobamos que tenga al menos un argumento

:- pred replace(E1,L1,E2,L2)
   #"Este predicado reemplaza un elemento @var{E1} de @var{L1} por @var{E2} en @var{L2} . @includedef{replace/4}".
% Replace
% Reemplaza por Sub un elemento en el indice i de una lista Ls, y almacena el resultado en Res
replace(E1,L1,E2,L2) :-
    same_len(L1,L2),
    append(BeforeElement,[E1|AfterElement],L1),
    append(BeforeElement,[E2|AfterElement],L2).


% =============================================
% Ejercicio I - Eliminar Comodines            |
% =============================================

:- pred eliminar_comodines(Registros,RegistrosSinComodines,ListaSimbolos)
    #"@var{ListaSimbolos} es la lista de @var{Registros}. @var{Registros} es el conjunto de registros. @var{RegistrosSinComodines} es la sustitución de @var{Registros} por variables. @includedef{eliminar_comodines/3}".
eliminar_comodines_aux([],[],[]). % Caso Base

% Auxiliar de Listas 
:- pred eliminar_comodines_aux(Regs,RegsSinCom,S)
    #"@var{Regs} es la lista de registros. @var{RegSinCOm} es la lista de registros sin comodines. @var{S} es el resultado de comprobar los comodines y descartarlos. @includedef{eliminar_comodines_aux/3}".
eliminar_comodines_aux([X | Regs], [R | RegsSinCom], S) :-
        (
            X == * -> eliminar_comodines_aux(Regs, RegsSinCom, S); % Si es comodin lo descartamos, llamamos con el resto de datos
            % Else:
            R = X, 
            S = [X | Sim],
            eliminar_comodines_aux(Regs, RegsSinCom, Sim)
        ).

% Caso Principal: Usamos auxiliar sin estructura para calcular todo
eliminar_comodines(Registros,RegistrosSinComodines,ListaSimbolos) :-
    check_registers(Registros), % Comprobamos que sea valido
    Registros =.. [H | R], % Pillamos los valores de los registros y no la estructura
    eliminar_comodines_aux(R, L, ListaSimbolos),
    RegistrosSinComodines =.. [H | L].

% =============================================
% Ejercicio II - Ejecutar Instruccion         |
% =============================================

%Move
% Sigue forma Anular
% i < n: ri => r(i+1)
% i = n: ri => r(1)
% Este codigo abusa del motor de inferencia de Ciao
% Basicamente, si la ecuacion no tiene solucion
% Lo que hara sera volver al ultimo punto donde se 
% podria haber generado un fallo logico

:- pred do_move(EstadoInicial, EstadoFinal, Regi)
	#"Comprueba que se haya hecho el move adecuado. @var{EstadoInicial} es el estado inicial. @var{EstadoFinal} es el estado final. @var{Regi} es un registro auxiliar. @includedef{do_move/3}".

do_move(EstadoInicial, EstadoFinal, Regi) :-
    append(Front, [X|Back],EstadoInicial), % Descomponemos el Estado Inicial en partes
    length(Back, Len), % Calculamos la Longitud 
    (
        Len =:= 0 -> % Si Len = 0 => Es move(n) (debemos intercambiar con el primero, modo anular)
            EstadoInicial = [_ | Rest],
            EstadoFinal = [X | Rest];
        % Else es cualquier otro move
            Back = [_ | Back1],
            append(Front, [X,X|Back1], EstadoFinal)
        ),
        % Debido a que el motor de inferencia no conoce la solucion exacta del EF 
        % (En casos en el que se llame do_move(EI, F, N) donde F es indeterminado)
        % Nos podria dar una solucion invalida.
        % Por lo tanto debemos comprobar que haya realizado el movimiento adecuado
        % Eso se puede hacer mediante la longitud de Front (que deberia ser un
        % subconjunto que llega hasta Regi - 1 si lo ha hecho bien)
        length(Front, I),
        % Si esto no se cumple, dara un error, y el motor de inferencia
        % buscara otra solucion mediante otra iteracion (aumentando Front)
        Regi is I + 1.

% Swap
% i < j, intercambiar registros
% 
% 

:- pred do_swap(EstadoInicial, EstadoFinal, Regi, Regj)
	#"Comprueba que se haya hecho el swap adecuado. @var{EstadoInicial} es el estado inicial. @var{EstadoFinal} es el estado final. @var{Regi} y @var{Regj} son registros auxiliares. @includedef{do_swap/4}".
	do_swap(EstadoInicial, EstadoFinal, Regi, Regj) :- 
    % Comprobaciones necesarias
    Regi < Regj, % RegI < RegJ
    length(EstadoInicial, L), % Sacamos la longitud del Estado Inicial
    Regj =< L, % Comprobamos que J < longitud, t.q I < J <= L
    same_len(EstadoInicial, EstadoFinal), % Forzamos la misma longitud
    append(PrevI,[HI|TI],EstadoInicial),
    append(PrevI,[HJ|TI],Temp),
    append(PrevJ,[HJ|TJ],Temp),
    append(PrevJ,[HI|TJ],EstadoFinal),
    % Calculamos la longitud de los conjuntos obtenidos
    % Esto actuara como comprobador de que se haya hecho
    % el swap adecuado. Si no, el motor saltara al append 
    % apropiado, segun falle J o I
    length(PrevI,LenI),
    length(PrevJ,LenJ),
    % No entiendo del todo porque hay que hacer esto
    % pero si no nos aseguramos de que esto es asi, 
    % move empezaria a contar con 0 en vez de 1
    Regi is LenI + 1,
    Regj is LenJ + 1.

    

  :- pred ejecutar_instruccion(EstadoActual, Instruccion, EstadoSiguiente)
    #"@var{EstadoActual} es el estado actual. @var{EstadoSiguiente} es el estado siguiente. @var{Instruccion} es la instruccion que se quiere ejecutar. @includedef{ejecutar_instruccion/3}".
	
	ejecutar_instruccion(EstadoActual,Instruccion,EstadoSiguiente) :-
    check_registers(EstadoActual), % Comprobamos que sea valido
    EstadoActual =.. [H | R], % regs, listado en R
    functor(Instruccion, I, A), % Nombre de la Instruccion y cantidad de args
    arg(1,Instruccion,Af), % Obtenemos el primer argumento
    (
        A =:= 1 -> % move debe tener 1 argumento y llamarse move
            I == move,
            do_move(R, L, Af);
        % Else
        arg(2,Instruccion,As), % Obtenemos el Segundo Argumento
        I == swap, % Comprobamos que I sea swap
        do_swap(R, L, Af, As) % Ejecutamos la opcion de Swap
    ), 
    EstadoSiguiente =.. [H | L],
    !. % Solo Ejecuta Una Vez

% =============================================
% Ejercicio III -   Generador De Codigo       |
% =============================================

:- pred generador_de_codigo(EstadoInicial, EstadoFinal, ListaDeInstrucciones)
    #"@var{EstadoInicial} es el estado inicial de los registros. @var{EstadoFinal} es el estado final de los registros. @var{ListaDeInstrucciones} es una lista que contiene las instrucciones. @includedef{generador_de_codigo/3}".
