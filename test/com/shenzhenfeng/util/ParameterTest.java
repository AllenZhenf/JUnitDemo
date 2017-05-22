package com.shenzhenfeng.util;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterTest {

	/**
	 * 1.¸ü¸ÄÄ¬ÈÏ
	 */
	
	private int expected=0;
	private int input1=0;
	private int input2=0;
	
	@Parameters
	public static Collection<Object[]> ArrayAdd(){
	  return Arrays.asList(new Object[][]{{4,2,2},{3,2,1}});
	}	
	public ParameterTest(int expected,int input1,int input2) {
		this.expected=expected;
		this.input1=input1;
		this.input2=input2;
	}
	
	@Test
	public void test() {
		assertEquals(expected, new Caculate().add(input1, input2));
	}

}
