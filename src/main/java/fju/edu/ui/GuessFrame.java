package fju.edu.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    //Fields
    int min = 0;
    int max = 100;
    JLabel label = new JLabel("Enter a number from "+min+" to "+max);
    JButton button = new JButton("Guess");
    JTextField number = new JTextField(8);
    //Constructors
    public GuessFrame(){
        super();
        setSize(400,400);
        setLocation(200,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        Random r = new Random();
        int secret = r.nextInt(100)+1;
        System.out.println("secret:"+secret);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
                if (num < secret){
                    min = num;
                    label.setText("Enter a number from "+min+" to "+max);
                }else if (num > secret){
                    max = num;
                    label.setText("Enter a number from "+min+" to "+max);
                }else {
                    label.setText("BINGO!, the secret number is "+secret);
                }
                //label.setText("Hello World!");
            }
        });
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
    }
    //Methods





    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
        //guessFrame.setSize(400,400);
        //guessFrame.setVisible(true);
    }
}
