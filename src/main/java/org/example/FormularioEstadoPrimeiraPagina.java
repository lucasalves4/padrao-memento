package org.example;

public class FormularioEstadoPrimeiraPagina implements FormularioEstado{

    private FormularioEstadoPrimeiraPagina() {};
    private static FormularioEstadoPrimeiraPagina instance = new FormularioEstadoPrimeiraPagina();
    public static FormularioEstadoPrimeiraPagina getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Primeira página preenchida";
    }
}
