package com.Ecommerce.Firelawn.genericLib;



import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public WebDriver driver;
	public FileUtilies pdata = new FileUtilies();
	public WebdriverUtilies utilities= new WebdriverUtilies();
	
	@BeforeMethod
	public void openApp() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getPropertydata("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@AfterMethod         //inbuilt interface
	public void closeApp(ITestResult res) throws IOException
	{
		int status = res.getStatus();     //1=pass 2=fail 3=skip
		String name = res.getName();      //give failed test case name
		if(status==2)                    //fail==2 we want failed testcase sc only
		{
			Photo p = new Photo();
			p.getPhoto(driver, name);
		}
		driver.quit();
	}
}
