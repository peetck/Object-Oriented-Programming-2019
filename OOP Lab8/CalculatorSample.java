import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class CalculatorSample{
    private JFrame fr;
    private JPanel p;
    private JTextField txt;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16;
    private double left, right;
    private String select;
    public void init(){
        // Construct Object
        fr = new JFrame("My Calculator ");
        p = new JPanel();
        txt = new JTextField();
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn10 = new JButton("0");
        btn11 = new JButton("c");
        btn12 = new JButton("+");
        btn13 = new JButton("-");
        btn14 = new JButton("x");
        btn15 = new JButton("/");
        btn16 = new JButton("=");
        
        p.setLayout(new GridLayout(4, 4));
        p.add(btn7);
        p.add(btn8);
        p.add(btn9);
        p.add(btn12);
        
        p.add(btn4);
        p.add(btn5);
        p.add(btn6);
        p.add(btn13);
        
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btn14);
        
        p.add(btn10);
        p.add(btn11);
        p.add(btn16);
        p.add(btn15);
        
        fr.add(txt,BorderLayout.NORTH);
        fr.add(p,BorderLayout.CENTER);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(500, 650);
        fr.setVisible(true);
        fr.pack();
        
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txt.setText(txt.getText() + "1");
            }
        });
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txt.setText(txt.getText() + "2");
            }
        });
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txt.setText(txt.getText() + "3");
            }
        });
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txt.setText(txt.getText() + "4");
            }
        });
        btn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txt.setText(txt.getText() + "5");
            }
        });
        btn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txt.setText(txt.getText() + "6");
            }
        });
        btn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txt.setText(txt.getText() + "7");
            }
        });
        btn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txt.setText(txt.getText() + "8");
            }
        });
        btn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txt.setText(txt.getText() + "9");
            }
        });
        btn10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txt.setText(txt.getText() + "0");
            }
        });
        
        btn11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txt.setText("");
            }
        });
        btn12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                left = Double.parseDouble(txt.getText());
                txt.setText("");
                select = "+";
            }
        });
        btn13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                left = Double.parseDouble(txt.getText());
                txt.setText("");
                select = "-";
            }
        });
        btn14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                left = Double.parseDouble(txt.getText());
                txt.setText("");
                select = "x";
            }
        });
        btn15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                left = Double.parseDouble(txt.getText());
                txt.setText("");
                select = "/";
            }
        });
        btn16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                right = Double.parseDouble(txt.getText());
                if (select.equals("+")){
                    txt.setText(Double.toString(left + right));
                }
                else if (select.equals("-")){
                    txt.setText(Double.toString(left - right));
                }
                else if (select.equals("x")){
                    txt.setText(Double.toString(left * right));
                }
                else if (select.equals("/")){
                    txt.setText(Double.toString(left / right));
                }
                select = null;
            }
        });
    }
    public static void main(String[] args) {
        
        new CalculatorSample().init();
   
    }
}