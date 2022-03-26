:- module(_, _, [assertions]).

alumno_prode('APE','','NAME','MAT').
alumno_prode('APE','APE','NAME','MAT').

:- doc(title, "Práctica 1 - Programación lógica pura").

:- doc(author, "FULLNAME").
:- doc(author, "FULLNAME").
:- doc(module, "Esta práctica consiste en una lista de listas, que forman un edificio y se quieren hacer ciertas acciones sobre este.

@subsection{Predicados pedidos en la práctica}
@begin{verbatim}
:- prop nat/1
#``Comprueba que L es natural.''.
@end{verbatim}

@begin{verbatim}
:- pred basic_building(X)
#``Mira si el edificio tiene al menos un nivel con vivienda''.
@end{verbatim}

@begin{verbatim}
:- pred building(X)
#``Comprueba que todos los niveles del edificio tengan el mismo número de viviendas''.
@end{verbatim}

@begin{verbatim}
:- pred level(T,N,C)
#``Lista de todas las viviendas del nivel N''.
@end{verbatim}

@begin{verbatim}
:- pred column(X,s(N),C)
#``Lista de las viviendas en la posicion s(N) de todos los niveles''.
@end{verbatim}

@begin{verbatim}
:- pred columns(X,C)
#``Lista de todas las columnas de las viviendas''.
@end{verbatim}

@begin{verbatim}
:- pred total_people(X,T)
#``Es el número total de personas que viven en el edificio''.
@end{verbatim}

@begin{verbatim}
:- pred average(X,A)
#``Es la media de las personas de cada vivienda que viven en el edificio''.
@end{verbatim}

@subsection{Predicados auxiliares}
@begin{verbatim}
:- pred suma(X,Y,Z)
#``Es la suma de X+Y. Devuelve el resultado en Z''.
@end{verbatim}

@begin{verbatim}
:- pred equals(X,Y)
#``Compara X e Y.''.
@end{verbatim}

@begin{verbatim}
:- pred count(T,N)
#``Contador que cuenta los elementos y los devuelve en N.''.
@end{verbatim}

@begin{verbatim}
:- pred getHead([H| _T],Y)
#``Coge la cabeza H de la lista del edificio.''.
@end{verbatim}

@begin{verbatim}
:- pred getLevelBuilding(T,N)
#``Obtiene el nivel de la lista del edificio.''.
@end{verbatim}

@begin{verbatim}
:- pred concat(T,L,X)
#``Concatena las listas T y L, y los devuelve en X.''.
@end{verbatim}

@begin{verbatim}
:- pred traspuesta2([H|T],Ts)
#``Predicado que se itera con traspuesta/3 para sacar la traspuesta de [H|T].''.
@end{verbatim}

@begin{verbatim}
:- pred traspuesta3(T,Submat,Ts)
#``Predicado que saca la traspuesta en Ts.''.
@end{verbatim}

@begin{verbatim}
:- pred first(Rest,Fs,Ts)
#``Realiza un cambio de posiciones para hallar la traspuesta en Ts.''.
@end{verbatim}

@begin{verbatim}
:- pred cumsum(T,Acc)
#``Acumulador para la suma recursiva.''.
@end{verbatim}

@begin{verbatim}
:- pred recConcat(T,Ls)
#``Se concatenan recursivamente las listas y se obtiene una matriz en Ls.''.
@end{verbatim}

@begin{verbatim}
:- pred resta(A,B,C)
#``Hace la suma al revés: A=B+C.''.
@end{verbatim}

@begin{verbatim}
:- pred gt(X,Y)
#``Comprueba que X es mayor que Y.''.
@end{verbatim}

@begin{verbatim}
:- pred lt(X,Y)
#``Comprueba que X es menor que Y.''.
@end{verbatim}

@begin{verbatim}
:- pred div3(N,Den,C)
#``Hace la división N entre Den y da el resultado en C.''.
@end{verbatim}

@begin{verbatim}
:- pred mult3(X,Y,P)
#``Hace la multiplicación de X con Y, y da el resultado en P.''.
@end{verbatim}


@section{Tests}
Se incluyen aserciones que empiezan por @tt{:- test} al final del documento.

@subsection{basic_building(X) tests}
@begin{verbatim}
:- test basic_building(X) : (X = [[1,1],[s(0)]] ) 
@end{verbatim}
@begin{verbatim}
:- test basic_building(X) : (X = [[s(0),1],[s(0)]] )
@end{verbatim}
@begin{verbatim}
:- test basic_building(X) : (X = [[],[s(0)]])
@end{verbatim}
@begin{verbatim}
:- test basic_building(X) : (X = [])
@end{verbatim}

@subsection{building(X) tests}
@begin{verbatim}
:- test building(X) : (X = [[1,1],[s(0),1]] )
@end{verbatim}
@begin{verbatim}
:- test building(X) : (X = [[s(0),1],[s(0)]] )
@end{verbatim}
@begin{verbatim}
:- test building(X) : (X = [[s(0),s(0)],[s(0),s(s(0))]] )
@end{verbatim}
@begin{verbatim}
:- test building(X) : (X = [] )
@end{verbatim}

@subsection{level(T,N,C) tests}
@begin{verbatim}
:- test level(T,N,C) : (T = [[s(0),s(0)],[s(0),s(s(0))]], N=s(0) ) => (C=[s(0),s(0)])
@end{verbatim}
@begin{verbatim}
:- test level(T,N,C) : (T = [[s(0),s(0)],[s(0),s(s(0))]], N=s(s(0)) ) => (C=[s(0),s(s(0))])
@end{verbatim}
@begin{verbatim}
:- test level(T,N,C) : (T = [[],[s(0),s(s(0))]], N=s(0) ) => C=0
@end{verbatim}
@begin{verbatim}
:- test level(T,N,C) : (T = [[1],[s(0)]], N=s(0) ) => C=0
@end{verbatim}
@begin{verbatim}
:- test level(T,N,C) : (T = [], N=s(0) ) => C=0
@end{verbatim}

@subsection{column(X,s(N),C) tests}
@begin{verbatim}
:- test column(X,s(N),C) : (X = [[],[s(0),s(s(0))]], s(0) ) => C=0
@end{verbatim}
@begin{verbatim}
:- test column(X,s(N),C) : (X = [[s(0),s(0)],[s(0),s(s(0))]], N=s(0) ) => (C=[s(0),s(0)])
@end{verbatim}
@begin{verbatim}
:- test column(X,s(N),C) : (X = [[s(0),s(0)],[s(0),s(s(0))]], N=s(s(0)) ) => (C=[s(0),s(s(0))])
@end{verbatim}
@begin{verbatim}
:- test column(X,s(N),C) : (X = [[s(0),s(0)],[s(0),s(s(0))]], N=0 ) => C=0
@end{verbatim}
@begin{verbatim}
:- test column(X,s(N),C) : (X = [[s(0),s(0)],[s(0),s(s(0))]], N=6 ) => C=0
@end{verbatim}
@begin{verbatim}
:- test column(X,s(N),C) : (X = [], N=s(0) ) => C=0
@end{verbatim}

@subsection{columns(X,C) tests}
@begin{verbatim}
:- test columns(X,C) : (X = [[s(0),s(0)],[s(0),s(s(0))]] ) => (C=[[s(0),s(0)],[s(0),s(s(0))]])
@end{verbatim}
@begin{verbatim}
:- test columns(X,C) : (X = [[s(0),s(0),s(s(s(0)))],[s(0),s(s(0)),s(0)]] ) => (C=[[s(0),s(0)],[s(0),s(s(0))],[s(s(s(0))),s(0)]])
@end{verbatim}
@begin{verbatim}
:- test columns(X,C) : (X = [[0,s(0)],[0,s(s(0))]] ) => (C=[[0,0],[s(0),s(s(0))]])
@end{verbatim}
@begin{verbatim}
:- test columns(X,C) : (X = [[],[s(0),s(s(0))]] ) => C=0
@end{verbatim}
@begin{verbatim}
:- test columns(X,C) : (X = []) => C=0
@end{verbatim}

@subsection{total_people(X,T) tests}
@begin{verbatim}
:- test total_people(X,T) : (X = [[s(0),s(0)],[s(0),s(s(0))]] ) => (T=s(s(s(s(s(0))))))
@end{verbatim}
@begin{verbatim}
:- test total_people(X,T) : (X = [[s(0)],[s(0)]] ) => (T=s(s(0)))
@end{verbatim}
@begin{verbatim}
:- test total_people(X,T) : (X = [[[],s(0)],[s(0),s(s(0))]] ) => T=0
@end{verbatim}
@begin{verbatim}
:- test total_people(X,T) : (X = [] ) => T=0
@end{verbatim}

@subsection{average(X,A) tests}
@begin{verbatim}
:- test average(X,A) : (X = [[s(0),s(0)],[s(0),s(s(0))]] ) => (A=s(0))
@end{verbatim}
@begin{verbatim}
:- test average(X,A) : (X = [[s(0),s(s(s(0)))],[s(0),s(0)]] ) => (A=s(0))
@end{verbatim}
@begin{verbatim}
:- test average(X,A) : (X = [[s(0),s(s(s(0))),s(s(s(0)))],[s(0),s(s(0)),s(s(s(0)))] ] ) => (A=s(s(0)))
@end{verbatim}
@begin{verbatim}
:- test average(X,A) : (X = [[],[s(0),s(s(0))]] ) => A=0
@end{verbatim}
@begin{verbatim}
:- test average(X,A) : (X = [] ) => A=0 
@end{verbatim}

Estas definen casos de test. Dada una aserción @tt{:- test Head : Llamada =>
Out}, @var{Head} se refiere al predicado, @var{Call} describe los valores de entrada para el test, @var{Out} define
los valores de salida.

@subsection{Lanzar los test automáticamente}
Para lanzar los test, seleccione en el menú de emacs @tt{CiaoDbg -> Run tests in current module}.

@subsection{Generación memoria con LPDOC}
La memoria se ha generado a partir de Lpdoc -> Generate documentation for buffer. Lpdoc->View documentation in selected format.

").


% Ejercicio 1
:- pred basic_building(X)
   #"@var{X} es el edificio en formato de una lista. Mira si tiene al menos un nivel que no esté vacío. @includedef{basic_building/1}".
basic_building([[L |_ ]|_]) :- nat(L).

:- prop nat/1 #"Numero natural. @includedef{nat/1}".
nat(0).
nat(s(L)) :-
    nat(L).

% Testing: basic_building([[s(0),1],[s(0)]]).

% Ejercicio 2

:- pred suma(X,Y,Z)
   #"@var{Z} es la suma de @var{X} y @var{Y} en formato peano. @includedef{suma/3}".
suma(0,X,X) :- nat(X). % Regla: Suma 0 + X = X
suma(s(X),Y,s(Z)) :-
    suma(X,Y,Z).

:- pred equals(X,Y)
   #"Este predicado comprueba que @var{X} y @var{Y} sean iguales. @includedef{equals/2}".
equals(X, X).
equals(s(X), s(Y)) :- equals(X, Y).

:- pred count(T,N)
   #"@var{N} es el contador que va a ir contando los elementos de la lista @var{T}. @includedef{count/2}".
count([], 0).
count([_ | T], s(N)) :- count(T, N).

:- pred getHead([H| _T], H)
   #"@var{H} guarda la cabeza de la lista @var{[H| _T]}. @includedef{getHead/2}".
getHead([H| _T], H).

:- pred getLevelBuilding(T,N)
   #"@var{N} obtiene el nivel de @var{T}. @includedef{getLevelBuilding/2}".
getLevelBuilding([], _N).
getLevelBuilding([H | T], N1) :- count(H, N), equals(N, N1), getLevelBuilding(T, N) .

:- pred building(X)
   #"Comprueba que @var{X} tenga todos los niveles con el mismo número de viviendas. @includedef{building/1}".
building(X) :- basic_building(X), getHead(X, H), count(H, N), getLevelBuilding(X, N) .

% Ejercicio 3
:- pred concat(T,L,X)
   #"Concatena @var{T} y @var{L} en @var{X}, es decir, unifica las listas de un lado al del otro, y las devuelve en el tercer argumento. @includedef{concat/3}".
concat([],L,L). %Regla: Vacio + L = L
concat([H | T], L, [H|X]) :- concat(T,L,X).

% Logica:
% concat([A,B,C],[C,D],X=[]).
%  = concat([A | B,C], [C,D], [A | _])
%  = concat([B | C], [C,D], [B | A])
%  = concat([C | _], [C,D], [C | B, A])
%  = concat([_], [C,D], [_ | CBA])
%  = concat([], , [ CD | CBA])

:- pred level(T,N,C)
   #"@var{C} es el nivel @var{N} de @var{T}. @includedef{level/3}".
level([H | T], s(0), C) :- building([H | T]), concat([], H, C). %Caso base
level([_H | T], s(N), C):- level(T,N,C).

% Ejercicio 4
% Ejemplo: Dado 
% [ [s(0), s(s(s(0)))], [ 0, s(s(0))]]
% column(X,s(0),C) => C = [s(0), 0].

% [A B C D]
% [E F G H] => s(0) = 1 => A E I M
% [I J K L]
% [M N O P]

% 1) Podemos sacar la traspuesta y pillar la fila N
% 2) podemos iterar con un contador N hasta la columna N
% y luego iterar hacia abajo, hasta el final, y hacer append

% Teniendo Level, es mas facil 1)

:- pred traspuesta2([H|T], Ts)
   #"El predicado traspuesta2/2 se itera con traspuesta3/3, que sacará la traspuesta a partir de @var{[H|T]}. @includedef{traspuesta2/2}".
traspuesta2([], []). %Caso Base
traspuesta2([H|T], Ts) :- traspuesta3(H, [H | T], Ts). % Queremos la traspuesta a partir de H

% Esencialmente, lo que estamos haciendo es sacar la traspuesta linea a linea
% [A B C D]    [A   E I M]    [A E   I M]    [A E I  M]
% [E F G H] => [B | F G H] => [B F   J N] => [B F J  N] => Hecho
% [I J K L]    [C | J K L]    [C G | K L]    [C G K  L]
% [M N O P]    [D | N O P] => [D H | O P]    [D H O |P]

:- pred traspuesta3(T,Submat,Ts)
   #"Saca la traspuesta en @var{Ts} de @var{Submat}, dado @var{T}. @includedef{traspuesta3/3}".
traspuesta3([], _, []). %Caso Base
traspuesta3([_|T], Mat, [H|Ts]) :-
    first(Mat, H, Submat), traspuesta3(T, Submat, Ts).

% Solo la primera linea/fila y columna
:- pred first(Rest,Fs,Ts)
   #"Realiza el intercambio de posiciones para hallar la traspuesta @var{Ts}. @includedef{first/3}".
first([], [], []). % Caso Base
first([[H | T] | Rest], [H | Fs], [T | Ts]) :- % Realizamos el intercambio
    first(Rest, Fs, Ts).


% Siguiendo la solucion 1)

:- pred column(X,s(N),C)
   #"@var{C} es la lista de las viviendas en @var{s(N)} de @var{X}. @includedef{column/3}".
column(X, s(N),C) :-
    traspuesta2(X,M), level(M,s(N),C).

% No hace falta llamar building(X) pq Level => Building

% Ejercicio 5:
:- pred columns(X,C)
   #"@var{C} es el listado de todas las columnas, comprobando que sea building/1. @includedef{columns/2}".
columns(X, C) :-
    building(X), traspuesta2(X, C).

% Ejercicio 6

% Vamos a tener que sumar
% podemos sumar cada fila independientemente
% juntar el resultado en una nueva lista
% y sumar de nuevo la nueva lista al final

% Cumulative Sum recursiva:
% S = H + S_1
% S1 = H + S_2
% S2 = H + S_3
% ...
% SN = Acc (acumulador)

:- pred cumsum(T,Acc)
   #"@var{Acc} es el acumulador para la suma recursiva. @includedef{cumsum/2}".
cumsum([],0). % caso Base
cumsum([H | T],S):- % Separamos cabeza del cuerpo
    cumsum(T,Acc),suma(H,Acc,S). % S = H + Acc

:- pred recConcat(T,Ls)
   #"@var{Z} es la matriz resultado de concatenar recursivamente todas las listas. @includedef{recConcat/2}".
recConcat([],[]). % base Case
recConcat([H | T], L) :- % get first List
    concat(H, Ls, L), recConcat(T, Ls). % L = First List + Ls; Recursive Call w/ Rest of Lists

:- pred total_people(X,T)
   #"@var{T} es el número total de personas que viven en @var{X}. @includedef{total_people/2}".
total_people(X, T) :- building(X), recConcat(X, L), cumsum(L, T).

% Ejercicio 7
% average: num_personas/niveles
% niveles = len(matriz) (rows)

% Motor de Inferencia
% Formamos ecuacion y despejamos C
% Prolog lo calcula automaticamente

:- pred resta(A,B,C)
   #"@var{A} es la resta de @var{B} y @var{C} en formato peano. @includedef{resta/3}".
resta(A,B,C) :- suma(B,C,A).
                                            
:- pred gt(X,Y)
   #"@var{X} es mayor que @var{Y} en formato peano. @includedef{gt/2}".
gt(_, 0).
gt(s(X),s(Y)) :- 
    gt(X,Y).

:- pred lt(X,Y)
   #"@var{X} es menor que @var{Y} en formato peano. @includedef{lt/2}".
lt(0,s(0)).
lt(s(X),s(Y)):-
    lt(X,Y).   

% Division, division euclidea: Restamos N veces
% Num       |_Den__
% Num-Den   |_Den__
% Num-Den*C |_Den__
% etc

:- pred div3(N,Den,C)
   #"@var{c} es la division entre @var{N} y @var{Den} en formato peano. @includedef{div3/3}".
div3(Num,Den,s(C)) :- equals(Num,Den), nat(C). % si num = dem => Cociente++ (Caso Base, ultima vez)
div3(Num,Den,_) :- lt(Num,Den). % Si numerador menor que denominador => Hemos terminado (division entera)
% Si num > Div, se puede hacer una division
div3(Num,Den,s(C)) :- gt(Num,Den), resta(Num,Den,N), div3(N, Den, C).

:- pred mult3(X,Y,P)
   #"@var{P} es la multiplicación de @var{X} con @var{Y}. @includedef{mult3/3}".
mult3(_,0,0).
mult3(X,Y,P) :-
    gt(Y,0),
    resta(Y,s(0),Res),
    mult3(X,Res,P0),
    suma(P0,X,P).

:- pred average(X,A)
   #"@var{A} es la media de las personas qie viven en @var{X}. @includedef{average/2}".
average(X,A):-
    count(X,Nlvls), % Calculamos la cantidad de viviendas.
    level(X,s(0),L),
    count(L,NVivsLvl),
    mult3(NVivsLvl,Nlvls,NumVivs),
    total_people(X,Hente), % Total de Hente
    div3(Hente,NumVivs,A). % Calculamos la media de personas por vivienda

% ########################################## TESTS ########################################## %
:- test basic_building(X) : (X = [[1,1],[s(0)]] ) #"@includedef{test/1}".
:- test basic_building(X) : (X = [[s(0),1],[s(0)]] ) #"@includedef{test/1}".
:- test basic_building(X) : (X = [[],[s(0)]])  #"@includedef{test/1}".
:- test basic_building(X) : (X = [])  #"@includedef{test/1}".

:- test building(X) : (X = [[1,1],[s(0),1]] ) #"@includedef{test/1}".
:- test building(X) : (X = [[s(0),1],[s(0)]] ) #"@includedef{test/1}".
:- test building(X) : (X = [[s(0),s(0)],[s(0),s(s(0))]] ) #"@includedef{test/1}".
:- test building(X) : (X = [] ) #"@includedef{test/1}".

:- test level(T,N,C) : (T = [[s(0),0],[s(0),s(s(0))]], N=s(0) ) => (C=[s(0),0]) #"@includedef{test/3}".
:- test level(T,N,C) : (T = [[s(0),s(0)],[s(0),s(s(0))]], N=s(s(0)) ) => (C=[s(0),s(s(0))]) #"@includedef{test/3}".
:- test level(T,N,C) : (T = [[],[s(0),s(s(0))]], N=s(0) ) => (C=0) #"@includedef{test/3}".
:- test level(T,N,C) : (T = [[1],[s(0)]], N=s(0) ) => (C=0) #"@includedef{test/3}".
:- test level(T,N,C) : (T = [], N=s(0) ) =>(C=0) #"@includedef{test/3}".

:- test column(X,s(N),C) : (X = [[],[s(0),s(s(0))]],N= s(0) ) => C=0  #"@includedef{test/3}".
:- test column(X,s(N),C) : (X = [[s(0),s(0)],[s(0),s(s(0))]], N=1 ) => C=[s(0),s(0)] #"@includedef{test/3}".
:- test column(X,s(N),C) : (X = [[s(0),s(0)],[s(0),s(s(0))]], N=2 ) => C=[s(0),s(s(0))] #"@includedef{test/3}".
:- test column(X,s(N),C) : (X = [[s(0),s(0)],[s(0),s(s(0))]], N=3 ) => C=0 #"@includedef{test/3}".
:- test column(X,s(N),C) : (X = [[s(0),s(0)],[s(0),s(s(0))]], N=6 ) => C=0 #"@includedef{test/3}".
:- test column(X,s(N),C) : (X = [], N=s(0) ) => C=0 #"@includedef{test/3}".

:- test columns(X,C) : (X = [[s(0),s(0)],[s(0),s(s(0))]] ) =>(C=[[s(0),s(0)],[s(0),s(s(0))]]) #"@includedef{test/2}".
:- test columns(X,C) : (X = [[s(0),s(0),s(s(s(0)))],[s(0),s(s(0)),s(0)]] ) => (C=[[s(0),s(0)],[s(0),s(s(0))],[s(s(s(0))),s(0)]]) #"@includedef{test/2}".
:- test columns(X,C) : (X = [[0,s(0)],[0,s(s(0))]] ) => (C=[[0,0],[s(0),s(s(0))]]) #"@includedef{test/2}".
:- test columns(X,C) : (X = [[],[s(0),s(s(0))]] ) => (C=0) #"@includedef{test/2}".
:- test columns(X,C) : (X = []) => (C=0) #"@includedef{test/2}".

:- test total_people(X,C) : (X = [[s(0),s(0)],[s(0),s(0)]] ) => (C=s(s(s(s(0))))) #"@includedef{test/2}".
:- test total_people(X,C) : (X = [[s(0)],[s(0)]] ) => (C=s(s(0))) #"@includedef{test/2}".
:- test total_people(X,C) : (X = [[[],s(0)],[s(0),s(s(0))]] ) => (C=0) #"@includedef{test/2}".
:- test total_people(X,C) : (X = [] ) => (C=0) #"@includedef{test/2}".

:- test average(X,A) : (X = [[s(0),s(0)],[s(0),s(s(0))]] ) => (A=s(0)) #"@includedef{test/2}".
:- test average(X,A) : (X = [[s(0),s(s(s(0)))],[s(0),s(0)]]) => (A=s(0)) #"@includedef{test/2}".
:- test average(X,A) : (X = [[s(0),s(s(s(0))),s(s(s(0)))],[s(0),s(s(0)),s(s(s(0)))]] ) => (A=s(s(0))) #"@includedef{test/2}".
:- test average(X,A) : (X = [[],[s(0),s(s(0))]] ) => (A=0) #"@includedef{test/2}".
:- test average(X,A) : (X = [] ) => (A=0) #"@includedef{test/2}".