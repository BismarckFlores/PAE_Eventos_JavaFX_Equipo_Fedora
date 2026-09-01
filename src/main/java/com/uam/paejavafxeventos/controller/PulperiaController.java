package com.uam.paejavafxeventos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.HashMap;
import java.util.Map;

public class PulperiaController {
    // Reto 1 - Contexto: una pulpería necesita registrar productos y consultar rápidamente sus existencias.
    //    Capturar código, nombre, precio y cantidad.
    //    Usar ActionEvent para guardar.
    //    Usar KeyEvent para buscar con ENTER.
    //    Validar campos vacíos y valores numéricos.
    //
    //Commit sugerido:
    //Implementa registro y búsqueda de productos

    private final Map<String, Producto> inventario = new HashMap<>();

    // ---- 4 cajas para el registro de un objeto: Codigo, Nombre, Precio, Cantidad ----
    @FXML private TextField txtCodigo;
    @FXML private TextField txtNombre;
    @FXML private TextField txtPrecio;
    @FXML private TextField txtCantidad;
    @FXML private Label lblMensaje;

    @FXML private TextField txtBuscar;
    @FXML private Label lblResultado;
    @FXML private ImageView imgNoEncontrado; // imagen que se muestra si no fue encontrado el objeto


    @FXML
    private void guardarProducto(ActionEvent event) {

        String codigo = txtCodigo.getText();
        String nombre = txtNombre.getText();
        String precioTexto = txtPrecio.getText();
        String cantidadTexto = txtCantidad.getText();

        // Validación: si CUALQUIERA de los 4 está vacío o nulo, no se guarda nada.
        if (esVacio(codigo) || esVacio(nombre) || esVacio(precioTexto) || esVacio(cantidadTexto)) {
            lblMensaje.setText("No es posible guardar el objeto, Asegurate de que todos los campos esten llenos");
            return;
        }
        // Validar que precio y cantidad sean números
        double precio;
        int cantidad;
        try {
            precio = Double.parseDouble(precioTexto.trim());
            cantidad = Integer.parseInt(cantidadTexto.trim());
        } catch (NumberFormatException error) {
            lblMensaje.setText("Precio y cantidad deben ser números válidos.");
            return;
        }

        // Guardar en memoria
        inventario.put(codigo.trim(), new Producto(nombre.trim(), precio, cantidad));

        lblMensaje.setText("Producto \"" + nombre.trim() + "\" guardado correctamente.");
        txtCodigo.clear();
        txtNombre.clear();
        txtPrecio.clear();
        txtCantidad.clear();

    }
