package org.hoangit3.layouts.flow_pane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class FlowPaneTest extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");

        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10);
        flowPane.setVgap(3);
        flowPane.setPrefWrapLength(250);
        flowPane.getChildren().addAll(btn1, btn2, btn3, btn4);

        Scene scene = new Scene(flowPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Flow layout pane");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
