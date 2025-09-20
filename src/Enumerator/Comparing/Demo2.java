package Enumerator.Comparing;
enum Color2{
        RED, GREEN, BLUE;
}

public class Demo2 {
    public static void main(String[] args) {
        Color2 color1 = Color2.RED;
        Color2 color2 = Color2.RED;
        Color2 color3 = Color2.BLUE;

        if (color1.equals(color2)) {
            System.out.println("color1 and color2 are the same");
        } else {
            System.out.println("color1 and color2 are different");
        }

        if (color1.equals(color3)) {
            System.out.println("color1 and color3 are the same");
        } else {
            System.out.println("color1 and color3 are different");
        }


    }
}


