package com.qoh332.mytutorial;
//iss53 fixes
import junit.framework.TestCase;

public class PersonTest extends TestCase {

	//person test inherits all methods in the TestCase
	
	
	
	public void testPerson() {
		Person p1 = new Person();
		assertEquals("unknown name", p1.getName());
		assertEquals(3, p1.getMaximumBooks());
	}

	public void testSetName() {
		Person p2 = new Person();
		p2.setName("My New Person Inserted");
		assertEquals("My New Person Inserted", p2.getName());
		assertEquals(3, p2.getMaximumBooks());
		
	}

	public void testSetMaximumBooks() {
		
		Person p2 = new Person();
		p2.setMaximumBooks(8);
		assertEquals(8, p2.getMaximumBooks());
	}

	
	public void testToString(){
		Person p4 = new Person();
		p4.setName("Fred Flinstone");;
		p4.setMaximumBooks(7);
		String testString = "Fred Flinstone (7 books)";
		assertEquals(testString, p4.toString());
		
		
	}
	
}
