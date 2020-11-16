package edu.ithaca.dragon.datastructures.tree;

import bridges.base.BinTreeElement;
import bridges.connect.Bridges;

public class TreeVisualization {

    public static void visualizeBinaryTree(BTNode root, String bridgesUserName, String bridgesApiKey){
        try {
            Bridges bridges = new Bridges(4, bridgesUserName, bridgesApiKey);
            bridges.setTitle("Binary Tree");
            bridges.setDescription("Visual display of a binary tree");
            bridges.setDataStructure(getVisualTreeRoot(root));
            bridges.visualize();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private static BinTreeElement<Integer> getVisualTreeRoot(BTNode root){
        if (root == null){
            return null;
        }
        else {
            BinTreeElement<Integer> newRoot = new BinTreeElement<>(""+root.getKey(), root.getKey());
            newRoot.setLeft(getVisualTreeRoot(root.getLeft()));
            newRoot.setRight(getVisualTreeRoot(root.getRight()));
            return newRoot;
        }
    }
    
}
