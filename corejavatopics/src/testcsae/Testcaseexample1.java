package testcsae;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testcaseexample1 {
	@Test //(expected=ArithmeticException.class)
    public void test() {
        CalcDivision obj=new CalcDivision();
        assertEquals(5,obj.divide(15, 3));
    }

}
 class CalcDivision {

    public int divide(int a, int b) {
        return a/b;
    }
 }

