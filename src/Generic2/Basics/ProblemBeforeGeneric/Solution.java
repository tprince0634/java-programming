package Generic2.Basics.ProblemBeforeGeneric;

import java.util.ArrayList;

//After Generics
public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();         //It is a type safe now
        arr.add(1);
//      arr.add("Ppp");                                       Compile time error

    }
}
