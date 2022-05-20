package fju.edu.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin {
    public static void main(String[] args) {
        // *create a new window
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setLocation(100,100);

        // *stop the program when close the window
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // *add Component
        JButton button = new JButton("OK");

        // *Anonymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Nice to meet you!");
            }
        });

        // *let the button work, create a new class
        //MyActionListener listener = new MyActionListener();
        //button.addActionListener(listener);

        // *Layout
        //frame.setLayout(new BorderLayout());
        frame.setLayout(new FlowLayout());
        frame.add(button);
        //frame.add(new JButton("testing"));
        frame.setVisible(true);
        System.out.println("Hi there!");
    }
}
