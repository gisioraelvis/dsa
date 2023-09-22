package linkedlist;

import java.util.Arrays;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.print();
        System.out.println(" Linked list size: " + ll.getSize());

        System.out.println("\n Kth node value from ll end is: " + ll.getKthFromEnd(6));

        int n = 4;
        System.out.println("\n Index of: " + n + " in the linked list is " + ll.indexOf(n));

        System.out.println("\n Does linked list contain " + n + "? " + ll.contains(n));

        ll.removeFirst();
        System.out.println("\n After removing first item");
        ll.print();

        ll.removeLast();
        System.out.println("\n After removing last item");
        ll.print();
        System.out.println(" Linked list size: " + ll.getSize());

        int[] llToArray = ll.toArray();
        System.out.println("\n Linked list to array" + Arrays.toString(llToArray));

        ll.reverse();
        System.out.println("\n Reversed linked list");
        ll.print();

        System.out.println("\n The ll median is: " + ll.getMedian());

        System.out.println("\n Does the ll have a loop? " + ll.hasLoop());
    }
}
