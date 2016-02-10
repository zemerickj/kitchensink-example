package org.jboss.as.quickstarts.kitchensink.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleUserInterfaceIT {

	private WebDriver driver;
	
	@Before
	public void before() {
		
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromium-browser");
		
	}
	
	@After
	public void after() {
		
		driver.quit();
		
	}
	
	
	@Test
	public void titleTest() throws IOException {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://localhost:8080/pages/index.html");
		String text = driver.findElement(By.ById.id("pageTitle")).getText();
		
		assertEquals("My Dashboard", text);
		
	}

}