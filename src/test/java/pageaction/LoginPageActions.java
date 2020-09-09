package pageaction;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;

import pagelocators.LoginPageLocators;
import util.WiniumDriverHelper;
import winium.elements.desktop.ComboBox;

/**
 *
 * This test class works as Action class of corresponding behaviour related to Login Page.
 *
 * @author swghosh
 */

public class LoginPageActions {
	LoginPageLocators loginpage = null;



	public void EnterCreds(String user, String pwd) throws ElementNotVisibleException,InterruptedException {
		Thread.sleep(5000);
		loginpage = new LoginPageLocators();
		loginpage.openclient.click();
		loginpage.User.sendKeys(user);
		loginpage.Password.sendKeys(pwd);
	}

	public void SelectRole() throws ElementNotVisibleException {
		ComboBox selectdropdown = new ComboBox(WiniumDriverHelper.winiumdriver.findElement(By.id("102")));
		selectdropdown.expand();
		loginpage.selectrole.click();

	}

	public void clickOk() throws ElementNotVisibleException {
		loginpage = new LoginPageLocators();
		loginpage.okbutton.click();
	}

	public void selectClient()  throws ElementNotVisibleException{
		loginpage=new LoginPageLocators();
		if(loginpage.client.isDisplayed()) {
			loginpage.client.sendKeys("system");
			System.out.println("Logging in multi tenant System");
		}
		else {

			System.out.println("Logging in Single tenant System");
		}
	}

}
