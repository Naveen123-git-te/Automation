package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void demo1() {
		System.out.println("Hello World");//It will print only In the console
	}
	@Test
	public void demo2() {
		Reporter.log("Bye World");//It will print only in the report
		Reporter.log("Bye World",false);//It will print only in the report
	}	
	@Test
	public void demo3() {
		Reporter.log("Hi World",true);//It will print both in report as well as console
	}
}