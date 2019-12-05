/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Picnic101
 */
import java.io.*;

public class BalanceStorage {
    
    public static double getBalance(){
        try{
            FileInputStream fout = new FileInputStream("Balance.dat");
            DataInputStream dout = new DataInputStream(fout);
            double balance = dout.readDouble();
            dout.close();
            fout.close();
            return balance;
        }
        catch(IOException e){
            return 9000.0;
        }
        
    }
    public static void saveBalance(double balance){
        
    }
}
