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
        circleR = height / 30f;
        frameRate(30);
    }

    public void draw() {
        fill(0, 40);
        rect(0, 0, width, height);

        fill(255, 255, 0);
        circle(circleX, circleY, 2 * circleR);
        if (key == CODED) {
            if (keyCode == UP) {
                circleY -= 2 * circleR;
            }
            if (keyCode == DOWN) {
                circleY += 2 * circleR;
            }
            if (keyCode == LEFT) {
                circleX -= 2 * circleR;
            }
            if (keyCode == RIGHT) {
                circleX += 2 * circleR;
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }
}
