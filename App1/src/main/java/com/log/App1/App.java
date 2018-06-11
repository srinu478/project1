package com.log.App1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Hello world!
 *
 */
public class App {
	@Test
	public void testSize1() {
		ArrayList list = new ArrayList();
		assertEquals(0, list.size());
		list.add(42);
		assertEquals(1, list.size());
		list.add(-3);
		assertEquals(2, list.size());
		list.add(17);
		assertEquals(3, list.size());
		list.add(99);
		assertEquals(4, list.size());
		assertEquals("second attempt", 4, list.size()); // make sure I can get
														// it a second time
	
	}

	@Test
	public void testIsEmpty1() {
		ArrayList list = new ArrayList();
		assertTrue(list.isEmpty());
		list.add(42);
		assertFalse("should have one element", list.isEmpty());
		list.add(-3);
		assertFalse("should have two elements", list.isEmpty());
	}

	@Test
	public void testIsEmpty2() {
		ArrayList list = new ArrayList();
		list.add(42);
		list.add(-3);
		assertFalse("should have two elements", list.isEmpty());
		list.remove(1);
		list.remove(0);
		assertTrue("after removing all elements", list.isEmpty());
		list.add(42);
		assertFalse("should have one element", list.isEmpty());
	}

}
