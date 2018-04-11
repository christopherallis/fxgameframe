/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxgametest;

/**
 *
 * @author Christopher Allis
 */
public class Vector {
    public double x = 0;
    public double y = 0;
    
    public Vector(){
        
    }
    public Vector(double x, double y){
        set(x,y);
    }
    public void add(double x, double y){
        this.x+=x;
        this.y+=y;
    }
    public void add(Vector o){
        this.x+=o.x;
        this.y+=o.y; 
    }
    public void set(double x, double y){
        this.x=x;
        this.y=y;
    }
}
