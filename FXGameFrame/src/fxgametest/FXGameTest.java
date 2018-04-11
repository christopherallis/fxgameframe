/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxgametest;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Christopher Allis
 */
public class FXGameTest extends Application {
    private int WIDTH = 200;
    private int HEIGHT = 200;
    @Override
    public void start(Stage primaryStage) {
        
        StackPane root = new StackPane();
        GameCanvas canvas = new GameCanvas(WIDTH,HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        
        
        canvas.addObject(new Character());
        AnimationTimer animator = new AnimationTimer(){
            @Override
            public void handle(long delta) {
                canvas.tick(delta);
                canvas.render(gc);
            }
        };
        
        
        
        animator.start();
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
