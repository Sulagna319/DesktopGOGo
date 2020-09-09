package pagelocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import util.WiniumDriverHelper;


public class AnnotationPagelocators extends WiniumDriverHelper {

    public AnnotationPagelocators()
    {
        PageFactory.initElements(winiumdriver,this);
    }

    @FindBy(how=How.ID,using ="8197")
    public WebElement SearchBox;


    @FindBy(how=How.CLASS_NAME,using ="Win!Viewer!Client")
    public WebElement imageStampin;

    @FindBy(how=How.ID,using ="Close")
    public WebElement closeButton;

    @FindBy(how=How.ID,using ="6")
    public WebElement yesSave;

    @FindBy(how=How.ID,using ="1")
    public WebElement OKSave;


    @FindBy(how=How.NAME,using= "Black Markers")
    public WebElement BlackMrkr;

    @FindBy(how=How.ID,using ="123")
    public WebElement noteText;

    @FindBy(how=How.NAME,using= "Notes")
    public WebElement notes;

    @FindBy(how=How.NAME,using= "Query result")
    public WebElement ResultPane;

    @FindBy(how=How.NAME,using= "Edit")
    public WebElement EditTab;

    @FindBy(how=How.NAME,using= "View")
    public WebElement ViewTab;

    @FindBy(how=How.ID,using ="TitleBar")
     public WebElement PrintTab;

    @FindBy(how=How.NAME,using= "Cancel")
    public WebElement CancelTab;

    @FindBy(how=How.NAME,using="Save As")
    public WebElement SaveAsTab;

    @FindBy(how=How.NAME,using="Type")
    public WebElement IndexType;



    @FindBy(how=How.ID,using ="8198")
    public WebElement idUpdate;


    @FindBy(how=How.NAME,using="Menu")
    public WebElement Menu;

    @FindBy(how=How.NAME,using="This operation can only be undone by a media rebuild. Delete anyway?")
    public WebElement DeleteDialogueMsg;

    @FindBy(how=How.NAME,using="Select Access List")
     public WebElement SecurityTab;

    @FindBy(how=How.ID,using = "Maximize")
     public WebElement Maximize;


    @FindBy(how=How.ID,using ="104")
    public WebElement Comment;

    @FindBy(how=How.NAME,using="Document")
    public WebElement DocOption;

    @FindBy(how=How.ID,using="SystemMenuBar")
    public WebElement saveMessageBox;
}
