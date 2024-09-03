package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormularioTest {

    @Test
    void deveArmazenarEstados() {
        Formulario formulario = new Formulario();
        formulario.setEstado(FormularioEstadoPrimeiraPagina.getInstance());
        formulario.setEstado(FormularioEstadoSegundaPagina.getInstance());
        assertEquals(2, formulario.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Formulario formulario = new Formulario();
        formulario.setEstado(FormularioEstadoPrimeiraPagina.getInstance());
        formulario.setEstado(FormularioEstadoSegundaPagina.getInstance());
        formulario.restauraEstado(0);
        assertEquals(FormularioEstadoPrimeiraPagina.getInstance(), formulario.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Formulario formulario = new Formulario();
        formulario.setEstado(FormularioEstadoPrimeiraPagina.getInstance());
        formulario.setEstado(FormularioEstadoSegundaPagina.getInstance());
        formulario.setEstado(FormularioEstadoTerceiraPagina.getInstance());
        formulario.restauraEstado(1);
        assertEquals(FormularioEstadoSegundaPagina.getInstance(), formulario.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Formulario formulario = new Formulario();
            formulario.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}