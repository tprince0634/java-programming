package RegularExpression.spliting;

import java.util.regex.Pattern;

public class way2 {
    public static void main(String[] args) {

        String regex = "\\,";
        String input = "This,is,a,test";

        Pattern pattern = Pattern.compile(regex);
        String[] result = pattern.split(input);

        for (String part : result) {
            System.out.println(part);
        }
    }
}
