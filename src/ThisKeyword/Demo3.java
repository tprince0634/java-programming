package ThisKeyword;

public class Demo3 {

    // Method that receives a Demo3 object
    public void show(Demo3 demo3) {
        System.out.println("Received object: " + demo3);
    }

    // Method that passes current object
    public void store() {
        show(this);   // passing current object
    }

    public static void main(String[] args) {
        Demo3 demo3 = new Demo3(); // creates an object
        demo3.store();             // call store()
        demo3.show(demo3);
    }
}

//The code proves  this keyword refers to the current object and can be passed as a parameter to another method.