
% p(x) = sum(i = 0..n, Li(x)*f(x_i))

function px = Lagrange(x, y, xx)
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
        px = px + Li * y(i);
    end
end