package GUI2.Basics;
//Frame
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //JFrame = a GUI window to add Components

        JFrame frame = new JFrame(); //create a frame
        frame.setTitle("Practice Makes Man Perfect");
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);  //prevent frame from being resized
        frame.setSize(420,420);  //set x and y dimensions
        frame.setVisible(true); // make frame visible

        ImageIcon imageIcon = new ImageIcon("kainchi-dham_1687158479.webp");  //Creates an ImageIcon
        frame.setIconImage(imageIcon.getImage());

        frame.getContentPane().setBackground(Color.LIGHT_GRAY); // change Background color
//      frame.getContentPane().setBackground(new Color(255,0,0));


    }
}
