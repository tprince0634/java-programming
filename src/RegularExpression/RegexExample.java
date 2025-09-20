import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        String regex = "a$";
        String input = "All is wella";

        //Compiler
        Pattern pattern = Pattern.compile(regex);
        //Matching Process
        Matcher matcher = pattern.matcher(input);

        boolean found = matcher.find();
        if(found){
            System.out.println("Got the regex in the following String");
        }else {
            System.out.println("Not present in the String");
        }

        matcher.reset();
        while (matcher.find()){
            System.out.println("Match: " + matcher.group());
        }
//The method matcher.group() in Java is used to retrieve the actual text matched by the regex during a match operation.
    }
}
