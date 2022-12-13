import processing.core.*;

public class Problem01 extends PApplet {
    static final int N_SNOWFLAKES = 100;
    float[] x = new float[N_SNOWFLAKES];
    float[] y = new float[N_SNOWFLAKES];
    float[] r = new float[N_SNOWFLAKES];
    float maxR;
    float minR;
    float[] angle = new float[N_SNOWFLAKES];
    float[] dAngle = new float[N_SNOWFLAKES];
    float[] c = new float[N_SNOWFLAKES];

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(60);
        strokeWeight(3);

        maxR = min(height, width) / 35f;
        minR = min(height, width) / 75f;

        for (int i = 0; i < N_SNOWFLAKES; i++) {
            x[i] = random(width);
            y[i] = random(height);
            r[i] = random(minR, maxR);
            angle[i] = random(2 * PI);
            dAngle[i] = random(-0.02f, 0.02f);
            c[i] = 20 + (255 - 20) / (maxR - minR) * (r[i] - minR);
        }
    }

    public void draw() {
        background(0, 0, 0);

        for (int i = 0; i < N_SNOWFLAKES; i++) {
            drawStar(x[i], y[i], r[i], angle[i], c[i]);
            y[i] += r[i] / 5f;
            angle[i] += dAngle[i];

            if (y[i] > height + r[i]) {
                x[i] = random(width);
                y[i] = -r[i];
            }
        }
    }

    void drawStar(float xc, float yc, float r, float angle, float color) {
        pushMatrix();
        translate(xc, yc);
        rotate(angle);
        stroke(color);

        // Draw the lines
        point(0, 0);
        line(0, 0, r, 0);
        line(0, 0, 0, -r);
        line(0, 0, -r, 0);
        line(0, 0, 0, r);
        line(0, 0, r / 2.5f, -r / 2.5f);
        line(0, 0, r / 2.5f, r / 2.5f);
        line(0, 0, -r / 2.5f, -r / 2.5f);
        line(0, 0, -r / 2.5f, r / 2.5f);

        popMatrix();
    }

    public static void main(String[] args) {
        PApplet.main("Problem01");
    }

}