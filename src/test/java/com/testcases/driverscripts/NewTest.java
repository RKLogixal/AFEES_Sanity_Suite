package com.testcases.driverscripts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void f() throws IOException {

		/*  String line;

		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\LSPL309\\Documents\\123.txt"));

		while ((line = reader.readLine()) != null)
		{
			String[] parts = line.split("/", 4);
			if (parts.length >= 4)
			{
				String key = parts[0];
				String hvalue = parts[1];
				String key1 = parts[2];
				String hvalue2 = parts[3];

				//System.out.println(key);
				//System.out.println(hvalue);
				//System.out.println(key1);
				System.out.println(hvalue2);

			} else {
				System.out.println("ignoring line: " + line);
			}

		}
		reader.close();

		 */

		for (int vl=0;vl<10;vl++) {
			System.out.println(vl);
		}
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"/Browser_files/chromedriver_win32/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//Dimension d = new Dimension(DeviceScrWidth,DeviceScrHeight);
		driver.manage().window().maximize();
		
		
	}
}
