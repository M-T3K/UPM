
% p(x) = sum(i = 0..n, Li(x)*f(x_i))

function px = Lagrangio(x, y, xx)
    
    px = 0;
    n = length(x)
    for i = 1:n
        Li = 1;
        % Hacemos Bases de Lagrange
        for j = 1:n
            if j ~= i
                Li = Li .* ( (xx - x(j) )/ (x(i) - x(j) ) ); % Li(x_i)
            end
        end
        subplot(n, 1, i)
        plot(xx, Li, 'b')
    end
end