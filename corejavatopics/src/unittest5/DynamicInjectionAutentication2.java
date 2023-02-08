package unittest5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DynamicInjectionAutentication2 {

	@Test
	@Tag("my-tag")
	public void test() {
		Authentication obj=new Authentication("vishnu","shankar");
		assertEquals(7,obj.getLength());
	}

}
