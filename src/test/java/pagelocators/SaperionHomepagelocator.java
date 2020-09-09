package pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import util.WiniumDriverHelper;

/**
 *
 * This test class works as object repository class of Saperion homepage locator.
 *
 * @author swghosh
 */

public class SaperionHomepagelocator extends WiniumDriverHelper {

	public SaperionHomepagelocator() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(winiumdriver, this);
	}

	@FindBy(how = How.NAME, using = "SAPERION")
	public WebElement Saperionsymbol;

	@FindBy(how = How.NAME, using = "Close")
	public WebElement closebutton;

	@FindBy(how = How.NAME, using = "Yes")
	public WebElement PopupYesbutton;

	@FindBy(how = How.NAME, using = "Design")
	public WebElement Designbutton;

	@FindBy(how = How.NAME, using = "Create...")
	public WebElement createbutton;

	@FindBy(how = How.NAME, using = "OK")
	public WebElement DefinitionTypeOKbutton;

	@FindBy(how = How.NAME, using = "Index columns")
	public WebElement indexcolumns;

	@FindBy(how = How.ID, using = "102")
	public WebElement NewbuttonEdit;

	@FindBy(how = How.ID, using = "103")
	public WebElement DeletebuttonEdit;

	@FindBy(how = How.ID, using = "1")
	public WebElement okbuttonindex;

	@FindBy(how = How.NAME, using = "New...")
	public WebElement NewButton;

	@FindBy(how = How.ID, using = "101")
	public WebElement NamefieldEdit;

	@FindBy(how = How.NAME, using = "Start")
	public WebElement startbutton;

	@FindBy(how = How.ID, using = "1001")
	public WebElement fileName;

	@FindBy(how = How.NAME, using = "Create Search Form...")
	public WebElement CreateSearchForm;

	@FindBy(how = How.NAME, using = "Create Index Form...")
	public WebElement CreateIndexForm;

	@FindBy(how = How.NAME, using = "Create")
	public WebElement createbuttonsearch;

	@FindBy(how = How.NAME, using = "Save As...")
	public WebElement saveasform;

	@FindBy(how = How.NAME, using = "Form")
	public WebElement formbuttonsearch;

	@FindBy(how = How.ID, using = "103")
	public WebElement workspacebutton;

	@FindBy(how = How.ID, using = "1001")
	public WebElement workspacepane;

	@FindBy(how = How.NAME, using = "Create Application...")
	public WebElement CreateApplicationbutton;

	@FindBy(how = How.ID, using = "118")
	public WebElement EditApplicationDescriptionfield;

	@FindBy(how = How.ID, using = "127")
	public WebElement EditApplicationQueryfield;

	@FindBy(how = How.ID, using = "129")
	public WebElement EditApplicationIndexfield;

	@FindBy(how = How.ID, using = "128")
	public WebElement searchQueryForm;

	@FindBy(how = How.ID, using = "120")
	public WebElement searchIndexForm;

	@FindBy(how = How.ID, using = "1")
	public WebElement okbuttonEditapplication;

	@FindBy(how = How.NAME, using = "Administration")
	public WebElement Administration;

	@FindBy(how = How.NAME, using = "Administration...")
	public WebElement administrationbutton;

	@FindBy(how = How.ID, using = "103")
	public WebElement choosedatatype;

	@FindBy(how = How.ID, using = "6")
	public WebElement closeyesbutton;

	@FindBy(how = How.NAME, using = "Import")
	public WebElement importbutton;




	@FindBy(how = How.NAME, using = "Load File(s)...")
	public WebElement loadfiles;

	@FindBy(how = How.NAME, using = "Load...")
	public WebElement loadbutton;

	@FindBy(how = How.NAME, using = "File Name:")
	public WebElement filename;

	@FindBy(how = How.NAME, using = "Index columns")
	public WebElement newwindow;

	@FindBy(how = How.ID, using = "111")
	public WebElement clienttype;

	/////////////////////pallavi//////////////

	@FindBy(how=How.ID,using="DropDown")
	public WebElement DefinitionType;

	@FindBy(how=How.NAME,using="Lookup table")
	public WebElement LookupTable;



	@FindBy(how=How.ID,using="8199")
	public WebElement clickResult;

	@FindBy(how=How.ID,using="105")
	public WebElement resultpane;

	@FindBy(how=How.ID,using="Item 5961")
	public WebElement resultpaneNew;

	@FindBy(how=How.ID,using="Item 5953")
	public WebElement resultpaneEdit;

	@FindBy(how=How.ID,using="Item 5957")
	public WebElement resultpaneDelete;

	@FindBy(how=How.ID,using="8195")
	public WebElement enterLookupValueName;

	@FindBy(how=How.NAME,using="Lookup Table")
	public WebElement addLookupToIndexTable;

	@FindBy(how=How.ID,using="155")
	public WebElement searchLookupName;

	@FindBy(how=How.ID,using="1001")
	public WebElement enterLookupName;




/*@FindBy(how=How.ID,using="154")
public WebElement addLookupName;*/

/*@FindBy(how=How.ID,using="152")
public WebElement addLookupForm;*/

	@FindBy(how=How.ID,using="153")
	public WebElement searchLookupForm;

    /*@FindBy(how=How.ID,using="157")
    public WebElement addLookupMainField;*/

	@FindBy(how=How.NAME,using="id")
	public WebElement LookupMainFieldName;

	@FindBy(how=How.NAME,using="Close")
	public WebElement Closedialoguebox;

	@FindBy(how=How.NAME,using="Drop Down Button")
	public WebElement addLookupMainField;

	@FindBy(how=How.NAME,using="Folders")
	public WebElement folderTab;

	@FindBy(how =How.NAME,using="Create Application...")
	public WebElement createApplication;


	/////////////ribbon locators--pallavi///////////
	/////////////Start button ribbon locators///////////

	@FindBy(how = How.NAME, using = "Update")
	public WebElement Update;

	@FindBy(how = How.NAME, using = "Reset")
	public WebElement Reset;

	/////////////Add_to_Favorites////////////////////
	@FindBy(how = How.NAME, using = "Add to Favorites")
	public WebElement Add_to_Favorites;

	@FindBy(how = How.NAME, using = "Favorites")
	public WebElement FavoritesTab;

	//////////////Export///////////
	@FindBy(how = How.NAME, using = "Export...")
	public WebElement Export;

	@FindBy(how = How.NAME, using = "Result")
	public WebElement ResultButton;

	@FindBy(how = How.NAME, using = "Save Folder...")
	public WebElement SaveFolder;

	@FindBy(how = How.ID, using = "2")
	public WebElement CancelButton;

	////////////// Edit//////////////
	@FindBy(how = How.NAME, using = "Edit")
	public WebElement Edit;

	@FindBy(how = How.NAME, using = "Notes")
	public WebElement EditPage;

	///////////////Display//////////

	@FindBy(how = How.NAME, using = "Display")
	public WebElement Display;

	@FindBy(how = How.NAME, using = "Enlarge")
	public WebElement DisplayPage;

	///////////////Index//////////

	@FindBy(how = How.NAME, using = "Index...")
	public WebElement Index;

	@FindBy(how = How.NAME, using = "Indexing-[Indextest_i]")
	public WebElement IndexPage;

	/////////////////Structure/////////////////

	@FindBy(how = How.NAME, using = "Structure...")
	public WebElement Structure;

	@FindBy(how = How.NAME, using = "Content: Structure")
	public WebElement StructurePage;

	//////////////CheckOut/////////////////
	@FindBy(how = How.NAME, using = "Check Out")
	public WebElement CheckOut;

	//////////////Delete/////////////////
	@FindBy(how = How.NAME, using = "Delete")
	public WebElement Delete;

	@FindBy(how = How.ID, using = "65535")
	public WebElement DeleteMessage;

	@FindBy(how = How.ID, using = "7")
	public WebElement NoDelete;

	//////////////Revisions/////////////////
	@FindBy(how = How.NAME, using = "Revisions...")
	public WebElement Revisions;

	@FindBy(how = How.NAME, using = "Edit Revisions")
	public WebElement RevisionsWindow;

	@FindBy(how = How.NAME, using = "Close")
	public WebElement RevisionsWindowClose;

	//////////////Save As/////////////////
	@FindBy(how = How.NAME, using = "Save As...")
	public WebElement Save_As;

	@FindBy(how = How.NAME, using = "Save As")
	public WebElement Save_As_Title_bar;

	//////////////Favorites/////////////////
	@FindBy(how = How.NAME, using = "Add Documents to Favorites")
	public WebElement Add_Documents_to_Favorites;

	//////////////Cross-reference...//////////////

	@FindBy(how = How.NAME, using = "Cross-reference...")
	public WebElement Cross_reference;

	//////////////Set Access Lists...//////////////
	@FindBy(how = How.NAME, using = "Set Access Lists...")
	public WebElement Set_Access_Lists;


	/////////////Folders button ribbon locators///////////
	@FindBy(how = How.NAME, using = "Folders")
	public WebElement Folders;
	@FindBy(how = How.NAME, using = "Create Folder")
	public WebElement CreateFolder;
	@FindBy(how = How.NAME, using = "Create Application...")
	public WebElement CreateApplication;
	@FindBy(how = How.NAME, using = "Create Tray..")
	public WebElement CreateTray;
	@FindBy(how = How.NAME, using = "Folder...")
	public WebElement Folder;
	@FindBy(how = How.NAME, using = "Delete")
	public WebElement DeleteInFolders;
	@FindBy(how = How.NAME, using = "Access List...")
	public WebElement AccessList;
	@FindBy(how = How.NAME, using = "Classes...")
	public WebElement Classes;

	/////////////Import button ribbon locators///////////
/*	@FindBy(how = How.NAME, using = "Import")
	public WebElement ImportInRibbon;*/
	@FindBy(how = How.NAME, using = "Page Feed...")
	public WebElement PageFeed;
	@FindBy(how = How.NAME, using = "Single Page...")
	public WebElement SinglePage;
	@FindBy(how = How.NAME, using = "Replace Page...")
	public WebElement ReplacePage;
	@FindBy(how = How.NAME, using = "Scan Profile")
	public WebElement ScanProfile;
	@FindBy(how = How.NAME, using = "Duplex")
	public WebElement Duplex;
	@FindBy(how = How.NAME, using = "Configuration...")
	public WebElement Configuration;
	@FindBy(how = How.NAME, using = "Load File(s)...")
	public WebElement LoadFiles;
	@FindBy(how = How.NAME, using = "Open")
	public WebElement Open;
	@FindBy(how = How.NAME, using = "New Page")
	public WebElement NewPage;
	@FindBy(how = How.NAME, using = "Bulk Import...")
	public WebElement BulkImport;
	@FindBy(how = How.NAME, using = "Transfer...")
	public WebElement Transfer;
	@FindBy(how = How.NAME, using = "Scanned Pages...")
	public WebElement ScannedPages;
	@FindBy(how = How.NAME, using = "Loaded Files...")
	public WebElement LoadedFiles;
	@FindBy(how = How.NAME, using = "Import...")
	public WebElement ImportInTab;
	@FindBy(how = How.NAME, using = "Format Preset...")
	public WebElement FormatPreset;
	@FindBy(how = How.NAME, using = "Input")
	public WebElement Input;
	@FindBy(how = How.NAME, using = "Documents")
	public WebElement Documents;
	@FindBy(how = How.NAME, using = "To Do")
	public WebElement ToDo;

	/////////////Advanced tab ribbon locators///////////
	@FindBy(how = How.NAME, using = "Advanced")
	public WebElement AdvancedInRibbon;
	@FindBy(how = How.NAME, using = "Create Reader...")
	public WebElement CreateReader;
	@FindBy(how = How.NAME, using = "Quality Assurance...")
	public WebElement QualityAssurance;
	@FindBy(how = How.NAME, using = "New")
	public WebElement New ;
	@FindBy(how = How.NAME, using = "Load...")
	public WebElement Load;
	@FindBy(how = How.NAME, using = "Save...")
	public WebElement Save;
	@FindBy(how = How.NAME, using = "Update")
	public WebElement UpdateinAdvancedtab;
	@FindBy(how = How.NAME, using = "Delete...")
	public WebElement DeleteinAdvancedtab;
	@FindBy(how = How.NAME, using = "Back to Form")
	public WebElement BacktoForm;



	/////////////Design tab ribbon locators///////////
	@FindBy(how = How.NAME, using = "Load...")
	public WebElement LoadinDesignTab;
	@FindBy(how = How.NAME, using = "Edit...")
	public WebElement EditinDesignTab;
	@FindBy(how = How.NAME, using = "Save As...")
	public WebElement SaveAs;
	@FindBy(how = How.NAME, using = "Save Definition As...")
	public WebElement SaveDefinitionAs;
	@FindBy(how = How.NAME, using = "Delete...")
	public WebElement DeleteinDesignTab ;
	@FindBy(how = How.NAME, using = "Remove Definition...")
	public WebElement RemoveDefinition ;
	@FindBy(how = How.NAME, using = "Document Formats...")
	public WebElement DocumentFormats;
	@FindBy(how = How.NAME, using = "Process Designer...")
	public WebElement ProcessDesigner;
	@FindBy(how = How.NAME, using = "Events...")
	public WebElement Events;
	@FindBy(how = How.NAME, using = "Events")
	public WebElement EventsWindow;
	@FindBy(how = How.NAME, using = "Scripts...")
	public WebElement Scripts;
	@FindBy(how = How.NAME, using = "EventScript")
	public WebElement EventScript;
	@FindBy(how = How.NAME, using = "Edit Form...")
	public WebElement EditForm;
	@FindBy(how = How.NAME, using = "Open Form...")
	public WebElement OpenForm;
	@FindBy(how = How.NAME, using = "Print Lists...")
	public WebElement PrintLists;
	@FindBy(how = How.NAME, using = "Cover Sheets...")
	public WebElement CoverSheets;
	@FindBy(how = How.NAME, using = "Background Forms...")
	public WebElement BackgroundForms;


	/////////////Administrator tab ribbon locators///////////
	@FindBy(how = How.NAME, using = "New Content Type...")
	public WebElement NewContentType;
	@FindBy(how = How.NAME, using = "Edit Content Type....")
	public WebElement EditContentType;
	@FindBy(how = How.NAME, using = "New Retention Class...")
	public WebElement NewRetentionClass;
	@FindBy(how = How.NAME, using = "Encryption")
	public WebElement Encryption ;
	@FindBy(how = How.NAME, using = "Localization...")
	public WebElement Localization;
	@FindBy(how = How.NAME, using = "Access Lists...")
	public WebElement AccessLists;
	@FindBy(how = How.NAME, using = "Query...")
	public WebElement Query;
	@FindBy(how = How.NAME, using = "Form")
	public WebElement Form;
	@FindBy(how = How.NAME, using = "Configure Forms...")
	public WebElement ConfigureForms;
	@FindBy(how = How.NAME, using = "Settings...")
	public WebElement Settings;
	@FindBy(how = How.NAME, using = "Export...")
	public WebElement ExportinAdministrationTab;

	/////////////Administrator tab ribbon locators///////////
	@FindBy(how = How.NAME, using = "Order")
	public WebElement Order;
	@FindBy(how = How.NAME, using = "Split")
	public WebElement Split;
	@FindBy(how = How.NAME, using = "Format")
	public WebElement Format;
	@FindBy(how = How.NAME, using = "Complete")
	public WebElement Complete ;
	@FindBy(how = How.NAME, using = "Add Page")
	public WebElement AddPage;
	@FindBy(how = How.NAME, using = "Add All")
	public WebElement AddAll;

	@FindBy(how = How.NAME, using = "Up")
	public WebElement Up;
	@FindBy(how = How.NAME, using = "Down")
	public WebElement Down ;
	@FindBy(how = How.NAME, using = "Right")
	public WebElement Right;
	@FindBy(how = How.NAME, using = "Left")
	public WebElement Left;

	@FindBy(how = How.NAME, using = "View...")
	public WebElement View;

	@FindBy(how = How.NAME, using = "Edit...")
	public WebElement EditInDocumentTray;
	@FindBy(how = How.NAME, using = "Edit Name")
	public WebElement EditName;

	@FindBy(how = How.NAME, using = "Delete")
	public WebElement DeleteInDocumentTray;
	@FindBy(how = How.NAME, using = "Delete All")
	public WebElement DeleteAll;
	@FindBy(how = How.NAME, using = "Save As...")
	public WebElement SaveAsInDocumentTray;

	@FindBy(how = How.NAME, using = "Encrypt...")
	public WebElement Encrypt;
	@FindBy(how = How.NAME, using = "Security...")
	public WebElement Security;
	@FindBy(how = How.NAME, using = "Rendering...")
	public WebElement Rendering;

	@FindBy(how = How.NAME, using = "Single Document")
	public WebElement SingleDocument;
	@FindBy(how = How.NAME, using = "All Documents")
	public WebElement AllDocuments;
	@FindBy(how = How.NAME, using = "Options")
	public WebElement Options;

	@FindBy(how = How.NAME, using = "Activate Forms...")
	public WebElement ActivateForms;
	@FindBy(how = How.NAME, using = "Index Form")
	public WebElement IndexForm;
	@FindBy(how = How.NAME, using = "Index...")
	public WebElement IndexInDocumentTray;

	@FindBy(how = How.NAME, using = "Create...")
	public WebElement Create;

	@FindBy(how = How.NAME, using = "Edit...")
	public WebElement EditSignature;
	@FindBy(how = How.NAME, using = "Verify...")
	public WebElement Verify;
	@FindBy(how = How.NAME, using = "Delete")
	public WebElement DeleteSignature;

	@FindBy(how = How.NAME, using = "Finish")
	public WebElement Finish;
	@FindBy(how = How.NAME, using = "Finish All")
	public WebElement FinishAll;
	@FindBy(how = How.NAME, using = "Start Mass Signing...")
	public WebElement StartMassSigning;




	//////
	@FindBy(how=How.NAME,using= "Workspace")
	public WebElement WorkspaceButton;



	///sulagna///

	@FindBy(how=How.ID,using ="107")
	public WebElement ClearBox;

	@FindBy(how=How.ID,using ="8197")
	public WebElement DDcNameField;

	@FindBy(how=How.ID,using ="8204")
	public WebElement resultbutton;

	@FindBy(how=How.ID,using ="Item 5953")
	public WebElement EditImage;

	@FindBy(how=How.ID,using ="Item 5969")
	public WebElement ViewImage;

	@FindBy(how=How.ID,using ="Item 5954")
	public WebElement PrintImage;

	@FindBy(how=How.ID,using ="Item 5958")
	public WebElement SaveImage;

	@FindBy(how=How.ID,using ="Item 5955")
	public WebElement IndexImage;

	@FindBy(how=How.NAME,using ="Delete")
	public WebElement DeleteImage;

	@FindBy(how=How.ID,using ="Item 5972")
	public WebElement SecurityImage;

	@FindBy(how=How.NAME,using ="Check Out")
	public WebElement CheckOutImage;

	@FindBy(how=How.ID,using ="Item 1059")
	public WebElement CheckInDoc;

	@FindBy(how=How.NAME,using="SAPERION")
	public WebElement saperion;

	///sulagna//

}
