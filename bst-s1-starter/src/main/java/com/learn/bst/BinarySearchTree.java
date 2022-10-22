package com.learn.bst;

/**
 * TODO: Fill in data
 * Your Name: 
 * Your Student ID: 
 * The Date: 
 * Your partner name (when appropriate): 
 * 
 * I pledge that the work done here was my own and that I have learned how to write this program, such that
 * I could throw it out and restart and finish it in a timely manner. I am not turning in any work that I
 * cannot understand, describe, or recreate. 
 * *YOUR NAME*
 * 
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;

/**
 * Creates a Tree for which each element in the tree can only have up to two
 * children and every element that is compared to be less than the root node is
 * placed to the left of the root and every element that is compared to be
 * greater than the root is placed to the right of the root.
 * 
 * @param <Type> - Object type of data the tree contains.
 * 
 * @author TODO: Add Name
 *
 */
public class BinarySearchTree<Type extends Comparable<? super Type>> implements SortedSet<Type> {

	public Node<Type> root;
	private int size;

	/**
	 * Constructs an empty tree.
	 */
	public BinarySearchTree() {
		root = null;
		size = 0;
	}

	@Override
	public boolean add(Type item) throws NullPointerException {
		// FIXME:
		return false;
	}

	/**
	 * This is the recursive method to be called in the add(Type item) method. When
	 * looking at the current Node, you will see if you need to add the item to the
	 * left of the Node or the right of the Node.
	 * 
	 * @param item    - The item to ensure is in the set
	 * @param current - The current node to look
	 * @return - true if this set changed as a result of this method call (that is,
	 *         if the input item was actually inserted); otherwise, returns false
	 */
	private boolean add(Type item, Node<Type> current) {
		// FIXME:
		return false;

	}

	/**
	 * Returns the height of the tree at its "highest" point. This will call the
	 * recursive height(Node<Type> current) method to find the height.
	 * 
	 * @return
	 */
	public int height() {
		// FIXME:
		return 0;
	}

	/**
	 * Determines the height of the tree that this node is contained in. Height is
	 * defined as 1 plus the maximum height of the left vs. the right sub tree
	 * 
	 * @return - the height from this node to its leaves
	 */
	public int height(Node<Type> current) {
		// FIXME:
		return 0;
	}

	@Override
	public boolean addAll(Collection<? extends Type> items) throws NullPointerException {
		// FIXME:
		return false;
	}

	@Override
	public void clear() {
		// FIXME:
	}

	@Override
	public boolean contains(Type item) throws NullPointerException {
		// FIXME:
		return false;
	}

	/**
	 * The recursive method of contains(Type item). Determines if the parameter item
	 * is contained in this node or a node after.
	 * 
	 * @param item    - The item being searched for.
	 * @param current
	 * @return - true if item in tree, false otherwise.
	 */
	public boolean contains(Type item, Node<Type> current) {
		// FIXME:
		return false;
	}

	@Override
	public boolean containsAll(Collection<? extends Type> items) {
		// FIXME:
		return false;
	}

	@Override
	public Type first() throws NoSuchElementException {
		// FIXME:
		return null;
	}

	/**
	 * Traverses this node and all nodes after it to the left to find the farthest
	 * left node from this node. This can be called in the first() method. The
	 * first() element will be the leftmost node's data.
	 * 
	 * @return - The farthest left node in the tree from this node.
	 */
	public Node<Type> getLeftmostNode(Node<Type> temp) {
		// FIXME:
		return null;
	}

	@Override
	public Type last() throws NoSuchElementException {
		// FIXME:
		return null;
	}

	/**
	 * Traverses this node and all nodes after it to the right to find the farthest
	 * right node from this node. This can be called in the last() method. The
	 * last() element will be the leftmost node's data.
	 * 
	 * @return - The farthest right node in the tree from this node.
	 */
	public Node<Type> getRightmostNode(Node<Type> temp) {
		// FIXME:
		return null;
	}

	@Override
	public boolean isEmpty() {
		// FIXME: See SortedSet.java
		return false;
	}

	@Override
	public boolean remove(Type item) throws NullPointerException {
		// FIXME: See SortedSet.java
		return false;
	}

	/**
	 * This is the recursive method for remove(Type item). You can write your own
	 * recursive method that doesn't use the "directionLeft" parameter. It just
	 * gives a guideline.
	 * 
	 * Deletes the node containing the specified data from the tree, and shifts any
	 * nodes into correct positions if necessary.
	 * 
	 * @param item          - The data that is to be removed from the tree.
	 * @param parent        - The parent node of the node to be deleted.
	 * @param directionLeft - Boolean for whether the node to be deleted is on the
	 *                      left of it's parent or the right in the tree (true if on
	 *                      left and false if on right)
	 * @return True if the node was successfully deleted and false if the tree did
	 *         not contain what was to be deleted.
	 */
	private boolean remove(Type item, Node<Type> parent, Node<Type> current, boolean directionLeft) {
		// FIXME:
		return false;
	}

	/**
	 * A helper method to determine if the node has any children nodes. You do not
	 * have to use this method!!! You can simply check if the Node has left or
	 * right.
	 * 
	 * @param node
	 * @return - the number of children this node has.
	 */
	public int numChildren(Node<Type> node) {
		// FIXME:
		return 0;
	}

	@Override
	public boolean removeAll(Collection<? extends Type> items) {
		// FIXME:
		return false;
	}

	@Override
	public int size() {
		// FIXME:
		return 0;
	}

	@Override
	public ArrayList<Type> toArrayList() {
		// FIXME:
		return null;
	}

	/**
	 * The recursive method for toArrayList().
	 * 
	 * @param array   - The ArrayList in sorted order
	 * @param current - The current node of the tree to add to the list
	 */
	private void toArrayList(ArrayList<Type> array, Node<Type> current) {
		// FIXME:
	}

	// *************************************************************************************
	// Functions for writing a DOT file. This is used as a visual representation of
	// the data. This is extra credit, and should be done after the rest of the
	// assignment has been finished.

	/**
	 * Creates a dot file containing the trees data in the format for GraphViz to
	 * read.
	 * 
	 * @param filename - The name for the file that is created.
	 */
	void writeDOT(String filename) {
		// FIXME:
	}

	// Place any helper methods that you use to create the DOT file within this
	// section:

	// End of DOT functions
	// *************************************************************************************

	// *************************************************************************************
	// Beginning of the Node inner class
	/**
	 * This Node contains data and has reference to Nodes to its "left" and "right".
	 * This creates a Node tree.
	 *
	 * Pictorially, a node is: <br>
	 *
	 * left data right <br>
	 * <--+ | 5 | +--->
	 * 
	 */
	public static class Node<Type extends Comparable<? super Type>> {
		public Type data;
		public Node<Type> left;
		public Node<Type> right;

		/**
		 * Construct a new Node containing the data passed in. Will set the left and
		 * right Nodes to null.
		 * 
		 * @param data - The data of the Node
		 */
		Node(Type data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

		// You may write another Node constructor that takes in the data and a reference
		// to the left and right, but that is not necessary.
	}

	// End of the Node inner class
	// *************************************************************************************

}
