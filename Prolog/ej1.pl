%  primerosNParesLista(N,L,LNPares)
% Programar el predicado lógico puro primerosNParesLista/3, con cabecera primerosNParesLista(N,L,LNPares), que se verifica si LNPares es la lista de los N primeros números pares (en notación de Peano) de la lista L.

% Predicados de paridad
is_even(s(s(0))).
is_even(s(s(X))) :- is_even(X).

% Operaciones



% Predicado del ejercicio para comprobar si la lista es de numeros pares de peano
primerosNParesLista(0,_L,[]).
% 1) Vamos restando a N y a las listas por cada iteracion
% 2) 
primerosNParesLista(s(N),[_ | TL],[_ | TLN]) :- is_even(N), primerosNParesLista(N, TL, TLN).