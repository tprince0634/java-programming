package ThisKeyword;
//Passing the current object as a method argument
class Person{
    void personname(Demo33 s){
        System.out.println(s.name);
    }
}


public class Demo33 {
    String name;

    public Demo33(String name) {
        this.name = name;
    }

    void passthis(){
        Person p = new Person();
        p.personname(this);
    }

    public static void main(String[] args) {
        Demo33 demo33 = new Demo33("Alice");
        demo33.passthis();



    }
}
