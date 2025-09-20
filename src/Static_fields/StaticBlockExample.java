package Static_fields;

public class StaticBlockExample {

    public static void sayhi(){
        System.out.println("Method");
    }
    static {
        System.out.println("Static block executed Before Object creation ");
    }

    public static void main(String[] args) {
        sayhi();
    }
}

