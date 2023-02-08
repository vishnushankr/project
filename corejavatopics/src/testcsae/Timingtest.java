package testcsae;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;


class Timingtest {

	Messenger obj=new Messenger("Hello Everyone");
	@Test(timeout=1000)
	public void test() {
		obj.printmessege();
	}
}
