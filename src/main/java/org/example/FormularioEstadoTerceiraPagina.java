package org.example;

public class FormularioEstadoTerceiraPagina implements FormularioEstado{

    private FormularioEstadoTerceiraPagina() {};
    private static FormularioEstadoTerceiraPagina instance = new FormularioEstadoTerceiraPagina();
    public static FormularioEstadoTerceiraPagina getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Terceira página preenchida";
    }
}
