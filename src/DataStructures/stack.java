package DataStructures;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(6);
        stack.push(4);
        stack.push(9);
        System.out.println("stack = " + stack);
        //stack.pop();
        System.out.println("stack size = " + stack.size());
        int a = 0;

        for(int i=0; i < stack.size(); i++) {
            a += stack.get(i);
        }

        System.out.println("the sum of all elements in the stack = " + a);
    }

}
