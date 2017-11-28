import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyStackTest {

/*
	@Test
	public void failingTest()
	   {
	     assertTrue(false);
	   }
//*/

// /*
	@Test 
	public void testPush()
	   {
	      MyStack<String> stack = new MyStack<String>();
	      stack.push ("hello");
	      stack.push ("world");
	      assertEquals (stack.peek(), "world");     	      
	   }

	// Test 1
	@Test
	public void testPopWhenEmpty()
	   {
	      MyStack<Integer> stack = new MyStack<Integer>();
	      assertEquals( stack.pop(), null );
	   }
	
	// Test 2
	@Test
	public void testPopWhenNonEmpty()
	   {
	      MyStack<Character> stack = new MyStack<Character>();
	      stack.push('A');
	      assertEquals((char)stack.pop(), 'A');
	   }

	// Test 3
	@Test
	public void stackNotEmpty()
	   {
	      MyStack<String> stack = new MyStack<String>();
	      stack.push("Hey");
	      assertEquals(stack.empty(), false);
	   }

	// Test 4
	@Test
	public void stackEmpty()
	   {
	      MyStack<String> stack = new MyStack<String>();
	      assertEquals(stack.empty(), true);
	   }

	// Test 5
	@Test
	public void stackSizeIsCorrect()
	   {
	      MyStack<Integer> stack = new MyStack<Integer>();
	      stack.push(1);
	      stack.push(2);
	      stack.push(3);
	      assertEquals(stack.size(), 3);
	   }

	// Test 6
	@Test
	public void clearIsFunctional()
	   {
	      MyStack<Short> stack = new MyStack<Short>();
	      stack.push((short)123);
	      assertEquals( stack.size(), 1 );
	      stack.clear();
	      assertEquals( stack.size(), 0 );
	   }

	// Test 7
	@Test
	public void peekWhenEmpty()
	   {
	      MyStack<Long> stack = new MyStack<Long>();
	      assertEquals( stack.peek(), null );
	   }

	// Test 8
	@Test
	public void toStringTest()
	   {
	      MyStack<Integer> stack = new MyStack<Integer>();
	      stack.push(50);
	      boolean result;
	      String ret_val = stack.toString();
	      result = ( ret_val instanceof String );
	      assertEquals(result, true);
	   }

	// Test 9
	@Test
	public void divByZero()
	   {
	      MyStack<Integer> stack = new MyStack<Integer>();
	      stack.push(5000);
	      stack.push(10);
	      stack.push(0);
	      int num1 = stack.pop();
	      int num2 = 0;
	      int result;
	      try{
	        result = num1/num2;
		result = 2;
	      }
	      catch(Exception e){
	         System.err.println("Error: Division by zero attempted - exception caught!\n");
	         e.printStackTrace();
		 result = stack.pop();
	      }
	      assertEquals(result, 10);
	   }

	// Test 10
	@Test
	public void testTen()
	   {
	      MyStack<Integer> stack = new MyStack<Integer>();
	      stack.push(50);
	      stack.push(20);
	      Integer num = stack.pop();
	      String str = num.toString();
	      assertEquals( str, "20");
	   }

/*
	@Test
	public void runAllTests()
           {
		for(int i = 0; i < 2000000; i++){
			for(int j = 0; j < 2000000; j++){
				testTen();
				divByZero();
				toStringTest();
				peekWhenEmpty();
				clearIsFunctional();
				stackSizeIsCorrect();
				stackEmpty();
				stackNotEmpty();
				testPopWhenNonEmpty();
				testPopWhenEmpty();
			} 
		}
		
           }
*/
//*/
}
