import processing.core.PApplet;

public class Problem04 extends PApplet {

    int tableSize;
    float cellSize;
    float gridX;
    float gridY;
    float radius;
    float snakeX;
    float snakeY;
    float dSnakeXY;
    float targetX;
    float targetY;
    float msgX;
    float msgY;
    float scoreX;
    float scoreY;
    float msgSize;
    float scoreSize;
    int score;
    String scoreStr;


    public void settings() {

        fullScreen();
    }

    public void setup() {

        // maintaining the table
        tableSize = 12;
        cellSize = min(width, height) / 17f;
        gridX = (width - cellSize * tableSize) / 2f;
        gridY = (height - cellSize * tableSize) / 2f;


        // maintaining the snake
        radius = cellSize / 2f;
        snakeX = gridX + radius;
        snakeY = gridY + radius;
        dSnakeXY = radius * 2;

        //target parameter
        targetX = gridX + (int) random(tableSize) * cellSize + radius;
        targetY = gridY + (int) random(tableSize) * cellSize + radius;

        // text parameter
        textAlign(CENTER, CENTER);
        msgX = width / 2f;
        msgY = (height - cellSize * tableSize) / 4f;
        scoreX = width / 2f;
        scoreY = height - (height - cellSize * tableSize) / 4f;
        msgSize = min(width, height) / 32f;
        scoreSize = min(width, height) / 25f;

        score = 0;
        frameRate(11);
    }

    public void draw() {
        fill(0, 30);
        rect(0, 0, width, height);

        //draw the table
        for (int row = 0; row < tableSize; row++) {
            for (int col = 0; col < tableSize; col++) {
                stroke(125, 125, 255);
                strokeWeight(2);
                square(gridX + cellSize * col, gridY + cellSize * row, cellSize);
            }
        }

        //drawing snake

        fill(255, 0, 0);
        noStroke();
        circle(snakeX, snakeY, radius * 2);


        //snake movement
        if (keyCode == UP) {
            if (snakeY - dSnakeXY > gridY) {
                snakeY -= dSnakeXY;
            }
        }
        if (keyCode == DOWN) {
            if (snakeY + dSnakeXY < gridY + cellSize * tableSize) {
                snakeY += dSnakeXY;
            }
        }
        if (keyCode == RIGHT) {
            if (snakeX + dSnakeXY < gridX + cellSize * tableSize) {
                snakeX += dSnakeXY;
            }
        }
        if (keyCode == LEFT) {
            if (snakeX - dSnakeXY > gridX) {
                snakeX -= dSnakeXY;
            }
        }

        // draw the target
        fill(255, 255, 0);
        noStroke();
        circle(targetX, targetY, radius * 2);

        //target appear at a random location

        if (abs(targetX - snakeX) < 1e-3 && abs(targetY - snakeY) < 1e-3) {
            targetX = gridX + (int) random(tableSize) * cellSize + radius;
            targetY = gridY + (int) random(tableSize) * cellSize + radius;
            score++;
        }

        //draw the message
        fill(255, 255, 255);
        textSize(msgSize);
        text("Collect Yellow Circles using Arrow Keys", msgX, msgY);

        //display the score
        scoreStr = String.format("Score: %d", score);
        textSize(scoreSize);
        fill(255, 255, 255);
        text(scoreStr, scoreX, scoreY);
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");
    }

}