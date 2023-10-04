package org.humber.dsa.week5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a Circle
        Circle circle = new Circle();
        circle.setCenterX(100);  // X-coordinate of the center
        circle.setCenterY(100);  // Y-coordinate of the center
        circle.setRadius(50);    // Radius of the circle
        circle.setFill(Color.GREY);  // Fill color
        circle.setStroke(Color.RED);  // Stroke color (border)

        // Create a StackPane and add the Circle to it
        StackPane root = new StackPane();
        root.getChildren().add(circle);

        // Create a Scene
        Scene scene = new Scene(root, 200, 200);

        // Set the title of the Stage (window)
        primaryStage.setTitle("JavaFX Circle Example");

        // Set the Scene for the Stage
        primaryStage.setScene(scene);

        // Show the Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
