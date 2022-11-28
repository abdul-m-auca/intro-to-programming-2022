import processing.core.PApplet;

public class Problem04 extends PApplet {

    final float SQUARES_IN_COLUMN = 12;
    final float CUBES_IN_ROW = 15;

    float size, xLeft, yUpper, rightBorder, leftBorder, upBorder, downBorder;
    float circleX, circleY, dx, dy;
    String s;

    public void settings() {
        fullScreen();
    }

    public void setup() {

// maintaining the table

        size = width / 30;
        xLeft = 8 * size;
        yUpper = 3 * size;

        leftBorder = xLeft + size;
        rightBorder = width - leftBorder;
        upBorder = yUpper + size;
        downBorder = height - upBorder;

// maintaining the snake

        circleX = xLeft + size / 2;
        circleY = yUpper + size / 2;
        dx = 0;
        dy = 0;
        frameRate(20);
        background(0);

        s = "Press Arrow buttons";
        textAlign(CENTER, CENTER);
        textSize(25);

    }

    public void draw() {

        fill(0, 0, 0);
        rect(0, 0, width, yUpper - 10);
        fill(255, 0, 0);
        text(s, width / 2, 2 * size);

// creating table

        fill(0, 0, 0, 30);
        stroke(0, 0, 650);
        strokeWeight(1);

        for (int row = 0; row < SQUARES_IN_COLUMN; row++) {
            for (int col = 0; col < CUBES_IN_ROW; col++) {
                square(xLeft + col * size, yUpper + row * size, size);
            }
        }

// drawing the snake (circle)

        noStroke();
        fill(255, 0, 0);
        circle(circleX, circleY, size);
        circleX += dx;
        circleY += dy;

// showing borders of the snake

        if (circleX > rightBorder || circleX < leftBorder) {
            dx = 0;
        }
        if (circleY < upBorder || circleY > downBorder) {
            dy = 0;
        }

    }

// what direction the snake goes

    public void keyReleased() {

        if (key == CODED) {
            if (keyCode == RIGHT && circleX < rightBorder) {
                dx = size;
                dy = 0;
                s = "You pressed button: RIGHT";
            } else if (keyCode == LEFT && circleX > leftBorder) {
                dx = -size;
                dy = 0;
                s = "You pressed button: LEFT";
            } else if (keyCode == UP && circleY > upBorder) {
                dy = -size;
                dx = 0;
                s = "You pressed button: UP";
            } else if (keyCode == DOWN && circleY < downBorder) {
                dy = size;
                dx = 0;
                s = "You pressed button: DOWN";
            }
        }

    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}