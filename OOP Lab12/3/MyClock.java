/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Picnic101
 */

import java.util.Calendar; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class MyClock extends JLabel implements Runnable{
    private int time = 0;
    private boolean counting = true;
    public MyClock(){
        this.setFont(new Font("kanit", Font.BOLD, 50));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
               if (counting){
                   counting = false;
                   changeColor(Color.RED);
               }
               else{
                   counting = true;
                   changeColor(Color.BLACK);
               }
            }
        });
    }
    public void run(){
        while (true){
            try{
                if (counting){
                    int hour = time / 3600;
                    int left = time % 3600;
                    int min = left / 60;
                    left %= 60;
                    this.setText(String.format("%02d:%02d:%02d", hour, min, left));
                    time++;
                }
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
        }
    }
    public void changeColor(Color color){
        this.setForeground(color);
    }
}
