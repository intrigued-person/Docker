package com.test.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	// @Test
	// void testCompareString() {
	// 	assertTrue(App.CompareString("shakeel", "shakeel"));
	// }
	
	// @Test
	// void testCompareString1() {
	// 	assertFalse(App.CompareString("Shakeel", "shakeel"));
	// }
	
	// @Test
	// void testCompareString2() {
	// 	assertEquals(0, App.CompareString("sakeel", "shakeel"));
	// }
	
	@Test
	void testSub() {
		assertEquals(5, App.sub(10, 5));
	}
	
	@Test
	void testSub1() {
		assertEquals(0, App.sub(5, 15));
	}

}
