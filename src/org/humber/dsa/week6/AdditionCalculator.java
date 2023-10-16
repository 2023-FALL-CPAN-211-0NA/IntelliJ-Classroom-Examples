package org.humber.dsa.week6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import static javafx.scene.control.Alert.AlertType;

public class AdditionCalculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Addition Calculator");

        // Create a GridPane
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        // Create two text fields for input
        TextField num1Field = new TextField();
        TextField num2Field = new TextField();


        // Create a button for addition
        Button addButton = new Button("Add");

        // Create a text field for displaying the result
        TextField resultField = new TextField();
        resultField.setEditable(false);

        num1Field.setOnMouseClicked(mouseEvent -> resultField.clear());

        // Set event handler for the button
        addButton.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 + num2;
                resultField.setText(Double.toString(result));
            } catch (NumberFormatException ex) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Invalid input");
                alert.showAndWait();
                resultField.setText("");
            }
        });

        // Add components to the GridPane
        grid.add(new Label("Number 1: "), 0, 0);
        grid.add(num1Field, 0, 1);
        grid.add(new Label("Number 2: "), 0, 2);
        grid.add(num2Field, 0, 3);
        grid.add(addButton, 0, 4);
        grid.add(resultField, 0, 5);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void setAddButtonHandler(Button addButton, TextField num1Field, TextField num2Field, TextField resultField) {
        // Set event handler for the button
        addButton.setOnAction(actionEvent -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 + num2;
                resultField.setText(Double.toString(result));
            } catch (NumberFormatException ex) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Invalid input");
                alert.showAndWait();
                resultField.clear();
            }
        });

    }
}
