package StrongandWeak;

public class Documentation {

 /*Strong Reference
Definition: A strong reference is the default type of reference in Java.
 When you create an object and assign it to a variable, you are creating a strong reference to that object.
 Garbage Collection: An object that is strongly reachable
(i.e., there is at least one strong reference pointing to it) will not be garbage collected.
 The garbage collector will only reclaim memory from objects that are no longer strongly reachable.*/

/*Weak Reference
Definition: A weak reference is a type of reference that does not prevent its referent
 (the object it points to) from being made eligible for garbage collection.
 Weak references are used when you want to allow the garbage collector to reclaim the memory
 of an object when it is no longer strongly reachable.
Garbage Collection: If an object is only weakly reachable (i.e., there are no strong references to it),
 it can be collected by the garbage collector.
 This is useful for implementing caches or mappings where you want to allow the garbage collector
 to reclaim memory when needed.
 */

}
