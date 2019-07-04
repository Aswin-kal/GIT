package com.selenium.kk.maventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:/Chrome/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https:\\connect.maveric-systems.com");
		
	//wright wat u want notmine

	}

}
