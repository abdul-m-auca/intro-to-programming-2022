import processing.core.*;

public class Problem02 extends PApplet {
    final float max = 180;
    final float min = 50;

    float start1 = min + (max - min) / 2;
    float start2 = min + (max - min) / 2;
    float num1 = 3;
    float num2 = 3;
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
        textSize(msgSize);
        fill(0, 255, 51);
        text("Write once!!!", width / 2f, height / 2f);
        fill(255, 0, 0);
        text("Java Slogan:", width / 2f, height / 4f);
        fill(0, 0, 255);
        text("run anywhere", width / 2f, height - height / 4f);

        msgSize += dMsgSize;
        if (msgSize < 20 || 100 <= msgSize) {
            dMsgSize = -dMsgSize;
        }
        if (start1 > max) {
            start1 = max;
            num1 = -num1;
        }

    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }

}