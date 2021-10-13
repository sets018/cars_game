/*variables*/
// 0: Initial Screen
// 1: Game Screen
// 2: Game-over Screen
package game;
import processing.core.*;
import gifAnimation.*;
public class Juego extends PApplet{
    int gamestart = 0;
    Gif pre_gamescrbg;
    car car;
    public void settings() {
        size(1080, 1080);
    }

    @Override
    public void setup() {
        car = new car(5,5,5,5,5);
        frameRate(10);
        pre_gamescrbg = new Gif(this,"Gif portada.gif");
        pre_gamescrbg.play();
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
    }
    void pregamescr() {
    // placeholder
        background(486);
    }
    void gamescr() {
    // codes of game screen 
        background(86);
        car.show();
        
        if(keyPressed){
            if((key == 'w')||(key == 'W')){
                car.go_forward();
        }
        
    }
    if(keyPressed){
            if((key == 'a')||(key == 'A')){
                car.go_left();
        }
        
    }
    if(keyPressed){
            if((key == 'd')||(key == 'D')){
                car.go_right();
        }
        
    }
    }
    void gameoverscr(){
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

    
