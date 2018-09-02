package Testing_Ankita.DemoMavenProject1;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test_Maven {
	
	WebDriver driver;
	final static Logger logger = Logger.getLogger("Ankita");
	@Test
	public void openbrowser()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amiddha\\Desktop\\Important_downloads\\chromedriver_win32\\chromedriver.exe");
		logger.info("Opening browser");
		driver = new ChromeDriver();
		logger.debug("Maximizing the window");
		driver.manage().window().maximize();
		logger.info("Opening google website");
		driver.navigate().to("https://google.com");
		String Title = driver.getTitle();
		Assert.assertEquals("Google", Title);
		
		logger.error("Driver closed");
		driver.close();
		
		
		
	}
	
	
	

}

