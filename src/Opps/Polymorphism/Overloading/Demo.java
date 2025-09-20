package Opps.Polymorphism.Overloading;
//same name Different parameter
public class Demo {
    public void show(String name , int age){
        System.out.println(name);
        System.out.println(age);
        System.out.println("First");
    }

    public void show(String name,float age){
        System.out.println(name);
        System.out.println(age);
        System.out.println("second");
    }
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show("Prince",56.5f);  // compiler know which method is going to call by the value you provide this is called overloading
    }
}
