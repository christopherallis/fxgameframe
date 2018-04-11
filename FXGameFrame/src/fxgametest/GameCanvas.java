/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxgametest;

import java.util.ArrayList;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Christopher Allis
 */
public class GameCanvas extends Canvas {
    
    private ArrayList<MovableObject> objects;
    private int WIDTH;
    private int HEIGHT;
    
    
    public GameCanvas(int WIDTH, int HEIGHT){
        super(WIDTH,HEIGHT);
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        objects = new ArrayList<>();
    }
    
    public void addObject(MovableObject mo){
        objects.add(mo);
    }
    
    public void tick(long delta){
        for (MovableObject mo : objects) {
            mo.tick(delta);
        }
    }
    public void render(GraphicsContext gc){
        gc.clearRect(0, 0, WIDTH, HEIGHT);
        for (MovableObject mo : objects) {
            mo.render(gc);
        }
    }
}
