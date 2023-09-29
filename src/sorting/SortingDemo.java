package sorting;

import java.util.Arrays;

public class SortingDemo {
    public static void main(String[] args) {
        int[] items = {8, 1, 5, 3, 7, 2, 9, 0, 4, 6};
        Sort sort = new Sort(items);

//        sort.bubble();
//        sort.selection();
        sort.insertion();
        System.out.println(Arrays.toString(items));
    }
}
