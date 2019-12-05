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
import java.io.*;
import java.util.*;
public class Pre_03 {
    private JFrame fr;
    private JPanel top, bottom, bottom1, bottom2;
    private JLabel l1, l2, l3;
    private JTextField f1, f2, f3;
    private JComboBox<String> c1;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private ArrayList<String[]> data;
    private int index = -1;
    public Pre_03(){
        fr = new JFrame();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        
        top = new JPanel();
        top.setLayout(new GridLayout(3, 3));
        
        bottom = new JPanel();
        bottom.setLayout(new GridLayout(2, 1));
        
        bottom1 = new JPanel();
        
        bottom2 = new JPanel();

        
        l1 = new JLabel("  Name");
        l2 = new JLabel("  Price");
        l3 = new JLabel("  Type");
        
        f1 = new JTextField("");
        f2 = new JTextField("");
        f3 = new JTextField("0");
        f3.setColumns(5);
        
        c1 = new JComboBox<String>();
        c1.addItem("General");
        c1.addItem("Computer");
        c1.addItem("Math&Sci");
        c1.addItem("Photo");
        
        btn1 = new JButton("<<<");
        btn2 = new JButton(">>>");
        btn3 = new JButton("Add");
        btn4 = new JButton("Update");
        btn5 = new JButton("Delete");
        
        top.add(l1);
        top.add(f1);
        top.add(l2);
        top.add(f2);
        top.add(l3);
        top.add(c1);
        
        bottom1.add(btn1);
        bottom1.add(f3);
        bottom1.add(btn2);
        
        bottom2.add(btn3);
        bottom2.add(btn4);
        bottom2.add(btn5);
        
        bottom.add(bottom1);
        bottom.add(bottom2);
        
        fr.add(top);
        fr.add(bottom, BorderLayout.SOUTH);
        
        fr.setSize(250, 200);
        
        
        data = new ArrayList<String[]>();
        //data.add(new String[] {"JAVA", "240", "Computer"});
        
        // read data
        try{
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);
            while (true){
                String row = br.readLine();
                if (row == null){
                    break; // end of file
                }
                String[] each = row.split(" ");
                data.add(each);
            }
            
            br.close();
            fr.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

        
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (index > 0){
                    index--;
                    update();
                }
            }
        });
        
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (index < data.size() - 1){
                    index++;
                    update();
                }
            }
        });
        
        // add
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame addfr = new JFrame();
                JPanel addp1 = new JPanel();
                addp1.setLayout(new GridLayout(3, 3));
                
                JButton addbtn1 = new JButton("Insert");
                
                addfr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                addfr.setVisible(true);
                
                JLabel addl1 = new JLabel("  Name");
                JLabel addl2 = new JLabel("  Price");
                JLabel addl3 = new JLabel("  Type");

                JTextField addf1 = new JTextField("");
                JTextField addf2 = new JTextField("");
                JTextField addf3 = new JTextField("0");
                addf3.setColumns(5);

                JComboBox<String> addc1 = new JComboBox<String>();
                addc1.addItem("General");
                addc1.addItem("Computer");
                addc1.addItem("Math&Sci");
                addc1.addItem("Photo");
                
                addp1.add(addl1);
                addp1.add(addf1);
                addp1.add(addl2);
                addp1.add(addf2);
                addp1.add(addl3);
                addp1.add(addc1);
                
                
                addfr.add(addp1);
                addfr.add(addbtn1, BorderLayout.SOUTH);
                addfr.pack();
                addfr.setLocationRelativeTo(null);
                addbtn1.addActionListener(new ActionListener(){
                   public void actionPerformed(ActionEvent e){
                       if (index == -1){
                           index = 0;
                       }
                       String[] n = {addf1.getText(), addf2.getText(), String.valueOf(addc1.getSelectedItem())};
                       data.add(n);
                       update();
                       addfr.dispose();
                       JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.PLAIN_MESSAGE, null);
                   } 
                });
            }
        });
        
        // update
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String[] current = data.get(index);
                current[0] = f1.getText();
                current[1] = f2.getText();
                current[2] = String.valueOf(c1.getSelectedItem());
                update();
                JOptionPane.showMessageDialog(null, "Done it.", "Update Command", JOptionPane.PLAIN_MESSAGE, null);
            }
        });
        
        // delete
        btn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                data.remove(index);
                index--;
                if (index < 0){
                    index = 0;
                    
                    f1.setText("");
                    f2.setText("");
                    c1.setSelectedItem("General");
                    f3.setText("0");
                    return;
                }
                update();
                JOptionPane.showMessageDialog(null, "Done it.", "Delete Command", JOptionPane.PLAIN_MESSAGE, null);
            }
        });
        
    }
    
    public void update(){
        f1.setText(data.get(index)[0]);
        f2.setText(Double.parseDouble(data.get(index)[1]) + "");
        c1.setSelectedItem(data.get(index)[2]);
        f3.setText("" + (index + 1));
        
        try{
            FileWriter fw = new FileWriter("data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (String[] i : data){
                String row = "";
                for (String j : i ){
                    row += (j + " ");
                }
                row += "\n";
                
                bw.write(row);
            }
            bw.close();
            fw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
