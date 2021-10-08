//(c) A+ Computer Science
//www.apluscompsci.com
package BasicTrees;
//Name -

import static java.lang.System.*;


public class BSTreeRunner
{
   public static void main( String args[] )
   {
 		//add test cases here
        BinarySearchTree btree = new BinarySearchTree();
        btree.add(90);
        btree.add(80);
        btree.add(70);
        btree.add(85);
        btree.add(100);
        btree.add(98);
        btree.add(120);
        
        System.out.println("IN ORDER");
        btree.inOrder();
        System.out.println("PRE ORDER");
        btree.preOrder();
        System.out.println("POST ORDER");
        btree.postOrder();
        System.out.println("REVERSE ORDER");
        btree.reverseOrder();
        
        
        System.out.println("Tree height is " + btree.getHeight());
        System.out.println("Tree width is " + btree.getWidth());
        System.out.println("Number of leaves is " + btree.getNumLeaves());
        System.out.println("Number of nodes is " + btree.getNumNodes());
        System.out.println("Number of levels is " + btree.getNumLevels());
        System.out.print("Tree as a string   ");
        System.out.println(btree);

        if (btree.isFull()) {
            System.out.println("The tree is full.");
        }
        else if (btree.isFull() == false) {
            System.out.println("The tree is empty.");
        }
 
   }
}