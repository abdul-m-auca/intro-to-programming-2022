import processing.core.*;

public class Problem05 extends PApplet {
    float r;
    float alpha = PI / 4f;
    float ex, ey;

    float tableSize;
    float gridX;
    float gridY;
    float cellSize;

    float msgX;
    float msgY;
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
        gridX = (width - cellSize * tableSize) / 2f;
        gridY = (height - cellSize * tableSize) / 2f;
    }

    public void draw() {
        background(0, 0, 0);
        translate(width / 2f, height / 2f);

        //table
        pushMatrix();

        translate(-200, -700);
        for (int row = 0; row < tableSize; row++) {
            stroke(255);
            strokeWeight(2);
            fill(0, 0, 255);
            rect(gridX + cellSize, gridY + cellSize * row, width / 7f, height / 15f);
        }
        popMatrix();

        //Text
        fill(255, 255, 255);
        textSize(msgSize);
        text("Sun", msgX, msgY);


        //sun
        noStroke();
        pushMatrix();
        fill(255, 255, 0);
        circle(0, 0, r * 2f);
        popMatrix();
        //earth
        fill(0, 0, 255);
        rotate(alpha);
        circle(350, 0, r / 1f);
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

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

}