package fju.edu.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    //Fields
    JLabel label = new JLabel("Zzzzz");
    JLabel label1 = new JLabel("Zzzzz");
    JButton button = new JButton("Hi!");
    JButton button1 = new JButton("Nice to meet you!");
    //Constructors
    public GuessFrame(){
        super();
        setSize(400,400);
        setLocation(200,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //System.out.println("Hello!");
                label.setText("Hello World!");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                label1.setText("Nice to meet you too!");
            }
        });
        setLayout(new FlowLayout());
        add(button);
        add(label);

        add(button1);
        add(label1);
    }
    //Methods





    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
        //guessFrame.setSize(400,400);
        //guessFrame.setVisible(true);
    }
}
