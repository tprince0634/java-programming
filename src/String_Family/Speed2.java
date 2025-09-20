package String_Family;

public class Speed2 {
    public static void main(String[] args) {
        long startTime, endTime;


        startTime = System.currentTimeMillis();
        String string = "Hello";
        for (int i = 0; i < 10000; i++) {
            string.concat("World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("String Timing: " + (endTime - startTime) + "ms");



        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("Hello");
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder Timing: " + (endTime - startTime) + "ms");




        startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer("Hello");
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append("World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer Timing: " + (endTime - startTime) + "ms");





    }
}
