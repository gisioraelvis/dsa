package queue;

import java.util.Arrays;

public class PriorityQueue {
    private int[] items;
    private int count;

    PriorityQueue(int size) {
        items = new int[size];
    }

    public void add(int item) {
        //if full double items arr capacity
        if (count == items.length) {
            int[] newItems = new int[items.length * 2];
            for (int i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }

        //shift item to the right
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > item) {
                items[i + 1] = items[i];
            } else break;
        }
        items[i + 1] = item;
        count++;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
