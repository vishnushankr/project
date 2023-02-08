package testcase;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


public class Test1 {

	@Test
	public void test() {
		Calculation obj=new Calculation();
		
		assertEquals(11, obj.addition(5, 6));
	
	}
	@Test
	public void test1() {
		Calculation obj=new Calculation();
		
		assertEquals(12, obj.addition(6, 6));
	
	}
}