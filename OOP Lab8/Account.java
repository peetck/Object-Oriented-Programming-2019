/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Picnic101
 */
public class Account {
    private int balance;
    public Account(){
        this(0);
    }
    public Account(int balance){
        this.balance = balance;
    }
    public void setBalance(int amount){
        balance = amount;
    }
    public int getBalance(){
        return this.balance;
    }
    public boolean withdraw(int amount){
        if (balance - amount >= 0){
             balance -= amount;
             
             return true;
        }
        return false;
        
    }
    public boolean deposit(int amount){
        if (amount > 0){
            balance += amount;
            return true;
        }
        return false;
    }
}
