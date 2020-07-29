% --------------------------------------------- EJERCICIO Entregable 2  ---------------------------------------- %
% Autor: Chingon Ligon, El Mago                                                                                  %
% Matrícula: La Concha de tu madre                                                                               %
% Asignatura: Sistemas Optoelectrónicos                                                                          % 
% Instrucciones de ejecución: Que es eso? es tu madre volando con un tio raro                                    % 
% -------------------------------------------------------------------------------------------------------------- %

clear
clc

% Se define lambda = 1, no hace falta usarla como variable

% Vertices del Rombo
x = [0 -1.7 1.7 0] ./ 2; % Vector x
y = [-1 0 0 1] ./ 2;     % Vector y

% Amplitud y Fase de los Diagramas (Total de 6)

A   = [1 1 1 1; 1 1 1 1; 1 1 1 1; 1 0 1 1; 0 1 1 1; 1 0 0 1]; % Amplitud
Ph  = [0 0 0 0; 0 pi pi 0; 0 -pi/3 pi/3 0; 0 0 0 0; 0 0 0 pi; 0 0 0 -pi/2]; % Fase

% Distancia R de Radiacion
R = 300 % Puede ser 300, 600, 1000, o mas; No es comparable a la wavelength

% Numero de Onda:
k = 2*pi; % Realmente, 2*pi/wavelength, pero como lambda = 1 => 2 *  pi

% Angulo Theta
theta = 0:0.01:2*pi;

% k = 1..cantidad_de_filas
for k = 1:length(A(:,1));
    % Inicializamos el Vector Ur
    Ur = zeros(0, length(theta));
    Amp = A(k, :); % Fila k en la matriz de amplitudes
    Phi = Ph(k, :); % Fila k en la matriz de Fases

    for c = 1:length(x);
        % r: Distancia desde origen de coordenadas
        r = sqrt((R*cos(theta)-x(c)).^2 + (R*sin(theta)-y(c)).^2);
        Ur = [Ur; (Amp(c)./r).*exp(1j.*(Phi(c)-k.*r))];
    end

    %Calculamos el Total
    UrT=sum(Ur);

    % Calculamos la Intensidad
    I = abs(UrT) .* abs(UrT);
    % Pasamos la Intensidad a Decibelios
    Idb = 10*log(I./min(I));

    % Realizamos la grafica
    figure(k)
    subplot(1,2,1)
    polarplot(theta, I);
    title('Diagrama de Radiación en Escala Lineal')
    subplot(1,2,2)
    polarplot(theta, Idb);
    title('Diagrama de Radiación en dB ')
end

