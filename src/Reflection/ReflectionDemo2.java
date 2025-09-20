package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Myclass{
     private  String name;
     private  String Lastname;


    public Myclass( String name,String lastname) {
        this.name = name;
        this.Lastname = lastname;
    }


    public String getLastname() {
        return Lastname;
    }

    public String getName() {
        return name;
    }

    public  static  void show(){
        System.out.println("This is a static method ");
    }

    private void privatemethod(){
        System.out.println("This is a private method");
    }

}

public class ReflectionDemo2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InvocationTargetException {
        Myclass myclass = new Myclass("Prince","Tiwari");


        Field [] fields = myclass.getClass().getDeclaredFields();

        for(Field field: fields){
            field.setAccessible(true);
            if (field.getName().equals("name")) {
               field.set(myclass,"Avinash");
            }
        }
        System.out.println(myclass.getName());

        // Invoking method via reflection
        Method[] methods = myclass.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equals("show")) {
                method.setAccessible(true);
                method.invoke(myclass);

                myclass.show();    //you can call public method but cant private

                /*  myclass.privatemethod();
                if (method.getName().equals("privatemethod")) {
                    method.setAccessible(true);
                    method.invoke(myclass);

       */
        // you can not call private method directly but with the help of reflection  you can call




            }
        }
    }
}
