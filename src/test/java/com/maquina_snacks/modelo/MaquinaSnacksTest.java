package com.maquina_snacks.modelo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaquinaSnacksTest {



    @Test
    public void agregarProductosEnDiferenteSeccion() {

        // arrange (organizar/inicializar)
        MaquinaSnacks maquina  = new MaquinaSnacks();

        Producto producto1 = new Producto("Galletas", 1_000);
        Producto producto2 = new Producto("Coca Cola", 2_500);
        Producto producto3 = new Producto("Papas", 2_000);
        Producto producto4 = new Producto("Papas", 2_000);


        // act (actual)
        maquina.agregarProducto("1", producto1);
        maquina.agregarProducto("2", producto2);
        maquina.agregarProducto("3", producto3);
        maquina.agregarProducto("3", producto4);


        // assert (verificar)
        List<Producto> productosSeccion1 = maquina.obtenerProductosDesdeSeccion("1");
        List<Producto> productosSeccion2 = maquina.obtenerProductosDesdeSeccion("2");
        List<Producto> productosSeccion3 = maquina.obtenerProductosDesdeSeccion("3");


        assertEquals(1, productosSeccion1.size());
        assertEquals(productosSeccion1.get(0).getId(), producto1.getId());
        assertEquals(productosSeccion1.get(0).getNombre(), producto1.getNombre());
        assertEquals(productosSeccion1.get(0).getValor(), producto1.getValor());


        assertEquals(1, productosSeccion2.size());
        assertEquals(productosSeccion2.get(0).getId(), producto2.getId());
        assertEquals(productosSeccion2.get(0).getNombre(), producto2.getNombre());
        assertEquals(productosSeccion2.get(0).getValor(), producto2.getValor());


        assertEquals(2, productosSeccion3.size());

    }
}
