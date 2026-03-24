package com.cmc.bai4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {

    @FXML
    private Label lblDisplay;

    @FXML
    private Label lblExpression;

    private String currentInput = "";
    private double firstNumber = 0;
    private String operator = "";
    private boolean startNewNumber = false;

    @FXML
    private void initialize() {
        lblDisplay.setText("0");
        lblExpression.setText("");
    }

    @FXML
    private void handleNumber(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        if (startNewNumber) {
            currentInput = "";
            startNewNumber = false;
        }

        if (".".equals(value)) {
            if (currentInput.isEmpty()) {
                currentInput = "0";
            }
            if (currentInput.contains(".")) {
                return;
            }
        }

        currentInput += value;
        lblDisplay.setText(currentInput);
    }

    @FXML
    private void handleOperator(ActionEvent event) {
        String newOperator = ((Button) event.getSource()).getText();

        if (currentInput.isEmpty()) {
            if (!operator.isEmpty()) {
                operator = newOperator;
                lblExpression.setText(formatNumber(firstNumber) + " " + operator);
            }
            return;
        }

        if (!operator.isEmpty() && !startNewNumber) {
            handleEqual();
            firstNumber = Double.parseDouble(lblDisplay.getText());
        } else {
            firstNumber = Double.parseDouble(currentInput);
        }

        operator = newOperator;
        lblExpression.setText(formatNumber(firstNumber) + " " + operator);
        startNewNumber = true;
    }

    @FXML
    private void handleEqual() {
        if (currentInput.isEmpty() || operator.isEmpty()) {
            return;
        }

        double secondNumber = Double.parseDouble(currentInput);
        double result = 0;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "×":
                result = firstNumber * secondNumber;
                break;
            case "÷":
                if (secondNumber == 0) {
                    lblExpression.setText(formatNumber(firstNumber) + " ÷ " + formatNumber(secondNumber) + " =");
                    lblDisplay.setText("Không thể chia 0");
                    currentInput = "";
                    operator = "";
                    startNewNumber = true;
                    return;
                }
                result = firstNumber / secondNumber;
                break;
            default:
                return;
        }

        lblExpression.setText(formatNumber(firstNumber) + " " + operator + " " + formatNumber(secondNumber) + " =");
        currentInput = formatNumber(result);
        lblDisplay.setText(currentInput);

        operator = "";
        startNewNumber = true;
    }

    @FXML
    private void handleClear() {
        currentInput = "";
        firstNumber = 0;
        operator = "";
        startNewNumber = false;
        lblDisplay.setText("0");
        lblExpression.setText("");
    }

    @FXML
    private void handleDelete() {
        if (startNewNumber) {
            return;
        }

        if (!currentInput.isEmpty()) {
            currentInput = currentInput.substring(0, currentInput.length() - 1);
            lblDisplay.setText(currentInput.isEmpty() ? "0" : currentInput);
        }
    }

    @FXML
    private void handlePlusMinus() {
        if (currentInput == null || currentInput.isEmpty()) {
            return;
        }

        if (currentInput.startsWith("-")) {
            currentInput = currentInput.substring(1);
        } else {
            currentInput = "-" + currentInput;
        }

        lblDisplay.setText(currentInput);
    }

    @FXML
    private void handlePercent() {
        if (currentInput == null || currentInput.isEmpty()) {
            return;
        }

        double value = Double.parseDouble(currentInput) / 100.0;
        currentInput = formatNumber(value);
        lblDisplay.setText(currentInput);
    }

    private String formatNumber(double value) {
        if (value == (long) value) {
            return String.valueOf((long) value);
        }
        return String.valueOf(value);
    }
}