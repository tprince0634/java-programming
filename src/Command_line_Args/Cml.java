package Command_line_Args;

public class Cml {
    public static void main(String[] args) {
        // Check if any arguments were passed
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
            return;
        }

        // Print the command-line arguments
        System.out.println("Command-Line Arguments:");
        for (int i = 0; i < args.length; i++) {
          //  System.out.println("Argument " + i + ": " + args[i]);
            System.out.println(args[i]);
        }

//        System.out.println(args[0]);
//        System.out.println(args[1]);
    }
}