package com.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
    	primaryStage.setTitle("Hello World!");
        
        StackPane root = new StackPane();
        root.getChildren().add(createButton());

        Scene scene = new Scene(root, 300, 250);
        
		primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private Button createButton() {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        btn.setOnAction((ActionEvent event) -> {
        	System.out.println("Hello World! " + event);
        });
        return btn;
    }
   

}