package com.uam.paejavafxeventos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("view/main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 460, 480);
        scene.getStylesheets().add(
                MainApplication.class.getResource("css/app.css").toExternalForm());

        stage.setTitle("Eventos y controles JavaFX");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
