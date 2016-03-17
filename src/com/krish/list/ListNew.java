package com.krish.list;

public class ListNew {
    public static void main(String[] args) throws Exception {
        List list1 = new List();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        
        System.out.println(list1.size());
        System.out.println(list1.get(3));
        
//        list1.remove(7);
//        list1.print();
//        List list2 = new List();
//        list2.add(2);
//        list2.add(4);
//        list2.add(6);
//        List list3 = new List();
//        System.out.println(list3.isEmpty());
//        System.out.println(list1.hasLoop());

    }
}

class List {

    Node node;
    int size = -1;

    public boolean isEmpty() {
        return (size == -1);

    }

    
    public int size() {
        return size+1;
    }


    public Object get(int index) {
        return get(node, index);
    }


    private Object get(Node node, int index) {
        Node targetNode = null;

        if(index > size) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            if(node != null) {
                targetNode = node;
                for(int i = 0; i<index; i++) {
                    if(targetNode.next == null)
                        return null;
                    
                    targetNode = targetNode.next;
                }
                return targetNode.cargo;
            }
            return targetNode;
        }
    }


    public void remove(int index) {
        remove(node, index);
    }


    private void remove(Node node, int index) {
        if(index > size) {
            throw new IndexOutOfBoundsException();
        } else {
            
        }
    }

    private static Node mergeLists(Node node1, Node node2) {
        if(node1 == null)
            return node2;
        if(node2 == null)
            return node1;
        
        if(node1.cargo < node2.cargo) {
            node1.next = mergeLists(node1.next, node2);
            return node1;
        } else {
            node2.next = mergeLists(node2.next, node1);
            return node2;
        }
    }
    
    
    public boolean hasLoop() {
        return hasLoop(node);
    }

    private boolean hasLoop(Node first) {
        if (first == null)
            return false;

        Node fast, slow;
        fast = slow = first;

        while (true) {
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

    public void print() {
        print(node);
    }

    public void print(Node node) {
        if (node == null)
            return;
        else {
            System.out.println(node.cargo);
            print(node.next);
        }
    }

    public void add(int i) {
        node = add(node, i);
        size++;
    }

    public Node add(Node node, int i) {
        if (node == null) {
            node = new Node(i, null);
        } else {
            node.next = add(node.next, i);
        }
        return node;
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