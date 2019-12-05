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
import java.util.Random;
public class Poring implements Runnable{
    private JFrame fr;
    private JLabel poring;
    private ImageIcon poringIcon;
    private int number;
    private int x, y;
    public Poring(int number){
        this.number = number;
        fr = new JFrame();
        fr.setResizable(false);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        Random rand = new Random();
        x = rand.nextInt(1300);
        y = rand.nextInt(800);
        fr.setLocation(x, y);
        poring = new JLabel("" + number);
        poringIcon = new ImageIcon("p96.png");
        poring.setIcon(poringIcon);
        
        poring.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                fr.dispose();
            }
        });
        fr.add(poring);
        fr.pack();
    }
    public void run(){
        try{
           while (true){
            
                fr.setLocation(x + 10, y);
                Thread.sleep(200);
                fr.setLocation(x + 20, y);
                 Thread.sleep(200);
                fr.setLocation(x + 30, y);
                 Thread.sleep(200);
                fr.setLocation(x + 40, y);
                 Thread.sleep(200);
                fr.setLocation(x + 40, y + 10);
                 Thread.sleep(200);
                fr.setLocation(x + 40, y + 20);
                Thread.sleep(200);
                fr.setLocation(x + 40, y + 30);
                 Thread.sleep(200);
                fr.setLocation(x + 40, y + 40);
                
                Thread.sleep(200);
                fr.setLocation(x + 30, y + 10);
                Thread.sleep(200);
                fr.setLocation(x + 20, y + 20);
                Thread.sleep(200);
                fr.setLocation(x + 10, y + 30);
                Thread.sleep(200);
                fr.setLocation(x, y + 40);
                
                Thread.sleep(200);
                fr.setLocation(x, y + 30);
                Thread.sleep(200);
                fr.setLocation(x, y + 20);
                Thread.sleep(200);
                fr.setLocation(x , y + 10);
                Thread.sleep(200);
                fr.setLocation(x, y);
            } 
        }
        catch(Exception e){
            
        }
    }
}
