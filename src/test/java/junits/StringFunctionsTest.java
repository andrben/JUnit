package junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class StringFunctionsTest {
	
	
	
	@Test
	@Tag("Regression")
	public void test() {
	
	String str1 = "madam";
	boolean processed_word1 = code.StringFunctions.isPalindrome(str1);
	Assertions.assertTrue(processed_word1);
	
	
	String str2 = "benjamin";
	boolean processed_word2 = code.StringFunctions.isPalindrome(str2);
	Assertions.assertFalse(processed_word2);
	}

}
