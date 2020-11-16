package edu.ithaca.dragon.datastructures.tree;

public class SampleTrees {
    public static BTNode getTree1(){
        BTNode root = new BTNode(4);
       
        root.setLeft(new BTNode(2));
        root.getLeft().setLeft(new BTNode(1));
        root.getLeft().setRight(new BTNode(3));

        root.setRight(new BTNode(6));
        root.getRight().setLeft(new BTNode(5));
        root.getRight().setRight(new BTNode(7));

        return root;
        
    }

    public static BTNode getTree2(){
        BTNode root = new BTNode(1);
       
        root.setLeft(new BTNode(2));
        root.getLeft().setLeft(new BTNode(3));
        root.getLeft().setRight(new BTNode(4));

        root.setRight(new BTNode(5));
        root.getRight().setLeft(new BTNode(6));
        root.getRight().setRight(new BTNode(7));
        return root;
        
    }

    public static BTNode getTree3(){
        BTNode root = new BTNode(7);
       
        root.setLeft(new BTNode(3));
        root.getLeft().setLeft(new BTNode(1));
        root.getLeft().setRight(new BTNode(2));

        root.setRight(new BTNode(6));
        root.getRight().setLeft(new BTNode(4));
        root.getRight().setRight(new BTNode(5));
        return root;
    }

    public static BTNode getTree4(){
        BTNode root = new BTNode(100);
       
        root.setLeft(new BTNode(22));
        root.getLeft().setLeft(new BTNode(5));
        root.getLeft().getLeft().setLeft(new BTNode(1));
        root.getLeft().getLeft().setRight(new BTNode(17));

        root.setRight(new BTNode(132));
        root.getRight().setLeft(new BTNode(105));
        root.getRight().getLeft().setRight(new BTNode(122));
        root.getRight().getLeft().getRight().setLeft(new BTNode(112));
        return root;
    }
}
