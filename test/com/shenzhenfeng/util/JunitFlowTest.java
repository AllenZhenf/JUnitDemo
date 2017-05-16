package com.shenzhenfeng.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitFlowTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this is beforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is afterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is up");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is down");
	}

	@Test(timeout=1000)
	@Ignore
	public void test() {
		while(true){
			System.out.println("this is test");
		}
	}
	
	@Test(expected=Exception.class)
	public void testdivide(){
		assertEquals(3,new Caculate().divide(4, 0));
	}

}
