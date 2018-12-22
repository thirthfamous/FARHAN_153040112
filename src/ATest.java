import org.junit.Test;

import junit.framework.TestCase;

public class ATest extends TestCase {
	@Test
	public void test1() {
		A a = new A();
		assertEquals(0, a.perkalian(0, 5));
	}
	
	@Test
	public void test2() {
		A a = new A();
		assertEquals(2, a.perkalian(1, 2));
	}
}