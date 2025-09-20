package Collection.Map.ConcurrentHashMap;

public class Document {
/*🔄 Replacement of HashTable:
✔️ ConcurrentHashMap was introduced to replace Hashtable for thread-safe operations with better concurrency and less performance penalty.

🔐 Java 7: Segment-Based Locking (Partitioned Locking)
✅ ConcurrentHashMap was divided into 16 segments (small individual hash maps).
✅ Each segment had its own lock.

✅ Concurrency Achieved:
➤ Only the segment being written to was locked.
➤ Reads usually did not require locks unless a write was happening in the same segment.

✅ Problem:
➤ Even with 16 segments, concurrency was limited (a thread might wait if other threads were writing to its target segment).


🚀 Java 8: Improved Design
✅ Segment-based locking was removed.
✅ Introduced bucket-based locking (finer granularity).
✅ Uses Compare-And-Swap (CAS) for updates →  lock-free wherever possible.
✅ Locking is required only during resizing and complex collisions (like tree-based buckets).
✅ Much higher concurrency and less contention than Java 7.


🔄 Compare-And-Swap (CAS) Overview:
✔️ CAS is an atomic operation that:
Compares a variable’s current value with an expected value.
If they are equal, swaps the current value with a new one.
If not, the operation fails and can retry.

*/
}
