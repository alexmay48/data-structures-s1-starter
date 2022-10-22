package com.learn.bst;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Tests for the BinarySearchTree
 * 
 * @author Alex May
 *
 */
public class BinarySearchTreeTest {

	BinarySearchTree<String> emptyTree;
	BinarySearchTree<String> test;
	BinarySearchTree<String> singleNode;
	BinarySearchTree<String> rightHeavy;
	BinarySearchTree<String> leftHeavy;
	BinarySearchTree<String> otherTest;
	ArrayList<String> emptyArray;
	ArrayList<String> allArray;
	ArrayList<String> nullArray;
	ArrayList<String> noArray;
	String nullString;

	/**
	 * Sets up different BST's to be used for testing as well as an ArrayList. 
	 * The trees should look like:
	 * 
	 * emptyTree:
	 * 
	 * 		(null)
	 * 
	 * singleNode:
	 * 
	 * 		("hello")
	 * 		/       \ 
	 * (null) 	    (null)
	 * 
	 * test:
	 * 
	 * 			     ----("dog")----
	 * 			    / 	            \ 
	 * 	    ("apple")               ("world")
	 * 	    /        \               /       \ 
	 *  ("ape")       ("cat")     ("water")   (null)
	 *   /   \        /     \       /     \
	 * (null)(null) (null) (null) (null) (null)
	 * 
	 * rightHeavy:
	 * 
	 *      ("a")
	 *      /   \
	 * (null)   ("b")
	 *          /   \
	 *     (null)   ("c")
	 *              /   \
	 *         (null)   ("d")
	 *                  /   \
	 *             (null)   (null)
	 *             
	 * leftHeavy:
	 * 
	 *                  ("d")
	 *                  /   \
	 *              ("c")   (null)
	 *              /   \
	 *          ("b")   (null)
	 *          /   \
	 *      ("a")   (null)
	 *      /   \
	 * (null)   (null)
	 * 
	 * otherTest:
	 * 
	 *                -------- ("h") --------
	 *               /                       \
	 *           ("d")                      ("m")
	 *        /       \                  /         \
	 *    ("a")        ("f")          ("k")         ("p")
	 *   /    \        /     \       /     \       /     \
	 * (null)  ("b") (null) (null) ("i")  (null) (null) ("s")
	 *         /   \               /   \                /    \
	 *    (null)   (null)     (null)   (null)        (null)   ("t")
	 *                                                        /   \
	 *                                                   (null)   (null)   
	 * 
	 * @throws Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		emptyTree = new BinarySearchTree<String>();

		singleNode = new BinarySearchTree<String>();
		singleNode.add("hello");

		test = new BinarySearchTree<String>();
		test.add("dog");
		test.add("apple");
		test.add("cat");
		test.add("world");
		test.add("ape");
		test.add("water");

		rightHeavy = new BinarySearchTree<String>();
		rightHeavy.add("a");
		rightHeavy.add("b");
		rightHeavy.add("c");
		rightHeavy.add("d");

		leftHeavy = new BinarySearchTree<String>();
		leftHeavy.add("d");
		leftHeavy.add("c");
		leftHeavy.add("b");
		leftHeavy.add("a");

		emptyArray = new ArrayList<String>();

		allArray = new ArrayList<String>();
		allArray.add("dog");
		allArray.add("apple");
		allArray.add("cat");
		allArray.add("world");

		nullArray = new ArrayList<String>();
		nullArray.add("apple");
		nullArray.add(null);
		nullArray.add("World");

		otherTest = new BinarySearchTree<String>();
		otherTest.add("h");
		otherTest.add("d");
		otherTest.add("a");
		otherTest.add("b");
		otherTest.add("f");
		otherTest.add("m");
		otherTest.add("k");
		otherTest.add("i");
		otherTest.add("p");
		otherTest.add("s");
		otherTest.add("t");

	}

	@Test
	public void testAdd() {
		assertEquals(test.root.data, "dog");
		assertEquals(test.root.right.data, "world");
		assertEquals(test.root.left.data, "apple");
		assertFalse(test.add("dog"));
	}

	@Test
	public void testAddAll() {
		assertTrue(emptyTree.addAll(allArray));
	}

	@Test
	public void testAddNull() {
		Assertions.assertThrows(NullPointerException.class, () -> test.add(null));
	}

	@Test
	public void testContainsLeftHeavy() {
		assertTrue(leftHeavy.contains("d"));
	}

	@Test
	public void testRemoveLeftHeavy() {
		assertTrue(leftHeavy.remove("d"));
		assertFalse(leftHeavy.contains("d"));
	}

	// FIXME: Write your tests here

}
