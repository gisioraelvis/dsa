package searching;

public class SearchDemo {
    public static void main(String[] args) {
        int[] arr = {8, 1, 5, 3, 7, 2, 9, 0, 4, 6};
        Search search = new Search(arr);

        System.out.println(search.linear(3));

        System.out.println(search.binaryIterative(7));
        System.out.println(search.binaryRecursive(7));

        System.out.println(search.ternaryRecursive(7));
    }
}
