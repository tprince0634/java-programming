package Static_fields;

class Demo {
    static {
        System.out.println("Static block 1 executed");
    }

    static {
        System.out.println("Static block 2 executed");
    }

    static int staticVar = 5;

    static {
        System.out.println("Static block 3 executed");
    }

    Demo() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        Demo demo = new Demo(); // Class loading occurs here
        System.out.println("Static variable: " + Demo.staticVar);
    }
}