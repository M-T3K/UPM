function px=polNewton_Horner(xi,fi,xx,k)

dd=difdiv(xi,fi);

if k == length(xi)
    px=dd(k);
elseif k ~= 0
    px=dd(k)+polNewton_Horner(xi,fi,xx,k+1).*(xx-xi(k));
end

return