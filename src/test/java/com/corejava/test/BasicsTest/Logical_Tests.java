package com.corejava.test.BasicsTest;

import com.corejava.test.Logical.LogicalTest_1;
import com.corejava.test.Logical.LogicalTest_2;
import com.corejava.test.Logical.LogicalTest_3;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class Logical_Tests {
  
  @Test
  public void logicTest_01() {
	LogicalTest_1 test_1 = new LogicalTest_1();
	assertEquals(2, test_1.dateFashion(5, 10));
	assertEquals(0, test_1.dateFashion(5, 2));
	assertEquals(1, test_1.dateFashion(5, 5));
  }
  
  @Test
  public void logicTest_02() {
	LogicalTest_2 test_2 = new LogicalTest_2();
	assertEquals(true, test_2.inOrderEqual(2, 5, 11, false));
	assertEquals(false, test_2.inOrderEqual(5, 7, 6, false));
	assertEquals(true, test_2.inOrderEqual(5, 5, 7, true));
  }
  
  @Test
  public void logicTest_03() {
	LogicalTest_3 test_3 = new LogicalTest_3();
	assertEquals(0, test_3.greenTicket(1, 2, 3));
	assertEquals(20, test_3.greenTicket(2, 2, 2));
	assertEquals(10, test_3.greenTicket(1, 1, 2));
  }
  
}