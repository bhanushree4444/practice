package com.practiceTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PracticTestngAssertion {

	SoftAssert asrt=new SoftAssert();
	
	@Test 
	public  void Test1Test() {
		Reporter.log("a------>",true);
		asrt.assertEquals("abc", "ac");
		Reporter.log("b------>",true);
		asrt.fail();
		Reporter.log("c------>",true);
		Reporter.log("d------>",true);
		asrt.assertAll();
		reporter.log("hi----->", true);
		reporter.log(browser,true);
		reporter.log(Url,true);
	}
	
	@Test 
	public  void Test2Test() {
		Reporter.log("a------>",true);
		asrt.assertEquals("abc", "abc");
		Reporter.log("b------>",true);
		Assert.fail();
		Reporter.log("c------>",true);
		asrt.assertEquals("abc", "abc");
		Reporter.log("d------>",true);
		reporter.log("hi----->", true);
		reporter.log(browser,true);
		reporter.log(Url,true);
	}
	
	@Test 
	public  void Test3Test() {
		Reporter.log("a------>",true);
		asrt.assertEquals("abc", "ab");
		Reporter.log("b------>",true);
		asrt.assertAll();
		Assert.fail();
		Reporter.log("c------>",true);
		Reporter.log("d------>",true);
		asrt.assertAll();
		reporter.log("hi----->", true);
		reporter.log(browser,true);
		reporter.log(Url,true);
	}
}
