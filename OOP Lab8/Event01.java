import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Event01 {
    
    private JFrame fr;
    private JPanel p1,p2;
    private JTextField txt1, txt2, txt3;
    private JButton btn1, btn2, btn3, btn4;
    public Event01(){

        fr = new JFrame("Calculator");
        p1 = new JPanel();
        p2 = new JPanel();
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        btn1 = new JButton("+");
        btn2 = new JButton("-");
        btn3 = new JButton("x");
        btn4 = new JButton("/");
        
      // Add Listener


     // Set Layout   
        p1.setLayout(new GridLayout(4,1));
        p1.add(txt1);
        p1.add(txt2);
        p1.add(p2);
        p1.add(txt3);

        p2.setLayout(new FlowLayout());
        p2.add(btn1);
        p2.add(btn2);
        p2.add(btn3);
        p2.add(btn4);
        
        fr. getContentPane().add(p1);

     // Set JFrame Property
        fr.setFont(new Font("TimesRoman",Font.BOLD,60));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();     
        fr.setVisible(true);

        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txt3.setText(Integer.toString(Integer.parseInt(txt1.getText()) + Integer.parseInt(txt2.getText())));
            }
        });
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txt3.setText(Integer.toString(Integer.parseInt(txt1.getText()) - Integer.parseInt(txt2.getText())));
            }
        });
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txt3.setText(Integer.toString(Integer.parseInt(txt1.getText()) * Integer.parseInt(txt2.getText())));
            }
        });
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txt3.setText(Integer.toString(Integer.parseInt(txt1.getText()) / Integer.parseInt(txt2.getText())));
            }
        });
    }
    
    public static void main(String[] args) {
        new Event01();
    }

   
}