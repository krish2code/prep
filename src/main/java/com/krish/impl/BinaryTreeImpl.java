package com.krish.impl;

import java.util.LinkedList;
import java.util.Queue;


public class BinaryTreeImpl {

    public static void main(String[] args) {
        BST bst = new BST();
        bst.add(8);
        bst.add(4);
        bst.add(9);
        bst.add(5);
        bst.add(11);
        bst.add(3);
        
        bst.levelOrder();
    }
}

class BST {
    BNode root;
    
    
    public void levelOrder() {
        levelOrder(root);
    }
    
    private void levelOrder(BNode node) {

        if(node != null) {
            Queue<BNode> queue = new LinkedList<BNode>();
            queue.add(node);
            
            while(!queue.isEmpty()) {
                BNode temp = queue.poll();
                System.out.print(temp.data + " ");
                
                if(temp.left != null) {
                    queue.add(temp.left);
                }
                
                if(temp.right != null) {
                    queue.add(temp.right);
                }
            }
            
        }
    }

    public BNode findLCA(int n1, int n2) {
        return findLCA(root, n1, n2);
    }

    private BNode findLCA(BNode node, int n1, int n2) {
        if (node == null)
            return null;

        if (node.data == n1 || node.data == n2)
            return node;

        BNode left_lca_node = findLCA(node.left, n1, n2);
        BNode right_lca_node = findLCA(node.right, n1, n2);

        if(left_lca_node!= null && right_lca_node != null)
            return node;
        
        return (left_lca_node !=null) ? left_lca_node : right_lca_node;
    }

    public boolean lookup(int data) {
        return lookup(root, data);
    }

    private boolean lookup(BNode node, int data) {
        if (node == null) {
            return false;
        } else {
            if (node.data == data) {
                return true;
            } else {
                if (data < node.data) {
                    return lookup(node.left, data);
                } else {
                    return lookup(node.right, data);
                }
            }
        }
    }

    public void add(int data) {
        root = add(root, data);
    }

    private BNode add(BNode node, int data) {
        if (node == null) {
            node = new BNode(data);
        } else {
            if (data < node.data) {
                node.left = add(node.left, data);
            } else {
                node.right = add(node.right, data);
            }
        }
        return node;
    }
}

class BNode {
    BNode left;
    BNode right;
    int data;

    public BNode(int data) {
        this.data = data;
    }
}