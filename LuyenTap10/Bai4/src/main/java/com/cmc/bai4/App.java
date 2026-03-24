package com.cmc.bai4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/cmc/bai4/Calculator.fxml"));
        Scene scene = new Scene(loader.load());

        scene.getStylesheets().add(getClass().getResource("/com/cmc/bai4/style.css").toExternalForm());

        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}