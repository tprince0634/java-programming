package Constructor.Paramaterized;

//Multiple parameterized Constructor
public class Demo2 {
    int id;
    String name;

    Demo2(){
        System.out.println("Default one");
    }

    Demo2(int id){
        this.id=id;
        System.out.println("Id constructor :" + id);
    }

    Demo2(int id,String  name){
        this.id=id;
        this.name=name;
        System.out.println("Id and name constructor called " + id +  " " + name);
    }
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        Demo2 dd = new Demo2(56);
        Demo2 ddd = new Demo2(90,"Sudikhska");

    }
}
