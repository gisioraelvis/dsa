package queue;

import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
//        Queue<Integer> queue = new ArrayDeque<>(List.of(4, 3, 2, 1));
//        System.out.println(queue);
//
//        reverse(queue);
//        System.out.println(queue);

//        ArrayQueue arrayQueue = new ArrayQueue(3);
//        arrayQueue.enqueue(1);
//        arrayQueue.enqueue(2);
//        arrayQueue.enqueue(3);
//        System.out.println(arrayQueue);
//
//        int dq1 = arrayQueue.dequeue();
//        System.out.println(dq1);
//        int dq2 = arrayQueue.dequeue();
//        System.out.println(dq2);
//        System.out.println(arrayQueue);
//
//        arrayQueue.enqueue(1);
//        arrayQueue.enqueue(2);
//        System.out.println(arrayQueue);

//        QueueWithTwoStacks qwts = new QueueWithTwoStacks();
//        qwts.enqueue(3);
//        qwts.enqueue(4);
//        qwts.enqueue(5);
//
//        System.out.println(qwts);
//
//        int dq1 = qwts.dequeue();
//        System.out.println(dq1);
//        int dq2 = qwts.dequeue();
//        System.out.println(dq2);
//        System.out.println(qwts);

//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        priorityQueue.addAll(List.of(5, 3, 4, 2, 1));
//        priorityQueue.add(2);
//        priorityQueue.add(5);
//        priorityQueue.add(1);
//        priorityQueue.add(4);
//        priorityQueue.add(3);
//        System.out.println(priorityQueue);

        PriorityQueue priorityQueue = new PriorityQueue(5);
        priorityQueue.add(4);
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(7);
        priorityQueue.add(9);
        priorityQueue.add(6);
        priorityQueue.add(8);
        priorityQueue.add(11);
        priorityQueue.add(10);

        System.out.println(priorityQueue);
    }

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
