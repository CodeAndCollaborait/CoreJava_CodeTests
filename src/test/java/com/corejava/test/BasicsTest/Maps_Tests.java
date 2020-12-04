package com.corejava.test.BasicsTest;

import com.corejava.test.Maps.MapsTest_01;

import static org.hamcrest.CoreMatchers.is;

import com.corejava.test.Maps.MapsTest_02;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;


public class Maps_Tests {
  
  @Test
  public void testMaps_01() {
	MapsTest_01 test_01 = new MapsTest_01();
	
	
	HashMap<String, String> outPut01 = new HashMap<>();
	outPut01.put("a", "aaa");
	outPut01.put("c", "cake");
	
	Map<String, String> map = test_01.mapAB2(outPut01);
	
	
	assertThat(map.size(), is(2));
	
  }
  
  @Test
  public void testMaps_02() {
	MapsTest_02 test_02 = new MapsTest_02();
	Assertions.assertEquals("a", test_02.wordAppend(new String[]{"a", "b", "a"}));
	Assertions.assertEquals("aa", test_02.wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
	Assertions.assertEquals("a", test_02.wordAppend(new String[]{"a", "", "a"}));
  }
}
