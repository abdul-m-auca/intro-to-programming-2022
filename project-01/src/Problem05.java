import processing.core.*;

public class Problem05 extends PApplet {
    float length;
    float lineA;
    float lineB;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        length = height / 10f;
    }

    public void draw() {
        background(0, 0, 0);

        lineA = width / 4f;
        lineB = height / 10f;

        for (int i = 0; i <= 8; ++i) {
            stroke(255);
            line(lineA, lineB, lineA + 8 * length, lineB);
            lineB += length;
        }
        lineB = height / 10f;
        for (int i = 0; i <= 8; ++i) {
            stroke(255);
            line(lineA, lineB, lineA, lineB + 8 * length);
            lineA += length;
        }


    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }
}