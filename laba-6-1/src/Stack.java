public class Stack<T> {
    private T[] data;
    private int size;
    public Stack(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }
    public void push(T element) {
        if (size < data.length) {
            data[size] = element;
            size++;
        } else {
            System.out.println("Stack overflow");
        }
    }
    public T pop() {
        if (size > 0) {
            T element = data[size - 1]= null;
            size--;
            return element;
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }
    public T peek() {
        if (size > 0) {
            return data[size - 1];
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }
}