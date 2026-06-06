package Opps.INHERITANCE.DaimondSolution.Two;

interface  A{
    void show();
}

interface  B extends  A{
    void show();
}

interface C extends  A{
    void show();
}

public class D implements B,C {
    @Override
    public void show() {
        System.out.println("Resolved in class C");
    }

    public static void main(String[] args) {
        D d = new D();
        d.show();
    }
}

/*

Explanation
Interfaces only declare methods (no implementation).
Even though B and C both inherit show() from A, there is no method body.
So class D is forced to implement show().
Hence, no ambiguity occurs.

*/