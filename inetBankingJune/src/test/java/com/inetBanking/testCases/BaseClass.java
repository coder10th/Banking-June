package com.inetBanking.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking.utilities.ReadConfig;

public class BaseClass {

	  ReadConfig config=new ReadConfig();
	public String url=config.getUrl();
	public String userName=config.getUName();
	public String passWord=config.getPw();
	public WebDriver driver;
	public static Logger log;
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br)
	{
		log=Logger.getLogger("BaseClass");
		PropertyConfigurator.configure("log4j.properties");
		if (br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",config.chrome());
		driver=new ChromeDriver();
		}
		else if(br.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver",config.ie());
			driver=new InternetExplorerDriver();
		}
				
		driver.get(url);
	}
		
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
	public void captureScreenShots(WebDriver driver,String tname)
	 {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/ScreenShots/"+ tname +".png");
		try {
			FileUtils.copyFile(source,target);
		    } catch (IOException e) {
			e.printStackTrace();
			System.out.println("File not found");
		                    }
		System.out.println("Screenshots captured");
	   }
}
