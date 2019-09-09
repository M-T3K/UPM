library IEEE;
use ieee.std_logic;

entity registro_PP is
    GENERIC(num_bits:natural);
    PORT(
        ent_datos: IN STD_LOGIC_VECTOR((num_bits -  1) DOWNTO 0);
        clock: IN STD_LOGIC;
        clear: IN STD_LOGIC;
        sal_datos: OUT STD_LOGIC_VECTOR((num_bits - 1) DOWNTO 0)
    );
end registro_PP;

ARCHITECTURE con_generate OF registro_PP IS
BEGIN
    COMPONENT biestable_D_con_Clr IS
        GENERIC(retardo: TIME:= 0 ns);
        PORT(
            D : IN STD_LOGIC;
            CLK: IN STD_LOGIC;
            CLR: IN STD_LOGIC;
            Q: OUT STD_LOGIC
        );
    END COMPONENT;
    BEGIN
        U1:FOR I IN 0 TO (num_bits - 1) GENERATE
            B1: biestable_D_con_Clr PORT MAP(CLK=>clock, CLR=>clear, D=>end_datos(i),Q=>sal_datos(i));
        END GENERATE;
END con_generate;