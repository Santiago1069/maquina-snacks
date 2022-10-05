package com.maquina_snacks.modelo;

import java.util.*;

public class MaquinaSnacks {

    private Map<String, List<Producto>> productos;

    public MaquinaSnacks() {
        this.productos = new HashMap<>();
    }

    public void agregarProducto(String seccion, Producto producto) {

        if(productos.containsKey(seccion)) {

            List<Producto> listaSeccion = productos.get(seccion);
            listaSeccion.add(producto);

        } else {

            List<Producto> listaNueva = new ArrayList<>();
            listaNueva.add(producto);
            productos.put(seccion, listaNueva);

        }
    }

    public List<Producto> obtenerProductosDesdeSeccion(String seccion) {
        return productos.get(seccion);
    }


    public Producto sacarProducto(String seccion){

        // preguntar si productos en la seccion
        if (productos.containsKey(seccion)){

            List<Producto> listaProductos = productos.get(seccion);

            if( !listaProductos.isEmpty()){
                Producto productoParaSacar = listaProductos.get(0);
                listaProductos.remove(0);
                return productoParaSacar;
            }
        }
        return null;
    }




}
