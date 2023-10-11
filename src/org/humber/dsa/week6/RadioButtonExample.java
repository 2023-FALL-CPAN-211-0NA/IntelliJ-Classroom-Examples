package org.humber.dsa.week6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioButtonExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Radio Button Example");

        // Create a ToggleGroup to ensure only one radio button is selected at a time
        ToggleGroup toggleGroup = new ToggleGroup();

        // Create radio buttons
        RadioButton option1 = new RadioButton("Option 1");
        option1.setToggleGroup(toggleGroup);
        RadioButton option2 = new RadioButton("Option 2");
        option2.setToggleGroup(toggleGroup);
        RadioButton option3 = new RadioButton("Option 3");
        option3.setToggleGroup(toggleGroup);

        // Set a default selected radio button
        option1.setSelected(true);

        // Create a VBox to hold the radio buttons
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(option1, option2, option3);

        // Create the scene
        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
