package com.uam.paejavafxeventos.dao;

import com.uam.paejavafxeventos.model.Producto;

import java.util.HashMap;
import java.util.Map;

public class Inventariomemoria {
    // la funcion de esta clase es guardar el inventario atraves de todas las pantallas

    // la unica instancia que va a exister en el programa
    private static final Inventariomemoria instancia = new Inventariomemoria();

    private final Map<String, Producto> productos = new HashMap<>();
}
