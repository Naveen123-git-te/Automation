package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CustomerModule extends BaseClass{
	@Test(priority=1,invocationCount = 2)
	public void createCustomer() {
		Reporter.log("createCustomer",true);
	}
	@Test(priority=1)
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true);
	}
	@Test(dependsOnMethods = {"createCustomer"})
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
}
