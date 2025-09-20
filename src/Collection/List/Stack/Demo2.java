package Collection.List.Stack;

import java.util.Stack;

public class Demo2 {
    public static void main(String[] args) {
        String str = "Hello";
        Stack<String> stack = new Stack<>();

//        Stack<Character> stack = new Stack<>();

//        for(Character c :str.toCharArray()){
//            stack.push(c);
//        }
       stack.push(str);


//
        StringBuilder reversed = new StringBuilder();
        // StringBuilder to store the reversed string
        while (!stack.isEmpty()) { // Continue while the stack is not empty
            reversed.append(stack.pop()); // Pop the top element from the stack and append it to the StringBuilder
        }

//        System.out.println(reversed);//elloH (Cause it use LIFO)
           System.out.println(reversed); // HELLO CAUSE WE USE STRING NOT STACK
    }
}
