package Collection.Comparator2;

public class Document {
/*Comparator :
The Comparator interface is used to define a custom order for sorting objects.
 It can be implemented as a separate class, or as an anonymous class or lambda expression.
 A Comparator must override the compare method.
 */

    /*
    when you are using string use
    return o2.compareTo(o1);
    integer
    o1 - o2
    Length
    o1.get length() - o2.get length()
    */


/*
🔸 d. Comparator.comparing() (Recommended Clean Way)
students.sort(Comparator.comparing(Student::getName));

students.sort(Comparator.comparing(Student::getAge).thenComparing(Student::getName));

*/
    //syntax
    //Comparator.comparing(Function keyExtractor)

}
