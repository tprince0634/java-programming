package Enumerator;

enum Weekdays{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}

public class EnumExample {
    public static void main(String[] args) {

        Weekdays weekdays = Weekdays.Monday;
        System.out.println(weekdays);

        switch (weekdays) {
            case Monday:
                System.out.println("This is Monday");
                break;
            case Friday:
                System.out.println("TGIF!");
                break;
            default:
                System.out.println("Just another day.");
        }


        // Iterating over enum constants
        System.out.println("Days of the week:");
        for (Weekdays day : Weekdays.values()) {
            System.out.println(day);
        }
    }
}

 





