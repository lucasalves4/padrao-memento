package org.example;

import java.util.ArrayList;
import java.util.List;

public class Formulario {

    private FormularioEstado estado;
    private List<FormularioEstado> memento = new ArrayList<FormularioEstado>();

    public FormularioEstado getEstado() {
        return this.estado;
    }

    public void setEstado(FormularioEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<FormularioEstado> getEstados() {
        return this.memento;
    }
}
