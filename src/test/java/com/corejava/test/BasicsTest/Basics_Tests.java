package com.corejava.test.BasicsTest;


import com.corejava.test.Basics.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Basics_Tests {
  
  @Test
  public void basicsTest_1(){
  
	CodeTest_1 test_1 = new CodeTest_1();
	assertTrue(test_1.loneTeen(13, 99));
	assertFalse(test_1.loneTeen(13, 13));
	
  }
  
  @Test
  public void basicsTest_2(){
	CodeTest_2 test_2 = new CodeTest_2();
	assertEquals("JavJavJav", test_2.front3("Java"));
	assertEquals("ChoChoCho", test_2.front3("Chocolate"));
	assertEquals("abcabcabc", test_2.front3("abc"));
  }
  
  @Test
  public void basicsTest_3(){
	CodeTest_3 test_3 = new CodeTest_3();
	assertEquals("HeLLO", test_3.endUp("Hello"));
	assertEquals("hi thERE", test_3.endUp("hi there"));
	assertEquals("HI", test_3.endUp("hi"));
  }
  
  @Test
  public void basicsTest_4(){
	CodeTest_4 test_4 = new CodeTest_4();
	assertEquals("kien", test_4.altPairs("kitten"));
	assertEquals("Chole", test_4.altPairs("Chocolate"));
	assertEquals("Congrr", test_4.altPairs("CodingHorror"));
  }
  
  @Test
  public void basicsTest_5(){
	CodeTest_5 test_5 = new CodeTest_5();
	assertEquals(1, test_5.array667(new int []{6,6,2}));
	assertEquals(1, test_5.array667(new int []{6,6,2, 6}));
	assertEquals(1, test_5.array667(new int []{6,7,2,6}));
  }
}
