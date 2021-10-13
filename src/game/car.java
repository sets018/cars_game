/*package game;

public class car extends hitbox{
    car(float x,float y,float w,float h){
        super(x,y,w,h);
    }
    public void show_car(){
        rect(l,t,r,b);
        
    }
    
}*/
package game;
import processing.core.*;
public class car extends PApplet{
  float v = 1;
  float x = 5;
  float y = 10;
  float w = 4;
  float h = 5;
  float vx;
  float vy;
  float ax;
  float ay;
  float t;
  float b;
  float l; 
  float r;
  
  void hitbox(float x,float y,float w,float h){
    t = y;
    b = y+h;
    l = x;
    r = x+w;
   }

    boolean hit(hitbox other) {
    return !(this.l > other.r || this.r < other.l || this.t > other.b || this.b < other.t);
}
  
  car(float x,float y,float w,float h,float v){
        
   }
 
  void show(){
    rectMode(CENTER);   
    translate(x,y);
    fill(0);
    rect(0, 0, w, h);
    fill(255);
    ellipse(w/2,0,10,10);
  }
 
  void go_forward(){
    ax = v*2;
    ay = v*2;
    vx += ax;
    vy += ay;
    move();
    vx=0;
    vy=0;
  }
 
  void go_left(){
    x = x-50;
  }
 
  void go_right(){
    x = x+50;
  }
 
  void move() {
      x += vx;
      y += vy;
     
      if(x>width) {
        x=0;
      }
      else if(x<0){
        x = width;
      }
     
      if(y>height) {
        y=0;
      }
      else if(y<0){
        y= height;
      }
  }
  }
