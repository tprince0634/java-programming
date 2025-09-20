package GUI2.Basics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Main4 extends JFrame implements ActionListener {
    JButton button;

    Main4() {
        button = new JButton("Submit");
        button.addActionListener(this);               // Attach listener
        button.setFocusable(false);
        button.setBackground(Color.yellow);
        button.setLayout(null);
        button.setBounds(0,0,100,100);



        setLayout(null);    // FlowLayout automatically sizes and positions
        add(button);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Main4() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button) {
                    System.out.println("Button clicked!");
                }
            }
        };
    }
}
