package com.shenzhenfeng.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitFlowTest {
	
	/**
	 *  @Test: 将一个 普通的方法修饰成为一个测试方法
	 *  @BeforeClass: 他会在所有的方法运行前被执行，static修饰
	 *  @AfterClass 他会在所有方法运行结束后被执行，static修饰
	 *  @Before：会在每一个测试方法被运行前执行一次
	 *  @After 会在每个测试方法被运行后执行一次
	 *  @Ignore 所修饰的测试方法会被测试运行器忽略
	 *  @RunWith: 可以修改测试运行器 org.junit.runner.Runner
	 *  
	 */


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
