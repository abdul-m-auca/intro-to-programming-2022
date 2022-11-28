import processing.core.*;

public class Problem03 extends PApplet {

    float rectX;
    float rectY;
    float rectWidth;
    float rectHeight;

    float circleX;
    float circleY;
    float circleR;

    float circleX1;
    float circleY1;
    float circleR1;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        noStroke();
        rectWidth = width / 4f;
        rectHeight = height / 4f;
        rectX = width / 2f - rectWidth / 2f;
        rectY = height / 2f - rectHeight / 2f;

        circleX = width / 4f;
        circleY = height / 4f;
        circleR = height / 10f;
        frameRate(30);

        circleX1 = width / 2f;
        circleY1 = height / 2f;
        circleR1 = height / 10f;
        frameRate(30);
    }

    public void draw() {
        //background(0, 0, 0);

        fill(0, 40);
        rect(0, 0, width, height);
        fill(0, 100, 100);
        rect(rectX, rectY, rectWidth, rectHeight);
        fill(0, 0, 255);

        circle(mouseX, mouseY, 50);

        /// first circle
        fill(255, 255, 0);
        circle(circleX, circleY, 2 * circleR);

        /// second circle

        fill(0, 0, 255);
        circle(circleX1, circleY1, 2 * circleR1);
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}