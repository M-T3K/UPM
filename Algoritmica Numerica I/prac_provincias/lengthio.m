function L = lengthio(x, y)
    L = 0
    n = length(x) - 1
    for i = 1:n
        L = L + sqrt((x(i + 1) - x(i))^2 + (y(i + 1) - y(i))^2);
    end
end