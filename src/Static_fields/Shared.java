package Static_fields;

public class Shared {

    //variable
    static int count =0;


    //constructor
    Shared(){
        count++;
    }

    public static void main(String[] args) {
        Shared s = new Shared();
        Shared ss = new Shared();
        System.out.println(count);

//        System.out.println(s.count);
//        System.out.println(ss.count);  //if not static




    }
}
