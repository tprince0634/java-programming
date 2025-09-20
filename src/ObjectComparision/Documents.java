package ObjectComparision;

public class Documents {
    /**
     *
     * Integer Caching: Java caches Integer objects in the range -128 to 127.
     * This means that a == b will store in Cache  and return true for values in this range,
     * because both a and b point to the same cached object.
     * */


    /**For primitive
     *  == compares their actual values.
     * */

    /**For Objects
     *  == checks if the two references point to the same object in memory,
     *  not if the objects have the same content or value.]
     *
     * .equals(): Compares the values or contents of the objects.
     */

}



/**
 *
 * // These values are in the Integer pool (-128 to 127)
 *         Integer num1 = 100;
 *         Integer num2 = 100;
 *         System.out.println(num1 == num2); // true, both refer to the same object in the pool
 *
 *         // These values are outside the Integer pool
 *         Integer num3 = 200;
 *         Integer num4 = 200;
 *         System.out.println(num3 == num4);  // false, they are different objects, outside the pool*/



