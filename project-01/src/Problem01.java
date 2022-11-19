import processing.core.*;

public class Problem01 extends PApplet {
    float xCenter;
    float yCenter;

    float xRight;
    float xLeft;

    float yTop;
    float yBottom;
    float dx;
    float dy;
    float radius;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        textAlign(CENTER, CENTER);

        xCenter = width / 2f;
        yCenter = height / 2f;
        xRight = xCenter + width / 4f;
        xLeft = xCenter - width / 4f;
        yTop = yCenter - height / 4f;
        yBottom = yCenter + height / 4f;
        dx = 10;
        dy = 14;
        frameRate(60);
        radius = 40;
    }

    public void draw() {
        //background should be black;
        fill(0, 0, 0, 40);
        rect(0, 0, width, height);
        //Center circle
        fill(255, 0, 255);
        noStroke();
        circle(xCenter, yCenter, 50);
        //top right circle
        fill(0, 255, 0);
        noStroke();
        circle(xRight, yTop, radius);
        //bottom right circle
        fill(255, 0, 0);
        noStroke();
        circle(xRight, yBottom, radius);
        //top left circle
        fill(0, 0, 255);
        noStroke();
        circle(xLeft, yTop, radius);
        //bottom left circle
        fill(255, 255, 0);
        noStroke();
        circle(xLeft, yBottom, radius);
        //the movement of circles on x-axis
        xCenter += dx;
        xRight += dx;
        xLeft += dx;
        if (xRight >= width) {
            dx = -dx;
        }
        if (xLeft <= 0) {
            dx = -dx;
        }
        //circles on the y-axis
        yCenter += dy;
        yTop += dy;
        yBottom += dy;
        if (yBottom >= height) {
            dy = -dy;
        }
        if (yTop <= 0) {
            dy = -dy;
        }

    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}