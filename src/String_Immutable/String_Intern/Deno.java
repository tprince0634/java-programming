package String_Immutable.String_Intern;

public class Deno {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello").intern();

        System.out.println(str1 == str2); // Output: true (Same object reference)
        System.out.println(str1 == str3); // Output: true (Same object reference)
    }
}
