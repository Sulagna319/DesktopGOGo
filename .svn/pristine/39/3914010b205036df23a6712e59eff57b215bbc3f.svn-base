package stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.sikuli.script.FindFailed;
import pageaction.AnnotationPageActions;
import pageaction.HomepageActions;
import pageaction.LoginPageActions;
import pagelocators.AnnotationPagelocators;
import util.WiniumDriverHelper;

import java.lang.reflect.GenericDeclaration;

public class AnnotationStepDef {

    public HomepageActions homepageactions;
    LoginPageActions loginpageactions = new LoginPageActions();
    public AnnotationPageActions annotationpageaction;
    WiniumDriverHelper winiumDriverHelper = new WiniumDriverHelper();


    public AnnotationStepDef() {
        homepageactions = new HomepageActions();
        annotationpageaction = new AnnotationPageActions();
    }


    @When("^DDC named \"([^\"]*)\" is present in Homepage$")
    public void ddc_named_something_is_present_in_homepage(String ddc) throws Throwable {
        homepageactions.findDDC(ddc);
    }
    @Then("^User Click on Result button of the DDC present$")
    public void user_click_on_result_button_of_the_ddc_present() throws Throwable {
            annotationpageaction.clickResult();

    }
    @And("^Search for file in the ddc with name \"([^\"]*)\"$")
    public void search_for_jpg_file_in_the_ddc_with_name_something(String s) throws Throwable {
            homepageactions.findDocument(s);
    }

    @Then("^Click on the file and edit$")
    public void click_on_the_jpg_file_and_edit() throws Throwable {
        annotationpageaction.editJPG();
    }

    @Then("Click on stamp and select stamp")
    public void click_On_Stamp_And_Select_Stamp() throws FindFailed {
        annotationpageaction.selectStamp();

    }

    @And("^save file with change")
    public void save_file_with_change() throws Throwable {
        annotationpageaction.saveFile();

    }





    @Then("^Click on note mode and write \"([^\"]*)\" on note$")
    public void click_on_note_mode_and_write_something_on_note(String strArg1) throws Throwable {
         annotationpageaction.selectNoteMode(strArg1);
         }



    @Then("^Click on \"([^\"]*)\" degree rotation$")
    public void click_on_something_degree_rotation(String angle) throws Throwable {

        annotationpageaction.degreeRotation(angle);


    }

    @And("save the rotated file")
    public void saveTheRotatedFile()
    {
        annotationpageaction.saveFile();
    }


    @Then("^Right click on the \"([^\"]*)\" file$")
    public void right_click_on_the_something_file(String docc) throws Throwable {
        homepageactions.rightClick(docc);
        
    }



    @And("^Select option \"([^\"]*)\"$")
    public void select_option_something(String option) throws Throwable {
      homepageactions.selectOption(option);


    }

    @And("^Maximize,Edit document and write \"([^\"]*)\"$")
    public void maximizeedit_document_and_write_something(String text) throws Throwable {
        annotationpageaction.maximizePage(text);


    }

    @Then("Look for the checkout sign in the doc")
    public void lookForTheCheckoutSignInTheDoc()
    {
        homepageactions.checkoutSign();
    }


    @And("saved the file for checkout")
    public void saved_the_File_For_Checkout() throws FindFailed {
        annotationpageaction.saveCheckout();
    }

    @And("Checkin the document with checkout sign")
    public void checkin_The_Document_With_Checkout_Sign() throws InterruptedException, FindFailed {
        homepageactions.checkIn();
    }

    @And("^Close the windows for \"([^\"]*)\"$")
    public void close_the_windows_for_something(String option) throws Throwable {
        annotationpageaction.selectOptionCloseTab(option);

    }

    @When("^find \"([^\"]*)\" and search for doc named \"([^\"]*)\"$")
    public void find_something_and_search_for_doc_named_something(String ddcName, String sampleDoc) throws FindFailed, InterruptedException {
        homepageactions.findDDC(ddcName);
        Thread.sleep(3000);
        homepageactions.findDocument(sampleDoc);

    }

    @Then("^Switch user with id \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void switch_user_with_id_something_and_password_something(String idNew, String pwNew) throws InterruptedException, FindFailed {
        homepageactions.selectSwitchUser();
        loginpageactions.EnterCreds(idNew, pwNew);
        loginpageactions.SelectRole();
        loginpageactions.selectClient();
        loginpageactions.clickOk();

    }

    @Then("^Look for checkout indicator present for the \"([^\"]*)\"$")
    public void look_for_ckeckout_indicator_present_for_the_something(String sampDoc) {
        homepageactions.checkoutSign();

    }

    @Then("^The \"([^\"]*)\" doesnot have Delete option$")
    public void the_something_doesnot_have_delete_option(String sampDoc) throws InterruptedException, FindFailed {
        homepageactions.rightClick(sampDoc);
        homepageactions.validateDocCheckedOUt();
    }


    @And("^Try to update the \"([^\"]*)\"$")
    public void try_to_update_the_something(String samDoc) throws InterruptedException, FindFailed {
        homepageactions.rightClick(samDoc);
        annotationpageaction.maximizePage("hello checking");
    }


    @Then("^File cannot be saved with update$")
    public void file_cannot_be_saved_with_update() throws FindFailed, InterruptedException {
        annotationpageaction.trySaveFile();
    }
}
