package Regras;

import DTO.Cliente;
import DTO.Complex;
import DTO.Conta;
import DTO.ContaFilha;

import java.math.BigDecimal;

public class TestaBanco {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Cliente cliente = new Cliente();
        Complex complex = new Complex();
        //objetoclasse1.complexo = objetoclasse2
        conta.setTitular(new Cliente());
        conta.getTitular().setOutros(new Complex());
        //conta.titular = cliente;
        conta.titular.setEhCorrentista(true);
        conta.titular.setNumeroDaConta(12);
        conta.titular.getOutros().setModeloSmartphone("12");
        System.out.println(conta.titular.getOutros().getModeloSmartphone());





    }
}
