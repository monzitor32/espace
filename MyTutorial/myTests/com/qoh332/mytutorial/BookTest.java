package com.qoh332.mytutorial;

import junit.framework.TestCase;

public class BookTest extends TestCase {

	public void testBook(){
		Book b1 = new Book("Great Expexctatins");
		assertEquals("Greate Expectations", b1.title);
		assertEquals("unknown author", b1.author);
		
	}
}
