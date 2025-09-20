package GUI;

import javax.swing.*;
import java.awt.*;

public class Demo2 {
    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();

    }

    Demo2(){

        JFrame  jFrame = new JFrame("Main Frame");
        jFrame.setSize(400,300);
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(3);


        JTextField j1 = new JTextField(20);
        JTextField j2 = new JTextField(20);
        JButton b1 = new JButton("Add");
        JButton b2 = new JButton("Sub");
        JLabel c = new JLabel("Result");


        jFrame.add(j1);
        jFrame.add(j2);
        jFrame.add(b1);
        jFrame.add(b2);
        jFrame.add(c);


        b1.addActionListener(e-> {
         try {
            int a = Integer.parseInt(j1.getText());
            int b = Integer.parseInt(j2.getText());

            int sum = a + b;
            c.setText(sum + "");
        }catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(jFrame, "Please enter valid integers only.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
         }
        });



        b2.addActionListener(e->{
            try{
                int a = Integer.parseInt(j1.getText());
                int b = Integer.parseInt(j2.getText());

                int sum = a-b;
                c.setText(sum + "");
            }catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(jFrame, "Please enter valid integers only.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        });


        jFrame.setVisible(true);
    }
}
