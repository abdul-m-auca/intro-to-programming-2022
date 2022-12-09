import processing.core.*;

public class Problem06 extends PApplet {
    final int NUMBER_OF_CIRCLES = 50;
    float r;
    float alpha = PI / 4f;
    float ex, ey;

    float tableSize;
    float gridX;
    float gridY;
    float cellSize;
    float menuWidth;
    float menuHeight;

    float msgX;
    float msgY;

    float msgX1;
    float msgY1;
    float msgSize;

    String X1 = "Sun";
    String X2 = "Venus";
    String X3 = "Earth";
    String X4 = "Moon";

    public void settings() {
        fullScreen();
        r = 100f;
        ex = 140;
        ey = 0;
    }

    public void setup() {
        tableSize = 4;
        cellSize = min(width, height) / 15f;
        gridX = width / 7f * 5.5f;
        gridY = height / 7f;

        textAlign(CENTER, CENTER);
        msgSize = min(width, height) / 32f;

        menuWidth = width / 7f;
        menuHeight = height / 15f;
    }

    public void draw() {
        background(0, 0, 0);

        //table
        for (int row = 0; row < tableSize; row++) {
            stroke(255);
            strokeWeight(2);
            fill(0, 0, 255);
            rect(gridX, gridY + cellSize * row, menuWidth, menuHeight);
        }

        //Text
        fill(255);
        textSize(msgSize);
        text("Sun", gridX + menuWidth / 2f, gridY + menuHeight / 2f);
        text("Venus", gridX + menuWidth / 2f, gridY + menuHeight + menuHeight / 2f);


        translate(width / 2f, height / 2f);
        //sun
        noStroke();
        pushMatrix();
//        fill(255, 255, 0);
//        circle(0, 0, r * 2f);
        drawConcentricCircles(0, 0, r * 2f, 255, 255, 0);
        popMatrix();

        //earth
        rotate(alpha);
//        circle(350, 0, r);
        drawConcentricCircles(350, 0, r, 0, 0, 255);
        alpha += 2 * PI / 200f;

        //moon
        pushMatrix();
        translate(350, 0);
        rotate(alpha);
        fill(255);
        circle(100, 0, r / 6f);
        popMatrix();

        // venus
        fill(31, 190, 214);
        rotate(alpha);
        circle(200, 0, r);


    }

    void drawConcentricCircles(float x, float y, float r, float redComp, float greenComp, float blueComp) {
        float dr = r / NUMBER_OF_CIRCLES;
        float dRedComp = redComp / NUMBER_OF_CIRCLES;
        float dGreenComp = greenComp / NUMBER_OF_CIRCLES;
        float dBlueComp = blueComp / NUMBER_OF_CIRCLES;

        for (int i = 0; i < NUMBER_OF_CIRCLES; ++i) {
//            fill(redComp, greenComp, blueComp);
            fill(dRedComp + dRedComp * i, dGreenComp + dGreenComp * i, dBlueComp + dBlueComp * i);
            circle(x, y, 2 * r);
            r -= dr;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem06");
    }

}