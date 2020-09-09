package stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageaction.UserManagementAction;


/**
 *
 * This test class works as Step Definition class of corresponding feature related to User management Functionality.
 *
 * @author swghosh
 */

public class Usermanagementstepdef {

	UserManagementAction usermanagement = new UserManagementAction();

	@When("^User click Administration tab$")
	public void user_click_Administration_tab() throws Throwable {

		usermanagement.openAdministration();
	}

	@When("^User click Administration button$")
	public void user_click_Administration_button() throws Throwable {

		usermanagement.clickAdministrationbutton();
	}

	@When("^User click on profiles tab$")
	public void user_click_on_profiles_tab() throws Throwable {

		usermanagement.clickonProfile();
	}

	@Then("^User Click on NEW button$")
	public void user_Click_on_NEW_button() throws Throwable {

		usermanagement.clickonNewProfile();
	}

	@Then("^User Give profile description \"([^\"]*)\"$")
	public void user_Give_profile_description(String prf1) throws Throwable {
		usermanagement.enterProfileDescription(prf1);
	}

	@Then("^User select definite access list$")
	public void user_select_definite_access_list() throws Throwable {

		usermanagement.selectprofileAccess();
	}

	@Then("^User will check for the profile he wants to delete$")
	public void user_will_check_for_the_profile_he_wants_to_delete() throws Throwable {

		usermanagement.checkprofilename();
	}

	@And("^User click yes on deletePopup$")
	public void User_click_yes_on_deletePopup() throws Throwable {
		usermanagement.clickyesybuttondeletepopup();
	}

	@Then("^User select that perticular User$")
	public void user_select_that_perticular_User() throws Throwable {

		usermanagement.selectprofilename();
	}

	@Then("^User Click on delete button$")
	public void user_Click_on_delete_button() throws Throwable {

		usermanagement.deletebuttonclick();
	}

	@Then("^Profile should be deleted$")
	public void profile_should_be_deleted() throws Throwable {
		usermanagement.deletedprofilecheck();
	}

	@And("^User Click Edit button$")
	public void User_Click_Edit_button() throws Throwable {
		usermanagement.clickEditButton();
	}

	@When("^User click on Groups tab$")
	public void user_click_on_Groups_tab() throws Throwable {

		usermanagement.clickGroupButtton();
	}

	@Then("^User Give Group description \"([^\"]*)\"$")
	public void user_Give_Group_description(String grpname) throws Throwable {
		usermanagement.entergroupdescription(grpname);
	}

	@Then("^User Select Profile name$")
	public void user_Select_Profile_name() throws Throwable {
		usermanagement.selectprofileforgroup();
	}

	@When("^User click on User tab$")
	public void user_click_on_User_tab() throws Throwable {
		usermanagement.clickuserTab();
	}

	@Then("^User Give User description \"([^\"]*)\"$")
	public void user_Give_User_description(String username) throws Throwable {
        usermanagement.giveUserDescription(username);
	}

	@Then("^User Select Group name \"([^\"]*)\"$$")
	public void user_Select_Group_name(String Groupname) throws Throwable {

	}

	@When("^User select group to be deleted$")
	public void user_select_group_to_be_deleted() throws Throwable {

		usermanagement.selectgroupfordeletion();
	}

	@Then("^Group should be deleted$")
	public void group_should_be_deleted() throws Throwable {

		usermanagement.deletegroupcheck();
	}

	@When("^User select a group for edit$")
	public void user_select_a_group_for_edit() throws Throwable {

		usermanagement.selectgroupforedit();
	}

	@When("^user give group new name$")
	public void user_give_group_new_name() throws Throwable {

		usermanagement.givenewgroupname();

	}

	@Then("^group should be edited successfully$")
	public void group_should_be_edited_successfully() throws Throwable {

		usermanagement.groupeditsuccessfull();
	}

	@And("^User Close the Usermanagement Section$")
	public void User_Close_the_Usermanagement_Section() throws Throwable
	{
		usermanagement.clickCloseButton();

	}
	@Then("^User Should able to see all the buttons$")
    public void User_should_able_to_see_all_the_buttons() throws Throwable
    {

        usermanagement.allButtonsDisplayed();

    }

    @Then("^User should able to see Usermanager Window$")
	public void User_should_able_to_see_Usermanager_Window() throws Throwable{

		usermanagement.usermanagerwindow();
	}
	@Then("^User should able to all the tab$")
	public void User_should_able_to_all_the_tab() throws Throwable{

		usermanagement.tabValidation();
	}
	@When("^User Click on Access Right tabs$")
	public void User_Click_on_Access_Right_tabs() throws Throwable{

		usermanagement.clickAccessRight();
	}
	@Then("^User should able to see all the element$")
	public void user_should_able_to_see_all_the_element() throws Throwable{

		usermanagement.aclGuiTest();
	}




}
