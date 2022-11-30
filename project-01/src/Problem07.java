import processing.core.*;

public class Problem07 extends PApplet {
    float r;
    float alpha = PI / 4f;
    float SunX;
    float SunY;
    float SunR;
    float EarthX;
    float EarthY;
    float EarthR;

    float VenusX;
    float VenusY;
    float VenusR;


    public void settings() {
        fullScreen();

    }

    public void setup() {
        //sun
        SunX = width / 2f;
        SunY = height / 2f;
        SunR = height / 7f;

        //Earth

        EarthX = width / 1.3f;
        EarthY = height / 2.4f;
        EarthR = height / 13f;

        //venus
        VenusX = width / 1.3f;
        VenusY = height / 2.4f;
        VenusR = height / 13f;


    }


    public void draw() {
        background(0, 0, 0);
        translate(width / 2f, height / 2f);


        //Sun

        fill(255, 255, 0);
        circle(0, 0, SunR * 2);


        //Earth
        fill(51, 153, 255);
        rotate(alpha);
        circle(200, 0, 2 * EarthR);
        alpha += 2 * PI / 200f;


        fill(0, 0, 255);
        rotate(alpha);
        circle(400, 0, 2 * EarthR);
        alpha -= 2 * PI / 2000f;

        //moon

        pushMatrix();
        rotate(alpha);
        fill(255);
        translate(200, 0, 2 * EarthR);
        circle(300, 0, 2 * EarthR);
        alpha += 2 * PI / 300f;
        popMatrix();


    }

    public static void main(String[] args) {
        PApplet.main("Problem07");
    }

}