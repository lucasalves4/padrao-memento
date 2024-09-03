package org.example;

public class FormularioEstadoSegundaPagina implements FormularioEstado{

    private FormularioEstadoSegundaPagina() {};
    private static FormularioEstadoSegundaPagina instance = new FormularioEstadoSegundaPagina();
    public static FormularioEstadoSegundaPagina getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Segunda página preenchida";
    }
}
