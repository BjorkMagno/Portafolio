package com.modelos;

public class Moneda {
    // Variable.
    String code;
    double valor;

    // Constructor.
    public Moneda(){
    }
    public Moneda(double valor, String code) {
        this.code = code;
        this.valor = valor;
    }

    // Getter y Setter.
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.getValor() + " "+ getCode();
    }
}
