package com.krish.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Binary Tree property: 1. Exactly one node with no parent - root node 2. Every other node in tree should have
 * exactly one parent 3. No loop in binary tree
 * 
 * Other: 1. Node with out any child called leaf 2. Subtree : Any subtree within tree with left and right or any
 * child.
 */

public class BST {

    Node root;
    static List<Integer> lst = new ArrayList<Integer>();

    public static void main(String[] args) {
        BST bst = new BST();

        bst.insert(5);
        bst.insert(4);
        bst.insert(6);
        bst.insert(3);
        bst.insert(7);

        System.out.println("sumNode " + bst.sumNode(bst.root));
        
        bst.inOrder(bst.root);
        bst.levelOrder(bst.root);
        System.out.println(lst);

        System.out.println(bst.lookup(bst.root, 10));
        System.out.println(bst.countNode(bst.root));
        
        System.out.println(bst.depth(bst.root));
        
        bst.mirror(bst.root);
    }

    int sum =0;
    
    private int sumNode(Node node) {
        int rootSum = node.data;
        sumNode1(node.leftNode);
        sumNode1(node.rightNode);
        return sum;
    }


    private int sumNode1(Node node) {
        if (node != null) {
            sum = sum + node.data;
            sumNode1(node.leftNode);
            sumNode1(node.rightNode);
             return sum;
        } else {
            return 0;
        }
    }
    
    /*
     * Find minimum value in BT
     */
    private int minValue() {
        return minValue(root);
    }

    private int minValue(Node node) {
        Node currentNode = node;
        while (currentNode.leftNode != null) {
            currentNode = currentNode.leftNode;
        }
        return currentNode.data;
    }
    
    private static boolean isMirror(Node root1, Node root2) {
        if (root1 == null || root2 == null) {
            return (root1 == null && root2 == null);
        } else {
            return (root1.data == root2.data && isMirror(root1.leftNode, root2.rightNode) && isMirror(root1.rightNode, root2.leftNode));
        }
    }
    
    private void mirror(Node node) {
        if(node != null) {
            mirror(node.leftNode);
            mirror(node.rightNode);
            
            Node temp = node.leftNode;
            node.leftNode= node.rightNode;
            node.rightNode = temp;
        }
    }

    private int depth(Node node) {
        if (node != null) {
            int left = depth(node.leftNode);
            int right = depth(node.rightNode);
            return Math.max(left, right) + 1;
        }
        return 0;
    }

    private int countNode(Node node) {
        if (node != null) {
            return countNode(node.leftNode) + countNode(node.rightNode) + 1;
        } else {
            return 0;
        }
    }

    private void levelOrder(Node node) {
        System.out.println("Level Order ");
        if(node != null) {
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(node);
            
            while(!queue.isEmpty()) {
                Node temp = queue.poll();
                System.out.print(temp.data + " ");
                
                if(temp.leftNode != null) {
                    queue.add(temp.leftNode);
                }
                
                if(temp.rightNode != null) {
                    queue.add(temp.rightNode);
                }
            }
        }
        System.out.println("");  
    }
    
    /*
     * Print BT in preOrderTraversal
     */
    private static void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.leftNode);
            preOrderTraversal(node.rightNode);
        }
    }

    /*
     * Print BT in postOrderTraversal
     */
    private static void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.leftNode);
            postOrderTraversal(node.rightNode);
            System.out.print(node.data + " ");
        }
    }

    /*
     * Print BT in inOrderTraversal
     */
    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.leftNode);
            lst.add(node.data);
            inOrder(node.rightNode);
        }
    }

    private boolean lookup(Node node, int i) {
        if (node == null)
            return false;
        else {
            if (i == node.data) {
                return true;
            } else {
                if (i < node.data)
                    return lookup(node.leftNode, i);
                else
                    return lookup(node.rightNode, i);
            }
        }
    }
    
    private void insert(int i) {
        root = insert(root, i);
    }

    private Node insert(Node node, int i) {
        if (node == null) {
            node = new Node(i);
        } else {
            if (i < node.data) {
                node.leftNode = insert(node.leftNode, i);
            } else {
                node.rightNode = insert(node.rightNode, i);
            }
        }
        return node;
    }

}

class Node {

    Node leftNode;
    Node rightNode;
    int data;

    public Node(int data) {
        this.data = data;
    }

}