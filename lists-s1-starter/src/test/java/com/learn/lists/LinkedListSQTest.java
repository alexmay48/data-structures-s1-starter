package com.learn.lists;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListSQTest {

	public ListSQ<Integer> newList() {
		return new LinkedListSQ<Integer>();
	}

	@Test
	public void testAddFirstGetFirst() {
		ListSQ<Integer> testList = newList();
		// [1]
		testList.addFirst(1);
		assertEquals(1, (int) testList.getFirst());
		// [2, 1]
		testList.addFirst(2);
		assertEquals(2, (int) testList.getFirst());
		// [3, 2, 1]
		testList.addFirst(3);
		assertEquals(3, (int) testList.getFirst());
		// [4, 3, 2, 1]
		testList.addFirst(4);
		assertEquals(4, (int) testList.getFirst());
		// [5, 4, 3, 2, 1]
		testList.addFirst(5);
		assertEquals(5, (int) testList.getFirst());
	}

	@Test
	public void testAddFirstGetLast() {
		ListSQ<Integer> testList = newList();
		// [1]
		testList.addFirst(1);
		assertEquals(1, (int) testList.getLast());
		// [2, 1]
		testList.addFirst(2);
		assertEquals(1, (int) testList.getLast());
		// [3, 2, 1]
		testList.addFirst(3);
		assertEquals(1, (int) testList.getLast());
		// [4, 3, 2, 1]
		testList.addFirst(4);
		assertEquals(1, (int) testList.getLast());
		// [5, 4, 3, 2, 1]
		testList.addFirst(5);
		assertEquals(1, (int) testList.getLast());
	}

	@Test
	public void testAddFirstGet() {
		ListSQ<Integer> testList = newList();
		// [0]
		testList.addFirst(0);
		assertEquals(0, (int) testList.get(0));
		// [1, 0]
		testList.addFirst(1);
		assertEquals(1, (int) testList.get(0));
		assertEquals(0, (int) testList.get(1));
		// [2, 1, 0]
		testList.addFirst(2);
		assertEquals(2, (int) testList.get(0));
		assertEquals(1, (int) testList.get(1));
		assertEquals(0, (int) testList.get(2));
		// [3, 2, 1, 0]
		testList.addFirst(3);
		assertEquals(3, (int) testList.get(0));
		assertEquals(2, (int) testList.get(1));
		assertEquals(1, (int) testList.get(2));
		assertEquals(0, (int) testList.get(3));
		// [4, 3, 2, 1, 0]
		testList.addFirst(4);
		assertEquals(4, (int) testList.get(0));
		assertEquals(3, (int) testList.get(1));
		assertEquals(2, (int) testList.get(2));
		assertEquals(1, (int) testList.get(3));
		assertEquals(0, (int) testList.get(4));
	}

	@Test
	public void testAddFirstContains() {
		ListSQ<Integer> testList = newList();
		testList.addFirst(0);
		testList.addFirst(1);
		testList.addFirst(2);
		testList.addFirst(3);
		testList.addFirst(4);
		// [4, 3, 2, 1, 0]
		assertTrue(testList.contains(0));
		assertTrue(testList.contains(1));
		assertTrue(testList.contains(2));
		assertTrue(testList.contains(3));
		assertTrue(testList.contains(4));

		assertFalse(testList.contains(-4));
		assertFalse(testList.contains(62));
	}

	@Test
	public void testAddFirstContainsRecursive() {
		ListSQ<Integer> testList = newList();
		testList.addFirst(0);
		testList.addFirst(1);
		testList.addFirst(2);
		testList.addFirst(3);
		testList.addFirst(4);
		// [4, 3, 2, 1, 0]
		assertTrue(testList.containsRecursive(0));
		assertTrue(testList.containsRecursive(1));
		assertTrue(testList.containsRecursive(2));
		assertTrue(testList.containsRecursive(3));
		assertTrue(testList.containsRecursive(4));

		assertFalse(testList.containsRecursive(-4));
		assertFalse(testList.containsRecursive(62));
	}

	@Test
	public void testAddLastGetFirst() {
		ListSQ<Integer> testList = newList();
		// [5]
		testList.addLast(5);
		assertEquals(5, (int) testList.getFirst());
		// [5, 4]
		testList.addLast(4);
		assertEquals(5, (int) testList.getFirst());
		// [5, 4, 3]
		testList.addLast(3);
		assertEquals(5, (int) testList.getFirst());
		// [5, 4, 3, 2]
		testList.addLast(2);
		assertEquals(5, (int) testList.getFirst());
		// [5, 4, 3, 2, 1]
		testList.addLast(1);
		assertEquals(5, (int) testList.getFirst());
	}

	@Test
	public void testAddLastGetLast() {
		ListSQ<Integer> testList = newList();
		// [5]
		testList.addLast(5);
		assertEquals(5, (int) testList.getLast());
		// [5, 4]
		testList.addLast(4);
		assertEquals(4, (int) testList.getLast());
		// [5, 4, 3]
		testList.addLast(3);
		assertEquals(3, (int) testList.getLast());
		// [5, 4, 3, 2]
		testList.addLast(2);
		assertEquals(2, (int) testList.getLast());
		// [5, 4, 3, 2, 1]
		testList.addLast(1);
		assertEquals(1, (int) testList.getLast());
	}

	@Test
	public void testAddLastGet() {
		ListSQ<Integer> testList = newList();
		// [0]
		testList.addLast(0);
		assertEquals(0, (int) testList.get(0));
		// [0, 1]
		testList.addLast(1);
		assertEquals(0, (int) testList.get(0));
		assertEquals(1, (int) testList.get(1));
		// [0, 1, 2]
		testList.addLast(2);
		assertEquals(0, (int) testList.get(0));
		assertEquals(1, (int) testList.get(1));
		assertEquals(2, (int) testList.get(2));
		// [0, 1, 2, 3]
		testList.addLast(3);
		assertEquals(0, (int) testList.get(0));
		assertEquals(1, (int) testList.get(1));
		assertEquals(2, (int) testList.get(2));
		assertEquals(3, (int) testList.get(3));
		// [0, 1, 2, 3, 4]
		testList.addLast(4);
		assertEquals(0, (int) testList.get(0));
		assertEquals(1, (int) testList.get(1));
		assertEquals(2, (int) testList.get(2));
		assertEquals(3, (int) testList.get(3));
		assertEquals(4, (int) testList.get(4));
	}

	@Test
	public void testAddLastContains() {
		ListSQ<Integer> testList = newList();
		testList.addLast(0);
		testList.addLast(1);
		testList.addLast(2);
		testList.addLast(3);
		testList.addLast(4);
		// [0, 1, 2, 3, 4]
		assertTrue(testList.contains(0));
		assertTrue(testList.contains(1));
		assertTrue(testList.contains(2));
		assertTrue(testList.contains(3));
		assertTrue(testList.contains(4));

		assertFalse(testList.contains(-4));
		assertFalse(testList.contains(62));
	}

	@Test
	public void testAddLastContainsRecursive() {
		ListSQ<Integer> testList = newList();
		testList.addLast(0);
		testList.addLast(1);
		testList.addLast(2);
		testList.addLast(3);
		testList.addLast(4);
		// [4, 3, 2, 1, 0]
		assertTrue(testList.containsRecursive(0));
		assertTrue(testList.containsRecursive(1));
		assertTrue(testList.containsRecursive(2));
		assertTrue(testList.containsRecursive(3));
		assertTrue(testList.containsRecursive(4));

		assertFalse(testList.containsRecursive(-4));
		assertFalse(testList.containsRecursive(62));
	}

	@Test
	public void testAddMiddleGetFirst() {
		ListSQ<Integer> testList = newList();
		// [0]
		testList.addMiddle(0, 0);
		assertEquals(0, (int) testList.getFirst());
		// [0, 1]
		testList.addMiddle(1, 1);
		assertEquals(0, (int) testList.getFirst());
		// [0, 1, 3]
		testList.addMiddle(2, 3);
		assertEquals(0, (int) testList.getFirst());
		// [0, 1, 2, 3]
		testList.addMiddle(2, 2);
		assertEquals(0, (int) testList.getFirst());
		// [0, 1, 2, 3, 4]
		testList.addMiddle(4, 4);
		assertEquals(0, (int) testList.getFirst());
		// [0, 1, 2, 3, 4, 5]
		testList.addMiddle(12, 5);
		assertEquals(0, (int) testList.getFirst());
		// [-1, 0, 1, 2, 3, 4, 5]
		testList.addMiddle(0, -1);
		assertEquals(-1, (int) testList.getFirst());
	}

	@Test
	public void testAddMiddleGetLast() {
		ListSQ<Integer> testList = newList();
		// [0]
		testList.addMiddle(0, 0);
		assertEquals(0, (int) testList.getLast());
		// [0, 1]
		testList.addMiddle(1, 1);
		assertEquals(1, (int) testList.getLast());
		// [0, 1, 3]
		testList.addMiddle(2, 3);
		assertEquals(3, (int) testList.getLast());
		// [0, 1, 2, 3]
		testList.addMiddle(2, 2);
		assertEquals(3, (int) testList.getLast());
		// [0, 1, 2, 3, 4]
		testList.addMiddle(4, 4);
		assertEquals(4, (int) testList.getLast());
		// [0, 1, 2, 3, 4, 5]
		testList.addMiddle(12, 5);
		assertEquals(5, (int) testList.getLast());
		// [-1, 0, 1, 2, 3, 4, 5]
		testList.addMiddle(0, -1);
		assertEquals(5, (int) testList.getLast());
	}

	@Test
	public void testAddMiddleGet() {
		ListSQ<Integer> testList = newList();
		// [0]
		testList.addMiddle(0, 0);
		assertEquals(0, (int) testList.get(0));
		// [0, 1]
		testList.addMiddle(1, 1);
		assertEquals(0, (int) testList.get(0));
		assertEquals(1, (int) testList.get(1));
		// [0, 1, 3]
		testList.addMiddle(2, 3);
		assertEquals(0, (int) testList.get(0));
		assertEquals(1, (int) testList.get(1));
		assertEquals(3, (int) testList.get(2));
		// [0, 1, 2, 3]
		testList.addMiddle(2, 2);
		assertEquals(0, (int) testList.get(0));
		assertEquals(1, (int) testList.get(1));
		assertEquals(2, (int) testList.get(2));
		assertEquals(3, (int) testList.get(3));
		// [0, 1, 2, 3, 4]
		testList.addMiddle(4, 4);
		assertEquals(0, (int) testList.get(0));
		assertEquals(1, (int) testList.get(1));
		assertEquals(2, (int) testList.get(2));
		assertEquals(3, (int) testList.get(3));
		assertEquals(4, (int) testList.get(4));
		// [0, 1, 2, 3, 4, 5]
		testList.addMiddle(12, 5);
		assertEquals(0, (int) testList.get(0));
		assertEquals(1, (int) testList.get(1));
		assertEquals(2, (int) testList.get(2));
		assertEquals(3, (int) testList.get(3));
		assertEquals(4, (int) testList.get(4));
		assertEquals(5, (int) testList.get(5));
		// [-1, 0, 1, 2, 3, 4, 5]
		testList.addMiddle(0, -1);
		assertEquals(-1, (int) testList.get(0));
		assertEquals(0, (int) testList.get(1));
		assertEquals(1, (int) testList.get(2));
		assertEquals(2, (int) testList.get(3));
		assertEquals(3, (int) testList.get(4));
		assertEquals(4, (int) testList.get(5));
		assertEquals(5, (int) testList.get(6));
	}

	@Test
	public void testAddMiddleContains() {
		ListSQ<Integer> testList = newList();
		testList.addMiddle(0, 0);
		testList.addMiddle(1, 1);
		testList.addMiddle(2, 3);
		testList.addMiddle(2, 2);
		testList.addMiddle(4, 4);
		testList.addMiddle(12, 5);
		testList.addMiddle(0, -1);
		// [-1, 0, 1, 2, 3, 4, 5]
		assertTrue(testList.contains(-1));
		assertTrue(testList.contains(0));
		assertTrue(testList.contains(1));
		assertTrue(testList.contains(2));
		assertTrue(testList.contains(3));
		assertTrue(testList.contains(4));
		assertTrue(testList.contains(5));
	}

	@Test
	public void testAddMiddleContainsRecursive() {
		ListSQ<Integer> testList = newList();
		testList.addMiddle(0, 0);
		testList.addMiddle(1, 1);
		testList.addMiddle(2, 3);
		testList.addMiddle(2, 2);
		testList.addMiddle(4, 4);
		testList.addMiddle(12, 5);
		testList.addMiddle(0, -1);
		// [4, 3, 2, 1, 0]
		assertTrue(testList.containsRecursive(-1));
		assertTrue(testList.containsRecursive(0));
		assertTrue(testList.containsRecursive(1));
		assertTrue(testList.containsRecursive(2));
		assertTrue(testList.containsRecursive(3));
		assertTrue(testList.containsRecursive(4));
		assertTrue(testList.containsRecursive(5));

		assertFalse(testList.containsRecursive(-4));
		assertFalse(testList.containsRecursive(62));
	}

	@Test
	public void testClearSize() {
		ListSQ<Integer> testList = newList();

		testList.addFirst(1);
		testList.addFirst(2);
		testList.addFirst(3);
		testList.addFirst(4);
		testList.addFirst(5);
		assertEquals(5, testList.size());
		testList.clear();
		assertEquals(0, testList.size());
	}

	@Test
	public void testClearAddFirstGetFirst() {
		ListSQ<Integer> testList = newList();

		testList.addFirst(1);
		testList.addFirst(2);
		testList.addFirst(3);
		testList.addFirst(4);
		testList.addFirst(5);

		assertEquals(5, (int) testList.getFirst());

		testList.clear();

		testList.addFirst(3);

		assertEquals(3, (int) testList.getFirst());
	}

	@Test
	public void testClearGetFirst() {
		ListSQ<Integer> testList = newList();

		testList.addFirst(1);
		testList.addFirst(2);
		testList.addFirst(3);

		assertEquals(3, (int) testList.size());
		assertEquals(3, (int) testList.getFirst());

		testList.clear();

		assertEquals(0, testList.size());

		Assertions.assertThrows(NoSuchElementException.class, () -> {
			testList.getFirst();
		});

	}

	@Test
	public void testClearGetLast() {
		ListSQ<Integer> testList = newList();

		testList.addFirst(1);
		testList.addFirst(2);
		testList.addFirst(3);

		assertEquals(3, (int) testList.size());
		assertEquals(1, (int) testList.getLast());

		testList.clear();

		assertEquals(0, testList.size());

		Assertions.assertThrows(NoSuchElementException.class, () -> {
			testList.getLast();
		});

	}

	@Test
	public void testClearGet() {
		ListSQ<Integer> testList = newList();

		testList.addFirst(1);
		testList.addFirst(2);
		testList.addFirst(3);

		assertEquals(3, (int) testList.size());
		assertEquals(3, (int) testList.getFirst());

		testList.clear();

		assertEquals(0, testList.size());

		Assertions.assertThrows(NoSuchElementException.class, () -> {
			testList.get(0);
		});
	}

	@Test
	public void testGetOutOfBounds() {
		ListSQ<Integer> testList = newList();

		testList.addFirst(1);
		testList.addFirst(2);
		testList.addFirst(3);

		Assertions.assertThrows(NoSuchElementException.class, () -> {
			testList.get(5);
		});
	}

	@Test
	public void testGetFirst() {
		ListSQ<Integer> testList = newList();

		testList.addFirst(1);
		testList.addFirst(2);
		testList.addFirst(3);

		ListSQ<Integer> testList1 = newList();

		testList1.addFirst(4);
		testList1.addFirst(5);
		testList1.addFirst(6);

		ListSQ<Integer> testList2 = newList();

		testList2.addFirst(7);
		testList2.addFirst(8);
		testList2.addFirst(9);

		assertEquals(3, (int) testList.getFirst());
		assertEquals(6, (int) testList1.getFirst());
		assertEquals(9, (int) testList2.getFirst());
	}

	@Test
	public void testGetFirstWithEmptyList() {
		ListSQ<Integer> testList = newList();
		Assertions.assertThrows(NoSuchElementException.class, () -> {
			testList.getFirst();
		});
	}

	@Test
	public void testGetLastWithEmptyList() {
		ListSQ<Integer> testList = newList();
		Assertions.assertThrows(NoSuchElementException.class, () -> {
			testList.getLast();
		});
	}

	@Test
	public void testGetLast() {
		ListSQ<Integer> testList = newList();

		testList.addFirst(1);
		testList.addFirst(2);
		testList.addFirst(3);

		ListSQ<Integer> testList1 = newList();

		testList1.addFirst(4);
		testList1.addFirst(5);
		testList1.addFirst(6);

		ListSQ<Integer> testList2 = newList();

		testList2.addFirst(7);
		testList2.addFirst(8);
		testList2.addFirst(9);

		assertEquals(1, (int) testList.getLast());
		assertEquals(4, (int) testList1.getLast());
		assertEquals(7, (int) testList2.getLast());
	}

	@Test
	public void testRemoveFirst() {
		ListSQ<Integer> testList = newList();

		testList.addLast(3);
		testList.addLast(2);
		testList.addLast(1);

		assertEquals(3, (int) testList.getFirst());

		testList.removeFirst();
		assertEquals(2, (int) testList.getFirst());

		testList.removeFirst();
		assertEquals(1, (int) testList.getFirst());

	}

	@Test
	public void testRemoveFirstWithEmptyList() {

		ListSQ<Integer> testList = newList();
		testList.addLast(1);
		assertEquals(1, (int) testList.getFirst());
		testList.removeFirst();
		Assertions.assertThrows(NoSuchElementException.class, () -> {
			testList.removeFirst();
		});
	}

	@Test
	public void testRemoveLast() {

		ListSQ<Integer> testList = newList();

		testList.addLast(3);
		testList.addLast(2);
		testList.addLast(1);

		assertEquals(1, (int) testList.getLast());

		testList.removeLast();
		assertEquals(2, (int) testList.getLast());

		testList.removeLast();
		assertEquals(3, (int) testList.getLast());

	}

	@Test
	public void testRemoveLastWithEmptyList() {
		ListSQ<Integer> testList = newList();
		testList.addLast(1);
		testList.removeLast();
		Assertions.assertThrows(NoSuchElementException.class, () -> {
			testList.removeLast();
		});
	}

	@Test
	public void testSize() {
		ListSQ<Integer> testList = newList();

		assertEquals(0, testList.size());

		testList.addLast(5);
		testList.addLast(4);
		testList.addLast(3);
		testList.addLast(2);
		testList.addLast(1);
		testList.addFirst(5);
		testList.addFirst(4);
		testList.addFirst(3);
		testList.addFirst(2);
		testList.addFirst(1);

		assertEquals(10, testList.size());

		testList.removeLast();
		testList.removeLast();
		testList.removeLast();
		testList.removeLast();
		testList.removeLast();

		assertEquals(5, testList.size());

		testList.removeLast();
		testList.removeLast();
		testList.removeLast();
		testList.removeLast();
		testList.removeLast();

		assertEquals(0, testList.size());

	}

	@Test
	public void testReverseGetFirstGetLast() {
		ListSQ<Integer> testList = newList();

		testList.addLast(1);
		testList.addLast(2);
		testList.addLast(3);
		testList.addLast(4);
		testList.addLast(5);
		testList.addLast(6);

		testList.reverse();

		assertEquals(1, (int) testList.getLast());
		assertEquals(6, (int) testList.getFirst());

	}

	@Test
	public void testReverseGet() {
		ListSQ<Integer> testList = newList();

		testList.addLast(1);
		testList.addLast(2);
		testList.addLast(3);
		testList.addLast(4);
		testList.addLast(5);

		testList.reverse();

		assertEquals(1, (int) testList.getLast());
		assertEquals(5, (int) testList.getFirst());
		assertEquals(5, (int) testList.get(0));
		assertEquals(4, (int) testList.get(1));
		assertEquals(3, (int) testList.get(2));
		assertEquals(2, (int) testList.get(3));
		assertEquals(1, (int) testList.get(4));

	}

	@Test
	public void testComputeSizeRecursive() {
		ListSQ<Integer> testList = newList();

		assertEquals(0, testList.computeSizeRecursive());

		testList.addLast(3);
		testList.addLast(2);
		testList.addLast(1);

		assertEquals(3, testList.computeSizeRecursive());
	}

	@Test
	public void testToArrayListPostRecurse() {
		ListSQ<Integer> testList = newList();

		testList.addLast(0);
		testList.addLast(1);
		testList.addLast(2);
		testList.addLast(3);
		testList.addLast(4);

		ArrayList<Integer> comparingList = new ArrayList<Integer>();
		comparingList.add(4);
		comparingList.add(3);
		comparingList.add(2);
		comparingList.add(1);
		comparingList.add(0);

		assertEquals(comparingList, testList.toArrayListPostRecursion());
	}

	@Test
	public void testToArrayList() {
		ListSQ<Integer> testList = newList();

		testList.addLast(0);
		testList.addLast(1);
		testList.addLast(2);
		testList.addLast(3);
		testList.addLast(4);
		testList.addLast(0);
		testList.addLast(1);
		testList.addLast(2);
		testList.addLast(3);
		testList.addLast(4);
		testList.addLast(0);
		testList.addLast(1);
		testList.addLast(2);
		testList.addLast(3);
		testList.addLast(4);
		testList.addLast(0);
		testList.addLast(1);
		testList.addLast(2);
		testList.addLast(3);
		testList.addLast(4);

		ArrayList<Integer> comparingList = new ArrayList<Integer>();
		comparingList.add(0);
		comparingList.add(1);
		comparingList.add(2);
		comparingList.add(3);
		comparingList.add(4);
		comparingList.add(0);
		comparingList.add(1);
		comparingList.add(2);
		comparingList.add(3);
		comparingList.add(4);
		comparingList.add(0);
		comparingList.add(1);
		comparingList.add(2);
		comparingList.add(3);
		comparingList.add(4);
		comparingList.add(0);
		comparingList.add(1);
		comparingList.add(2);
		comparingList.add(3);
		comparingList.add(4);

		assertEquals(comparingList, testList.toArrayList());
	}

	@Test
	public void testAddManyFristLastMiddle() {
		ListSQ<Integer> testList = newList();

		for (int i = 0; i < 10000; i++) {
			testList.addFirst((int) (Math.random() * 10000));
		}
		for (int i = 0; i < 10000; i++) {
			testList.addLast((int) (Math.random() * 10000));
		}
		for (int i = 0; i < 10000; i++) {
			testList.addMiddle((int) (Math.random() * 9999), (int) (Math.random() * 10000));
		}
		testList.addFirst(0);
		testList.addLast(1);

		assertEquals(0, (int) testList.getFirst());

		assertEquals(1, (int) testList.getLast());
	}

	@Test
	public void testAddMiddleContainsMany() {

		ListSQ<Integer> testList = newList();

		for (int i = 0; i < 100; i++) {
			int tempAfter = (int) (Math.random() * 4999);
			int tempValue = (int) (Math.random() * 5000);
			testList.addMiddle(tempAfter, tempValue);
			assertTrue(testList.contains(tempValue));
		}
		testList.addFirst(0);
		testList.addLast(1);

		assertEquals(0, (int) testList.getFirst());

		assertEquals(1, (int) testList.getLast());

	}

	@Test
	public void testAddLastContainsMany() {

		ListSQ<Integer> testList = newList();

		for (int i = 0; i < 100; i++) {
			int tempValue = (int) (Math.random() * 5000);
			testList.addLast(tempValue);
			assertTrue(testList.contains(tempValue));
		}
		testList.addFirst(0);
		testList.addLast(1);

		assertEquals(0, (int) testList.getFirst());

		assertEquals(1, (int) testList.getLast());

	}

	@Test
	public void testToStringAddLast() {
		ListSQ<Integer> testList = newList();
		testList.addLast(0);
		testList.addLast(1);
		testList.addLast(2);
		testList.addLast(3);
		testList.addLast(4);

		if (testList instanceof LinkedListSQ) {
			assertEquals("[0]--> [1]--> [2]--> [3]--> [4]--> null", testList.toString());
		}
		if (testList instanceof ArrayListSQ) {
			assertEquals("[0, 1, 2, 3, 4]", testList.toString());
		}
	}

	@Test
	public void testToStringAddFirst() {
		ListSQ<Integer> testList = newList();
		testList.addFirst(0);
		testList.addFirst(1);
		testList.addFirst(2);
		testList.addFirst(3);
		testList.addFirst(4);

		if (testList instanceof LinkedListSQ) {
			assertEquals("[4]--> [3]--> [2]--> [1]--> [0]--> null", testList.toString());
		}
		if (testList instanceof ArrayListSQ) {
			assertEquals("[4, 3, 2, 1, 0]", testList.toString());
		}
	}

	@Test
	public void testToStringEmpty() {
		ListSQ<Integer> testList = newList();

		if (testList instanceof LinkedListSQ) {
			assertEquals("null", testList.toString());
		}
		if (testList instanceof ArrayListSQ) {
			assertEquals("[]", testList.toString());
		}
	}

	@Test
	public void testToStringOneElement() {
		ListSQ<Integer> testList = newList();
		testList.addLast(0);

		if (testList instanceof LinkedListSQ) {
			assertEquals("[0]--> null", testList.toString());
		}
		if (testList instanceof ArrayListSQ) {
			assertEquals("[0]", testList.toString());
		}
	}

	@Test
	public void testAddFirstMiddleLast() {
		ListSQ<Integer> testList = newList();
		// [4]
		testList.addFirst(4);
		assertEquals(4, (int) testList.get(0));
		// [4, 5]
		testList.addMiddle(1, 5);
		assertEquals(4, (int) testList.get(0));
		assertEquals(5, (int) testList.get(1));
		// [4, 5, 6]
		testList.addLast(6);
		assertEquals(4, (int) testList.get(0));
		assertEquals(5, (int) testList.get(1));
		assertEquals(6, (int) testList.get(2));
		// [2, 4, 5, 6]
		testList.addFirst(2);
		assertEquals(2, (int) testList.get(0));
		assertEquals(4, (int) testList.get(1));
		assertEquals(5, (int) testList.get(2));
		assertEquals(6, (int) testList.get(3));
		// [2, 3, 4, 5, 6]
		testList.addMiddle(1, 3);
		assertEquals(2, (int) testList.get(0));
		assertEquals(3, (int) testList.get(1));
		assertEquals(4, (int) testList.get(2));
		assertEquals(5, (int) testList.get(3));
		assertEquals(6, (int) testList.get(4));
		// [2, 3, 4, 5, 6, 8]
		testList.addLast(8);
		assertEquals(2, (int) testList.get(0));
		assertEquals(3, (int) testList.get(1));
		assertEquals(4, (int) testList.get(2));
		assertEquals(5, (int) testList.get(3));
		assertEquals(6, (int) testList.get(4));
		assertEquals(8, (int) testList.get(5));
		// [0, 2, 3, 4, 5, 6, 8]
		testList.addFirst(0);
		assertEquals(0, (int) testList.get(0));
		assertEquals(2, (int) testList.get(1));
		assertEquals(3, (int) testList.get(2));
		assertEquals(4, (int) testList.get(3));
		assertEquals(5, (int) testList.get(4));
		assertEquals(6, (int) testList.get(5));
		assertEquals(8, (int) testList.get(6));
		// [0, 1, 2, 3, 4, 5, 6, 8]
		testList.addMiddle(1, 1);
		assertEquals(0, (int) testList.get(0));
		assertEquals(1, (int) testList.get(1));
		assertEquals(2, (int) testList.get(2));
		assertEquals(3, (int) testList.get(3));
		assertEquals(4, (int) testList.get(4));
		assertEquals(5, (int) testList.get(5));
		assertEquals(6, (int) testList.get(6));
		assertEquals(8, (int) testList.get(7));
		// [0, 1, 2, 3, 4, 5, 6, 7, 8]
		testList.addMiddle(7, 7);
		assertEquals(0, (int) testList.get(0));
		assertEquals(1, (int) testList.get(1));
		assertEquals(2, (int) testList.get(2));
		assertEquals(3, (int) testList.get(3));
		assertEquals(4, (int) testList.get(4));
		assertEquals(5, (int) testList.get(5));
		assertEquals(6, (int) testList.get(6));
		assertEquals(7, (int) testList.get(7));
		assertEquals(8, (int) testList.get(8));
	}

	@Test
	public void testNegativeBoundsLargerThanArrayLength() {
		ListSQ<Integer> testList = newList();
		// [0]
		testList.addFirst(0);
		// [1, 0]
		testList.addFirst(1);
		// [1]
		testList.removeLast();
		// [2, 1]
		testList.addFirst(2);
		// [3, 2, 1]
		testList.addFirst(3);
		// [3, 2]
		testList.removeLast();
		// [3]
		testList.removeLast();
		// [4, 3]
		testList.addFirst(4);
		// [5, 4, 3]
		testList.addFirst(5);
		// [4, 3]
		testList.removeFirst();
		// [4, 3, 2]
		testList.addLast(2);

		assertEquals(3, testList.size());
		assertEquals(4, (int) testList.getFirst());
		assertEquals(2, (int) testList.getLast());
		assertEquals(4, (int) testList.get(0));
		assertEquals(3, (int) testList.get(1));
		assertEquals(2, (int) testList.get(2));

		// [3, 2]
		testList.removeFirst();
		// [2]
		testList.removeFirst();
		// [2, 1]
		testList.addLast(1);
		// [2, 1, 0]
		testList.addLast(0);

		assertEquals(0, (int) testList.getLast());
	}

	@Test
	public void testPositiveBoundsLArgerThanArrayLength() {
		ListSQ<Integer> testList = newList();
		// [0]
		testList.addLast(0);
		// [0, 1]
		testList.addLast(1);
		// [1]
		testList.removeFirst();
		// [1, 2]
		testList.addLast(2);
		// [1, 2, 3]
		testList.addLast(3);
		// [2, 3]
		testList.removeFirst();
		// [3]
		testList.removeFirst();
		// [3, 4]
		testList.addLast(4);
		// [3, 4, 5]
		testList.addLast(5);
		// [4, 5]
		testList.removeFirst();
		// [5]
		testList.removeFirst();
		// [5, 6]
		testList.addLast(6);
		// [5, 6, 7]
		testList.addLast(7);
		// [6, 7]
		testList.removeFirst();
		// [7]
		testList.removeFirst();
		// [7, 8]
		testList.addLast(8);
		// [7, 8, 9]
		testList.addLast(9);
		// [8, 9]
		testList.removeFirst();
		// [9]
		testList.removeFirst();
		// [9, 10]
		testList.addLast(10);
		// [9, 10, 11]
		testList.addLast(11);
		// [8, 9, 10, 11]
		testList.addFirst(8);
		// [7, 8, 9, 10, 11]
		testList.addFirst(7);

		assertEquals(5, testList.size());
	}

	@Test
	public void testAddFirstAddLast() {
		ListSQ<Integer> testList = newList();
		testList.addFirst(5);
		testList.addFirst(13);
		testList.addFirst(3);
		testList.addLast(18);

		assertEquals(4, testList.size());

	}

}
