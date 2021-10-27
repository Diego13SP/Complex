package Regras;

import DTO.Cliente;
import DTO.Complex;
import DTO.Conta;
import DTO.ContaFilha;

public class TestaBanco {
    public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("****************************************************************");
        System.out.println("Começo do programa");
        ContaFilha contaFilha = new ContaFilha();
        contaFilha.tabuada(0,0,0);
        Conta conta = new Conta();
        Complex complex = new Complex();
        Cliente cliente = new Cliente();
        System.out.println("mudança");
    }
}
