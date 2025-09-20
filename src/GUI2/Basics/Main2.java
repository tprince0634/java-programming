package GUI2.Basics;
//Label

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main2 {
    public static void main(String[] args) {
        Border border = BorderFactory.createLineBorder(Color.YELLOW, 20);

        // Create a label
        JLabel label = new JLabel("This is a label with a border");
        label.setFont(new Font("Arial", Font.BOLD, 16));               // font type
        label.setHorizontalAlignment(JLabel.CENTER);                   // horizontally align text
        label.setVerticalAlignment(JLabel.TOP);                        // vertically align text
        label.setOpaque(true);                                         // enable background painting
        label.setBackground(new Color(220, 230, 240));        // light background
        label.setBorder(border); // border
        label.setSize(420,420);
        //label.setBounds(0, 0, 320, 320);          // position and size (frame.setLayout(null)) must


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setResizable(true);
        frame.setLayout(new FlowLayout()); // MUST come before add() and if using set bounds it should eb null
//       frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);
//       frame.pack();

    }
}
