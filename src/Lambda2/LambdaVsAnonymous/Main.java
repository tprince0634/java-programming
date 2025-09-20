package Lambda2.LambdaVsAnonymous;
@FunctionalInterface
interface Mathoperation{
   abstract int operation(int a, int b);   //NO implementation cause abstract by default
}



public class Main {
    public static void main(String[] args) {

        //Anonymous inner class        An anonymous inner class in Java is a type of inner class that does not have a name and is defined and instantiated in a single expression. It is used to create a class that extends another class or implements an interface without explicitly declaring a separate named class.
        Mathoperation mathoperation = new Mathoperation() {
            @Override
            public int operation(int a, int b) {
                System.out.println("This is Anonymous inner class");
                return a+b;
            }
        };
        System.out.println(mathoperation.operation(4,7));



//Lambda Function
        Mathoperation mathoperation1 = ((int a,int b)->{
            System.out.println("This is a lambda function");
            return a+b;
        });
        System.out.println(mathoperation1.operation(6,6));

    }

}
