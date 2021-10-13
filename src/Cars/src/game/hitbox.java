package game;

import processing.core.PApplet;

class hitbox extends PApplet{
    float t;
    float b;
    float l; 
    float r;
    
    hitbox(float x,float y,float w,float h){
    t = y;
    b = y+h;
    l = x;
    r = x+w;
    }

    boolean hit(hitbox other) {
    return !(this.l > other.r || this.r < other.l || this.t > other.b || this.b < other.t);
}
}