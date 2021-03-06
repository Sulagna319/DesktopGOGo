package pageaction;


import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import pagelocators.ArchivePageLocators;
import util.WiniumDriverHelper;

import static org.testng.Assert.assertTrue;

/**
 *
 * This test class works as Action class of corresponding behaviour related to Archive or Document Load Page.
 *
 * @author swghosh
 */

public class ArchivePageActions {




    public void  chooseFile(String filetype) throws ElementNotVisibleException,FindFailed,InterruptedException {
        ArchivePageLocators archivepagelocators=new ArchivePageLocators();

        Screen screen=new Screen();
        Pattern desktopIcon=new Pattern("src/test/resource/Images/DesktopIcon.PNG");
        screen.wait(desktopIcon,3000);
        screen.click(desktopIcon);

      /*  Pattern testdatafolder=new Pattern("C:\\Automation\\RichClientAutomation\\src\\test\\resource\\Images\\TestData.PNG");
        screen.wait(testdatafolder,2000);
        screen.doubleClick(testdatafolder);*/

        Actions builder=new Actions(WiniumDriverHelper.winiumdriver);

        builder.doubleClick(archivepagelocators.TestData).build().perform();

        Thread.sleep(1000);

        if(filetype.equalsIgnoreCase("PNG"))
        {

            builder.doubleClick(archivepagelocators.pngfile).build().perform();
        }

        Thread.sleep(6000);
    }


    public void documentLoaded() throws FindFailed {
        Screen screen =new Screen();
        Match loaded=screen.exists("src/test/resource/Images/DocumentLoadedTray.PNG");
        assertTrue(loaded != null);
    }

    public void documentOrder() throws FindFailed {
        Screen screen =new Screen();
        Pattern loadedpng=new Pattern("src/test/resource/Images/DocumentLoadedTray.PNG");
        screen.wait(loadedpng,3000);
        screen.rightClick(loadedpng);
        ArchivePageLocators archivepagelocators=new ArchivePageLocators();
        archivepagelocators.order.click();

    }

    public void documentOrderedSuccessfully() throws FindFailed{
        Screen screen =new Screen();
        Match orderedpng=screen.exists("src/test/resource/Images/PNGordered.PNG");
        assertTrue(orderedpng != null);
    }

    public void dragDropImages() throws FindFailed{
        Screen screen =new Screen();
        Pattern Orderimage=new Pattern("src/test/resource/Images/OrderedDoc.PNG");
        Pattern ddcname=new Pattern("src/test/resource/Images/DDCNAME.PNG");
        screen.click(Orderimage);
        screen.wait(Orderimage,5000);
        screen.dragDrop(Orderimage,ddcname);
    }

    public void indexingData(String index) throws NoSuchElementException{
        ArchivePageLocators archivePageLocators=new ArchivePageLocators();
        archivePageLocators.indexingfield.sendKeys(index);
    }

    public void clickApplication() throws NoSuchElementException,FindFailed{
        Screen screen =new Screen();
        Pattern application=new Pattern("src/test/resource/Images/DDCNAME.PNG");
        screen.wait(application,3000);
        screen.click(application);
    }

    public void resultButtonclick() throws NoSuchElementException{
        ArchivePageLocators archivePageLocators =new ArchivePageLocators();
        archivePageLocators.resultbutton.click();
    }

    public void clickDocumentsButton() throws NoSuchElementException{
        ArchivePageLocators archivePageLocators =new ArchivePageLocators();
        archivePageLocators.Documentsbutton.click();
    }

    public void checkDocumentHeader() throws NoSuchElementException{
        ArchivePageLocators archivePageLocators =new ArchivePageLocators();
        Assert.assertTrue(archivePageLocators.Documenttrayheader.isDisplayed());
    }
}
