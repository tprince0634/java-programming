package Command_line_Args;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        if(args.length > 0){
            for(String a : args){
                System.out.println(a);

                try {
                    int number = Integer.parseInt(a);                 // Convert the string argument to an integer
                    System.out.println("Parsed integer: " + number);
                }catch (NumberFormatException e){
                    System.out.println("Invalid number" + e);
                }

            }
        } else {
            System.out.println("No arguments were passed.");
        }


    }
}

//Because command-line arguments are always treated as text (Strings) when passed to main(String[] args) — no matter what you type.
//So Java receives "677" (the characters '6', '7', '7') as a String, not as a real number.