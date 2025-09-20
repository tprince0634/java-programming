package Constructor.CallingConstructor;

public class Demo2 {

        // constructor 1
        Demo2() {
            this("Hello"); // calls constructor 2
            System.out.println("Constructor 1: Default Constructor");
        }

        // constructor 2
        Demo2(String message) {
            this( 10); // calls constructor 3
            System.out.println("Constructor 2: " + message);
        }

        // constructor 3
        Demo2( int num) {
            System.out.println("Constructor 3: " + num );
        }

        public static void main(String[] args) {
            Demo2 obj = new Demo2();
        }
    }
