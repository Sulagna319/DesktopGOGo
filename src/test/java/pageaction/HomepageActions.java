package pageaction;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.*;
import org.testng.Assert;

import pagelocators.AnnotationPagelocators;
import pagelocators.SaperionHomepagelocator;
import util.WiniumDriverHelper;

import static org.testng.Assert.assertNotNull;


/**
 *
 * This test class works as Action class of corresponding behaviour related to Saperion homepage.
 *
 * @author swghosh
 */

public class HomepageActions {

	SaperionHomepagelocator saperionHomepagelocator;
	AnnotationPagelocators annotationpagelocators;

	public void Homepagevalidation() throws InterruptedException {
		saperionHomepagelocator = new SaperionHomepagelocator();
		Thread.sleep(10000);
		boolean flag = saperionHomepagelocator.Saperionsymbol.isDisplayed();
		System.out.println(flag);
		Assert.assertEquals(flag, true);
	}

	public void designbuttonvalidation() {
		saperionHomepagelocator = new SaperionHomepagelocator();
		Assert.assertEquals(saperionHomepagelocator.Designbutton.isDisplayed(), true);

	}

	public void chooseDatatypeIndexfield() {

		saperionHomepagelocator.choosedatatype.click();
	}

	public void chooseDatatypeAsInteger() throws SikuliException {
		Screen screen = new Screen();
		Pattern integer = new Pattern(
				"src/test/resource/Images/Integer_1.png");
		screen.wait(integer, 3000);
		screen.click(integer);
	}

	public void designbuttonClick() {

		saperionHomepagelocator.Designbutton.click();
	}



	public void createbuttonClick() {
		saperionHomepagelocator.createbutton.click();

	}

	public void okbuttonClick() throws InterruptedException{
		saperionHomepagelocator.DefinitionTypeOKbutton.click();
		Thread.sleep(3000);
	}

	public void indexcolumnClick() {
		saperionHomepagelocator.indexcolumns.click();

	}

	public void startButtonClick() {
		saperionHomepagelocator.startbutton.click();
	}

	public void newbuttonClick() {
		saperionHomepagelocator.NewButton.click();

	}

	public void enterindexName(String fieldname) {
		saperionHomepagelocator.NamefieldEdit.sendKeys(fieldname);
	}

	public void indextableNameenter(String tablename) {
		saperionHomepagelocator.fileName.sendKeys(tablename);
	}

	public void createsearchForm() {

		saperionHomepagelocator.CreateSearchForm.click();

	}

	public void createindexForm() {
		saperionHomepagelocator.CreateIndexForm.click();
	}

	public void createbuttonclicksearch() {
		saperionHomepagelocator.createbuttonsearch.click();
	}

	public void saveform() {
		saperionHomepagelocator.saveasform.click();
	}

	public void enterqueryformname(String searchform) {
		saperionHomepagelocator.fileName.sendKeys(searchform);
	}

	public void enterindexformname(String indexform) {
		saperionHomepagelocator.fileName.sendKeys(indexform);
	}

	public void formbuttonClick() {
		saperionHomepagelocator.formbuttonsearch.click();
	}

	public void workspaceclick() {
		saperionHomepagelocator.workspacebutton.click();

	}

	public void createapplicationClick() throws FindFailed {
		Screen screen = new Screen();
		Pattern pattern = new Pattern(
				"src/test/resource/Images/WorkspaceButton.PNG");
		screen.rightClick(pattern);

		Pattern createappli = new Pattern(
				"src/test/resource/Images/CreateApplicationButton.png");
		screen.wait(createappli, 2000);
		screen.click();

	}

	public void enterapplicationDetails(String appname, String indexform, String searchform) {
		saperionHomepagelocator.EditApplicationDescriptionfield.sendKeys(appname);

		saperionHomepagelocator.searchQueryForm.click();
		saperionHomepagelocator.fileName.sendKeys(searchform);
		saperionHomepagelocator.okbuttonindex.click();
		saperionHomepagelocator.searchIndexForm.click();
		saperionHomepagelocator.fileName.sendKeys(indexform);
		saperionHomepagelocator.okbuttonindex.click();

	}

	public void CreateapplicationOkbuttonClick() {

		saperionHomepagelocator.okbuttonEditapplication.click();
	}

	public void clickimportButton() {
		saperionHomepagelocator = new SaperionHomepagelocator();
		saperionHomepagelocator.importbutton.click();
	}

	public void clickloadFiles() {

		saperionHomepagelocator.loadfiles.click();
	}

	public void validateIndextable(String ddcname) throws InterruptedException{
		saperionHomepagelocator.loadbutton.click();

		saperionHomepagelocator.fileName.sendKeys(ddcname);
		saperionHomepagelocator.okbuttonindex.click();
		Thread.sleep(5000);
		Assert.assertTrue(saperionHomepagelocator.newwindow.isDisplayed());
	}

	public void clickLookupTable()
	{
		//ComboBox definitionType=new ComboBox(saperionHomepagelocator.DefinitionType);
		saperionHomepagelocator.DefinitionType.click();
		//definitionType.expand();
		saperionHomepagelocator.LookupTable.click();

	}

	public void clickResult()
	{

		saperionHomepagelocator.clickResult.click();
	}

	public void resultPaneRightClick()
	{
		Actions actions=new Actions(WiniumDriverHelper.winiumdriver);
		actions.contextClick(saperionHomepagelocator.resultpane).build().perform();
		saperionHomepagelocator.resultpaneNew.click();
	}

	public void newLookupResult()
	{
		saperionHomepagelocator.resultpaneEdit.click();
	}

	public void EditLookupResult()
	{
		saperionHomepagelocator.resultpaneEdit.click();
	}

	public void enterLookupValueName()
	{
		saperionHomepagelocator.enterLookupValueName.sendKeys("one");
	}

	public void addLookupToIndexTable(String appname, String searchform)
	{
		saperionHomepagelocator.addLookupToIndexTable.click();
		saperionHomepagelocator.searchLookupName.click();
		saperionHomepagelocator.enterLookupName.sendKeys(appname);
		saperionHomepagelocator.okbuttonindex.click();
		saperionHomepagelocator.searchLookupForm.click();
		saperionHomepagelocator.enterLookupName.sendKeys(searchform);
		saperionHomepagelocator.okbuttonindex.click();
		saperionHomepagelocator.addLookupMainField.click();

// WiniumDriverHelper.winiumdriver.findElementByName(indexfieldname).click();

	}
	public void chooseMainFieldasId() throws SikuliException {
		Screen screen = new Screen();
		Pattern id = new Pattern(
				"C:\\Users\\pchatterjee\\Documents\\RichClient\\src\\test\\resource\\Images\\lookupfieldSelection.png");
		screen.wait(id, 3000);
		screen.click(id);
	}

	//	public void lookuptableNameenter()
//	{
//		saperionHomepagelocator.fileName.sendKeys("Lookup3");
//	}
//
//	public void enterlookupqueryformname()
//	{
//		saperionHomepagelocator.fileName.sendKeys("Lookup_q3");
//	}
//
//	public void enterlookupindexformname()
//	{
//		saperionHomepagelocator.fileName.sendKeys("Lookup_i3");
//	}
//
	public void Closedialoguebox()
	{
		saperionHomepagelocator.Closedialoguebox.click();

	}

	public void ClickFolderTab()
	{
		saperionHomepagelocator.folderTab.click();

	}
	public void ClickCreateApplication()
	{
		saperionHomepagelocator.createApplication.click();

	}

	//////////////////////////////////////////////////////////////////////////sulagna//////////////////
	public void findDDC(String ddcName) throws FindFailed {

		Screen screen=new Screen();
		Pattern ddc=new Pattern("src/test/resource/Images/DDC.PNG");
		screen.exists(ddc);
		screen.click(ddc);

	}
	public void findDocument(String name) throws FindFailed, InterruptedException {
		saperionHomepagelocator = new SaperionHomepagelocator();
		saperionHomepagelocator.ClearBox.click();
		Actions act = new Actions(WiniumDriverHelper.winiumdriver);
		act.moveToElement(saperionHomepagelocator.DDcNameField).doubleClick().build().perform();
		saperionHomepagelocator.DDcNameField.sendKeys(name);
		Thread.sleep(2000);
		saperionHomepagelocator.resultbutton.click();
		saperionHomepagelocator.ClearBox.click();

	}


	public void rightClick(String docc) throws FindFailed, InterruptedException {


		Screen screen = new Screen();
		{
			if (docc.equalsIgnoreCase("jpg")) {

				Pattern jpg = new Pattern("src/test/resource/Images/jpgImage.PNG");
				Pattern jpg2 = new Pattern("src/test/resource/Images/jpg_anno.PNG");
				Match jpg_match = screen.exists("src/test/resource/Images/jpgImage.PNG");
				Match jpg2_match = screen.exists("src/test/resource/Images/jpganno1.PNG");

				if (jpg_match != null) {
					screen.exists(jpg);
					screen.rightClick(jpg);

				} else if (jpg2_match != null) {
					screen.exists(jpg2);
					screen.rightClick(jpg2);
				}
			} else if (docc.equalsIgnoreCase("doc")) {
				Pattern docfie = new Pattern("src/test/resource/Images/docImage1.PNG");
				screen.exists(docfie);
				screen.rightClick(docfie);
			}


		}
	}
	public void selectOption(String op) throws InterruptedException {
		saperionHomepagelocator = new SaperionHomepagelocator();
		annotationpagelocators = new AnnotationPagelocators();
		Thread.sleep(3000);

		if (op.equalsIgnoreCase("Edit")) {

			saperionHomepagelocator.EditImage.click();
			assertNotNull(annotationpagelocators.EditTab);

		} else if (op.equalsIgnoreCase("View")) {

			saperionHomepagelocator.ViewImage.click();
			assertNotNull(annotationpagelocators.ViewTab);

		} else if (op.equalsIgnoreCase("Print")) {

			saperionHomepagelocator.PrintImage.click();
			assertNotNull(annotationpagelocators.PrintTab);

		} else if (op.equalsIgnoreCase("Save")) {

			saperionHomepagelocator.SaveImage.click();
			Thread.sleep(3000);
			assertNotNull(annotationpagelocators.SaveAsTab);

		} else if (op.equalsIgnoreCase("Index")) {

			saperionHomepagelocator.IndexImage.click();
			Thread.sleep(3000);
			Actions ac = new Actions(WiniumDriverHelper.winiumdriver);
			ac.moveToElement(annotationpagelocators.idUpdate).doubleClick().build().perform();
			annotationpagelocators.idUpdate.sendKeys("1122");

		} else if (op.equalsIgnoreCase("Delete")) {

			saperionHomepagelocator.DeleteImage.click();
			assertNotNull(annotationpagelocators.DeleteDialogueMsg);

		} else if (op.equalsIgnoreCase("Security")) {

			saperionHomepagelocator.SecurityImage.click();
			Thread.sleep(3000);
			assertNotNull(annotationpagelocators.SecurityTab);

		} else if (op.equalsIgnoreCase("CheckOut")) {

			saperionHomepagelocator.CheckOutImage.click();
		} else System.out.println("Your input is not valid");

	}



	public void checkoutSign() {
		Screen screen = new Screen();
		Pattern checkOutSign = new Pattern("src/test/resource/Images/Checkout_Sign.PNG");
		Match co = screen.exists(checkOutSign);
		assertNotNull(co);
		System.out.println("Document has been checked out Already");


	}

	public void checkIn() throws FindFailed, InterruptedException {
		saperionHomepagelocator = new SaperionHomepagelocator();
		annotationpagelocators = new AnnotationPagelocators();
		Screen screen = new Screen();
		Pattern checkOutSign = new Pattern("src/test/resource/Images/Checkout_Sign.PNG");
		Match co = screen.find(checkOutSign);
		if (co != null) {
			screen.rightClick(checkOutSign);
			Thread.sleep(2000);
			saperionHomepagelocator.CheckInDoc.click();
			annotationpagelocators.Comment.sendKeys("Document has been CHECKED - IN!!");
			annotationpagelocators.OKSave.click();

		}

	}

	public void selectSwitchUser() throws FindFailed {
		saperionHomepagelocator = new SaperionHomepagelocator();
		saperionHomepagelocator.saperion.click();
		Screen screen = new Screen();
		Pattern swUser = new Pattern("src/test/resource/Images/SwitchUser.PNG");
		screen.exists(swUser);
		screen.click(swUser);


	}

	public void validateDocCheckedOUt() {
		saperionHomepagelocator = new SaperionHomepagelocator();
		boolean flag1 = saperionHomepagelocator.DeleteImage.isEnabled();
		Assert.assertEquals(flag1,false);

		System.out.println("Doc has been successfully checkedOut by another user,thus you cannot delete it!!!!");
	}

	//////////////////////////////////sulagna//////////////////






}
