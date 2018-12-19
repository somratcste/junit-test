package somrat.info;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath myMath = new MyMath();
	
	@Before
	public void before() {
		System.out.println("before");
	}
	
	@After
	public void after() {
		System.out.println("after");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}

	@Test
	public void sum_with3numbers() {
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}
	
	@Test
	public void sum_with1number() {
		assertEquals(3, myMath.sum(new int[] {3}));
	}

}
