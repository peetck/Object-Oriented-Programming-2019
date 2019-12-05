/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Picnic101
 */
public class AccountController {
    private Account model;
    private AccountView view;
    
    public AccountController(){
        model = new Account();
        view = new AccountView(model.getBalance(), this);
    }
    /*public AccountController(Account model, AccountView view){
        model = new Account();
        view = new AccountView(model.getBalance(), this);
    }*/
    public void setModel(Account model){
        this.model = model;
    }
    public Account getModel(){
        return model;
    }
    public void setView(AccountView view){
        this.view = view;
    }
    public AccountView getView(){
        return view;
    }
}
