package com.uam.paejavafxeventos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;

public class MainController {

    @FXML
    private void abrirPulperia(ActionEvent event) {
        abrirVista("view/pulperia-view.fxml", "Reto 1 · Inventario de pulpería", event);
    }

    @FXML
    private void abrirCafe(ActionEvent event) {
        abrirVista("view/cafe-view.fxml", "Reto 2 · Recepción de café", event);
    }

    @FXML
    private void abrirArtesanias(ActionEvent event) {
        abrirVista("view/artesania-view.fxml", "Reto 3 · Tienda de artesanías", event);
    }

    private void abrirVista(String recurso, String titulo, ActionEvent event) {
        URL url = MainApplication.class.getResource(recurso);

        if (url == null) {
            mostrarAviso(Alert.AlertType.INFORMATION, titulo,
                    "Esta vista todavía no existe.\n\nCrea el archivo:\n" + recurso);
            return;
        }

        try {
            Parent raiz = FXMLLoader.load(url);
            Scene escenaActual = ((Node) event.getSource()).getScene();

            Scene escena = new Scene(raiz);
            escena.getStylesheets().addAll(escenaActual.getStylesheets());

            Stage ventana = new Stage();
            ventana.setTitle(titulo);
            ventana.setScene(escena);
            ventana.initModality(Modality.WINDOW_MODAL);
            ventana.initOwner(escenaActual.getWindow());
            ventana.show();
        } catch (Exception e) {
            mostrarAviso(Alert.AlertType.ERROR, "No se pudo abrir " + titulo, String.valueOf(e.getMessage()));
        }
    }

    private void mostrarAviso(Alert.AlertType tipo, String encabezado, String mensaje) {
        Alert alerta = new Alert(tipo);
        alerta.setTitle("Eventos y controles JavaFX");
        alerta.setHeaderText(encabezado);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }
}
