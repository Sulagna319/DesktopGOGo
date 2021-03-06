package pagelocators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import util.WiniumDriverHelper;

/**
 *
 * This test class works as object repository class of Saperion Archive flow locator.
 *
 * @author swghosh
 */

public class ArchivePageLocators extends WiniumDriverHelper {

    public ArchivePageLocators()
    {
        PageFactory.initElements(winiumdriver,this);
    }

    @FindBy(how = How.ID,using = "8202")
    public WebElement ResultIcon;

    @FindBy(how=How.NAME,using = "SaperionTestData")
    public WebElement testdatafolder;

    @FindBy(how=How.NAME,using="PNG.png")
    public WebElement pngfile;

    @FindBy(how=How.NAME,using = "Order")
    public WebElement order;

    @FindBy(how=How.ID,using = "8196")
    public WebElement indexingfield;

    @FindBy(how=How.ID,using ="8203")
    public WebElement resultbutton;

    @FindBy(how=How.NAME,using ="Documents")
    public WebElement Documentsbutton;

    @FindBy(how=How.ID,using = "104")
    public  WebElement Documenttrayheader;

    @FindBy(how = How.NAME, using = "SaperionTestData")
    public WebElement TestData;


}
