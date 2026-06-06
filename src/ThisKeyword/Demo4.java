package ThisKeyword;

public class Demo4 {

        Demo4 getObject() {
            return this;   // returning current object
        }

        public static void main(String[] args) {
            Demo4 d1 = new Demo4();
            Demo4 d2 = d1.getObject();

            System.out.println(d1);
            System.out.println(d2);
        }
    }

    //getObject() is a user-defined method whose purpose is to return the current object using this


