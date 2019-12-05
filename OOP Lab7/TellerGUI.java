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
public class TellerGUI {
    private JFrame frame;
    private JPanel panel1, panel2, panel3;
    private JTextField text_field1, text_field2;
    private JLabel balance, amount;
    private JButton btn1, btn2, btn3;
    public void init(){
        frame = new JFrame("Teller GUI");
        frame.setVisible(true);
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        balance = new JLabel("Balance");
        amount = new JLabel("Amount");
        
        text_field1 = new JTextField("6000");
        text_field1.setEditable(false);
        text_field2 = new JTextField();
        
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");
        
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2, 2));
        panel1.add(balance);
        panel1.add(text_field1);
        panel1.add(amount);
        panel1.add(text_field2);
        
        panel2 = new JPanel();
        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);
        
        panel3 = new JPanel();
        panel3.setLayout(new GridLayout(2, 1));
        panel3.add(panel1);
        panel3.add(panel2);
        frame.add(panel3);
    }
}
