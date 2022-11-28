import processing.core.*;

public class Problem03 extends PApplet {

    float rectX;
    float rectY;
    float rectWidth;
    float rectHeight;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        noStroke();
        rectWidth = width / 3f;
        rectHeight = height / 3f;
        rectX = width / 2f - rectWidth / 2f;
        rectY = height / 2f - rectHeight / 2f;
    }

    public void draw() {
        //background(0, 0, 0);

        fill(0, 40);
        rect(0, 0, width, height);
        fill(0, 100, 100);
        rect(rectX, rectY, rectWidth, rectHeight);
        fill(0, 0, 255);
        circle(mouseX, mouseY, 50);
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}