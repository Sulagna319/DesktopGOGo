package stepdef;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageaction.HomepageActions;

/**
 *
 * This test class works as Step Definition class of corresponding feature related to Homepage  Functionality.
 *
 * @author swghosh
 */

public class DesktopHomepagestepdef {

	public HomepageActions homepageactions;


	public DesktopHomepagestepdef() {
		homepageactions = new HomepageActions();

	}


	@Then("^User will sign on to the application$")
	public void User_will_sign_on_to_the_application() throws Throwable {

		homepageactions.Homepagevalidation();
	}

	@Given("^User is on the Saperion Homepage$")
	public void user_is_on_the_Saperion_Homepage() throws Throwable {

		homepageactions.designbuttonvalidation();

	}

	@When("^User Click on design button$")
	public void user_Click_on_design_button() throws Throwable {

		homepageactions.designbuttonClick();

	}

	@When("^User Click on create button$")
	public void user_Click_on_create_button() throws Throwable {

		homepageactions.createbuttonClick();

	}

	@Then("^User Click on Ok button$")
	public void user_Click_on_Ok_button() throws Throwable {

		homepageactions.okbuttonClick();

	}

	@Then("^User click on new column section$")
	public void user_click_on_new_column_section() throws Throwable {

		homepageactions.indexcolumnClick();

	}

	@Then("^User Click on New section$")
	public void user_Click_on_New_section() throws Throwable {

		homepageactions.newbuttonClick();

	}

	@Then("^User Enter Index field name \"([^\"]*)\"$")
	public void user_Enter_Index_field_name(String indexfieldname) throws Throwable {

		homepageactions.enterindexName(indexfieldname);

	}

	@Then("^User Choose the datatype of that index field$")
	public void user_Choose_the_datatype_of_that_index_field() throws Throwable {

		homepageactions.chooseDatatypeIndexfield();
		homepageactions.chooseDatatypeAsInteger();

	}

	@Then("^User Enter the name of the Index table \"([^\"]*)\"$")
	public void user_Enter_the_name_of_the_Index_table(String indextablename) throws Throwable {

		homepageactions.indextableNameenter(indextablename);

	}

	@When("^User Click on Create Search form$")
	public void user_Click_on_Create_Search_form() throws Throwable {

		homepageactions.createsearchForm();
	}

	@When("^User Click Create button in form$")
	public void user_Click_Create_button_in_form() throws Throwable {

		homepageactions.createbuttonclicksearch();
	}

	@Then("^User click on Form button$")
	public void user_click_on_Form_button() throws Throwable {

		homepageactions.formbuttonClick();
	}

	@Then("^User click on Save button$")
	public void user_click_on_Save_button() throws Throwable {

		homepageactions.saveform();
	}

	@Then("^User Enter the Search form name \"([^\"]*)\"$")
	public void user_Enter_the_Search_form_name(String searchformname) throws Throwable {

		homepageactions.enterqueryformname(searchformname);
	}

	@And("^User Click on Create Index form$")
	public void user_Click_on_Create_Index_form() throws Throwable {
		homepageactions.createindexForm();

	}

	@Then("^User Enter the Index form name \"([^\"]*)\"$")
	public void user_Enter_the_Index_form_name(String indexformname) throws Throwable {
		homepageactions.enterindexformname(indexformname);
	}

	@When("^User right click on workspace pane and select create application$")
	public void user_right_click_on_workspace_pane() throws Throwable {
		homepageactions.createapplicationClick();
	}

	@When("^User Enter application Details applicationname \"([^\"]*)\" indexform \"([^\"]*)\" searchform \"([^\"]*)\"$")
	public void user_Enter_application_Details_applicationname_indexform_searchform(String applicationname, String indexformname, String searchformname) throws Throwable {

		homepageactions.enterapplicationDetails(applicationname, indexformname, searchformname);
	}

	@Then("^Validate index table created successfully of ddc name \"([^\"]*)\"$")
	public void validate_index_table_created_successfully_of_ddc_name(String ddcname) throws Throwable {
		homepageactions.validateIndextable(ddcname);
	}

	@When("^User choose Lookup table from Definition type dropdown$")
	public void User_choose_Lookup_table_from_Definition_type_dropdown() throws Throwable {
		homepageactions.clickLookupTable();
	}


	@Then("^User Enter the name of the Lookup table \"([^\"]*)\"$")
	public void user_Enter_the_name_of_the_Lookup_table(String Lookuptablename) throws Throwable {

		homepageactions.indextableNameenter(Lookuptablename);

	}

	@Then("^User Enter the Search form name for Lookup Table \"([^\"]*)\"$")
	public void user_Enter_the_Search_form_name_for_Lookup_Table(String LookupTablesearchformname) throws Throwable {

		homepageactions.enterqueryformname(LookupTablesearchformname);
	}


	@Then("^User Enter the Index form name for Lookup Table \"([^\"]*)\"$")
	public void user_Enter_the_Index_form_name_for_Lookup_Table(String LookupTableindexformname) throws Throwable {
		homepageactions.enterindexformname(LookupTableindexformname);
	}

	@When("^User Enter application Details applicationname for Lookup Table \"([^\"]*)\" searchform \"([^\"]*)\" indexform \"([^\"]*)\"$")
	public void user_Enter_application_Details_applicationname_indexform_searchform_for_Lookup_Table(String applicationname, String LookupTablesearchformname, String LookupTableindexformname) throws Throwable {

		homepageactions.enterapplicationDetails(applicationname, LookupTablesearchformname, LookupTableindexformname);
	}


	@Then("^enter Lookup Table information applicationname \"([^\"]*)\" searchform \"([^\"]*)\"$")
	public void enter_Lookup_Table_information(String appname, String searchform) throws Throwable {
		homepageactions.addLookupToIndexTable(appname, searchform);
		homepageactions.chooseMainFieldasId();
	}


}