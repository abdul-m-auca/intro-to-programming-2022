import processing.core.*;

public class Problem02 extends PApplet {

    float x;
    float yCenter;
    float yTop;
    float yBottom;
    float minMsgSize;
    float maxMsgSize;
    float topMsgSize;
    float centerMsgSize;
    float bottomMsgSize;

    float dTextSize;

    boolean topMsgAnimation;
    boolean centerMsgAnimation;
    boolean bottomMsgAnimation;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width / 2f;
        yCenter = height / 2f;
        yTop = yCenter - height / 5f;
        yBottom = yCenter + height / 5f;

        minMsgSize = min(width, height) / 18f;
        maxMsgSize = min(width, height) / 7f;
        topMsgSize = centerMsgSize = bottomMsgSize = minMsgSize;
        dTextSize = 2;
        topMsgAnimation = true;
        centerMsgAnimation = false;
        bottomMsgAnimation = false;

        frameRate(60);
        textAlign(CENTER, CENTER);
    }

    public void draw() {
        background(0, 0, 0);

        // Top red text
        fill(255, 0, 0);
        textSize(topMsgSize);
        text("Java Slogan:", x, yTop);

        // Center green text
        fill(0, 255, 0);
        textSize(centerMsgSize);
        text("Write once,", x, yCenter);

        // Bottom blue text
        fill(0, 0, 255);
        textSize(bottomMsgSize);
        text("run anywhere!", x, yBottom);

        // Animation for top text fragment
        if (topMsgAnimation) {
            topMsgSize += dTextSize;

            if (topMsgSize >= maxMsgSize) {
                dTextSize = -dTextSize;
            }
            if (topMsgSize <= minMsgSize) {
                topMsgSize = minMsgSize;
                topMsgAnimation = false;
                centerMsgAnimation = true;
                dTextSize = -dTextSize;
            }
        }

        // Animation for center text fragment
        if (centerMsgAnimation) {
            centerMsgSize += dTextSize;

            if (centerMsgSize >= maxMsgSize) {
                dTextSize = -dTextSize;
            }
            if (centerMsgSize <= minMsgSize) {
                centerMsgSize = minMsgSize;
                centerMsgAnimation = false;
                bottomMsgAnimation = true;
                dTextSize = -dTextSize;
            }
        }

        // Animation for bottom text fragment
        if (bottomMsgAnimation) {
            bottomMsgSize += dTextSize;

            if (bottomMsgSize >= maxMsgSize) {
                dTextSize = -dTextSize;
            }
            if (bottomMsgSize <= minMsgSize) {
                bottomMsgSize = minMsgSize;
                bottomMsgAnimation = false;
                topMsgAnimation = true;
                dTextSize = -dTextSize;
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem02");
    }
}
