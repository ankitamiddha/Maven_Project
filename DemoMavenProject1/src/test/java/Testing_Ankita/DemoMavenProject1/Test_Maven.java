package Testing_Ankita.DemoMavenProject1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test_Maven {
	
	WebDriver driver;
	final static Logger logger = Logger.getLogger("Ankita");
	@Test
	public void openbrowser() throws IOException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amiddha\\Desktop\\Important_downloads\\chromedriver_win32\\chromedriver.exe");
		logger.info("Opening browser");
		driver = new ChromeDriver();
		logger.debug("Maximizing the window");
		driver.manage().window().maximize();
		logger.info("Opening google website");
		driver.navigate().to("https://google.com");
		String Title = driver.getTitle();
		Assert.assertEquals("Google", Title);
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, 
				new File("C:\\Users\\amiddha\\git\\Maven project_1\\DemoMavenProject1\\failed.png"));		
		logger.error("Driver closed");
		driver.close();
		
		
		
	}
	
	
	

}

