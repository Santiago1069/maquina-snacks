package com.maquina_snacks.modelo;

public class OrdenCompra {

    private String seccion;
    private int dinero;

    public OrdenCompra(String seccion, int dinero) {
        this.seccion = seccion;
        this.dinero = dinero;
    }

    public String getSeccion() {
        return seccion;
    }


    public int getDinero() {
        return dinero;
    }

}
