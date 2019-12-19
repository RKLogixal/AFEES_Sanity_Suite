package com.testcases.driverscripts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void f() throws IOException {

		/*System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"/Browser_files/chromedriver_win32/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//options.addExtensions(new File("D:\\ROhit\\Rohit\\Automation\\crx\\extension_4_0_4_0.crx"));
		options.addArguments("--no-sandbox");
		ChromeDriver webdriver = new ChromeDriver(options);
		
		webdriver.get("http://demo.guru99.com/");
		webdriver.manage().window().maximize();
		String title = webdriver.getTitle();
		System.out.println("Page Title: " +title);
		webdriver.quit();*/
		
		Runtime rt = Runtime.getRuntime();
		rt.exec("taskkill /F /IM IEDriverServers.exe");
	}
}
