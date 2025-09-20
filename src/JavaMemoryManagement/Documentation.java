package JavaMemoryManagement;

public class Documentation {
    /**
     *
     * 🧠 Java Memory Management Overview
     * Java memory is divided into several regions within the Java Virtual Machine (JVM):
     *
     * 🔸 1. Heap
     * Where objects are stored.
     *
     * Managed by the Garbage Collector.
     *
     * Divided into:
     *
     * Young Generation (Young Gen): newly created objects.
     *
     * Eden Space: where objects are first created.
     *
     * Survivor Spaces (S0 and S1): objects that survive GC.
     *
     * Old Generation (Tenured): long-lived objects.
     *
     * 🔸 2. Stack
     * Stores method calls and local variables.
     *
     * Each thread gets its own stack.
     *
     * Memory is managed in LIFO (Last In, First Out) order.
     *
     * When a method finishes, its stack frame is removed.
     *
     * 🔸 3. Method Area (MetaSpace in Java 8+)
     * Stores class metadata (class info, static variables, method data).
     *
     * In older Java versions, it was called PermGen.
     *
     * 🔸 4. Program Counter (PC) Register
     * Each thread has a PC register that keeps track of which instruction it’s executing.
     *
     * 🔸 5. Native Method Stack
     * Used for native (non-Java) code like C/C++ via JNI.
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     * 🔄 How Java Manages Memory
     * ✅ Memory Allocation
     * Primitive types are stored on the stack.
     *
     * Objects and their instance variables go into the heap.
     *
     * JVM handles allocation when new is used.
     *
     * ♻️ Garbage Collection
     * Automatically removes unused objects (no references).
     *
     * JVM runs GC in the background using various algorithms like:
     *
     * Mark and Sweep
     *
     * Generational GC
     *
     * G1 (Garbage First) Collector (default in newer versions)
     *
     * You can request GC with:
     *
     * java
     * Copy
     * Edit
     * System.gc();
     * But it's just a suggestion; the JVM decides when to actually run it.
     *
     * 🧪 Example Flow
     * java
     * Copy
     * Edit
     * public class Test {
     *     public static void main(String[] args) {
     *         int a = 10;                   // Stored in Stack
     *         String s = new String("Hi"); // "Hi" is in Heap
     *     }
     * }
     * a is a local variable → stored on stack
     *
     * s points to an object in heap → created with new*/
}
