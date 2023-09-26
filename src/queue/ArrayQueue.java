package queue;

import java.util.Arrays;

public class ArrayQueue {
    private final int[] items;
    int rear;
    int front;
    int count;

    ArrayQueue(int size) {
        items = new int[size];
    }

    public void enqueue(int item) {
        if (items.length == count) {
            throw new IllegalStateException();
        }
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue() {
        int itemAtFront = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return itemAtFront;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
