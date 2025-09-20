package GUI;

import javax.swing.*;
import java.awt.*;

public class GuiExample1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Window");

        jFrame.setSize(400,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // Close app when window closes
        jFrame.setLayout(new FlowLayout());
        jFrame.setVisible(true);    // Make window visible


    }
}
