package Generic2.ExceptionHandlingInGeneric;
/**
 * n Java, you cannot declare a generic type parameter for a class that extends Throwable
 * (or its subclasses). This is a restriction in the Java language to ensure type safety
 * and consistency in exception handling.*/


// Custom exception class without generics
class DetailedException extends Exception {
    private Object details; // Use Object to hold any type of details

    public DetailedException(String message, Object details) {
        super(message);
        this.details = details;
    }

    public Object getDetails() {
        return details;
    }
}

// Main class to demonstrate exception handling
class Main {
    public static void main(String[] args) {
        try {
            // Throwing a DetailedException with an Integer type
            throw new DetailedException("An error occurred", 404);
        } catch (DetailedException e) {  // Catching without generics
            System.out.println("Exception Message: " + e.getMessage());
            System.out.println("Details: " + e.getDetails());
        }

        try {
            // Throwing a DetailedException with a String type
            throw new DetailedException("Another error occurred", "Invalid input");
        } catch (DetailedException e) {  // Catching without generics
            System.out.println("Exception Message: " + e.getMessage());
            System.out.println("Details: " + e.getDetails());
        }
    }
}