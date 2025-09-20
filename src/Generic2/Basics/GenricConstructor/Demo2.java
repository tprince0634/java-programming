package Generic2.Basics.GenricConstructor;

public class Demo2 {

    <K,V> Demo2(K Roll,V Name){
        System.out.println("Roll: " + Roll);
        System.out.println("Name: " + Name);
    }

    public static void main(String[] args) {
        Demo2 d2 = new Demo2(14,"Gaikwad");
        Demo2 d3 = new Demo2("JS",45);             //There is no specific data
    }
}
