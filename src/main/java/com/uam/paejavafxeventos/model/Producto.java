package com.uam.paejavafxeventos.model;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    // Constructor vacío
    public Producto() {
    }
    // Constructor completo
    public Producto(String codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}
