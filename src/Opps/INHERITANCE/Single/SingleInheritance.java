package Opps.INHERITANCE.Single;


//superclass
public class SingleInheritance {
    public  void display(){
        System.out.println("THIS IS THE SUPER CLASS METHOD");
    }
}
//subclass
class Sub extends SingleInheritance{
    public void show(){
        System.out.println("THIS IS SUB CLASS METHOD");
    }

    public static void main(String[] args) {
        Sub sam = new Sub();
        sam.display(); //superclass method accessing from subclass
        sam.show();
    }
}
