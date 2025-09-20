package Threading.Basic;

public class Documentation {

    /**
     * In Java, the main thread is the first thread that starts when a Java program begins execution.
     * It’s created automatically by the Java Virtual Machine (JVM) and runs the code inside
     * your main() method.
     * */

    /**TWO WAYS TO ACHIEVE Threading in YOUR CODE */

    //BY EXTENDING THREAD
    /**  Steps for Extending Thread class
     *
     * 1> You need to extend Thread in a class
     * 2> You have to override Run method of a thread
     * 3> Create object of a class and call Start() to invoke run method
     */

    //BY IMPLEMENTING THE RUNNABLE INTERFACE
    /**  Steps for  implementing Runnable
     *
     * 1> You need to implement Runnable
     * 2> You have to override Run method of a thread
     * 3> Create object of a class Runnable class AND ALSO
     * 4> Have to create Object of Thread and pass the instance of Runnable class in to its constructor
     * 5> Call the Start () through Multi_Threading.Thread instance
     */



    /**
     * In Java, a daemon thread is a special type of thread that runs in the background and is
     * typically used for tasks that do not require user interaction.
     * Daemon threads are designed to provide services to user threads (also known as non-daemon threads)
     * and are often used for tasks such as garbage collection, monitoring, or handling background tasks.
     * */


}
