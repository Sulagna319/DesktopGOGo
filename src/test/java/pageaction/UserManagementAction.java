package pageaction;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.sikuli.script.*;

import org.testng.Assert;
import pagelocators.SaperionHomepagelocator;
import pagelocators.UserManagementpagelocators;

/**
 *
 * This test class works as Action class of corresponding behaviour related to Usermanagement Page.
 *
 * @author swghosh
 */

public class UserManagementAction {

	UserManagementpagelocators usermangementlocator ;
	SaperionHomepagelocator homepagelocator;

	public UserManagementAction()
	{
		 usermangementlocator=new UserManagementpagelocators();
	}

	public void openAdministration() throws ElementNotVisibleException {
		homepagelocator = new SaperionHomepagelocator();
		homepagelocator.Administration.click();

	}

	public void clickAdministrationbutton() throws ElementNotVisibleException {
		homepagelocator.administrationbutton.click();
		//usermangementlocator = new UserManagementpagelocators();

	}

	public void clickonProfile() throws ElementNotVisibleException

	{

		usermangementlocator.Profilestab.click();

	}

	public void clickonNewProfile() throws ElementNotVisibleException {
		UserManagementpagelocators usermangementlocator=new UserManagementpagelocators();
		usermangementlocator.New.click();
	}

	public void enterProfileDescription(String Profilename) throws ElementNotVisibleException {
		usermangementlocator.EnterProfileName.sendKeys(Profilename);
		usermangementlocator.EnterProfileDescription.sendKeys(Profilename);
	}

	public void selectprofileAccess() throws ElementNotVisibleException {

		usermangementlocator.ProfileAccess.click();
		usermangementlocator.Import.click();
	}

	public void clickokButton() throws ElementNotVisibleException {
		usermangementlocator.Profilepropertiesokbutton.click();
	}

	public void checkprofilename() throws SikuliException {
		Screen screen = new Screen();
		Match profilename = screen.exists(
				"src/test/resource/Images/Profilename_Delete.PNG");
		assertTrue(profilename != null);
	}

	public void deletedprofilecheck() throws SikuliException {
		Screen screen = new Screen();
		Match profilename = screen.exists(
				"src/test/resource/Images/Profilename_Delete.PNG");
		assertFalse(profilename != null);
	}

	public void selectprofilename() throws SikuliException {
		Screen screen = new Screen();
		Pattern profilename = new Pattern(
				"src/test/resource/Images/Profilename_Delete.PNG");
		screen.wait(profilename, 3000);
		screen.click(profilename);
	}

	public void clickyesybuttondeletepopup() throws ElementNotVisibleException {

		usermangementlocator.ProfileDeleteYesbutton.click();
	}

	public void deletebuttonclick() throws ElementNotVisibleException {
		usermangementlocator.Delete.click();

	}

	public void clickEditButton() throws ElementNotVisibleException {

		usermangementlocator.Edit.click();
	}

	public void clickGroupButtton() throws ElementNotVisibleException {
		usermangementlocator = new UserManagementpagelocators();
		usermangementlocator.Groupstab.click();
	}

	public void entergroupdescription(String grpname) throws ElementNotVisibleException {
		usermangementlocator.GroupName.sendKeys(grpname);
		usermangementlocator.Fullname.sendKeys(grpname);
		usermangementlocator.GroupDescription.sendKeys(grpname);

	}

	public void selectprofileforgroup() throws SikuliException, ElementNotVisibleException {
		usermangementlocator.GroupUnderProfile.click();
		Screen screen = new Screen();
		Pattern selectprofilenameforgroup = new Pattern(
				"src/test/resource/Images/groupunderprofile.png");
		screen.wait(selectprofilenameforgroup, 3000);
		screen.click(selectprofilenameforgroup);
	}

	public void selectgroupfordeletion() throws SikuliException {
		Screen screen = new Screen();
		Pattern selectgroupfordeletion = new Pattern(
				"src/test/resource/Images/groupnamedeleted.png");
		screen.wait(selectgroupfordeletion, 3000);
		screen.click(selectgroupfordeletion);
	}

	public void deletegroupcheck() throws SikuliException {
		Screen screen = new Screen();
		Match selectgroupfordeletion = screen.exists(
				"src/test/resource/Images/groupnamedeleted.png");
		assertFalse(selectgroupfordeletion != null);
	}

	public void selectgroupforedit() throws SikuliException {
		Screen screen = new Screen();
		Pattern selectgroupedit = new Pattern(
				"src/test/resource/Images/groupeditselect.png");
		screen.wait(selectgroupedit, 3000);
		screen.click(selectgroupedit);

	}

	public void givenewgroupname() throws ElementNotVisibleException {
		usermangementlocator.Fullname.sendKeys("groupedit1");
		usermangementlocator.GroupDescription.sendKeys("groupedit1");
	}

	public void groupeditsuccessfull() throws SikuliException {
		Screen screen = new Screen();
		Match groupeditsuccessfull = screen.exists(
				"src/test/resource/Images/groupeditsuccessfull.png");
		assertFalse(groupeditsuccessfull != null);
	}

	public void clickuserTab() throws ElementNotVisibleException,InterruptedException {

		Thread.sleep(3000);
		Assert.assertTrue(usermangementlocator.Usertab.isDisplayed());
		usermangementlocator.Usertab.click();
	}

	public void giveUserDescription(String User) throws ElementNotVisibleException, TimeoutException,InterruptedException {
		UserManagementpagelocators usermangementlocator=new UserManagementpagelocators();
		usermangementlocator.username.sendKeys(User);
		Thread.sleep(5000);
		usermangementlocator.Fullnameuser.sendKeys(User);
		usermangementlocator.userDescription.sendKeys("NewUser");
		usermangementlocator.password.sendKeys("qa");
		usermangementlocator.confirmpassword.sendKeys("qa");
	}

	public void selectGroupforUser(String groupforuser) throws ElementNotVisibleException
	{


	}

	public void clickCloseButton() throws ElementNotVisibleException, FindFailed {
		Screen screen=new Screen();
		Pattern p1=new Pattern("src/test/resource/Images/ClosebuttonUsermanagement.PNG");
		screen.wait(p1,2000);
		screen.click(p1);


	}

	public void allButtonsDisplayed() throws NoSuchFieldException{
		usermangementlocator = new UserManagementpagelocators();
		boolean result= usermangementlocator.optionsbutton.isDisplayed()&&usermangementlocator.Synchronize.isDisplayed()&&usermangementlocator.Report.isDisplayed()&&usermangementlocator.Export.isDisplayed()&&usermangementlocator.ImportUM.isDisplayed();
		Assert.assertTrue(result);

	}

	public void usermanagerwindow() throws NoSuchElementException{
		usermangementlocator = new UserManagementpagelocators();
		Assert.assertTrue(usermangementlocator.Usermanager.isDisplayed());
	}

	public void tabValidation() throws NoSuchElementException{
        usermangementlocator = new UserManagementpagelocators();
        Assert.assertTrue(usermangementlocator.Usertab.isDisplayed()&& usermangementlocator.Accessrightstab.isDisplayed() && usermangementlocator.Groupstab.isDisplayed() && usermangementlocator.Profilestab.isDisplayed() && usermangementlocator.client.isDisplayed());

    }

    public void clickAccessRight() throws NoSuchElementException{
		usermangementlocator=new UserManagementpagelocators();
		usermangementlocator.Accessrightstab.click();

	}

	public void aclGuiTest() throws NoSuchElementException{
		usermangementlocator=new UserManagementpagelocators();

		Assert.assertTrue(usermangementlocator.aclname.isDisplayed()&&usermangementlocator.description.isDisplayed()&&usermangementlocator.profile.isDisplayed()&&usermangementlocator.rightsection.isDisplayed()&&usermangementlocator.allowsubstitute.isDisplayed()&&usermangementlocator.acledit.isDisplayed()&&usermangementlocator.select.isDisplayed());
		usermangementlocator.cancel.click();
	}


}
