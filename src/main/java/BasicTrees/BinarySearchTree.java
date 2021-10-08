//(c) A+ Computer Science
//www.apluscompsci.com
package BasicTrees;
//Name -

import static java.lang.System.*;
import java.util.LinkedList;

public class BinarySearchTree
{
	private TreeNode root;
        private int numNodes;
        private boolean full = true;
        private String outString;

	public BinarySearchTree()
	{
		root = null;
	}

	public void add(Comparable val)
	{
		root = add(val, root);
	}

	private TreeNode add(Comparable val, TreeNode tree)
	{
            
            if(tree == null) {
                return new TreeNode(val,null,null);
            }
           

            int dirTest = val.compareTo(tree.getValue());
		
		
		if(dirTest < 0) {
                    tree.setLeft(add(val, tree.getLeft()));
                }
			
		else if(dirTest > 0) {
                    tree.setRight(add(val, tree.getRight()));
                }
                else {
                    return tree;
                }
                
		
		return tree;
	}

        public void inOrder()
	{
            inOrder(root);
            System.out.println("\n\n");
	}

	private void inOrder(TreeNode tree)
	{
            if (tree != null){
                inOrder(tree.getLeft());
                System.out.print(tree.getValue() + " ");
                inOrder(tree.getRight());
            }
	}

	//add preOrder, postOrder, and revOrder
	
	public void preOrder() {
            preOrder(root);
            System.out.println("\n\n");
        }
	
        private void preOrder(TreeNode tree) {
            if (tree != null) {
                System.out.print(tree.getValue() + " ");
                preOrder(tree.getLeft());
                preOrder(tree.getRight());
            }
        }
        
        public void postOrder() {
            postOrder(root);
            System.out.println("\n\n");
        }
        
        private void postOrder(TreeNode tree) {
            if (tree != null) {
                postOrder(tree.getLeft());
                postOrder(tree.getRight());
                System.out.print(tree.getValue() + " ");
            }
        }
        
        public void reverseOrder() {
            reverseOrder(root);
            System.out.println("\n\n");
        }
        
        private void reverseOrder(TreeNode tree) {
            if (tree != null) {
                reverseOrder(tree.getRight());
                System.out.print(tree.getValue() + " ");
                reverseOrder(tree.getLeft());
            }
        }
	
	
	
	



	public int getNumLevels()
	{
		return getNumLevels(root);
	}

	private int getNumLevels(TreeNode tree)
	{
		if(tree==null)
			return 0;
		else if(getNumLevels(tree.getLeft())>getNumLevels(tree.getRight()))
			return 1+getNumLevels(tree.getLeft());
		else
			return 1+getNumLevels(tree.getRight());
	}



	//add getNumLeaves, getWidth, getHeight, getNumNodes, and isFull

        public int getHeight() {
            return getHeight(root);
        }
        
        private int getHeight(TreeNode tree) {
            if (tree == null) {
                return -1;
            }
            return 1 + Math.max(getHeight(tree.getLeft()),getHeight(tree.getRight()));
        }
        
        public int getNumNodes() {
            numNodes = 0;
            getNumNodes(root);
            return numNodes;
        }
        
        private void getNumNodes (TreeNode tree) {
            if (tree != null) {
                numNodes += 1;
                getNumNodes(tree.getLeft());
                getNumNodes(tree.getRight());
            }
        }
        
        public int getNumLeaves() {
            numNodes = 0;
            getNumLeaves(root);
            return numNodes;
        }
        
        private void getNumLeaves (TreeNode tree) {
            if (tree != null) {
                if (tree.getLeft() == null && tree.getRight() == null) {
                    numNodes += 1;
                }
                getNumLeaves(tree.getLeft());
                getNumLeaves(tree.getRight());
            }
        }

        public int getWidth() {
            int left = getNumLevels(root.getLeft());
            int right = getNumLevels(root.getRight());
            return left + right + 1;
        }

        public Boolean isFull() {
            isFull(root);
            return full;
        }
        
        private void isFull(TreeNode tree) {
            if (tree != null) {
                if (tree.getLeft() == null && tree.getRight() != null) {
                    full = false;
                }
                if (tree.getLeft() != null && tree.getRight() == null) {
                    full = false;
                }
                isFull(tree.getLeft());
                isFull(tree.getRight());
            }
        }







	
	//add extra credit options here - 10 points each
	
	//search
	
	//maxNode
	
	//minNode
	
	//level order
	
	//display like a tree
	
	//remove

        
	public String toString()
	{
            toString(root);
            return "";
	}

	private void toString(TreeNode tree)
	{
            if (tree.getValue() != null){
                inOrder(tree.getLeft());
                System.out.print(tree.getValue() + " ");
                inOrder(tree.getRight());
            }
	}
}