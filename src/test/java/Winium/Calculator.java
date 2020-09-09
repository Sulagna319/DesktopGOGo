package Winium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

public class Calculator {

	@Test
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		// TODO Auto-generated method stub
		
		DesktopOptions options=new DesktopOptions();
		options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		WiniumDriver winiumdriver=new WiniumDriver(new URL("http://localhost:9999"), options);
		winiumdriver.findElement(By.id("num2Button")).click();
		winiumdriver.findElement(By.id("num2Button")).click();
		winiumdriver.findElement(By.id("plusButton")).click();
		winiumdriver.findElement(By.id("num2Button")).click();
		winiumdriver.findElement(By.id("num2Button")).click();
		winiumdriver.findElement(By.id("equalButton")).click();
		Thread.sleep(3000);
		System.out.println(winiumdriver.findElement(By.id("CalculatorResults")).getAttribute("Name"));

	}

}
