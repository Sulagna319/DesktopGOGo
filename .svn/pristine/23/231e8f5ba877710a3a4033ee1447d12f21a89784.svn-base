package pageaction;

import com.google.common.base.Function;
import org.apache.commons.lang.ObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import pagelocators.AnnotationPagelocators;
import pageaction.HomepageActions;
import pagelocators.SaperionHomepagelocator;
import util.WiniumDriverHelper;

import java.sql.Time;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;


public class AnnotationPageActions {

    AnnotationPagelocators annotationpagelocators;
    SaperionHomepagelocator homepagelocator;


    public void clickResult() {
        homepagelocator = new SaperionHomepagelocator();
        homepagelocator.resultbutton.click();

    }



    public void editJPG() throws InterruptedException {
        homepagelocator = new SaperionHomepagelocator();
        Thread.sleep(2000);
        homepagelocator.EditImage.click();


    }

    public void selectStamp() throws FindFailed {
        annotationpagelocators = new AnnotationPagelocators();
        Screen screen = new Screen();
        Pattern stamp = new Pattern("src/test/resource/Images/StampIcon.PNG");
        Pattern stampImage = new Pattern("src/test/resource/Images/StampStar1.PNG");
        screen.exists(stamp);
        screen.click(stamp);
        screen.doubleClick(stampImage);
        annotationpagelocators.imageStampin.click();

    }

    public void saveFile() {
        annotationpagelocators = new AnnotationPagelocators();
        annotationpagelocators.closeButton.click();
        annotationpagelocators.yesSave.click();
        annotationpagelocators.OKSave.click();
    }


    public void selectNoteMode(String text) throws FindFailed {
        annotationpagelocators = new AnnotationPagelocators();
        Screen screen = new Screen();
        Pattern noteMode = new Pattern("src/test/resource/Images/NoteMode1.PNG");
        screen.exists(noteMode);
        screen.click(noteMode);
        Actions ac = new Actions(WiniumDriverHelper.winiumdriver);
        //annotationpagelocators.imageStampin.click();
        ac.moveByOffset(500, 300).click().build().perform();
        annotationpagelocators.noteText.sendKeys(text);
        annotationpagelocators.OKSave.click();

    }


    public void degreeRotation(String degree) throws FindFailed {

        if (degree.equals("90")) {

            Screen screen = new Screen();
            Pattern rotation90 = new Pattern("src/test/resource/Images/rotation90.PNG");
            screen.exists(rotation90);
            screen.click(rotation90);

        } else if (degree.equals("180")) {

            Screen screen = new Screen();
            Pattern rotation180 = new Pattern("src/test/resource/Images/rotation180.PNG");
            screen.exists(rotation180);
            screen.click(rotation180);
        } else if (degree.equals("270")) {

            Screen screen = new Screen();
            Pattern rotation270 = new Pattern("src/test/resource/Images/rotation270.PNG");
            screen.exists(rotation270);
            screen.click(rotation270);
        } else System.out.println("Your input angle is not valid");

    }





    public void maximizePage(String message) throws InterruptedException, FindFailed {
        Thread.sleep(2000);
        homepagelocator = new SaperionHomepagelocator();
        homepagelocator.EditImage.click();
        Screen sc = new Screen();
        Pattern maxi = new Pattern("src/test/resource/Images/Maximize_doc.PNG");
        Thread.sleep(7000);
        annotationpagelocators = new AnnotationPagelocators();
        annotationpagelocators.explicitwait(annotationpagelocators.DocOption);
        sc.exists(maxi);
        sc.click(maxi);
        Thread.sleep(3000);
        sc.type(message);
        Thread.sleep(3000);
    }


    public void selectOptionCloseTab(String closeTab) throws InterruptedException {
        annotationpagelocators = new AnnotationPagelocators();
        homepagelocator = new SaperionHomepagelocator();
        Thread.sleep(3000);

        if (closeTab.equalsIgnoreCase("Edit")) {
            annotationpagelocators.closeButton.click();
            System.out.println("Edit option working fine");

        } else if (closeTab.equalsIgnoreCase("View")) {

            annotationpagelocators.closeButton.click();
            System.out.println("View option working fine");

        } else if (closeTab.equalsIgnoreCase("Print")) {

            annotationpagelocators.CancelTab.click();
            System.out.println("Print option working fine");

        } else if (closeTab.equalsIgnoreCase("Save")) {

            annotationpagelocators.CancelTab.click();
            System.out.println("SaveAs option working fine");

        } else if (closeTab.equalsIgnoreCase("Index")) {

            annotationpagelocators.OKSave.click();
            annotationpagelocators.OKSave.click();
            homepagelocator.resultbutton.click();
            //Screen screen=new Screen();
            System.out.println("Index option working fine");

        } else if (closeTab.equalsIgnoreCase("Delete")) {

            annotationpagelocators.yesSave.click();
            Screen screen = new Screen();
            Pattern delete = new Pattern("src/test/resource/Images/DeleteBin.PNG");
            Match m = screen.exists(delete);

            if (m != null) {
                System.out.println("Data deleted!!Baamm!!");
            } else {
                System.out.println("Not deleted yett!");
            }


        } else if (closeTab.equalsIgnoreCase("Security")) {

            annotationpagelocators.CancelTab.click();
            System.out.println("Security option working fine");


        } else if (closeTab.equalsIgnoreCase("CheckOut")) {
            Screen screen = new Screen();
            Match CheckOutSign = screen.exists("src/test/resource/Images/CheckOutSign.PNG");
            assertNotNull(CheckOutSign);
            System.out.println("Document has been Checked Out.Option working fine");
        } else System.out.println("Your input is not valid");
    }




    public void saveCheckout() throws FindFailed {

        Screen sc = new Screen();
        Pattern close = new Pattern("src/test/resource/Images/docClose.PNG");
        sc.wait(close);
        sc.exists(close);
        sc.click(close);
        Pattern yesSave = new Pattern("src/test/resource/Images/Yessave.PNG");
        sc.wait(yesSave);
        sc.exists(yesSave);
        sc.click(yesSave);

    }




    public void trySaveFile() throws FindFailed, InterruptedException {
        Screen sc = new Screen();
        Pattern close = new Pattern("src/test/resource/Images/docClose.PNG");
        //sc.wait(close);
        sc.exists(close);
        sc.click(close);
        Wait<WebDriver> wait = new FluentWait<WebDriver>(WiniumDriverHelper.winiumdriver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.name("Cancel"));
            } });


        /*boolean flag1 = annotationpagelocators.CancelTab.isEnabled();
        Assert.assertEquals(flag1,false);
        System.out.println("Doc has been successfully checkedOut by another user,thus you cannot edit it!!!!");*/

    }


    }



