package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Company{
    private String name;

    Company(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void displayname(){
        System.out.println("The name of the compnay is : " + name);
    }
}



public class ReflectionExamample{
    public static void main(String[] args) throws Exception {

        Company company = new Company("Youtube");
        System.out.println(company.getName());

        //Reflection

        Field namefield = company.getClass().getDeclaredField("name");
        namefield.setAccessible(true);
        namefield.set(company,"Google");
        System.out.println("Using Reflection :" + company.getName());

//        //invoking method
        Method methodfield = company.getClass().getDeclaredMethod("displayname");
        methodfield.setAccessible(true);
        methodfield.invoke(company);


    }
}
