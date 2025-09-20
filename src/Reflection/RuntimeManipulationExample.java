package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person {
    private String name;
    private int age;

    private Person(String name) {
        this.name = name;
        this.age = 0; // default value
    }

    private void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

public class RuntimeManipulationExample {
    public static void main(String[] args) throws Exception {

        // 1. Load the class dynamically
        Class<?> personClass = Class.forName("Reflection.Person");

        // 2. Access private constructor with one String parameter
        Constructor<?> constructor = personClass.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);

        //object

        Object alice = constructor.newInstance("Alice");

        // 3. Modify fields on the object
        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.getName().equals("name")) {
                field.set(alice, "Arjun");
            } else if (field.getName().equals("age")) {
                field.setInt(alice, 78);
            }
        }


        // 4. Invoke the private method
        Method method = personClass.getDeclaredMethod("sayHello");
        method.setAccessible(true);
        method.invoke(alice);  // Corrected
    }
}
