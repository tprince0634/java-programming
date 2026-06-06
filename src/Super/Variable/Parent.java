package Super.Variable;

public  class Parent {
    int x = 10;
}


class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println(super.x);
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.show();
//      System.out.println(super.x);  //error super cannot be used in static context

    }
}
