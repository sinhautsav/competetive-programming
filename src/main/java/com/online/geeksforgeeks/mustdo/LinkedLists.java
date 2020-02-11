package com.online.geeksforgeeks.mustdo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any):
 * Difficulty Level:
 * Status:
 * Description:
 * Created On : 11/02/20
 */
public class LinkedLists {

    /**
     * https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1
     */

    public static void intersectionPointOfYShapedLinkedList(Node a, Node b) {
        Queue<Node> queue = new LinkedList<Node>();

        while(a != null){
            queue.add(a);
            a = a.next;
        }

        while(!queue.isEmpty()){
            Node node = queue.poll();
            if(node.data == b.data) {
                System.out.println(b.data);
                return;
            } else b = b.next;
        }
    }


    static class Node {
        int data; Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
}
