import javax.swing.*;
import java.awt.event.*;

public class AddSwing extends JFrame implements ActionListener {

    JTextField t1,t2,t3;
    JButton b;

    AddSwing(){

        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();

        b=new JButton("Add");

        t1.setBounds(50,50,100,30);
        t2.setBounds(50,100,100,30);
        t3.setBounds(50,150,100,30);
        b.setBounds(50,200,100,30);

        add(t1);
        add(t2);
        add(t3);
        add(b);

        b.addActionListener(this);

        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());

        int c=a+b;

        t3.setText(String.valueOf(c));

    }

    public static void main(String args[]){

        new AddSwing();

    }
}
