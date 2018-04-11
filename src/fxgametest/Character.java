/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxgametest;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Christopher Allis
 */
public class Character extends MovableObject{
    
    public Character(){
        position = new Vector(0,0);
        size = new Vector(20,20);
    }
    
    @Override
    public void tick(long delta) {
        double d = ((double)delta)/100000000.0;
        position.set(50,40+Math.sin(d)*20);//40+Math.cos(d)*20
    }

    @Override
    public void render(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillRect(position.x, position.y, size.x, size.y);
    }
    
}
