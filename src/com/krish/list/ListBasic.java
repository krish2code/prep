package com.krish.list;

public class ListBasic {

    public static void main(String[] args) {
        Node node1 = new Node(1, null);
        Node node2 = new Node(3, null);
        Node node3 = new Node(5, null);

        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        printList(node1);

        Node node4 = new Node(2, null);
        Node node5 = new Node(4, null);
        Node node6 = new Node(6, null);

        node4.next = node5;
        node5.next = node6;
        node6.next = null;

        Node mergeListNode = MergeLists(node1, node4);

        System.out.println();
        System.out.println("mergeListNode : ");
        printList(mergeListNode);

        Node removed = removeSecond(node1);
        printList(removed);
        printList(node1);

        printListBackward(node1);
        
        
        Node node7 = new Node(7, null);
        Node node8 = new Node(8, null);
        Node node9 = new Node(9, null);

        node7.next = node8;
        node8.next = node9;
        node9.next = node7;
        
        System.out.println(hasLoop(node7));
        

    }

    private static boolean hasLoop(Node first) {
        if(first == null) 
            return false;
        
        Node slow, fast;
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

    private static Node MergeLists(Node list1, Node list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.cargo < list2.cargo) {
            list1.next = MergeLists(list1.next, list2);
            return list1;
        } else {
            list2.next = MergeLists(list2.next, list1);
            return list2;
        }
    }

    // called traversal
    private static void printList(Node list) {
        Node node = list;
        while (node != null) {
            System.out.print(node);
            node = node.next;
        }
        System.out.println(" ");
    }

    private static void printListBackward(Node lst) {
        if (lst == null)
            return;

        Node head = lst;
        Node tail = lst.next;

        printListBackward(tail);
        System.out.print(head);
    }

    private static Node removeSecond(Node lst) {
        Node first = lst;
        Node second = first.next;

        first.next = second.next;
        second.next = null;
        return second;

    }
}

class Node {
    int cargo;
    Node next;

    public Node() {
        cargo = 0;
        next = null;
    }

    public Node(int cargo, Node next) {
        this.cargo = cargo;
        this.next = next;
    }

    public String toString() {
        return cargo + " ";
    }
}