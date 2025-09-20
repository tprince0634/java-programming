package String_Family.AboutString;

//Demo shows that immutability

public class StringDemo {
    public static void main(String[] args) throws InterruptedException {

//        //Immutable
        String string = new String("BSC");
        string.concat("CS");
        System.out.println(string);

        String greet = "Hello";
        String greetwithworld = greet.concat("world");
        System.out.println(greetwithworld);

    }
}
