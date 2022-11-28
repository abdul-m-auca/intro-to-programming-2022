import processing.core.*;

public class Problem04 extends PApplet {

    float circleX;
    float circleY;
    float circleR;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        circleX = width / 2f;
        circleY = height / 2f;
        circleR = height / 50f;
    }

    public void draw() {
        background(0, 0, 0);
        circle(circleX, circleY, 2 * circleR);
        if (key == CODED) {
            if (keyCode == UP) {
                circleY -= circleR;
            }
            if (keyCode == DOWN) {
                circleY += circleR;
            }
            if (keyCode == LEFT) {
                circleX -= circleR;
            }
            if (keyCode == RIGHT) {
                circleX += circleR;
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }
}
