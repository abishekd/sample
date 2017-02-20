package com.hello.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class helloTest {

	@Test
	public void f() {

		Assert.assertTrue(hello.largenumbers(90).isParallel());
	}
}
