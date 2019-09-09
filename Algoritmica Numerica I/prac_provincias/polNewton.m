function px=polNewton(xi,fi,xx)
% Calcula el polinomio de Newton y lo evalua en la tabla xx
% Entrada xi nodos
        % fi valores en los nodos
        % xx tabla de valores
% Salida: px=evaluación del polinomio de Newton en xx
N=length(xi);m=length(xx);
dd=difdiv(xi,fi);
pp=zeros(1,m);
pp=xx-xi(1);
px=zeros(1,m);
px=dd(1)+dd(2)*pp;
for k=3:N
    pp=pp.*(xx-xi(k-1));
    px=px+dd(k)*pp;
end
return