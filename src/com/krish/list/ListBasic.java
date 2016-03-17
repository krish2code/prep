package com.krish.list;

public class ListBasic {

    public static void main(String[] args) {
        Node1 node1 = new Node1(1, null);
        Node1 node2 = new Node1(3, null);
        Node1 node3 = new Node1(5, null);

        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        printList(node1);

        Node1 node4 = new Node1(2, null);
        Node1 node5 = new Node1(4, null);
        Node1 node6 = new Node1(6, null);

        node4.next = node5;
        node5.next = node6;
        node6.next = null;

        Node1 mergeListNode = MergeLists(node1, node4);

        System.out.println();
        System.out.println("mergeListNode : ");
        printList(mergeListNode);

        Node1 removed = removeSecond(node1);
        printList(removed);
        printList(node1);

        printListBackward(node1);
        
        
        Node1 node7 = new Node1(7, null);
        Node1 node8 = new Node1(8, null);
        Node1 node9 = new Node1(9, null);

        node7.next = node8;
        node8.next = node9;
        node9.next = node7;
        
        System.out.println(hasLoop(node7));
        

    }

    private static boolean hasLoop(Node1 first) {
        if(first == null) 
            return false;
        
        Node1 slow, fast;
        slow = fast = first;
        
        while(true) {
            slow = slow.next;
            
            if(fast.next != null)
                fast = fast.next.next;
            else
                return false;
            
            if(slow == null || fast == null)
                return false;
            
            if(slow == fast)
                return true;
        }
    }

    private static Node1 MergeLists(Node1 node1, Node1 node2) {
        if (node1 == null)
            return node2;
        if (node2 == null)
            return node1;

        if (node1.cargo < node2.cargo) {
            node1.next = MergeLists(node1.next, node2);
            return node1;
        } else {
            node2.next = MergeLists(node2.next, node1);
            return node2;
        }
    }

    // called traversal
    private static void printList(Node1 list) {
        Node1 node = list;
        while (node != null) {
            System.out.print(node);
            node = node.next;
        }
        System.out.println(" ");
    }

    private static void printListBackward(Node1 lst) {
        if (lst == null)
            return;

        Node1 head = lst;
        Node1 tail = lst.next;

        printListBackward(tail);
        System.out.print(head);
    }

    private static Node1 removeSecond(Node1 lst) {
        Node1 first = lst;
        Node1 second = first.next;

        first.next = second.next;
        second.next = null;
        return second;

    }
}

class Node1 {
    int cargo;
    Node1 next;

    public Node1() {
        cargo = 0;
        next = null;
    }

    public Node1(int cargo, Node1 next) {
        this.cargo = cargo;
        this.next = next;
    }

    public String toString() {
        return cargo + " ";
    }
}