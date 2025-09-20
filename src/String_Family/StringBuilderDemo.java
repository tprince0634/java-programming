package String_Buffer_Builder;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Hello");

        stringBuilder.append("world").reverse().reverse().insert(0,"P");
        String string = stringBuilder.toString();
        System.out.println(string);

    }
}
