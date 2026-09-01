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
    private void openGroceryStore(ActionEvent event) {
        openView("view/grocery-view.fxml", "Reto 1 · Inventario de pulpería", event);
    }

    @FXML
    private void openCoffeeReception(ActionEvent event) {
        openView("view/coffee-view.fxml", "Reto 2 · Recepción de café", event);
    }

    @FXML
    private void openCraftStore(ActionEvent event) {
        openView("view/crafts-view.fxml", "Reto 3 · Tienda de artesanías", event);
    }

    private void openView(String resource, String title, ActionEvent event) {
        URL url = MainApplication.class.getResource(resource);

        if (url == null) {
            showAlert(Alert.AlertType.INFORMATION, title,
                    "Esta vista todavía no existe.\n\nCrea el archivo:\n" + resource);
            return;
        }

        try {
            Parent root = FXMLLoader.load(url);
            Scene currentScene = ((Node) event.getSource()).getScene();

            Scene scene = new Scene(root);
            scene.getStylesheets().addAll(currentScene.getStylesheets());

            Stage window = new Stage();
            window.setTitle(title);
            window.setScene(scene);
            window.initModality(Modality.WINDOW_MODAL);
            window.initOwner(currentScene.getWindow());
            window.show();
        } catch (Exception e) {
            showAlert(Alert.AlertType.ERROR, "No se pudo abrir " + title, String.valueOf(e.getMessage()));
        }
    }

    private void showAlert(Alert.AlertType type, String header, String message) {
        Alert alert = new Alert(type);
        alert.setTitle("Eventos y controles JavaFX");
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
