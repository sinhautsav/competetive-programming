package com.ds.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any):
 * Difficulty Level:
 * Status:
 * Description:
 * Created On : 21/10/19
 */
public class PriorityQueueDemo {

    public static void main(String[] args) {
        System.exit(1);
        Queue<String> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.add("Utsav");
        queue.add("Apoorv");
        queue.add("Amit");
        queue.add("Aarzu");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
