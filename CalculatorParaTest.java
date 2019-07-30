import java.util.*;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import org.junit.*;

@RunWith(Parameterized.class)
public class CalculatorParaTest {

	public int input;
	public int expected;
	@Parameterized.Parameters
	public static Collection data()
	{
		return Arrays.asList(new Object[][] {{25,4},{50,2},{25,625},{100,1},{0,10},{5,20}});//pass test
		//cases as array
				
	}
	
	public CalculatorParaTest(int input,int expected) {
		this.input=input;
		this.expected=expected;
	}
	
	@Test(expected=ArithmeticException.class)
	public void testMethod1() {
		System.out.println("Running parameterized tests");
		Assert.assertEquals(expected,Calculator.divide(input));
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Running parameterized tests");
		Assert.assertEquals(expected,Calculator.divide(input));
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Running parameterized tests");
		Assert.assertEquals("Test Failed",625,Calculator.squared(input));
	}
	
	
}
