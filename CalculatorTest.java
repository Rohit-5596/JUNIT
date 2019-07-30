import org.junit.*;

public class CalculatorTest {

	static Calculator calc=null;
	@BeforeClass
	public static void setUp()
	{
		calc=new Calculator();
		System.out.println("This Function is called once before the execution of all test cases");
	}
	
	@AfterClass
	public static void tearDown()
	{
		System.out.println("This Function is called once after the execution of all test cases");
		calc=null;
	}
	
	@Before
	public void init()
	{
		System.out.println("This Function is called once before the execution of each test cases");
		
	}
	
	@After
	public void destroy()
	{
		
		System.out.println("This Function is called once after the execution of each test cases");
	}
	
	@Test
	public void squaredTest1()
	{
		Assert.assertEquals(81, calc.squared(9));
	}
	
	@Test
	public void squaredTest2()
	{
		Assert.assertEquals(0, calc.squared(0));
	}
	
	@Test
	public void squaredTest3()
	{
		Assert.assertEquals(1, calc.squared(1));
	}
	
	@Test
	public void squaredTest4()
	{
		Assert.assertEquals(10, calc.squared(10));
	}
	
	@Test
	public void divideTest1()
	{
		Assert.assertEquals(10, calc.divide(10));
	}
	@Test
	public void divideTest2()
	{
		Assert.assertEquals(2, calc.divide(50));
	}
	@Test
	@Ignore
	public void divideTest3()
	{
		Assert.assertEquals(1, calc.divide(1));
	}
	@Test(expected=ArithmeticException.class)
	public void divideTest4()
	{
		Assert.assertEquals(1, calc.divide(0));
	}
}
