package org.hoangit3.layouts.border_pane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneTest extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label1 = new Label("Label 1");
        Label label2 = new Label("Label 2");
        Label label3 = new Label("Label 3");
        Label label4 = new Label("Label 4");

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(label4);
        borderPane.setRight(label1);
        borderPane.setBottom(label3);
        borderPane.setTop(label2);

        Scene scene = new Scene(borderPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("BorderPane layout");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
