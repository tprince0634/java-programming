package Lambda2.Basics;

//lamba with return

@FunctionalInterface
interface B {
    int add(int a , int i);
}


public class Demo1 {
    public static void main(String[] args) {

        B b = (a,i) ->  a + i;

        int result = b.add(4,5);
        System.out.println(result);

    }
}


