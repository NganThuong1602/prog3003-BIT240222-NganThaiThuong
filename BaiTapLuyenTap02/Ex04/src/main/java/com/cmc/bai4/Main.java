package com.cmc.bai4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Label lblInput = new Label("Nhap nhiet do C:");
        TextField txtCelsius = new TextField();
        Button btnConvert = new Button("Chuyen doi");
        Label lblResult = new Label("Ket qua se hien thi o day");

        btnConvert.setOnAction(e -> {
            try {
                double C = Double.parseDouble(txtCelsius.getText());
                double F = C * 9 / 5 + 32;
                lblResult.setText("Nhiet do F: " + F);
            } catch (NumberFormatException ex) {
                lblResult.setText("Vui long nhap so hop le");
            }
        });

        VBox root = new VBox(10);
        root.setPadding(new Insets(15));
        root.getChildren().addAll(lblInput, txtCelsius, btnConvert, lblResult);

        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("Chuyen doi do C sang F");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}