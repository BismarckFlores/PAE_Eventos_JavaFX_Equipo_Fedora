
package com.uam.paejavafxeventos.util;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.util.Duration;

import java.io.IOException;

//Utilidad reutilizable para cambiar de pantalla CON una animación de * fade (desvanecido), en vez de un cambio brusco.//


public class Navegador {
    private static final Duration DURACION = Duration.millis(250);

    public static void cambiarEscenaConFade(ActionEvent event, String rutaFxml) {
        // El nodo que originó el evento (el botón presionado)

        Node origen = (Node) event.getSource();
        Scene escena = origen.getScene();
        Parent raizActual = escena.getRoot();



    }
