import javax.swing.*;

public class ShapeFrame {

    public static void main(String args[]){

        JFrame f=new JFrame();

        JButton b=new JButton("Circle");

        b.setBounds(100,100,100,30);

        f.add(b);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

    }
}
