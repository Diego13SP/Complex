package DTO;

import java.math.BigDecimal;

public class Cliente {
    boolean isCasado;
    String cep;
    String numeroDaResidencia;
    BigDecimal salario;
    Complex nivel2;

    public Complex getNivel2() {
        return nivel2;
    }

    public void setNivel2(Complex nivel2) {
        this.nivel2 = nivel2;
    }

    public boolean isCasado() {
        return isCasado;
    }

    public void setCasado(boolean casado) {
        isCasado = casado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumeroDaResidencia() {
        return numeroDaResidencia;
    }

    public void setNumeroDaResidencia(String numeroDaResidencia) {
        this.numeroDaResidencia = numeroDaResidencia;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
