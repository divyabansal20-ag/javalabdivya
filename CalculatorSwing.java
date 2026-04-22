import javax.swing.*;
import java.awt.event.*;

public class CalculatorSwing extends JFrame implements ActionListener {

    JTextField t1;
    JButton b1;

    CalculatorSwing(){

        t1=new JTextField();
        b1=new JButton("Clear");

        t1.setBounds(50,50,200,30);
        b1.setBounds(50,100,100,30);

        add(t1);
        add(b1);

        b1.addActionListener(this);

        setSize(300,250);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        t1.setText("");

    }

    public static void main(String args[]){

        new CalculatorSwing();

    }
}
