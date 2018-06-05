package startingGitHub;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opengoogle {
	
	@Test
	public void githubint(){
		System.out.println("Integration Print");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Desktop\\Learning\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		Assert.assertTrue("Not same as title", driver.getTitle().contains("Google"));		
		driver.close();		
	}
	
	

}
