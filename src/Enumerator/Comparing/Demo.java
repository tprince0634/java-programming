package Enumerator.Comparing;

/* In Java, enums are designed so that each constant is a singleton.

 This design ensures that assigning the same enum constant to different variables results
 in all variables referencing the same object.
 (When you assign the same enum constant to multiple variables in Java,
  all those variables point to the exact same object in memory.)

  Because enums in Java are singletons by design.
Each constant like Day.MONDAY is created only once in the JVM.
So, no matter how many variables you assign to Day.MONDAY,
they all refer to that one single shared object.

 Therefore, using the == operator for comparison
 is not only safe but also the recommended practice.*/
//This is more concise way of comparing

enum  Color{
    Red,White,Yellow;
}
public class Demo {
    public static void main(String[] args) {
        Color color1 = Color.Red;
        Color color2 = Color.Red;
        Color color3 = Color.Yellow;


        if (color1 == color2) {
            System.out.println("color1 and color2 are the same");
        } else {
            System.out.println("color1 and color2 are different");
        }

        if (color1 == color3) {
            System.out.println("color1 and color3 are the same");
        } else {
            System.out.println("color1 and color3 are different");
        }
    }

}
