
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB203_40
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception e){
            
        }
        //new Pre_01();
        //new Pre_02();
        //new Pre_03();
        new Pre_04();
    }
    
}
