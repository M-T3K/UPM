
% trazo se refiere a la funcion
% x_p se refiere a las coordenadas x de los puntos elegidos
% y_p se refiere a las coorenadas y de los puntos elegidos

function coste = cost(trazo, len, xx, x_p, y_p)
    coste = 0;
    n = length(x_p);
    m = length(trazo);
    for j = 1:m
        for i = 1:n 
            if xx(j) == x_p(i)
                dx = abs(y_p(i) - trazo(j));
                if dx ~= 0
                    coste = coste + dx*0.5;
                end
            end
        end  
    end
    % coste = coste + len * 2;
end