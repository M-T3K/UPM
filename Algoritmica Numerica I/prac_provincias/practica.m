clc                             % Mejor clc que clear
% --------------------------------------------- EJERCICIO 1  ----------------------------------------

% A)

figure(1)
A=imread('provincias.jpg');
image(A), axis image,hold on
% [x,y]=ginput(5),
% Estos son los valores elegidos para la practica
x = [128.9227 184.8353 239.4475 279.7566 353.8732]'
y = [206.5962 164.9869 174.0889 196.1939 216.9985]'
plot(x,y,'ro','markersize',4,'markerfacecolor','r'),

% B) Tabla para recopilar la informacion de manera mas organizada:

fprintf('Esta tabla redondea si son numeros muy cercanos a un entero...')
Provincias = {'Cáceres'; 'Ávila'; 'Madrid'; 'Cuenca'; 'Valencia'};
T = table(Provincias, x, y)

% --------------------------------------------- EJERCICIO 2  ----------------------------------------

% A)
xk= x(1:2:length(x)),
H = [xk.^0, xk.^1, xk.^2];
yk= y(1:2:length(y)),
v = yk;
c = H\v;
plot(xk, yk, 'b*'),
xx=[x(1):0.01:x(end)];
pp=c(1)+c(2)*xx+c(3)*xx.^2;
hold on;
plot(xx,pp,'r','LineWidth',2);
figure(7)
plot(xx, pp, 'r', 'LineWidth', 2)
figure(1)

% B)

    % 1)

    trazo_b = polNewton_Horner(x,y,xx,1);
    plot(xx,trazo_b,'b','LineWidth',2);
    % Grado de Polinomio: 4 (Pasa por 5 puntos, los grados seran x - 1)

    % 2)
    
    % Parte 1
    hold off
    figure(2)
    hold on;
    px = Lagrangio(x, y, xx);   % esto dibujara los subplot en su propia figura
    hold off                    % Terminamos con la figura 2 (La de los subplot)

    % Parte 2

    figure(1)                   % Volvemos a la figura con el mapa (figura 1)
    hold on;
    px = Lagrange(x, y, xx);
    plot(xx, px, 'g', 'LineWidth', 2); 

    
% C)

    % Queremos un trazado 'c', polinomio grado 3, carretera debe pasar lo mas cerca posible
    % Segun el sentido de minimos cuadrados

    C = polyfit(x, y, 3)
    trazo_c = polyval(C, xx);
    plot(xx, trazo_c, 'c', 'LineWidth', 2)

    %Ademas, nos piden que lo dibujemos junto al del ejercicio 2b1.
    
    hold off
    figure(3)
    hold on;
    plot(xx,trazo_b,'b', xx, trazo_c, 'c', 'LineWidth',2);
    hold off

% D)

    % Trazado 'd', poly grado 3, pasar por madrid, cerca de las 4 otras en sentido de minimos cuadrados
    % https://blogs.mathworks.com/pick/2015/12/11/polynomial-fit-passing-through-specified-points/

    % Primero tenemos que tomar la posicion que hemos elegido para 'Madrid'
    % x(3) & y(3)
    x_m = x(3)
    y_m = y(3)

    % Queremos hacer que el polinomio pase por el punto P(x_m, y_m) obligatoriamente

    C = [x.^3 x.^2 x ones(size(x))] % Vals
    d = y

    % No tenemos ninguna restriccion de inecuaciones
    A = []
    B = []  

    % Restriccion para las ecuaciones

    Aeq = [x_m^3 x_m^2 x_m 1]
    Beq = [y_m]

    % Llamamos a la funcion lsqlin (Least Squares Linear Solver)

    x_lsqlin = lsqlin(C, d, A, B, Aeq, Beq)

    trazo_d = x_lsqlin(1) .* xx.^3 +  x_lsqlin(2) .* xx.^2 +  x_lsqlin(3) .* xx +  x_lsqlin(4);

    
    figure(1)
    hold on;
    plot(xx, trazo_d, 'y', 'LineWidth', 2)

    % Nos piden que lo dibujemos con el trazado C
    figure(4)
    % Rojo y Amarillo, como mi espanita
    plot(xx, trazo_c, 'y', xx, trazo_d, 'r')
    % Falta anadir morado, como mi republiquita

    % E)
    % Trazado 'e' teniendo en cuenta que es el triple de importante que pase cerca de caceres, madrid, y valencia.
    % Poly grado 3
    
    C = [x.^3 x.^2 x ones(size(x))] % Vals
    d = y

    % Puntos por los que queremos que pase :
    x_triple = x(1:2:end)
    y_triple = y(1:2:end)

    % Restricciones de Inecuaciones
    % Condicion t.q. Aineq * x<=Bineq

    Aineq = [(x_triple(1)^3) (x_triple(1)^2) x_triple(1) 1;
            (x_triple(2)^3) (x_triple(2)^2) x_triple(2) 1;   
            (x_triple(3)^3) (x_triple(3)^2) x_triple(3) 1]
    Aineq = Aineq .* 3
    Bineq = y_triple

    % Restricciones de Ecuaciones

    % Aeq = [x_m^3 x_m^2 x_m 1]
    % Beq = [y_m]
    Aeq = []
    Beq = []

    % Llamamos a la funcion lsqlin (Least Squares Linear Solver)

    x_triple_lsqlin = lsqlin(C, d, A, B, Aeq, Beq)
    x_lsqlin

    trazo_e = x_triple_lsqlin(1) .* xx.^3 +  x_triple_lsqlin(2) .* xx.^2 +  x_triple_lsqlin(3) .* xx +  x_triple_lsqlin(4);

    figure(5)
    hold on;
    plot(xx, trazo_e, 'b', xx, trazo_c, 'r')
    

% --------------------------------------------- EJERCICIO 3  ----------------------------------------


trazob_len = lengthio(xx, trazo_b)
trazoc_len = lengthio(xx, trazo_c)

% --------------------------------------------- EJERCICIO 4  ----------------------------------------

coste_b = cost(trazo_b, trazob_len, xx, x, y)
coste_c = cost(trazo_c, trazoc_len, xx, x, y)  