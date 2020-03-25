package tdd;
 
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


 class Remove2A {

	 /*
	  * REMOVE A CHARACTERS IN A STRING
	  * 1.ABCD -> BCD
	  * 2.AACD -> CD
	  * 3.BBAA -> BBAA
	  * 4.AABAA -> BAA
	  * 5.AAB -> B 
	  */
	 RemoveA b;
	 
	 @BeforeEach
	 void createObject() {
		 RemoveA b = new RemoveA();
	 }
	 
	 @Test
	 void Test1() {
		 
		assertEquals("BCD", b.deleteA("ABCD"));
	 }
	 
	 @Test
	 void Test2() {
		 
		assertEquals("CD", b.deleteA("AACD"));
	 }
	 
	 @Test
	 void Test3() {
		 
		assertEquals("BBAA", b.deleteA("BBAA"));
	 }
	 
	 @Test
	 void Test4() {
		 
		assertEquals("BAA", b.deleteA("AABAA"));
	 }
	 
	 @Test
	 void Test5() {
		 
		assertEquals("AAB", b.deleteA("B"));
	 }
}
