import processing.core.*;

public class Problem03 extends PApplet {

    float rectX;
    float rectY;
    float rectWidth;
    float rectHeight;

    float circleX;
    float circleY;
    float circleR;

    float ringX1;
    float ringY1;
    float ringR1;
    float ringR2;

    float textX;
    float textY;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        noStroke();
        strokeWeight(4);
        textSize(25);
        textAlign(CENTER, CENTER);

        rectWidth = width / 6f;
        rectHeight = height / 6f;
        rectX = width / 2f - rectWidth / 2f;
        rectY = height / 4f - rectHeight / 4f;

        circleX = width / 4f;
        circleY = height / 3.5f;
        circleR = height / 10f;

        ringX1 = width / 1.35f;
        ringY1 = height / 3.5f;
        ringR1 = height / 10f;
        ringR2 = height / 14f;

        textX = width / 2f;
        textY = height - height / 6f;

        frameRate(30);
    }

    public void draw() {
        background(0, 0, 0);

        if (mouseY > rectY && mouseY < rectY + rectHeight && mouseX > rectX && mouseX < rectX + rectWidth) {
            fill(255);
            stroke(255, 255, 0);
            text("Rectangle", textX, textY);
        } else {
            noStroke();
        }

        // rectangle
        fill(0, 100, 100);
        rect(rectX, rectY, rectWidth, rectHeight);

        float distance = sqrt(sq(abs(mouseX - circleX)) + sq(abs(mouseY - circleY)));
        if (distance < circleR) {
            fill(255);
            stroke(255, 255, 0);
            text("Circle", textX, textY);
        } else {
            noStroke();
        }

        /// first circle
        fill(255, 0, 0);
        circle(circleX, circleY, 2 * circleR);


        /// ring
        float distance1 = sqrt(sq(abs(mouseX - ringX1)) + sq(abs(mouseY - ringY1)));

        if (distance1 < ringR1 && distance1 > ringR2) {
            fill(255);
            stroke(255, 255, 0);
            text("Ring", textX, textY);
        } else {
            noStroke();
        }
        fill(0, 0, 255);
        circle(ringX1, ringY1, 2 * ringR1);
        fill(0);
        circle(ringX1, ringY1, 2 * ringR2);
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}