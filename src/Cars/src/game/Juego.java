/*variables*/
// 0: Initial Screen
// 1: Game Screen
// 2: Game-over Screen
package game;
import processing.core.*;
import gifAnimation.*;
public class Juego extends PApplet{
    int gamestart = 0;
    PImage title;
    PImage tap;
    Gif pre_gamescrbg;
    car car;
    public void settings() {
        size(1080, 1080);
    }

    @Override
    public void setup() {
        frameRate(10);
        pre_gamescrbg = new Gif(this,"pre_gamescrbg.gif");
        pre_gamescrbg.play();
        title = loadImage("TITLE.png");
        tap = loadImage("TAP.png");
    }

    @Override
    public void draw() {
        switch (gamestart) {
            case 0:
                initialscr();
                break;
            case 1:
                pregamescr();
                break;
            case 2:
                gamescr();
                break;
            case 3:
                gameoverscr();
                break;
            default:
                break;
        }
    }  
    
    /*screens*/
    void initialscr() {
        image(pre_gamescrbg,0,0);
        pre_gamescrbg.blend(title, 0, 0, 980,980,150,20,800,250,ADD);
        pre_gamescrbg.blend(tap, 0, 0, 980,980,150,800,800,250,ADD);
    }
    void pregamescr() {
    // placeholder
        background(486);
    }
    void gamescr() {
    // codes of game screen 
        background(86);
        car = new car(100,100,50,50);
        if(car != null){
            car.show_car();
        }
    }
    void gameoverscr() {
    // codes for game over screen
        background(8);
    }
      
    public void run() {
        String[] processingArgs = { this.getClass().getName() };
        PApplet.runSketch(processingArgs, this);
    }
    
    @Override
    public void mousePressed(){
        if (gamestart == 0){
            nuevoJuego();
        }
        else {
            cargarJuego();
        }
    }
    public void nuevoJuego(){
        gamestart = 1;
    }
    
    public void cargarJuego(){
        gamestart = 2;
    }
    public void finJuego() {
        
    }
}

    
