/* none of this works 
package game;

import processing.core.PApplet;

public class GameSketch extends PApplet{
car car;
    @Override
    public void settings() {
        size(600, 600);
    }

    @Override
    public void setup() {
        car = new car(100,100,50,50);
    }

    @Override
    public void draw() {
        car.show();
    }

    public void run() {
        String[] processingArgs = { this.getClass().getName() };
        PApplet.runSketch(processingArgs, this);
    }
}*/