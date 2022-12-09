import processing.core.*;

public class Problem03 extends PApplet {
    float angle = 0;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        strokeWeight(6);
    }

    public void draw() {
        background(0, 0, 0);

        float r = min(width, height) / 15f;

        translate(width / 2f, height / 2f);
        rotate(angle);
        stroke(255, 0, 0);
        line(-r, 0, r, 0);

        angle += 0.02f;


    }

    public static void main(String[] args) {
        PApplet.main("Problem03 ");
    }

}