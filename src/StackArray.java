import java.util.EmptyStackException;

public class StackArray<T>{

    private int Size;
    private int top;
    Object[] ArrayStack;

    public StackArray(int Size) {
        this.Size = Size;
        ArrayStack = new Object[this.Size];
        top = -1;
    }
    public void push(Object data) {
        if(isFull()) return; // can not add to the stack, it's full
        ArrayStack[++top] = data;
    }
    public T pop(){
        if(isEmpty()) throw new EmptyStackException(); // can not pop from the stack, it's full
        T item = (T) ArrayStack[top];
        //ArrayStack[top] = ArrayStack[--top];
        top--;
        return item;
    }
    public boolean isFull(){
        return top == Size-1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
    public void print () {
        System.out.print("[");
        for(int i = 0; i <= top; i++) {
            System.out.print(ArrayStack[i]);
            if (i < top ) {
                System.out.print(", ");
            }

        }
        System.out.print("]" + "\n");

    }

    public static void main(String[] args) {
        StackArray<Integer> stack = new StackArray<Integer>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.print();
    }
}
