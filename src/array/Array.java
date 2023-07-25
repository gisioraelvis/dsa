package array;

import java.util.Arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }

    public void insert(int item){
        if (items.length == count){
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    // insert at index and shift the rest of the items
    public void insertAt(int index, int item){
        if(index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + count);
        }

        if (items.length == count){
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }

        for (int i = count; i > index; i--) {
            items[i] = items[i-1];
        }
        items[index] = item;
        count++;
    }

    public void removeAt(int index){
        if(index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + count);
        }

        for (int i = index; i < count; i++) {
            items[i] = items[i+1];
        }
        count--;
    }

    public int indexOf(int item){
        for (int i = 0; i < count; i++) {
            if (items[i] == item){
                return i;
            }
        }
        return -1;
    }

    public int max(){
        int max = items[0];
        for (int i = 0; i < count; i++) {
            if(items[i]>max){
                max=items[i];
            }
        }
        return max;
    }

    public int[] reverse(){
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
           reversed[i] = items[count - 1 - i];
        }
        return reversed;
    }

    // Return the common items in this array and another array
    // e.g. current = [1, 2, 3, 4], other = [1, 2, 5, 6] => intersect = [1, 2]
    public int[] intersect(int[] other){
        int intersectCount = 0;
        int[] intersect = new int[other.length];

        for (int i = 0; i < other.length; i++) {
            for (int j = 0; j < count; j++) {
                if (other[i] == items[j]){
                    intersect[intersectCount++] = other[i];
                }
            }
        }
        return Arrays.copyOfRange(intersect, 0, intersectCount);
    }

    @Override
    public String toString(){
        int[] content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }
}
