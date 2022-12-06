import processing.core.*;

public class Problem02 extends PApplet {
    float x;
    float y;
    float dx;
    float dy;
    float msgSize = 32;
    float dMsgSize = 2;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        textAlign(CENTER, CENTER);

        x = width / 2f;
        y = height / 2f;
        dx = random(-10, 10);
        dy = random(-10, 10);
        frameRate(40);

    }

    public void draw() {
        background(0, 0, 0);
        textSize(72);
        fill(255, 0, 0);
        text("Hello, Processing!!!", width / 2f, height / 2f);

    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}