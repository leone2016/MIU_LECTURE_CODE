package FPP.lectureCode.lesson1.testcalculatesum;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Testing {
	
	@Test
	public void testCalculateSum() {
		int[] arr = {1,2,3};
		int expected = 6;
		int result = SampleClass.calculateSum(arr);
		assertTrue(expected == result);
		//assertEquals(expected, result);
	}
	
	@Test
	public void CalculateSumEmptyTest() {
		int[] arr = {};
		int expected = 0;
		int result = SampleClass.calculateSum(arr);
		assertEquals(expected, result);
	}
}
