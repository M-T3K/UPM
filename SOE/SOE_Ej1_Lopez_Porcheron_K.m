% --------------------------------------------- EJERCICIO Entregable 1  ---------------------------------------- %
% Autor: Chingon Ligon, El Mago                                                                                  %
% Matrícula: La Concha de tu madre                                                                               %
% Asignatura: Sistemas Optoelectrónicos                                                                          % 
% Instrucciones de ejecución: Ejecutar. Una interfaz de texto le guiará por las distintas opciones.              % 
% -------------------------------------------------------------------------------------------------------------- %

clc;
clear;

should_print = input("Antes de comenzar, desea incluir en la gráfica información adicional de depuración como tangentes y/o normales? (Responda con 1 para Si y 0 para No)\n");
f = input("Por favor, inserte un valor para el foco de la parabola:\n"); % Foco
r = 2 * f;     % RADIO
x = 0:0.01:20; % Valores de X para la grafica

% Espejo (Parabola)
y_pos = 2 * sqrt(f * x); 
y_neg = -2 * sqrt(f * x);

% Dibujamos la parabola y los puntos, ya que estos nunca van a cambiar
plot(f, 0, 'bo', r, 0, 'bo', x, y_pos, 'b', x, y_neg, 'b'); hold on

% Debemos encontrar la ecuacion de una linea que pase por los puntos (x_p, y_p) partiendo del punto (x_e, y_e)
fprintf("Debería haberse abierto una figura con la parabola, el foco (primer punto en azul), y el radio (segundo punto en azul) marcados. \nNo la cierre.\n");
numero_rayos = input("Cuantos rayos incidentes quiere?\n");

% Bucle
for n = 1:numero_rayos
    fprintf("A continuación deberá elegir los valores para el punto inicial desde el cual parte el rayo incidente numero %i.\n", n);
    x_e = input("Coordenada X?:");
    y_e = input("Coordenada Y?:");

    % Se pasa a definir los puntos donde incide el rayo en la parabola (parte positiva)
    fprintf("Ahora se le pedirá de la misma manera la coordenada Y del punto de incidencia a partir del cual el rayo incidente se reflejará. Si quiere que el rayo incidente sea paralelo al eje X, esta deberá ser igual a la que ha puesto anteriormente.\n");
    y_p = input("Coordenada Y?:");
    x_p = 1/(4 * f) * y_p^2;

    x_acotada = x_p:0.01:x_e;

    % Dibujo de los puntos elegidos
    plot (x_e, y_e, 'ko'); hold on
    plot (x_p, y_p, 'ko'); hold on

    % Pendiente del rayo incidente
    m = (y_e - y_p) / (x_e - x_p);

    r_incidente = m *(x_acotada - x_p) + y_p; % Rayo Incidente entre (x_e, y_e) y (x_p, y_p)

    m_tan = sqrt(f / x_p); % Slope de la linea tangente

    tangent = m_tan * (x - x_p) + y_p; % Tangente a parabola en (x_p, y_p)
    tangent_neg = -1 * m_tan * (x - x_p) + y_p; % Tangente para negativos, para usarla luego si fuera necesario

    m_tan_normal = -1 / m_tan; % Slope de la recta normal a la tangente

    % Recta normal que pasa por el punto tangente, en este caso por el punto (x_p, y_p)
    normal = m_tan_normal * (x - x_p) + y_p;

    % tan(theta) = (m1 - m2)/(1 + m1*m2) => theta = arctan((m1 - m2)/(1 + m1*m2))
    % Queremos 2 veces este angulo

    theta =  2 * atan((m - m_tan_normal) / (1 + (m * m_tan_normal)));

    r_reflex = - tan(theta) * (x_acotada - x_p) + y_p; % Rayo reflejado
    % Tan (-x) = - Tan(x)
    r_reflect_neg = tan(theta) * (x_acotada - x_p) + y_p; % Rayo Reflejado en negativo

    % Graficas

    plot (x_acotada, r_incidente, 'm'); hold on % Rayo Incidente entre (x_e, y_e) y (x_p, y_p)
    if y_p < 0
        if should_print == 1
            plot (x, tangent_neg, 'r', x, normal, 'b--'); hold on % Recta Tangente y normal  
        end
        plot(x_acotada, r_reflect_neg, 'm'); hold on % Rayo Reflectado en caso de negativo
    else
        if should_print == 1
            plot (x, tangent, 'r', x, normal, 'b--'); hold on % Recta Tangente y normal  
        end
        plot (x_acotada, r_reflex, 'm'); hold on % Rayo reflectado
    end
end
fprintf("Simulación Terminada");


















