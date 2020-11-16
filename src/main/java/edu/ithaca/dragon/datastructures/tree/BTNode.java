package edu.ithaca.dragon.datastructures.tree;

public class BTNode {

    private int key;
    private BTNode left;
    private BTNode right;

    public BTNode(int key){
        this.key = key;
        this.left = null;
        this.right = null;
    }

    public int getKey(){
        return key;
    }

    public void setKey(int key) {
		this.key = key;
	}

	public BTNode getLeft() {
		return left;
	}

	public BTNode getRight() {
		return right;
    }

	public void setLeft(BTNode left) {
		this.left = left;
	}

	public void setRight(BTNode right) {
		this.right = right;
	}
    
    
}
