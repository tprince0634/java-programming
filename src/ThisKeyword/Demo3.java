public class Demo3 {
    public void show() {
        System.out.println(this); // prints the current object reference
    }

    public static void main(String[] args) {
        Demo3 demo3 = new Demo3(); // creates an object
        System.out.println(demo3); // prints reference of demo3
        demo3.show();              // inside show(), 'this' refers to demo3, so prints same reference
    }
}

//This confirms that this == demo3 in this context.