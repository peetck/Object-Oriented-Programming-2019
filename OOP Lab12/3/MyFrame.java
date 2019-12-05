/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Picnic101
 */
import javax.swing.*;
import java.awt.event.*;
public class MyFrame {

    public static void main(String[] args){
        JFrame fr = new JFrame();
        fr.setVisible(true);
        fr.setSize(300, 200);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setResizable(false);
        
        MyClock clock = new MyClock();
        Thread t = new Thread(clock);
        t.start();
        
        fr.add(clock);

    }
}
