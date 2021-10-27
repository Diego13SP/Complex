package DTO;

import java.math.BigDecimal;

public class Cliente {
    private boolean ehCorrentista;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    private int numeroDaConta;
    private Complex outros;

    public boolean getEhCorrentista(){
        return ehCorrentista;
    }
    public void setEhCorrentista(boolean ehCorrentista){
        this.ehCorrentista = ehCorrentista;
    }
    public Complex getOutros() {
        return outros;
    }

    public void setOutros(Complex outros) {
        this.outros = outros;
    }

}
