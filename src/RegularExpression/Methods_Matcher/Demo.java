package RegularExpression.Methods_Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//matches()
// Syntax: boolean matches()
//Behavior: Returns true if the entire input sequence matches the pattern.

public class Demo {
    public static void main(String[] args) {
        String regex = "\\d{4}";
        String  input = "2025";

//        String input = "20256";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

//
        boolean result = matcher.matches();
        System.out.println(result);

    }
}
