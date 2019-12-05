public class CheckingAccount extends Account{
    /* Attribute */
    private double credit;
    /* Constructor */
    public CheckingAccount(){
        this(0, "", 0);
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    /* methods */
    public void setCredit(double credit){
        if (credit > 0){
            this.credit = credit;
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return this.credit;
    }
    public void withdraw(double a){
        double balance = getBalance();
        if (balance - a >= 0){
            super.withdraw(a);
            System.out.println(" and your credit balance is " + this.credit + ".");
        }
        else if (balance - a + this.credit >= 0){
            this.balance = 0;
            this.credit -= balance - a + this.credit;
            System.out.println(" and your credit balance is " + this.credit + ".");
        }
        else{
            System.out.println("Not enough money!");
        }
    }
    /* Overidden methods */
    public void withdraw(int a){
        double balance = getBalance();
        if (balance - a >= 0){
            super.withdraw(a);
            System.out.println(a + " baht is withdrawn from " + getName() + " and your credit balance is " + this.credit + ".");
        }
        else if (balance - a + this.credit >= 0){
            this.balance = 0;
            this.credit -= balance - a + this.credit;
            System.out.println(a + " baht is withdrawn from " + getName() + " and your credit balance is " + this.credit + ".");
        }
        else{
            System.out.println("Not enough money!");
        }
    }
    public String toString(){
        return "The " + getName() + " account has " + getBalance() + " baht and " + this.credit + " credits.";
    }
}