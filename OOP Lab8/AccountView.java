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
import java.awt.event.*;
import javax.swing.*;
public class AccountView {
    private JFrame fr;
    private JPanel p1, p2, p3, p4;
    private JLabel l1, l2;
    private JButton btn1, btn2, btn3;
    private JTextField f1, f2;
    public AccountView(int amount, AccountController c){
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        l1 = new JLabel("Balance");
        l2 = new JLabel("Amount");
        f1 = new JTextField(amount + "");
        f1.setEditable(false);
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");
        f2 = new JTextField("");
        p1.setLayout(new GridLayout(4, 1));
        p2.setLayout(new GridLayout(1, 2));
        p3.setLayout(new GridLayout(1, 2));
        p2.add(l1);
        p2.add(f1);
        p3.add(l2);
        p3.add(f2);
        p4.add(btn1);
        p4.add(btn2);
        p4.add(btn3);
        p1.add(p2);
        p1.add(p3);
        p1.add(p4);
        fr.add(p1);
        
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (c.getModel().deposit(Integer.parseInt(f2.getText()))){
                    f1.setText("" + c.getModel().getBalance());
                }
            }
        });
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (c.getModel().withdraw(Integer.parseInt(f2.getText()))){
                    f1.setText("" + c.getModel().getBalance());
                };
            }
        });
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }
}
