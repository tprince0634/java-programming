package Opps.Abstraction.FirstWay.Example2;

public class MyAtm extends ATM{

    MyAtm(double balance) {
        super(balance);
    }

    @Override
    void moneywithdrawl(double amount) {

        if(amount < getBalance()){
            setBalance(getBalance()-amount);
            System.out.println("Withdraw Successful " + amount);
        }else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    void balancecheck() {
        System.out.println("Your Current Balance is " + getBalance());
    }


    public static void main(String[] args) {
        ATM myAtm = new MyAtm(1000); //setting initial Balance

        myAtm.displayWelcomeMessage();
        myAtm.balancecheck();
        myAtm.moneywithdrawl(1500);


    }
}
