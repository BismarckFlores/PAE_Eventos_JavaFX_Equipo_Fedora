package com.uam.paejavafxeventos.dao;

import com.uam.paejavafxeventos.model.Producto;

import java.util.HashMap;
import java.util.Map;

public class Inventariomemoria {
    // la funcion de esta clase es guardar el inventario atraves de todas las pantallas

    // la unica instancia que va a exister en el programa
    private static final Inventariomemoria instancia = new Inventariomemoria();

    private final Map<String, Producto> productos = new HashMap<>();

    //constructor privado: nadie mas puede hacer "new Inventariomemoria()"
    private Inventariomemoria(){
    }

    // Punto de acceso unico: para que siempre develva la misma instancia
    public static Inventariomemoria getInstancia(){
        return instancia;
    }

    public void guardar(String codigo, Producto producto){
        productos.put(codigo, producto);
    }
    public Producto buscar(String codigo){
        return productos.get(codigo);
    }
}
