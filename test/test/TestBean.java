package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class TestBean {
	
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
