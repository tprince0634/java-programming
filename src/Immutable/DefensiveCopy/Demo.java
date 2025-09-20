package Immutable.DefensiveCopy;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public final class Demo {

    private final String name;
    private final List<String> subjects;     // Mutable List


    public Demo(String name, List<String> subjects) {
        this.name = name;
        this.subjects = new ArrayList<>(subjects);  // Now it's a modifiable ArrayList
    }

    public String getName() {
        return name;
    }

    public List<String> getSubjects() {
        return new ArrayList<>(subjects);
    }



    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>(Arrays.asList("Math", "Science", "History"));

        Demo demo = new Demo("Alice", subjects);
        System.out.println("Original Subjects: " + demo.getSubjects());

        subjects.add("English");
        System.out.println("Modified Original List: " + subjects);

        System.out.println("Demo's Subjects (after modifying original): " + demo.getSubjects());
    }
}

/*Defensive copying is a technique used to protect an object's internal state from being modified
 by external code. By creating a copy of mutable objects when they're passed to or returned
 from your class, you ensure that external modifications do not affect your object's internal state.*/