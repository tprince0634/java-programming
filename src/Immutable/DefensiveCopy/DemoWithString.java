package Immutable.DefensiveCopy;



public class DemoWithString {
    private final String myString;

    public DemoWithString(String myString) {
        // No defensive copy needed — String is immutable
        this.myString = myString;
    }

    public String getMyString() {
        // No need to clone — safe to return directly
        return myString;
    }

    public static void main(String[] args) {
        String input = "Hello";
        DemoWithString demo = new DemoWithString(input);
        System.out.println("Stored string: " + demo.getMyString());

        // Try modifying original string reference
        input = "World";           // This only changes the `input` reference, not demo.myString
        System.out.println("Modified original: " + input);
        System.out.println("Internal string: " + demo.getMyString());
    }
}
