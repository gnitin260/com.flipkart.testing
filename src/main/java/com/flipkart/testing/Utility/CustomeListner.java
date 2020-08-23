package com.flipkart.testing.Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.flipkart.testing.BaseClass.Basecls;

public class CustomeListner extends Basecls implements ITestListener{
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed Test");
		failed(result.getMethod().getMethodName());
	}
}

