import java.awt.*;

public class Shape {
    private int x, y;
    private Color color;


    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX(){return x;}
    public int getY(){return y;}

    public void setColor(Color newColor){
        this.color = newColor;
    }


}
