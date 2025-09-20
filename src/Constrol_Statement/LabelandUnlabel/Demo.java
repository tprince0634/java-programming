package Constrol_Statement.LabelandUnlabel;

import java.sql.SQLOutput;

public class Demo {
    public static void main(String[] args) {

        System.out.println("Unlabeled");
//Unlabeled
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    break;              // Breaks inner loop when j == 2
                }
                System.out.println("i = " + i + " j = " + j);
                //The break only exits the inner loop, so for each outer loop (i), it prints only the first j = 1 value.
            }
        }
//labeled
        System.out.println("labeled");
        Outer:
        //label
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    break Outer;              // Breaks inner loop when j == 2
                }
                System.out.println("i = " + i + " j = " + j);
            }
        }


    }
}

/*Unlabeled break Statement:

It only breaks out of the innermost loop or switch statement in which it appears.
It is typically used in for, while, do-while, or switch statements.

Labeled break Statement:

It allows you to break out of a specific, outer loop or block of code.
This is useful when dealing with nested loops or blocks, where you want to break out of a loop that is not the innermost one.*/



