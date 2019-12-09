package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void test1() throws Exception {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\saitejamamidi\\Desktop\\Sai Teja\\Selenium Practice\\SW\\geckodriver-v0.24.0-win64\\geckodriver.exe" );
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("mamidisrisaiteja@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("srisai123");
	Thread.sleep(2000);
	driver.findElement(By.id("u_0_b")).click();

}
}
