package com.test.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {


	
	@Test
	void testSub() {
		assertEquals(5, App.sub(10, 5));
	}
	
	@Test
	void testSub1() {
		assertEquals(0, App.sub(5, 15));
	}

}
