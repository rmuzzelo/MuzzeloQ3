package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	
	Triangle triangle1;
	Triangle triangle2;

	@Before
	public void setUp() throws Exception {
		triangle1 = new Triangle(2,4,5);
		triangle2 = new Triangle(8,5,5);
		
	}

	@After
	public void tearDown() throws Exception {
		triangle1 = null;
		triangle2 = null;
	}

	@Test
	public final void testArea() {
		assertTrue("Assertion didn't work",triangle1.getArea()==3.799671038392666);
		assertTrue("Assertion didn't work",triangle2.getArea()==12);
	}
	
	@Test
	public final void testPerimeter() {
		assertTrue("Assertion didn't work",triangle1.getPerimeter()==11);
		assertTrue("Assertion didn't work",triangle2.getPerimeter()==18);
	}

}
