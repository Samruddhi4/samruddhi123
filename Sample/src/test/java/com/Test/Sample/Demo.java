package com.Test.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Software\\geckodriver_v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new  FirefoxDriver();
	}
}
