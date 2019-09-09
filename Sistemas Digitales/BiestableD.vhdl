library IEEE;
use ieee.std_logic.all;

entity biestable_D_con_Clr is
    GENERIC(retardo: TIME:= 0 ns)
    PORT(
        D: IN STD_LOGIC;
        CLK: IN STD_LOGIC;
        CLR: IN STD_LOGIC;
        Q: OUT STD_LOGIC);
end biestable_D_con_Clr;

ARCHITECTURE flujo_asin OF biestable_D_con_Clr IS
BEGIN 
        Q <= '0' WHEN CLR = '1'
    ELSE 
        Q <= D AFTER retardo WHEN rising_edge(CLK)
END flujo_asin;