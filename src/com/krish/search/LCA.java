package com.krish.search;

public class LCA {
    Node root;
    
    
    //Max Sum and path
    //ser and deser 
    //trie

    
    public static void main(String[] args) {
        LCA bt = new LCA();
        bt.root = new Node(1);
        bt.root.leftNode = new Node(2);
        bt.root.rightNode = new Node(3);
        bt.root.leftNode.leftNode = new Node(4);
//        bt.root.leftNode.rightNode = new Node(5);
//        bt.root.rightNode.leftNode = new Node(6);
//        bt.root.rightNode.rightNode = new Node(7);
        
        System.out.println("LCA(4, 5) = " +
                bt.findLCA(2, 4).data);
    }

    private Node findLCA(int n1, int n2) {
        return findLCA(root, n1, n2); 
    }

    private Node findLCA(Node node, int n1, int n2) {
        if(node == null)
            return null;
        
        if(node.data == n1 || node.data == n2)
            return node;
        
        
        Node left_lca_node = findLCA(node.leftNode, n1, n2);
        Node right_lca_node = findLCA(node.rightNode, n1, n2);
        
        
        if(left_lca_node!= null && right_lca_node != null)
            return node;
        
        return (left_lca_node !=null) ? left_lca_node : right_lca_node;
        
    }
    
    
}
