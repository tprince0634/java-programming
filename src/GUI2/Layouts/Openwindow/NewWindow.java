package GUI2.Layouts.Openwindow;

import javax.swing.*;
import java.util.jar.JarEntry;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel jLabel = new JLabel("Hello");

    NewWindow(){

        jLabel.setBounds(0,0,100,50);

        frame.add(jLabel);
        frame.setDefaultCloseOperation(3);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }


}
