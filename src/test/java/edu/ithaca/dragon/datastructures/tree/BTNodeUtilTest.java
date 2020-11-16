package edu.ithaca.dragon.datastructures.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BTNodeUtilTest {

    @Test
    public void showTree(){
        TreeVisualization.visualizeBinaryTree(SampleTrees.getTree4(), "tdragon","29315085544");
    }

    @Test
    public void inOrderStringTest(){
        assertEquals("1, 2, 3, 4, 5, 6, 7, ", BTNodeUtil.inOrderString(SampleTrees.getTree1()));
        assertEquals("1, 5, 17, 22, 100, 105, 112, 122, 132, ", BTNodeUtil.inOrderString(SampleTrees.getTree4()));
    }

    @Test
    public void preOrderStringTest(){
        assertEquals("1, 2, 3, 4, 5, 6, 7, ", BTNodeUtil.preOrderString(SampleTrees.getTree2()));
        assertEquals("100, 22, 5, 1, 17, 132, 105, 122, 112, ", BTNodeUtil.preOrderString(SampleTrees.getTree4()));
    }

    @Test
    public void postOrderStringTest(){
        assertEquals("1, 2, 3, 4, 5, 6, 7, ", BTNodeUtil.postOrderString(SampleTrees.getTree3()));
        assertEquals("1, 17, 5, 22, 112, 122, 105, 132, 100, ", BTNodeUtil.postOrderString(SampleTrees.getTree4()));

    }

    @Test
    public void heightTest(){
        assertEquals(2, BTNodeUtil.height(SampleTrees.getTree1()));
        assertEquals(2, BTNodeUtil.height(SampleTrees.getTree2()));
        assertEquals(4, BTNodeUtil.height(SampleTrees.getTree4()));
        assertEquals(1, BTNodeUtil.height(SampleTrees.getTree1().getRight()));
        assertEquals(2, BTNodeUtil.height(SampleTrees.getTree4().getLeft()));
        assertEquals(3, BTNodeUtil.height(SampleTrees.getTree4().getRight()));

        assertEquals(-1, BTNodeUtil.height(null));
        assertEquals(0, BTNodeUtil.height(new BTNode(5)));
    }

    @Test
    public void treeGrowingVisualization(){
        BTNode tree = SampleTrees.getTree4();
        for (int key=10; key<100; key++){
            BTNodeUtil.add(tree, key);
        }
        TreeVisualization.visualizeBinaryTree(tree, "tdragon","29315085544");
    }
    
}
