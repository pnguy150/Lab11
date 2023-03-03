import javax.swing.*;
import java.util.ArrayList;
import java.util.Observer;

public class App extends JFrame {


    public static void main(String[] args){
        App app = new App();
        app.setSize(500,500);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public App(){

        MainController controller = new MainController();
        JMenuBar menuBar = new JMenuBar();
        add(menuBar);

        ArrayList<JMenuItem> items = new ArrayList<>();


        JMenu edit = new JMenu("Edit");
        JMenu color = new JMenu("Color");
        JMenu action = new JMenu("Action");
        JMenu shape = new JMenu("Shape");

        menuBar.add(edit);
        menuBar.add(color);
        menuBar.add(action);
        menuBar.add(shape);

        JMenuItem undo = new JMenuItem("Undo");
        undo.addActionListener(controller);
        JMenuItem clear = new JMenuItem("Clear");
        clear.addActionListener(controller);
        edit.add(undo);
        edit.add(clear);

        JMenuItem black = new JMenuItem("Black");
        black.addActionListener(controller);
        JMenuItem red = new JMenuItem("Red");
        red.addActionListener(controller);
        color.add(black);
        color.add(red);

        JMenuItem cluster = new JMenuItem("Cluster");
        cluster.addActionListener(controller);
        JMenuItem line_action = new JMenuItem("Line");
        line_action.addActionListener(controller);

        action.add(cluster);
        action.add(line_action);

        JMenuItem circle = new JMenuItem("Circle");
        circle.addActionListener(controller);
        JMenuItem rect = new JMenuItem("Rect");
        rect.addActionListener(controller);
        JMenuItem dot = new JMenuItem("Dot");
        dot.addActionListener(controller);
        JMenuItem arc = new JMenuItem("Arc");
        dot.addActionListener(controller);
        JMenuItem line = new JMenuItem("Line");
        line.addActionListener(controller);

        shape.add(circle);
        shape.add(rect);
        shape.add(dot);
        shape.add(arc);
        shape.add(line);

    }
}
