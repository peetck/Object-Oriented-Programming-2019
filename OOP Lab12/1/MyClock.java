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
public class MyClock extends JLabel implements Runnable{
    
    public MyClock(){
        this.setFont(new Font("kanit", Font.BOLD, 50));
        this.setHorizontalAlignment(JLabel.CENTER);
    }
    public void run(){
        while (true){
            try{
                Calendar c = Calendar.getInstance();
                int sec = c.get(Calendar.SECOND);
                int min = c.get(Calendar.MINUTE);
                int hour = c.get(Calendar.HOUR_OF_DAY);
                this.setText(String.format("%02d:%02d:%02d", hour, min, sec));
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                
            }
            
        }
    }
}
