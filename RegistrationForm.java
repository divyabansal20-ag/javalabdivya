import javax.swing.*;

public class RegistrationForm extends JFrame {

    RegistrationForm(){

        JLabel l1=new JLabel("Name");
        JLabel l2=new JLabel("Email");

        JTextField t1=new JTextField();
        JTextField t2=new JTextField();

        JButton b=new JButton("Submit");

        l1.setBounds(50,50,100,30);
        l2.setBounds(50,100,100,30);

        t1.setBounds(150,50,150,30);
        t2.setBounds(150,100,150,30);

        b.setBounds(150,150,100,30);

        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b);

        setSize(400,300);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String args[]){

        new RegistrationForm();

    }
}
