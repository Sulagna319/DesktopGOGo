package TestCases;






import org.testng.annotations.Test;

import pageaction.HomepageActions;
import pageaction.LoginPageActions;
import util.WiniumDriverHelper;


public class SaperionRichClient extends WiniumDriverHelper {
	
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
	
	
	//HomePageValidation
	@Test(priority=1)
	public void homepagevalidation() throws Throwable
	{
		
		homepageactions.Homepagevalidation();
		
	}
	
	//Create Index Table
	@Test(enabled=false)
	public void createindextable() throws Throwable
	{
		homepageactions.designbuttonClick();
		homepageactions.createbuttonClick();
		homepageactions.okbuttonClick();
		homepageactions.indexcolumnClick();
		homepageactions.newbuttonClick();
		//homepageactions.enterindexName();
		homepageactions.okbuttonClick();
		homepageactions.okbuttonClick();
		//homepageactions.indextableNameenter();
		homepageactions.okbuttonClick();
	}
	
	
	//Create Query Form
	@Test(enabled=false)
	public void createqueryForm() throws Throwable
	{
		homepageactions.designbuttonClick();
        homepageactions.createsearchForm();
	    homepageactions.createbuttonclicksearch();
		homepageactions.formbuttonClick();
		homepageactions.saveform();
		//homepageactions.enterqueryformname();
		homepageactions.okbuttonClick();
		
	}
	
	//Create Index Form
	@Test(enabled=false)
	public void createindexform() throws Throwable
	{
		homepageactions.designbuttonClick();
		homepageactions.createindexForm();
		homepageactions.createbuttonclicksearch();
		homepageactions.formbuttonClick();
		homepageactions.saveform();
		//homepageactions.enterindexformname();
		homepageactions.okbuttonClick();
	}
	
	//Create DDC
	@Test(priority=3)
	public void createApplication() throws Throwable
	{
		
		homepageactions.createapplicationClick();
		//homepageactions.enterapplicationDetails();
		homepageactions.CreateapplicationOkbuttonClick();
	}
	
	
	
	
	
	
		
		
		
		
		
		
		
	}
	

	
	
	
	



