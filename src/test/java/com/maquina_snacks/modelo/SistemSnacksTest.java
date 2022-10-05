package com.maquina_snacks.modelo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SistemSnacksTest {

    @Test
    public void devueltaCompratest(){

        MaquinaSnacks maquina  = new MaquinaSnacks();
        SistemaSnaks sistemaSnaks = new SistemaSnaks();


        Producto producto1 = new Producto("Papas", 2_000);
        Producto producto2 = new Producto("Coca-Cola", 3_000);
        maquina.agregarProducto("1", producto1);
        maquina.agregarProducto("2", producto2);

        List<Producto> productosSeccion1 = maquina.obtenerProductosDesdeSeccion("1");
        List<Producto> productosSeccion2 = maquina.obtenerProductosDesdeSeccion("2");








    }
}
