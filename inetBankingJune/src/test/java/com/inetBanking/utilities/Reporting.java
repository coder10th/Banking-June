package com.inetBanking.utilities;


import java.text.SimpleDateFormat;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Reporting implements ITestListener {
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest erep;
	

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context)
	{
		//String timeStamp=new SimpleDateFormat("yyyy:mm:dd HH:MM:SS").
	}

	public void onFinish(ITestContext context)
	{
		
	}
	
	
	

}
