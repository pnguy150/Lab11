import javax.swing.*;
import java.awt.event.*;

public class MainController implements MouseListener, MouseMotionListener, ActionListener
{



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Edit"))
        {
            if(e.getActionCommand().equals("Undo"))
            {
                Repository.getInstance()
            } else if(e.getActionCommand().equals("Clean"))
            {

            }
        }
        if(e.getActionCommand().equals("Color"))
        {
            if(e.getActionCommand().equals("Black"))
            {
                Repository.getInstance()
            }
            if (e.getActionCommand().equals("White"))
            {

            }
        }
        if (e.getActionCommand().equals("Action"))
        {
            if (e.getActionCommand().equals("Cluster"))
            {

            } else if(e.getActionCommand().equals("Line"))
            {

            }
        }
        if(e.getActionCommand().equals("Shape"))
        {
            if(e.getActionCommand().equals("Rectangle"))
            {

            }
            else if(e.getActionCommand().equals("Circle"))
            {

            }
            else if (e.getActionCommand().equals("Arc"))
            {

            } else if (e.getActionCommand().equals("Dot"))
            {

            }
            else if(e.getActionCommand().equals("Line"))
            {

            }

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Repository.addCoordinates(e.getX(),e.getY());
    }
    @Override
    public void mouseClicked(MouseEvent e)
    {
    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
