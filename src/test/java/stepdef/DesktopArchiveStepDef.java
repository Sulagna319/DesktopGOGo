package stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageaction.ArchivePageActions;
import pageaction.HomepageActions;
import pagelocators.SaperionHomepagelocator;

/**
 *
 * This test class works as Step Definition class of corresponding feature related to Archive Functionality.
 *
 * @author swghosh
 */

public class DesktopArchiveStepDef {


    public  HomepageActions homepageActions;
    public ArchivePageActions archivePageActions;

    public DesktopArchiveStepDef() {
        homepageActions = new HomepageActions();
        archivePageActions =new ArchivePageActions();
    }


    @Then("^User Click on the import button$")
    public void user_Click_on_the_import_button() throws Throwable {

        homepageActions.clickimportButton();

    }

    @When("^User click on Load files option$")
    public void user_click_on_Load_files_option() throws Throwable {

        homepageActions.clickloadFiles();
    }

    @When("^User choose files with filetype \"([^\"]*)\"$")
    public void user_choose_files_with_filename(String arg1) throws Throwable {

        archivePageActions.chooseFile(arg1);

    }

    @Then("^Document should be loaded successfully$")
    public void document_should_be_loaded_successfully() throws Throwable {
        archivePageActions.documentLoaded();
    }


    @When("^User Order the Document$")
    public void user_Order_the_Document() throws Throwable {
        archivePageActions.documentOrder();
    }

    @Given("^Document Should be order Successfully$")
    public void document_Should_be_order_Successfully() throws Throwable {

       archivePageActions.documentOrderedSuccessfully();
    }

    @When("^User move the document to the DDC$")
    public void user_move_the_document_to_the_DDC() throws Throwable {
        archivePageActions.dragDropImages();
    }

    @When("^User Enter the index id \"([^\"]*)\"$")
    public void user_Enter_the_index_id(String index) throws Throwable {
        archivePageActions.indexingData(index);

    }

    @When("^User Click on Result button of the DDC$")
    public void user_Click_on_Result_button_of_the_DDC() throws Throwable {

        archivePageActions.resultButtonclick();
    }

    @Then("^Document Should be Archived and present in the Result section$")
    public void document_Should_be_Archived_and_present_in_the_Result_section() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^User click on the application$")
    public void User_click_on_the_application() throws Throwable{
        archivePageActions.clickApplication();
    }

    @And("^User Click on documents button$")
    public void User_Click_on_documents_button() throws Throwable{
        archivePageActions.clickDocumentsButton();
    }

    @Then("^User will able to see the Document tray$")
    public void user_will_able_to_see_the_Document_tray() throws Throwable{
        archivePageActions.checkDocumentHeader();
    }
}
