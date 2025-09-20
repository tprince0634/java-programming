package Stream.Advance;

public class Documentation {
    /**
     *
     * In Java, Streams are a powerful feature introduced in Java 8 that allow for a functional approach
     * to processing sequences of elements, such as collections or arrays.
     * A Stream represents a sequence of elements that can be processed in parallel or sequentially.
     * Streams allow you to perform complex operations, like filtering, mapping, reducing,
     * and collecting, in a concise and declarative manner.
     *
     * */
    /**
     *
     * A Functional Opps.Abstraction.Interface in Java is an interface that has exactly one abstract method.
     * Functional interfaces can be used as the target type for lambda expressions or method references.
     * They are key to functional programming in Java, especially in streams and other
     * functional constructs.
     * */

    /**
     * Streams are lazy in nature, meaning they are evaluated only when a terminal operation
     * is invoked (e.g., collect(), forEach(), reduce()).
     *
     * */
    /**
     * Types of Streams in Java:
     * Sequential Streams:
     *By default, streams are sequential, which means elements are processed in a single-threaded manner (one at a time).

     * Parallel Streams:
     * A parallel stream processes elements in parallel, which can improve performance for large datasets
     * on multicore processors.
     * */

    /**
     * Intermediate Operations:
     * These operations transform a stream into another stream.
     * They are lazy, meaning they are not executed until a terminal operation is invoked.
     * Examples of intermediate operations: filter(), map(), sorted(), distinct(), flatMap(), etc.
     *
     * Terminal Operations:
     * These operations produce a result or a side effect and trigger the processing of the stream.
     * Examples of terminal operations: collect(), forEach(), reduce(), count(), anyMatch(), etc.
     * */

    /**
     *
     * Benefits of Streams:
     * Concise Code: Streams allow you to write complex operations in a more declarative and concise manner.
     * Parallelism: With minimal changes, streams can be processed in parallel, taking advantage of multi-core processors for better performance.
     * Lazy Evaluation: Streams only perform computations when necessary (triggered by terminal operations), making them efficient.
     * */




}
