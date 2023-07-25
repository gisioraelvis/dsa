package array;

import java.util.Arrays;

public class Demo{
    public static void main(String[] args) {
        Array arr = new Array(4);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);

        arr.insertAt(4, 5);
        System.out.println(arr.indexOf(5));
        arr.removeAt(4);
        System.out.println(arr.max());
        System.out.println(arr);
        System.out.println(Arrays.toString(arr.reverse()));
        int[] otherArr = {2, 3, 4, 7};
        System.out.println(Arrays.toString(arr.intersect(otherArr)));
    }
}