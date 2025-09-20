package Collection.Set;

/*
Efficiency: EnumSet is implemented internally as a bit vector, which makes it very fast and efficient in terms of both time and space when compared to other Set implementations like HashSet or TreeSet.
Type-Safety: It can only contain elements of the specified enum type, ensuring type safety.
Iteration Order: Elements are maintained in their natural order (the order in which the enum constants are declared).
Null Handling: EnumSet does not allow null elements.
*/

import javax.swing.plaf.BorderUIResource;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetExample {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

        public static void main(String[] args) {
            EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
            System.out.println("Weekend days: " + weekend);                 // Weekend days: [SATURDAY, SUNDAY]

            EnumSet<Day> workdays = EnumSet.range(Day.MONDAY, Day.FRIDAY);
            System.out.println("Workdays: " + workdays);                    //Workdays: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY]

            EnumSet<Day> allDays = EnumSet.allOf(Day.class);
            System.out.println("All days: " + allDays);                      // All days: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]


    }
}
