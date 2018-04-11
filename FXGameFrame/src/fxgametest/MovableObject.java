/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxgametest;

import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Christopher Allis
 */
public abstract class MovableObject {
    public Vector position = new Vector();
    public Vector size = new Vector();
    public double rotation = 0;
    
    public abstract void tick(long delta);
    public abstract void render(GraphicsContext gc);
    
}
