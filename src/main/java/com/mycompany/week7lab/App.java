package com.mycompany.week7lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
//for importing ctrl+space

/**
 * JavaFX App
 */
public class App extends Application {
    Group sp;
    int counter = 0;
    Label label;

    @Override
    public void start(Stage stage) {
        sp = new Group();
        var scene = new Scene(sp, 500, 500);       

        
        Button btn1 = new Button("Button 1");
        btn1.setLayoutX(100);
        btn1.setLayoutY(400);
        btn1.setOnAction( this::processBtn1 );
        sp.getChildren().add(btn1);
        
        Button btn2 = new Button("Button 2");
        btn2.setLayoutX(200);
        btn2.setLayoutY(400);
        btn2.setOnAction( this::processBtn2 );      
        sp.getChildren().add(btn2);

        label = new Label("Click counter");
        label.setLayoutX(300);
        label.setLayoutY(400);
        sp.getChildren().add(label);      
        String numString = Integer.toString(counter);
        label.setText(numString);
        
        stage.setScene(scene);
        stage.setTitle("Demo");
        stage.show();
        
    }
    
    public static void main(String[] args) {
        launch();
    }
    
    public void processBtn1(ActionEvent arg0){
        Image img = new Image("https://i.imgur.com/xEbIEhV.jpg", 100, 100, false, false);
        ImageView imgView = new ImageView(img);
        StackPane pane = new StackPane(imgView);
        pane.setLayoutX(250);
        pane.setLayoutY(250);
        sp.getChildren().add(pane);
        
        counter++;
        String numString = Integer.toString(counter);
        label.setText(numString);
    }
    
    public void processBtn2(ActionEvent arg1){
        Image img = new Image("https://i.imgur.com/D5NM6XT.jpg", 100, 100, false, false);
        ImageView imgView = new ImageView(img);
        StackPane pane = new StackPane(imgView);
        pane.setLayoutX(250);
        pane.setLayoutY(250);
        sp.getChildren().add(pane);
        
        counter++;
        String numString = Integer.toString(counter);
        label.setText(numString);
        
    }
    
    

}