package stack;

import java.util.Arrays;

public class Stack {
    private final int[] items;
    private int count;

    Stack(int size) {
        items = new int[size];
    }

    public void push(int item) {
        if (count == items.length) {
            throw new StackOverflowError();
        }
        items[count++] = item;
    }

    //pop
    public int pop() {
        if (count == 0) {
            throw new IllegalStateException();
        }
        return items[--count];
    }

    //peek
    public int peek() {
        if (count == 0) {
            throw new IllegalStateException();
        }
        return items[count - 1];
    }

    //isEmpty
    public boolean isEmpty() {
        return count == 0;
    }


    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
