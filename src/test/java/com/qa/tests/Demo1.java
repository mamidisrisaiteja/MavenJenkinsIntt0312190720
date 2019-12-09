package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void sum() {
		System.out.println("sum");
		int a=10,b=2;
		Assert.assertEquals(a+b,12);
	}
	@Test
	public void sub() {
		System.out.println("sub");
		int a=10,b=2;
		Assert.assertEquals(a-b,8);
	}
	@Test
	public void mul() {
		System.out.println("mul");
		int a=10,b=2;
		Assert.assertEquals(a*b,20);
	}
	@Test
	public void div() {
		System.out.println("div");
		int a=10,b=2;
		Assert.assertEquals(a/b,5);
	}

}
