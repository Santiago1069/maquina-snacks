package com.maquina_snacks.modelo;

import java.util.List;

public class SistemaSnaks {

    private MaquinaSnacks maquina;

    public SistemaSnaks() {
        this.maquina = new MaquinaSnacks();
    }

    public DevueltaCompra comprar(OrdenCompra compra) {

        List<Producto> lista_productos = maquina.obtenerProductosDesdeSeccion(compra.getSeccion());

        if (!lista_productos.isEmpty()){

            int dinero_ingresado = compra.getDinero();
            int valor_producto = lista_productos.get(0).getValor();

            if (dinero_ingresado >= valor_producto){

                Producto productoSacar = maquina.sacarProducto(compra.getSeccion());
                int devueltas = dinero_ingresado - valor_producto;


                return new DevueltaCompra(productoSacar, devueltas);
            }
        }

        return null;

    }

}
