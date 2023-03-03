import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Repository extends Observable {
    private ArrayList<Shape> shapes;
    private static Repository x;
    private boolean clusterBool = false;
    private boolean lineBool = false;


    private Repository(){
        shapes = new ArrayList<Shape>();
    }

    public static Repository getInstance(){
        if (x == null){
            x = new Repository();
        }
        return x;
    }

    public List<Shape> getStruct(){
        return shapes;
    }

    public void addShape(Shape shape)
    {
        shapes.add(shape);
    }

    public void updateColor(Shape shape, Color color){
        shape.setColor(color);
    }


    public void undo(){

    }

    public void clear(){
        if (!shapes.isEmpty()){
            shapes.remove(shapes);
        }
        setChanged();
        notifyObservers();
    }

    public void updateCluster(){
        if(clusterBool){
            clusterBool = false;
        }
        else{
            clusterBool = true;
        }
    }

    public void updateLine(){
        if (lineBool){
            lineBool = false;
        }
        else{
            lineBool = true;
        }
    }

    public static void addCoordinates(int x, int y){}
}
