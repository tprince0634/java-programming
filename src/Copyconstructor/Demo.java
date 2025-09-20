package Copyconstructor;

public class Demo {
    int id;
    String name;

//parameterized
    Demo(int id, String name){
        this.id=id;
        this.name=name;
        System.out.println("paramaterized");
    }


//copy
    Demo(Demo  obj){
        this.id = obj.id;
        this.name=obj.name;
        System.out.println("Copy Constructor");
    }

    public void show(){
        System.out.println(id);
        System.out.println(name);
    }



    public static void main(String[] args) {
        Demo original = new Demo(34,"Gaikwad");
        Demo copy = new Demo(original);

        original.show();
        copy.show();



    }
}
