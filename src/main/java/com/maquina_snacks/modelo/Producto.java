package com.maquina_snacks.modelo;

import java.util.UUID;

public class Producto {
    private UUID id;
    private String nombre;
    private int valor;

    public Producto(String nombre, int valor) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.valor = valor;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }
}
