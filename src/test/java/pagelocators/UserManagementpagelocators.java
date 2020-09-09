package pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import util.WiniumDriverHelper;

/**
 *
 * This test class works as object repository class of all User management locator.
 *
 * @author swghosh
 */


public class UserManagementpagelocators extends WiniumDriverHelper {

	public UserManagementpagelocators() {
		PageFactory.initElements(winiumdriver, this);
	}

	/* General Locators */
	@FindBy(how = How.NAME, using = "User")
	public WebElement Usertab;

	@FindBy(how = How.NAME, using = "Groups")
	public WebElement Groupstab;

	@FindBy(how = How.NAME, using = "Profiles")
	public WebElement Profilestab;

	@FindBy(how = How.NAME, using = "Access rights")
	public WebElement Accessrightstab;

	@FindBy(how = How.ID, using = "5961")
	public WebElement New;

	@FindBy(how = How.ID, using = "5953")
	public WebElement Edit;

	@FindBy(how = How.ID, using = "5957")
	public WebElement Delete;

	@FindBy(how = How.ID, using = "5972")
	public WebElement Security;

	@FindBy(how=How.NAME,using="Close")
	public WebElement closebuttonusermanagement;
    @FindBy(how=How.NAME,using="Options...")
    public WebElement optionsbutton;
    @FindBy(how=How.NAME,using="Report...")
    public WebElement Report;
    @FindBy(how=How.NAME,using="Synchronize...")
    public WebElement Synchronize;
    @FindBy(how=How.NAME,using="Export...")
    public WebElement Export;
    @FindBy(how=How.NAME,using="Import...")
    public WebElement ImportUM;
    @FindBy(how=How.NAME,using="User Manager")
    public WebElement Usermanager;
    @FindBy(how=How.NAME,using="Clients")
    public WebElement client;




	/*------------------------------------------------------------------Profile Section Locator---------------------------------------------------------------------------------- */

	@FindBy(how = How.NAME, using = "Name:")
	public WebElement EnterProfileName;

	@FindBy(how = How.ID, using = "109")
	public WebElement EnterProfileDescription;

	@FindBy(how = How.ID, using = "1")
	public WebElement EnterProfileDescriptionokbutton;

	@FindBy(how = How.NAME, using = "Access")
	public WebElement ProfileAccess;

	@FindBy(how = How.ID, using = "112")
	public WebElement Import;

	@FindBy(how = How.ID, using = "113")
	public WebElement indexing;

	@FindBy(how = How.ID, using = "114")
	public WebElement Query;

	@FindBy(how = How.ID, using = "115")
	public WebElement Display;

	@FindBy(how = How.ID, using = "1")
	public WebElement Profilepropertiesokbutton;

	@FindBy(how = How.ID, using = "6")
	public WebElement ProfileDeleteYesbutton;

	/*---------------------------------------------------------------------Groups Section Locator -------------------------------------------------------------------------------------------------*/
	@FindBy(how = How.ID, using = "107")
	public WebElement GroupName;

	@FindBy(how = How.ID, using = "108")
	public WebElement Fullname;

	@FindBy(how = How.ID, using = "109")
	public WebElement GroupDescription;

	@FindBy(how = How.ID, using = "104")
	public WebElement GroupUnderProfile;

	/*----------------------------------------------------------------------User Section Locator------------------------------------------------------------------------------------------------ */
	@FindBy(how = How.ID, using = "107")
	public WebElement username;

	@FindBy(how = How.ID, using = "108")
	public WebElement Fullnameuser;

	@FindBy(how = How.ID, using = "109")
	public WebElement userDescription;

	@FindBy(how = How.ID, using = "110")
	public WebElement password;

	@FindBy(how = How.ID, using = "112")
	public WebElement confirmpassword;

	/*----------------------------------------------------------------------ACL Section-----------------------------------------------------------------------------------------------------------------*/

	@FindBy(how = How.ID, using ="119")
	public WebElement aclname;

	@FindBy(how = How.ID, using ="121")
	public WebElement description;

	@FindBy(how = How.ID, using ="117")
	public WebElement profile;
	@FindBy(how = How.ID, using ="114")
	public WebElement rightsection;

	@FindBy(how = How.ID, using ="129")
	public WebElement allowsubstitute;

	@FindBy(how = How.ID, using ="133")
	public WebElement acledit;

	@FindBy(how = How.ID, using ="132")
	public WebElement select;

	@FindBy(how = How.ID, using ="2")
	public WebElement cancel;
}
