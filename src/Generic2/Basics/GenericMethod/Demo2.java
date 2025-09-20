package Generic2.Basics.GenericMethod;

public class Demo2 {

    public <K,V> void show(K age, V name){
        System.out.println(age);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Demo2 d2 = new Demo2();
        d2.show(45,"Rohit");
    }
}
