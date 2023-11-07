package org.demojunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class A {
	@BeforeClass
	public static void BeforeClass() {
		System.out.println("Before Class");
	}
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	@Test
	public void tc1() {
		System.out.println("test 1");
	}
	@Test
	public void tc2() {
		System.out.println("test 2");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
