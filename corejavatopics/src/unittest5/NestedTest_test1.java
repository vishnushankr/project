package unittest5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
@DisplayName("Root Test")
public class NestedTest_test1 {

  @Test
  void test1() {
    System.out.println("=> test1()");
  }

  @Nested
  @DisplayName("Nested Test A")
  class TestA {

    @Test
    void testA_test1() {
      System.out.println("=> testA_test1()");
    }

    @Nested
    @DisplayName("Nested Test AA")
    class TestAA {

      @Test
      void testAA_test1() {
        System.out.println("=> testAA_test1()");
      }
    }
  }//TestA End

  @Nested
  @DisplayName("Nested Test B")
  class TestB {

    @Test
    void testB_test1() {
      System.out.println("=> testB_test1()");
    }
  }
}

	