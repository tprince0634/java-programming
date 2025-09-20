package RegularExpression.spliting;
//Using String.split()
//The split() method of the String class splits the string around matches of the given regular expression.
public class way1 {
    public static void main(String[] args) {
        String regex = ",";
        String input = "one,two,three,four";

        String[] result = input.split(regex);

        for (String part : result) {
            System.out.println(part);
        }
    }
}
