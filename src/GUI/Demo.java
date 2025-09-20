package GUI;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class Demo {
    public static void main(String[] args) {
        Addition addition = new Addition() ;
    }
}

class Addition extends JFrame {
    JTextField l1,l2;
    JButton b1;
    JLabel b2;


    Addition() {
        setLayout(new FlowLayout());
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        l1 = new JTextField(20);
        l2 = new JTextField(20);
        b1 = new JButton("Submit");
        b2 = new JLabel("Result");


        add(l1);
        add(l2);
        add(b1);
        add(b2);

// anonymous class with variable

      /*  ActionListener a1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(l1.getText());
                int num2 = Integer.parseInt(l1.getText());

                int sum = num1+num2;
                b2.setText(sum + "");
            }
        };
           b2.addAncestorListener(a1);
    */


//anonymous
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(l1.getText());
                int num2 = Integer.parseInt(l1.getText());
                int sum = num1 + num2;
                b2.setText(sum + "");
            }
        });


        setVisible(true);
    }

}










