import processing.core.*;

public class Problem03 extends PApplet {

    float angle;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        strokeWeight(6);
        angle = 0;
    }

    public void draw() {
        background(0);

        float r = min(width, height) / 10f;

        drawStar(width / 2f, height / 2f, height / 10f, angle, 255, 0, 0);
        drawStar(width / 4f, height / 4f, height / 15f, angle, 255, 255, 0);
        drawStar(width / 4f * 3, height / 4f * 3, height / 15f, angle, 255, 255, 0);
        drawStar(width / 4f * 3, height / 4f, height / 15f, angle, 255, 255, 0);
        drawStar(width / 4f, height / 4f * 3, height / 15f, angle, 255, 255, 0);

        angle += 0.05;

    }

    void drawStar(float xc, float yc, float r, float angle, float red, float green, float blue) {
        pushMatrix();
        translate(xc, yc);
        rotate(angle);
        stroke(red, green, blue);

        // Draw the main lines
        strokeWeight(3);
        line(-r, 0, r, 0);
        line(0, -r, 0, r);
        line(-r / 4f, r / 4f, r / 4f, -r / 4f);
        line(r / 4f, r / 4f, -r / 4f, -r / 4f);

        // Draw the outer lines
        strokeWeight(2);
        line(-r / 4f, r / 4f, 0, r);
        line(0, r, r / 4f, r / 4f);
        line(r / 4f, r / 4f, r, 0);
        line(r, 0, r / 4f, -r / 4f);
        line(r / 4f, -r / 4f, 0, -r);
        line(0, -r, -r / 4f, -r / 4f);
        line(-r / 4f, -r / 4f, -r, 0);
        line(-r, 0, -r / 4f, r / 4f);

        popMatrix();
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }
}