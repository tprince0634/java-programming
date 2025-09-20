package Generic2.Basics.GenericInterface.Two;
//Multiple Generic type

//A generic interface can have multiple type parameters.
// This is useful when you need to work with more than one type in the same interface.


public interface Pair <K,V> {
    K  getKey();
    V  getValue();
}


//Here, the Pair interface defines two generic type parameters K and V.