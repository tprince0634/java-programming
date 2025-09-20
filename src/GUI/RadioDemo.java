package GUI;

import javax.swing.*;
import java.awt.*;

public class RadioDemo {
    public static void main(String[] args) {
        RadioDemo radioDemo = new RadioDemo();

    }
    RadioDemo(){
        JFrame jFrame = new JFrame("Main");
        jFrame.setSize(400,300);
        jFrame.setLayout(new FlowLayout());
        jFrame.setDefaultCloseOperation(3);


        JTextField j1 = new JTextField(15);
        JRadioButton j3 = new JRadioButton("Male");
        JRadioButton j4 = new JRadioButton("Female");
        JButton  j2 = new JButton("Submit");
        JLabel j5 = new JLabel("Greetings");

        JCheckBox j6 = new JCheckBox("Singing");
        JCheckBox j7 = new JCheckBox("Dancing" );



        //For RadioButton
        ButtonGroup bg = new ButtonGroup();
        bg.add(j3);
        bg.add(j4);

        jFrame.add(j1);
        jFrame.add(j2);
        jFrame.add(j3);
        jFrame.add(j4);
        jFrame.add(j6);
        jFrame.add(j7);
        jFrame.add(j5);


        j2.addActionListener(e->{
            String  name = j1.getText();

            if (name.isEmpty()) {
                j5.setText("Please enter your name.");
                return;
            }

            if (j3.isSelected()) {
                name = "Mr " + name;
            } else if (j4.isSelected()) {
                name = "Ms " + name;
            } else {
                name = "Please select Male or Female.";
            }


            if(j7.isSelected()){
                name = name + "Dancer";
            } else {
                name = name + "Singer";
            }
            j5.setText(name);

        });

        jFrame.setVisible(true);

    }

}
