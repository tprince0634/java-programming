package RegularExpression.Methods_Matcher;

import Command_line_Args.Main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Syntax: boolean lookingAt()
//The lookingAt() method attempts to match the input sequence from the beginning.
public class Demo3 {
    public static void main(String[] args) {

        String regex = "\\d";
        String input = "123abc456";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        boolean b = matcher.lookingAt();
        System.out.println(b);


    }
}
