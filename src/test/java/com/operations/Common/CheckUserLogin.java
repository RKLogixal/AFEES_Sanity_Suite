package com.operations.Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CheckUserLogin {


	public void VerifyUserLoginforLogout(WebDriver webdriver) throws InterruptedException {

		String User = "//*[@class='logout-link']";
		String LogOut = "//*[@id='logout-button']";

		int CheckUserLogin = webdriver.findElements(By.xpath(User)).size();

		if(CheckUserLogin > 0){

			WebElement ele = webdriver.findElement(By.xpath("//span[@class='capitalize']"));
			//ele.click();
			Actions Mouseaction = new Actions(webdriver);
			//WebElement Mh = webdriver.findElement(ele);
			Mouseaction.moveToElement(ele).build().perform();
			Thread.sleep(2000);
			webdriver.findElement(By.xpath(LogOut)).click();
			Thread.sleep(2000);
		}

	}

}
