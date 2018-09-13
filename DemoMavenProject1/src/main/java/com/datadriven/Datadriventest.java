package com.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.excel.utility.Xls_Reader1;

public class Datadriventest {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amiddha\\Desktop\\Important_downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://reg.ebay.in/reg/PartialReg?siteid=203&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.in%2F&signInUrl=https%3A%2F%2Fwww.ebay.in%2Fsignin%3Fsgn%3Dreg%26siteid%3D203%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.in%252F");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Xls_Reader1 reader = new Xls_Reader1("C:\\Users\\amiddha\\git\\Maven project_1\\DemoMavenProject1\\src\\main\\java\\com\\testdata\\Registration data on ebay.xlsx");
		int rowCount = reader.getRowCount("RegisPage");
		for (int row = 2; row<=rowCount; row++) {		
		String firstName = reader.getCellData("RegisPage", "FirstName",row);
		System.out.println(firstName);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstName);
		
		String lastName = reader.getCellData("RegisPage", "LastName",row);
		System.out.println(lastName);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);
		
		String emailAddress = reader.getCellData("RegisPage", "EmailAddress",row);
		System.out.println(emailAddress);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(emailAddress);
		
		String passWord = reader.getCellData("RegisPage", "Password",row);
		System.out.println(passWord);
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys(passWord);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Assert.assertEquals(driver.getTitle(), "Get started with eBay");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://reg.ebay.in/reg/PartialReg?siteid=203&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.in%2F&signInUrl=https%3A%2F%2Fwww.ebay.in%2Fsignin%3Fsgn%3Dreg%26siteid%3D203%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.in%252F");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	

	}
		
		
	}

}
