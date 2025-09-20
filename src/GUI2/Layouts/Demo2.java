package GUI2.Layouts;
// GridLayout is a layout manager that arranges
// components in a grid of equally sized cells.

//Think of it like a spreadsheet table:
//Each cell is the same size, and components are stretched to fill their cell.

import javax.swing.*;
import java.awt.*;
import java.util.jar.JarFile;

public class Demo2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(new GridLayout(3,3,10,10));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));


        frame.setVisible(true);

    }
}
