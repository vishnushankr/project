package testallcases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

class Testcase1 {
	@Test
	public void test() {
		Information obj=new Information("java","java123");
		assertEquals(7,obj.getLength());
	}
	
}
