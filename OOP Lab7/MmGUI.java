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
public class MmGUI {
    private JFrame frame;
    private JMenuBar menu;
    private JMenu menu1, menu2, menu3, menu_item1;
    private JMenuItem menu_item2, menu_item3, menu_item4;
    public void init(){
        frame = new JFrame("SubMenuItem Demo");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);

        
        menu = new JMenuBar();
        menu1 = new JMenu("File");
        menu2 = new JMenu("Edit");
        menu3 = new JMenu("View");
        
        menu_item1 = new JMenu("New");
        menu_item1.add(new JMenuItem("Window"));
        menu_item1.addSeparator();
        menu_item1.add(new JMenuItem("Message"));
        menu_item2 = new JMenuItem("Open");
        menu_item3 = new JMenuItem("Save");
        menu_item4 = new JMenuItem("Exit");
        
        menu1.add(menu_item1);
        menu1.add(menu_item2);
        menu1.addSeparator();
        menu1.add(menu_item3);
        menu1.addSeparator();
        menu1.add(menu_item4);
        
        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);
        frame.setJMenuBar(menu);
        
        JInternalFrame app1 = new JInternalFrame("Application 01", true, true, true, true);
        app1.setSize(200, 100);
        app1.setLocation(100, 250);
        app1.setVisible(true);
        
        JInternalFrame app2 = new JInternalFrame("Application 02", true, true, true, true);
        app2.setSize(230, 130);
        app2.setLocation(200, 100);
        app2.setVisible(true);
        
        JInternalFrame app3 = new JInternalFrame("Application 03", true, true, true, true);
        app3.setSize(300, 200);
        app3.setLocation(650, 200);
        app3.setVisible(true);
        
        JDesktopPane pane = new JDesktopPane();
        pane.add(app1);
        pane.add(app2);
        pane.add(app3);
        pane.setBackground(Color.black);
        frame.setContentPane(pane);
    }
}
