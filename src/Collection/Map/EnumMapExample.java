package Collection.Map;
import java.util.EnumMap;

/*Efficiency: EnumMap is implemented using arrays, which makes it very fast and memory-efficient compared to other Map implementations like HashMap or TreeMap.
Type-Safety: It ensures type safety by requiring the keys to be of the specified enum type.
Iteration Order: Entries are maintained in the natural order of their keys (the order in which the enum constants are declared).
Null Handling: EnumMap does not allow null keys,     but it allows null values.
*/

public class EnumMapExample {
    enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
    }

    public static void main(String[] args) {
        EnumMap<Day,String> weeklyacticity = new EnumMap<>(Day.class);
        weeklyacticity.put(Day.MONDAY,"Meeting");
        weeklyacticity.put(Day.TUESDAY,"Lunch");
        System.out.println(weeklyacticity);

    }
}
