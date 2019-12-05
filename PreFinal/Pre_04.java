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
public class Pre_04 {
    private JFrame fr;
    private JPanel p1, p2;
    private JLabel l1, l2, l3, l4;
    private JTextField f1, f2, f3, f4;
    private JButton btn1, btn2, btn3, btn4;
    private ArrayList<Student> students;
    private int index = -1;
    public Pre_04(){
        fr = new JFrame();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        
        p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 2));
        
        p2 = new JPanel();
        
        l1 = new JLabel("  Student ID:");
        l2 = new JLabel("  First Name:");
        l3 = new JLabel("  Last Name:");
        l4 = new JLabel("  GPA:");
        
        f1 = new JTextField("");
        f1.setEditable(false);
        f2 = new JTextField("");
        f2.setEditable(false);
        f3 = new JTextField("");
        f3.setEditable(false);
        f4 = new JTextField("");
        f4.setEditable(false);
        
        p1.add(l1);
        p1.add(f1);
        p1.add(l2);
        p1.add(f2);
        p1.add(l3);
        p1.add(f3);
        p1.add(l4);
        p1.add(f4);
        
        btn1 = new JButton("Prev");
        btn2 = new JButton("Next");
        btn3 = new JButton("Add");
        btn4 = new JButton("Exit");
        
        p2.add(btn1);
        p2.add(btn2);
        p2.add(btn3);
        p2.add(btn4);
        
        fr.add(p1);
        fr.add(p2, BorderLayout.SOUTH);
        
        
        fr.setSize(450, 150);
        
        students = new ArrayList<Student>();
        
        try{
            FileReader fr = new FileReader("student.txt");
            BufferedReader br = new BufferedReader(fr);
            while (true){
                String row = br.readLine();
                if (row == null){
                    break;
                }
                String[] each = row.split(" ");
                students.add(new Student(each[0], each[1], each[2], Double.parseDouble(each[3])));
            }
            br.close();
            fr.close();
        }
        catch(Exception e){
            
        }
        
        if (students.size() != 0){
            index = 0;
            update();
        }
        
       
        
        // prev
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (index >= 1){
                    index--;
                    update();
                }
            }
        });
        
        // next
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (index < students.size() - 1){
                    index++;
                    update();
                }
            }
        });
        
        // add
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame addfr = new JFrame("Add New Student");
                JPanel addp1 = new JPanel();
                addp1.setLayout(new GridLayout(4, 4));
                
                JButton addbtn1 = new JButton("OK");
                
                addfr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                addfr.setVisible(true);
                
                JLabel addl1 = new JLabel("  Student ID:");
                JLabel addl2 = new JLabel("  First Name:");
                JLabel addl3 = new JLabel("  Last Name:");
                JLabel addl4 = new JLabel("  GPA:");

                JTextField addf1 = new JTextField("");
                JTextField addf2 = new JTextField("");
                JTextField addf3 = new JTextField("");
                JTextField addf4 = new JTextField("");
                
                addp1.add(addl1);
                addp1.add(addf1);
                addp1.add(addl2);
                addp1.add(addf2);
                addp1.add(addl3);
                addp1.add(addf3);
                addp1.add(addl4);
                addp1.add(addf4);
                
                
                addfr.add(addp1);
                addfr.add(addbtn1, BorderLayout.SOUTH);
                addfr.setSize(450, 150);
                addfr.setLocationRelativeTo(null);
                addbtn1.addActionListener(new ActionListener(){
                   public void actionPerformed(ActionEvent e){
                       if (index == -1){
                           index = 0;
                       }
                       Student s = new Student(addf1.getText(), addf2.getText(), addf3.getText(), Double.parseDouble(addf4.getText()));
                       students.add(s);
                       addfr.dispose();
                       update();
                       JOptionPane.showMessageDialog(null, "แอดแล้วจ้า.", "", JOptionPane.PLAIN_MESSAGE, null);
                   } 
                });
            }
        });
        
        // exit
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                // save
                try{
                    FileWriter fw = new FileWriter("student.txt");
                    BufferedWriter bw = new BufferedWriter(fw);

                    for (Student i : students){
                        String row = i.getStd_id() + " " + i.getFirstname() + " " + i.getLastname() + " " + i.getGpa();
                        bw.write(row + "\n");
                    }
                    bw.close();
                    fw.close();
                }
                catch(Exception err){
                    
                }
                System.exit(0);
            }
        });
        
        fr.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                 // save
                try{
                    FileWriter fw = new FileWriter("student.txt");
                    BufferedWriter bw = new BufferedWriter(fw);

                    for (Student i : students){
                        String row = i.getStd_id() + " " + i.getFirstname() + " " + i.getLastname() + " " + i.getGpa();
                        bw.write(row + "\n");
                    }
                    bw.close();
                    fw.close();
                }
                catch(Exception err){
                    
                }
            }
        });
    }
    public void update(){
        Student temp = students.get(index);
        f1.setText(temp.getStd_id());
        f2.setText(temp.getFirstname());
        f3.setText(temp.getLastname());
        f4.setText("" + temp.getGpa());
    }
}
