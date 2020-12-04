package com.corejava.test.BasicsTest;

import com.corejava.test.Array.ArrayTest_01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Arrays_Tests {
  
  @Test
  public void testArray_01() {
	ArrayTest_01 test_01 = new ArrayTest_01();
	assertTrue(test_01.has77(new int[]{1,7,7}));
	assertTrue(test_01.has77(new int[]{1,7,1,7}));
	assertFalse(test_01.has77(new int[]{1,7,1,1,7}));
  }
}
