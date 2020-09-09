package TestCases;

import org.testng.annotations.Test;

import pageaction.HomepageActions;
import pageaction.LoginPageActions;
import pageaction.UserManagementAction;
import util.WiniumDriverHelper;

public class UserManagement extends WiniumDriverHelper {

	UserManagementAction usermanagementaction=null;
	LoginPageActions loginpageactions=null;
	HomepageActions homepageactions=null;

	//LoginSuccessfull
	@Test(priority=0)
	public void login() throws Throwable
	{
		loginpageactions=new LoginPageActions();
		homepageactions=new HomepageActions();


		//loginpageactions.EnterCreds();
		loginpageactions.SelectRole();
		loginpageactions.clickOk();
		Thread.sleep(5000);

	}

	//Create Profile
	@Test(priority=1)
	public void CreateProfile() throws Throwable
	{
		usermanagementaction=new UserManagementAction();
		usermanagementaction.openAdministration();
		usermanagementaction.clickonProfile();
		usermanagementaction.clickonNewProfile();
		//usermanagementaction.enterProfileDescription();
		usermanagementaction.selectprofileAccess();
		
	}
}
