package unittest5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Mathutiltesting {
  
  @Test
  void test_Add() {
    assertEquals(5, Mathutil.add(3, 2));
  }
  
  @Test
  void test_Multiply() {
    assertEquals(15, Mathutil.multiple(3, 5));
  }

  @Test
  void test_Devide() {
    assertEquals(5, Mathutil.devide(25, 5));
  }
  
  @Test
  void testIs_Prime() {
    assertTrue(Mathutil.isPrime(13));
  }
}