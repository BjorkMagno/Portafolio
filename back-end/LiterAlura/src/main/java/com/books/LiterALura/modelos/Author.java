package com.books.LiterALura.modelos;

public class Author {
    private String nombreAutor;
    private int anoNacimiento;
    private int anoFallecimiento;

    // Constructor
    public Author(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    // Getter y Setter
    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public Integer getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(Integer anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public Integer getAnoFallecimiento() {
        return anoFallecimiento;
    }

    public void setAnoFallecimiento(Integer anoFallecimiento) {
        this.anoFallecimiento = anoFallecimiento;
    }

    // Salida

    @Override
    public String toString() {
        return nombreAutor + " (" + anoNacimiento + " - " + anoFallecimiento + ")";
    }
}
