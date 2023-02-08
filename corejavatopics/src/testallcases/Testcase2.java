package testallcases;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;



class Testcase2 {

	@Test
public	void test() {
		Information obj=new Information("java","java123");
		assertEquals(true,obj.validate());
		}

}
