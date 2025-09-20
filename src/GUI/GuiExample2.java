package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.jar.JarFile;

public class GuiExample2  extends JFrame {

    public GuiExample2(){
        setTitle("Window 2");
        setVisible(true);
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new JLabel("Hello"));
        add(jLabel);

        // Set layout to allow multiple components
        setLayout(new FlowLayout());
    }
    JLabel jLabel = new JLabel("Hello2");

    public static void main(String[] args) {
        GuiExample2 gui2 = new GuiExample2();


    }

}
