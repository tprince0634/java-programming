package Opps.Abstraction2.Firstway;

//Think of an ATM machine.
// You interact with it to withdraw money,
// check your balance, etc.,
// without needing to know how it processes
// transactions internally.

abstract class ATM{
    abstract void withdrawMoney();
    abstract void checkBalance();
}

class Myatm extends ATM{

    @Override
    void withdrawMoney() {
        System.out.println("Money withdraen");
    }

    @Override
    void checkBalance() {
        System.out.println("Balanced Checked");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Myatm myatm = new Myatm();
        myatm.checkBalance();
        myatm.checkBalance();


    }
}
