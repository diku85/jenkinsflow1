package com.qa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testcases {

	WebDriver driver;

	@BeforeClass
	public void init() {
		driver = new ChromeDriver();
	}

	@Test
	public void TC1() {
		driver.get("https://classic.freecrm.com/index.html");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));
		System.out.println(driver.getCurrentUrl());
		System.out.println("Adding code");
	}

	@Test
	public void TC2() {
		driver.get("https://classic.freecrm.com/index.html");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']")));
		System.out.println(driver.getTitle());
		driver.close();
	}

}
