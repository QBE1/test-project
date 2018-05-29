package test;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class TestBean extends TestCase {
	
	private Bean bean;
	
	@Before
	public void setUp() {
		bean = new Bean();
	}
	
	@Test
	public void testBean() {
		bean.setEntier(1);
		assertEquals(1, bean.getEntier());
	}

}
