package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person2{
     private  String fullname;

    public Person2(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }

    public void modi(){
        System.out.println("The name is : " + fullname);
    }

}
public class Reflection4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> person2class = Class.forName("Reflection.Person2");

        Constructor<?> constructor = person2class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        Object obj = constructor.newInstance("Don");


        Field field = obj.getClass().getDeclaredField("fullname");
        field.setAccessible(true);
        field.set(obj,"Prince Tiwari");


        Method method = obj.getClass().getDeclaredMethod("modi");
        method.setAccessible(true);
        method.invoke(obj);

        // Optionally, get the value of the field
        String value = (String) field.get(obj); // Retrieve the updated value
        System.out.println("Updated fullname: " + value); // Print the updated value



    }
}
