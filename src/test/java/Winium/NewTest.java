package Winium;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import java.net.URL;



import org.openqa.selenium.By;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;


import winium.elements.desktop.ComboBox;

public class NewTest {
 @Test(priority=0)
  public void login() throws InterruptedException, IOException
  {
	  
	  DesktopOptions options=new DesktopOptions();
	  options.setApplicationPath("C:\\Program Files (x86)\\SAPERION\\archie32.exe");
		
		WiniumDriver winiumdriver=new WiniumDriver(new URL("http://localhost:9999"), options);

		

		winiumdriver.findElement(By.name("SAPERION Client - 1 running window")).click();
		winiumdriver.findElement(By.id("107")).sendKeys("administrator");
		winiumdriver.findElement(By.id("110")).sendKeys("qa");
		ComboBox combobox=new ComboBox(winiumdriver.findElement(By.id("102")));
		combobox.expand();
		winiumdriver.findElement(By.name("Universal/Administration")).click();
		winiumdriver.findElement(By.id("1")).click();
		System.out.println("PASSED");
		Thread.sleep(5000);
		winiumdriver.findElement(By.name("Administration")).click();
		winiumdriver.findElement(By.name("Administration...")).click();
		winiumdriver.findElement(By.name("Profiles")).click();
		
		
		//siquli script
		/*Screen screen=new Screen();
		Pattern ddcname=new Pattern("C:\\Users\\swaghosh\\eclipse-workspace\\Desktop\\src\\test\\resource\\Images\\DDCNAME.PNG");
		Pattern designbutton=new Pattern("C:\\Users\\swaghosh\\eclipse-workspace\\Desktop\\src\\test\\resource\\Images\\Designbutton.PNG");
		screen.wait(ddcname,2000);
		screen.click(ddcname);
		screen.wait(designbutton,5000);
		screen.click(designbutton);
		winiumdriver.findElement(By.name("Create Search Form...")).click();
		Pattern closebutton=new Pattern("C:\\Users\\swaghosh\\eclipse-workspace\\Desktop\\src\\test\\resource\\Images\\crossbuttonForm.PNG");
		screen.wait(closebutton,5000);
		screen.click(closebutton);
		System.out.println("PASSED");
		
		
		
		/*File screenshotFile = ((TakesScreenshot)winiumdriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\swaghosh\\eclipse-workspace\\Desktop\\Screenshot\\screen.png"));
		winiumdriver.findElement(By.id("1")).click();
		Thread.sleep(10000);
		System.out.println(winiumdriver.findElement(By.name("SAPERION")).isDisplayed());
		Thread.sleep(5000);
		winiumdriver.findElement(By.id("Close")).click();
		winiumdriver.findElement(By.name("Yes")).click();*/
		
		
  }
 @Test(priority=1)
 public void imagevalidation()
 {
	 Screen screen=new Screen();
	 Match image1=screen.exists("C:\\Users\\swaghosh\\eclipse-workspace\\Desktop\\src\\test\\resource\\Images\\Profilename.PNG");
	 assertTrue(image1 !=null);
 }
  
}
