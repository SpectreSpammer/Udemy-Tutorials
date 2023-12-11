package org.example.Collections.queues;

import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {

        //if you have an element who keeps the smallest value, use priorityqueue
        Queue<Integer> bankQueueNumber = new java.util.PriorityQueue<>();

        bankQueueNumber.add(34);
        bankQueueNumber.offer(32);
        bankQueueNumber.offer(31);
        bankQueueNumber.offer(33);
        bankQueueNumber.offer(30);

        System.out.println(bankQueueNumber);

        System.out.println("The first customer in the queue " +
                "has the number: " + bankQueueNumber.peek());
        System.out.println("*************");

        System.out.println("Customer with number: " + bankQueueNumber.remove() + " is called");
        System.out.println(bankQueueNumber);
        System.out.println("*************");

        System.out.println("Customer with number: " + bankQueueNumber.poll() + " is called");
        System.out.println(bankQueueNumber);
        System.out.println("*************");

        bankQueueNumber.remove(33);
        System.out.println("Customer with number 33 is removed from the queue");
        System.out.println(bankQueueNumber);
    }
}
