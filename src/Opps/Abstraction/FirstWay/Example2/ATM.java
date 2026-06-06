package Opps.Abstraction.FirstWay.Example2;

public  abstract  class ATM {
    private double balance;

    //Constructor
    ATM(double balance){
        this.balance=balance;          //setting initial Balance
        System.out.println(balance);
    }


    //abstract Method
    abstract void moneywithdrawl(double balance);
    abstract void balancecheck();

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    // Concrete method (common functionality)
    public void displayWelcomeMessage() {
        System.out.println("Welcome to ATM Service");
    }
}


