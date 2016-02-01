package org.jboss.as.quickstarts.kitchensink.test;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleUserInterfaceIT {

	/*@Before
	public void before() {
		
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromium-browser");
		
	}*/
	
	@Test
	public void titleTest() throws IOException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://localhost:8080/");
		
		String appTitle = driver.getTitle();
		
		System.out.println("Application title is: " + appTitle);
		
		driver.quit();
		
	}

}