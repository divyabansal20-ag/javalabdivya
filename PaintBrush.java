import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PaintBrush extends JFrame {

    PaintBrush(){

        addMouseMotionListener(new MouseMotionAdapter(){

            public void mouseDragged(MouseEvent e){

                Graphics g=getGraphics();

                g.fillOval(e.getX(),e.getY(),5,5);

            }

        });

        setSize(400,400);
        setVisible(true);
    }

    public static void main(String args[]){

        new PaintBrush();

    }
}
