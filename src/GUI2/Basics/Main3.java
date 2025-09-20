package GUI2.Basics;

import javax.swing.*;
import java.awt.*;

public class Main3 {
    public static void main(String[] args) {

        JLabel label = new JLabel("Hii");
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,100,100);   //layout should be null

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0,200,200);
        redpanel.setLayout(null);
        redpanel.add(label);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(200,0,200,200);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(400,0,200,200);
        greenpanel.setLayout(new BorderLayout()); // Center layout
//        greenpanel.add(label);




        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.add(bluepanel);
        frame.add(redpanel);
        frame.add(greenpanel);
    }
}
