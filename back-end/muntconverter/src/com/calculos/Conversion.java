package com.calculos;

import com.modelos.Moneda;

public class Conversion {
    Moneda baseMoneda = new Moneda();
    Moneda moneda = new Moneda();

    // Contructor
    public Conversion(Moneda baseMoneda, Moneda moneda) {
        this.baseMoneda = baseMoneda;
        this.moneda = moneda;
    }

    // Metodo
    public Moneda conversorMoneda (){
        Moneda newMoneda = new Moneda(baseMoneda.getValor() * moneda.getValor(), moneda.getCode() );
        return newMoneda;
    }

    // Getter y Setter

    public Moneda getBaseMoneda() {
        return baseMoneda;
    }

    public void setBaseMoneda(Moneda baseMoneda) {
        this.baseMoneda = baseMoneda;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
}
