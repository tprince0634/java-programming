package RegularExpression.Methods_Matcher;
import Command_line_Args.Main;

//finds() method scans the input sequence looking for the next subsequence that matches the pattern
//subsequence A part of the input string (not necessarily the whole string) that matches the pattern.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//finds()
public class Demo2 {
    public static void main(String[] args) {
        String regx = "\\d+";  // Pattern to match one or more digits
        String input = "The man is 43  old and he son is 27 year old";

        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(input);

       while (matcher.find()){
           System.out.println(matcher.group());
       }

    }
}
