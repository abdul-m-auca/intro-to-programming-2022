import processing.core.*;

public class Problem05 extends PApplet {
    int boardSize;
    float boardX;
    float boardY;
    float boardWidth;
    float cellWidth;
    float cellInnerOffset;
    float cellInfoX;
    float cellInfoY;
    float sizeInfoX;
    float sizeInfoY;
    boolean plusKeyPressed;
    boolean minusKeyPressed;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        boardSize = 8;
        boardWidth = min(width, height) / 7f * 5;
        boardX = (width - boardWidth) / 2f;
        boardY = (height - boardWidth) / 2f;
        cellWidth = boardWidth / boardSize;
        cellInnerOffset = 0.02f;

        cellInfoX = width / 2f;
        cellInfoY = (height - boardWidth) / 4f;
        sizeInfoX = width / 2f;
        sizeInfoY = height - (height - boardWidth) / 4f;
        textAlign(CENTER, CENTER);
        textSize(30);

        plusKeyPressed = false;
        minusKeyPressed = false;

        frameRate(30);
    }

    public void draw() {
        background(0, 0, 0);

        // Resize the board on + and - keys
        if (keyPressed && key == '+' && boardSize < 12 && !plusKeyPressed) {
            boardSize++;
            plusKeyPressed = true;
        } else if (keyPressed && key == '-' && boardSize > 4 && !minusKeyPressed) {
            boardSize--;
            minusKeyPressed = true;
        }
        if (!keyPressed) {
            plusKeyPressed = false;
            minusKeyPressed = false;
        }
        boardX = (width - boardWidth) / 2f;
        boardY = (height - boardWidth) / 2f;
        cellWidth = boardWidth / boardSize;

        displaySizeInfo();

        // Draw the board
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                drawCell(row, col);

                if (isHovered(row, col)) {
                    drawRedSquare(row, col);
                    displayCellInfo(row, col);
                }
            }
        }
    }

    void drawCell(int row, int col) {
        if ((row + col) % 2 == 0) {
            fill(255);
        } else {
            fill(0, 30, 20);
        }
        noStroke();
        square(boardX + cellWidth * col, boardY + cellWidth * row, cellWidth);
    }

    // isHovered:  Returns true if the cursor is on the specified cell
    boolean isHovered(int row, int col) {
        return mouseX >= boardX + cellWidth * col && mouseX <= boardX + cellWidth * col + cellWidth
                && mouseY >= boardY + cellWidth * row && mouseY <= boardY + cellWidth * row + cellWidth;
    }

    void drawRedSquare(int row, int col) {
        stroke(180, 0, 0);
        strokeWeight(3);
        fill(0, 0);
        square(boardX + cellWidth * col + cellWidth * cellInnerOffset,
                boardY + cellWidth * row + cellWidth * cellInnerOffset,
                cellWidth - (cellWidth * cellInnerOffset * 2));
    }

    void displayCellInfo(int row, int col) {
        String info = String.format("Row: %d, Column: %d, Color: %s", row, col,
                (row + col) % 2 == 0 ? "White" : "Black");
        fill(255);
        text(info, cellInfoX, cellInfoY);
    }

    void displaySizeInfo() {
        String info = String.format("Size: %2d | Use +/- to change", boardSize);
        fill(255);
        text(info, sizeInfoX, sizeInfoY);
    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

}