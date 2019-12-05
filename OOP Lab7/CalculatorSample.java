/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Picnic101
 */
import java.awt.*;
import javax.swing.*;
public class CalculatorSample {
    private JFrame frame;
    public void init(){
        
        frame = new JFrame("My Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 250);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(4, 4));
        String[] btn = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "x", "0", "c", "=", "/"};
        for (String i : btn){
            frame.add(new JButton(i));
        }
    }
}
