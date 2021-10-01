/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import processing.core.PApplet;
/**
 *
 * @author lu23p
 */
public class Juego extends PApplet{
    int x =250,y=500,w=100,h=50;
    boolean button=false;
    
    
    @Override
    public void settings() {
        size(600, 600);
    }

    @Override
    public void setup() {
        frameRate(10);
    }

    @Override
    public void draw() {                      
        if (button==true){
            background(152,190,100);
        }else{
            background(0);
        }
        rect(x,y,w,h);
        
    }

    public void run() {
        String[] processingArgs = { this.getClass().getName() };
        PApplet.runSketch(processingArgs, this);
    }
    
    public void mousePressed(){
        if((mouseX >x) && (mouseX <x+w) && (mouseY > y) && (mouseY < y+h)){
            if (button==true){
            button = false;
        }else{
            button = true;
        }
        }
    }
     
    
    public void nuevoJuego() {
        
    }

    public void finJuego() {
        
    }
}
