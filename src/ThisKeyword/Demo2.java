package ThisKeyword;

public class Demo2 {
    String name;
    int age;

    // 1️⃣ Default Constructor
    Demo2() {
        this(5);  // calls Demo2(int age)
        System.out.println("Default");
    }

    // 2️⃣ Parameterized Constructor (String)
    Demo2(String name) {
        this.name = name;
        System.out.println("Parameterized 1");
    }

    // 3️⃣ Parameterized Constructor (int)
    Demo2(int age) {
        this("Kiran");  // calls Demo2(String name)
        this.age = age;
        System.out.println("Parameterized 2");
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
    }
}
