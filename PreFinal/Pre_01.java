/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB203_40
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Pre_01 {
    private JFrame fr;
    private JButton btn1;
    private int number = 1;
    public Pre_01(){
        fr = new JFrame();
        fr.setLayout(new FlowLayout());
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        btn1 = new JButton("Add");
        
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Thread t = new Thread(new Poring(number++));
                t.start();
            }
        });
        
        fr.add(btn1);
        fr.pack();
    }
}
