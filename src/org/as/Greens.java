package org.as;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Greens {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Greens-14\\eclipse\\java-oxygen\\eclipse\\Saranya\\Launch\\Driver\\geckodriver.exe");
		
		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
	}

}
