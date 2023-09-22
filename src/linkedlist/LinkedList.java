package linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {
    private static class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size = 0;

    private boolean isEmpty() {
        return first == null;
    }

    private Node getPrevious(Node node) {
        Node current = first;
        while (current != null) {
            if (current.next == node) break;
            current = current.next;
        }
        return current;
    }

    public void addLast(int item) {
        Node node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item) {
        Node node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        } else {
            Node second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            return;
        } else {
            Node previous = getPrevious(last);
            last = previous;
            previous.next = null;
        }
        size--;
    }

    public int getSize() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];

        int index = 0;
        Node current = first;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse() {
        if (isEmpty()) return;

        Node previous = first;
        Node current = first.next;
        while (current != null) {
            Node next = current.next;
            current.next = previous;

            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthFromEnd(int k) {
        if (isEmpty()) throw new IllegalStateException();

        Node a = first;
        Node b = first;

        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null) {
                throw new IllegalArgumentException();
            }
        }

        while (b != last) {
            a = a.next;
            b = b.next;
        }

        return a.value;
    }

    // median of ll
    public int getMedian() {
        if (isEmpty()) throw new IllegalStateException();

        Node a = first;
        Node b = first;

        while (b != last && b.next != last) {
            a = a.next;
            b = b.next.next;
        }

        if (b == last) {
            return a.value;
        } else {
            return (a.value + a.next.value) / 2;
        }
    }

    public boolean hasLoop() {
        Node slow = first;
        Node faster = first;

        while (faster != null && faster.next != null) {
            slow = slow.next;
            faster = faster.next.next;

            if (slow == faster) return true;
        }
        return false;
    }

    public void print() {
        Node current = first;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
