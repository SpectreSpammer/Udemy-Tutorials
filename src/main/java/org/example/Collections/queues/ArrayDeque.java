package org.example.Collections.queues;

import java.util.Deque;
import java.util.LinkedList;

public class ArrayDeque {
    public static void main(String[] args) {

        //use this when you dont store a null values otherwise,
        //use linkedlist
        Deque<String> editHistory = new java.util.ArrayDeque<>();
        System.out.println("Taking action: null");
        editHistory.push(null);

        System.out.println("Taking action: making the text bold");
        editHistory.push("making the text bold");

        System.out.println("Taking action: adding some text ");
        editHistory.push("adding some text");

        System.out.println("Taking action: adding a new paragraph");
        editHistory.push("adding a new paragraph");

        System.out.println();

        System.out.println("The last action is our edit history: " + editHistory.pop());
        System.out.println("Undoing the last action: " + editHistory.pop());


        System.out.println("Taking action: making the text italic");
        editHistory.push("making the text italic");
        System.out.println("Edit History: " + editHistory);
    }
}
