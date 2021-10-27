package DTO;

public class ContaFilha extends Conta{

    public int tabuada(int a, int b, int resultado){
        a = 8;
        for (b = 0; b <= 10; b++){
            resultado = a * b;
            System.out.println(a + " X " + b + " = " + resultado);
        }
        return resultado;
    }
}
