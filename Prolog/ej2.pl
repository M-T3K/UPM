% Programar el predicado ISO-Prolog zip/4, con cabecera zip(O,L1,L2,Z), que será cierto si O es un operador binario válido en expresiones aritméticas (e.g., +, -, *, etc.), 
% L1 y L2 son listas de números de idéntica longitud y Z es una lista de números que resulta de aplicar la operación O a los pares de números que aparecen en la misma posición en las listas L1 y L2.

% Por ejemplo:
% ?- zip(+,[1,2,3],[4,5,6],Z).
% Z = [5,7,9]

:- use_module(library(lists)).


% Comprobar que las longitudes son iguales: length(L1, N1), length(L2, N2), N1 =:= N2 
zip(O,L1,L2,Z) :- 
    length(L1, N1), length(L2, N2), N1 =:= N2.

