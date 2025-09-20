package Immutable.DefensiveCopy;

import com.sun.security.jgss.GSSUtil;

import java.sql.Date;
import java.util.*;
import java.util.*;


 public class Demo2{
    public static void main(String[] args) {

        final List<String> myTable = new ArrayList<>();            // final variable

        myTable.add("Item 1");     // ✅ Allowed: modifying object state
        myTable.add("Item 2");
        System.out.println("myTable: " + myTable);

        myTable.set(1, "Updated Item 2");                       // ✅ Allowed: still modifying internal state
        System.out.println("myTable after update: " + myTable);

        // myTable = new ArrayList<>(); // ❌ Not allowed: cannot reassign final variable
    }
}

