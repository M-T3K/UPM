function dd=difdiv(xi,fi)
% Rutina difdiv: calcula la tabla de diferencias divididas
% Entrada xi nodos
        % fi valores en los nodos
% Salida: dd tabla de diferencia divididas
N=length(xi);
D=zeros(N);
D(:,1)=fi;
for k=2:N
    for j=1:N-k+1
        dif=D(j,k-1)-D(j+1,k-1);
        dx=xi(j)-xi(j+k-1);
        D(j,k)=dif/dx;
    end
end
dd=D(1,:);
return