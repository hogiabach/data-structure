public class Stack {
    public static void main(String args[]) {
        StackClass<String> stack = new StackClass<String>(5);
    }
}

class StackClass<T> {
    private int top;
    private T[] array;

    public StackClass(int capacity) {
        top = -1;
        array = (T[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == array.length - 1;
    }

    public int size() {
        return top + 1;
    }

    public void push(T item) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        top++;
        array[top] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        T item = array[top];
        array[top--] = null;
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return array[top];
    }
}
