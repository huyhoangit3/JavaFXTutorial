package org.hoangit3.layouts.stack_pane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackPaneTest extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Button 1 on bottom ");
        Button btn2 = new Button("Button 2 on top");
        StackPane root = new StackPane(btn1, btn2);
        Scene scene = new Scene(root,300,200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
