package GUI;

import javax.swing.*;
import java.awt.event.*;


public class SimpleItemListener {
    public static void main(String[] args) {
        // Create a frame (window)
        JFrame frame = new JFrame("Checkbox Example");

        // Create a checkbox
        JCheckBox checkBox = new JCheckBox("I agree");

        // Add ItemListener to the checkbox
        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Checkbox selected");
                } else {
                    System.out.println("Checkbox deselected");
                }
            }
        });

        // Add checkbox to frame
        frame.add(checkBox);

        // Set frame properties
        frame.setSize(200, 100);
        frame.setLayout(null);
        checkBox.setBounds(50, 20, 100, 30);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}