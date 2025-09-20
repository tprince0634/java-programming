package GUI2.Layouts.Openwindow;

import javax.swing.*;

public class Launchpage {

    JFrame frame = new JFrame();
    JButton button = new JButton("New Button");



   Launchpage(){

       button.setBounds(100,160,200,40);
       button.setFocusable(false);
       button.addActionListener(e->{
           frame.dispose();
           new NewWindow();
       });

       frame.add(button);
       frame.setDefaultCloseOperation(3);
       frame.setSize(500,500);
       frame.setLayout(null);
       frame.setVisible(true);

   }
}
