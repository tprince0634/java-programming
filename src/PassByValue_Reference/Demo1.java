package PassByValue_Reference;
//pass by value with Objects
public class Demo1 {

    public  static  void modify(StringBuilder s){
        s.append("World");
        System.out.println("Modified Value " + s);
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello");
        System.out.println("Original Value " + s);

        modify(s);
        System.out.println("After Modification " + s);

    }
}



/*How can the original object still get modified then?
The reference variable (e.g., s in main) holds the memory address of the actual object (StringBuilder instance).
When you call modify(s), Java copies this reference (the address) and passes the copy into the method parameter (s in modify).
Now both the original reference and the parameter point to the same object in memory.
So when you do s.append("World") inside the method, you modify the object that both references point to.
Since the object itself is modified, the changes are visible outside the method as well.*/