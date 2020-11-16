package edu.ithaca.dragon.datastructures.tree;

public class BTNodeUtil {

    public static int height(BTNode root){
        if (root == null){
            return -1;
        }
        else {
            int leftHeight = height(root.getLeft());
            int rightHeight = height(root.getRight());
            if (leftHeight > rightHeight){
                return leftHeight + 1;
            }
            else {
                return rightHeight + 1;
            }
        }
    }

    public static void add(BTNode root, int newKey){
        if (root == null){
            throw new IllegalArgumentException("Can't add to a non-existant root");
        }
        else {
            if (root.getLeft() == null){
                root.setLeft(new BTNode(newKey));
            }
            else if (root.getRight() == null){
                root.setRight(new BTNode(newKey));
            }
            else {
                if (height(root.getLeft())> height(root.getRight())){
                    add(root.getRight(), newKey);
                }
                else {
                    add(root.getLeft(), newKey);
                }
            }
        }
    }

    
}
