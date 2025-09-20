package ThreadingByAman.VirtualThread;

public class Documentation {
    /*there are two types of threads*/

    /*✅ 1. Platform Thread (Traditional Thread)
    Also called: Carrier thread, OS thread, or Kernel thread
	Any thread that is backed by an OS thread (like new Thread()) are Platform Thread.
   	The main thread is a platform thread.

What it is:  A traditional thread backed by the operating system.
Heavyweight: Limited number because each uses a native OS thread (which is expensive).
Blocking is costly: If a thread blocks (e.g., Thread.sleep() or I/O), that OS thread is stuck.
(The entire OS thread is paused and removed from the CPU scheduler for 5 seconds.)

    🧠 Use when:
    You need long-running tasks.
    You're doing a small number of concurrent operations. */



 /*🚀 2. Virtual Thread (New in Java 21)
What it is: A lightweight thread managed by the JVM rather than the OS.
Created using: Thread.startVirtualThread(...) or Executors.newVirtualThreadPerTaskExecutor()
Lightweight: You can create millions of them.
Non-blocking or managed-blocking: JVM can suspend and resume them without blocking an OS thread.

They exist to provide scale (higher throughput), not speed (lower latency).


    🧠 Use when:
    Use virtual threads in high-throughput concurrent applications,
    especially those that consist of a great number of concurrent tasks
    that spend much of their time waiting. Server applications are examples
    of high-throughput applications because they typically handle many client
    requests that perform blocking I/O  */
}
