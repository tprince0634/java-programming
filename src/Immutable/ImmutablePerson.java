package Immutable;

public  final  class ImmutablePerson {
    private final String name;
    private final int age;


    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        ImmutablePerson a = new ImmutablePerson("Khan sir", 43);

        System.out.println("Person Name: " +a.getName());
        System.out.println("Person Age: " + a.getAge());

        // a.name = "Bob";        // ❌ Cannot assign a value to final variable
        // a.age = 25;            // ❌ Cannot assign a value to final variable
        // a.setName("Bob");      // ❌ No setter method exists

    }
}



