package junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import code.Calculator;

public class CalculatorTest {
	
	@DisplayName("Two positive numbers test")
	@Test
	@Tag("Sanity")
	public void test1() {
		
		int result = Calculator.add(4,5);
		Assertions.assertEquals(9,result);
		
	}
	
	@DisplayName("One positive and one negative number test")
	@Test
	public void test2() {
		
		int result = Calculator.add(-4,5);
		Assertions.assertEquals(1,result);
		
	}
	
	
	
	@RepeatedTest(3)
	@DisplayName("Two positive numbers test where result is not matching")
	public void test3() {
		
		int result = Calculator.add(4,5);
		Assertions.assertNotEquals(10,result);
		
	}

}
