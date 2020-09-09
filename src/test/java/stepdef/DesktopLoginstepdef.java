package stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import pageaction.LoginPageActions;
import util.WiniumDriverHelper;

/**
 *
 * This test class works as Step Definition class of corresponding feature related to Login Functionality.
 *
 * @author swghosh
 */

public class DesktopLoginstepdef {

	LoginPageActions loginpageactions = new LoginPageActions();
	WiniumDriverHelper winiumDriverHelper = new WiniumDriverHelper();


	@Given("^User is in the Saperion Login page$")
	public void User_is_in_the_Saperion_Login_page() throws Throwable {

		winiumDriverHelper.configdriver();

	}

	@Given("^User on Saperion login page and give credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_on_Saperion_login_page_and_give_credentials_and(String username, String password)
			throws Throwable {

		loginpageactions.EnterCreds(username, password);
	}

	@When("^user select role$")
	public void user_select_role() throws Throwable {

		loginpageactions.SelectRole();

	}

	@When("^user click ok button$")
	public void user_click_ok_button() throws Throwable {

		loginpageactions.clickOk();
	}

	@And("^user select appropriate client$")
	public void user_select_appropriate_client() throws Throwable{
		loginpageactions.selectClient();
	}
}
