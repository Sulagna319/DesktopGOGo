package pageaction;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.WiniumDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import pagelocators.LoginPageLocators;
import pagelocators.SaperionHomepagelocator;
import util.WiniumDriverHelper;
import winium.elements.desktop.ComboBox;

public class RibbonActions {

    SaperionHomepagelocator ribbon = null;

    public RibbonActions(){
        ribbon = new SaperionHomepagelocator();
    }

    /*public void StartButton() throws ElementNotVisibleException, InterruptedException {
        ribbon = new SaperionHomepagelocator();
        Screen screen=new Screen();
        Pattern startbutton=new Pattern("C:\\Users\\pchatterjee\\Documents\\RichClient\\src\\test\\resource\\Images\\StartButton.JPG") ;

        Boolean startVisible = ribbon.startbutton.isDisplayed();
        Assert.assertEquals(startVisible, "True");

    }*/

    public void StartButtonClick() throws ElementNotVisibleException, FindFailed {

        Screen screen=new Screen();
        Pattern startbutton=new Pattern("C:\\Users\\pchatterjee\\Documents\\RichClient\\src\\test\\resource\\Images\\StartButton.JPG") ;
        screen.wait(startbutton,3000);
        screen.click(startbutton);

    }


    public void UpdateButton() throws ElementNotVisibleException {
        //ribbon.Update.isDisplayed();

        String UpdateButton = ribbon.Update.getAttribute("Name");
        Assert.assertEquals(UpdateButton, "Update");

    }

    public void ResetButton() throws ElementNotVisibleException {
        //ribbon.Reset.isDisplayed();

        String ResetButton = ribbon.Reset.getAttribute("Name");
        Assert.assertEquals(ResetButton, "Reset");

    }
///////////////////////AddToFavorites//////////////////
    public void AddToFavoritesButton() throws ElementNotVisibleException {

        String AddToFavoritesButton = ribbon.Add_to_Favorites.getAttribute("Name");
        Assert.assertEquals(AddToFavoritesButton, "Add to Favorites");

    }

    public void ClickAddToFavoritesButton() throws ElementNotVisibleException {
        ribbon.Add_to_Favorites.click();
    }

    public void FavoritesTabVerify() throws ElementNotVisibleException {

        String FavoritesTabVerify = ribbon.FavoritesTab.getAttribute("Name");
        Assert.assertEquals(FavoritesTabVerify, "Favorites");

    }


    //////////Export scenario//////////
    public void ExportButton() throws ElementNotVisibleException {
        //ribbon.Export.isDisplayed();

        ribbon = new SaperionHomepagelocator();
        String ExportButton = ribbon.Export.getAttribute("Name");
        Assert.assertEquals(ExportButton, "Export...");

    }

    public void ClickIndexTableForExportButton() throws ElementNotVisibleException, FindFailed, InterruptedException {

        Screen screen=new Screen();
        Pattern IndexTable=new Pattern("C:\\Users\\pchatterjee\\Documents\\RichClient\\src\\test\\resource\\Images\\Indextest.JPG") ;
        screen.wait(IndexTable,3000);
        screen.click(IndexTable);
        Thread.sleep(3000);

    }

    public void ClickResultForExportButton() throws ElementNotVisibleException, InterruptedException {

        ribbon.ResultButton.click();
        Thread.sleep(3000);

    }

    public void ClickExportButton() throws ElementNotVisibleException {

        ribbon.Export.click();

    }

    public void VerifySaveFolderWindow() throws ElementNotVisibleException {

        String SaveFolderWindow = ribbon.SaveFolder.getAttribute("Name");
        Assert.assertEquals(SaveFolderWindow, "Save Folder...");

    }

    public void ClickCancelButton() throws ElementNotVisibleException {

        ribbon.CancelButton.click();

    }

    ////////////////  Edit  ///////////////////
    public void EditButton() throws ElementNotVisibleException {
       // ribbon.Edit.isDisplayed();

        String EditButton = ribbon.Edit.getAttribute("Name");
        Assert.assertEquals(EditButton, "Edit");
    }


    public void ClickDocumentInResultPane() throws ElementNotVisibleException, FindFailed, InterruptedException {

        Screen screen=new Screen();
        Pattern ClickDocument=new Pattern("C:\\Users\\pchatterjee\\Documents\\RichClient\\src\\test\\resource\\Images\\DocumentForEditButton.JPG") ;
        screen.wait(ClickDocument,3000);
        screen.click(ClickDocument);
        Thread.sleep(3000);

    }

    public void ClickEditButton() throws ElementNotVisibleException {
         ribbon.Edit.click();
    }

    public void VerifyEditPage() throws ElementNotVisibleException {

        String EditButton = ribbon.EditPage.getAttribute("Name");
        Assert.assertEquals(EditButton, "Notes");
    }


    ///////////////Display//////////

    public void DisplayButton() throws ElementNotVisibleException {
       // ribbon.Display.isDisplayed();

        String DisplayButton = ribbon.Display.getAttribute("Name");
        Assert.assertEquals(DisplayButton, "Display");

    }

    public void ClickDisplayButton() throws ElementNotVisibleException {
        ribbon.Display.click();
    }

    public void VerifyDisplayPage() throws ElementNotVisibleException {

        String DisplayButton = ribbon.DisplayPage.getAttribute("Name");
        Assert.assertEquals(DisplayButton, "Enlarge");
    }


    ///////////////Index//////////

    public void IndexButton() throws ElementNotVisibleException {
        //ribbon.Index.isDisplayed();

        String IndexButton = ribbon.Index.getAttribute("Name");
        Assert.assertEquals(IndexButton, "Index...");

    }
    public void ClickIndexButton() throws ElementNotVisibleException {
        ribbon.Index.click();
    }

    public void VerifyIndexPage() throws ElementNotVisibleException {

        String IndexButton = ribbon.IndexPage.getAttribute("Name");
        Assert.assertEquals(IndexButton, "Indexing-[Indextest_i]");
    }

    ///////////////////Structure////////////////

    public void StructureButton() throws ElementNotVisibleException {

        String StructureButton = ribbon.Structure.getAttribute("Name");
        Assert.assertEquals(StructureButton, "Structure...");
    }

    public void ClickStructureButton() throws ElementNotVisibleException {
        ribbon.Structure.click();
    }

    public void VerifyStructurePage() throws ElementNotVisibleException {

        String StructureButton = ribbon.StructurePage.getAttribute("Name");
        Assert.assertEquals(StructureButton, "Content: Structure");
    }

    //////////////Check Out//////////////////////

    public void CheckOutButton() throws ElementNotVisibleException {

        String CheckOutButton = ribbon.CheckOut.getAttribute("Name");
        Assert.assertEquals(CheckOutButton, "Check Out");
    }

    ///////////Delete//////////

    public void DeleteButton() throws ElementNotVisibleException {

        String DeleteButton = ribbon.Delete.getAttribute("Name");
        Assert.assertEquals(DeleteButton, "Delete");

    }

    public void ClickDeleteButton() throws ElementNotVisibleException {
        ribbon.Delete.click();
    }

    public void DeleteMessage() throws ElementNotVisibleException {

        String DeleteMessage = ribbon.DeleteMessage.getAttribute("Name");
        Assert.assertEquals(DeleteMessage, "This operation can only be undone by a media rebuild. Delete anyway?");

    }

    public void ClickNoDelete() throws ElementNotVisibleException {
        ribbon.NoDelete.click();
    }

    //////////////Revisions////////////


    public void RevisionsButton() throws ElementNotVisibleException {
        //ribbon.Revisions.isDisplayed();

        String RevisionsButton = ribbon.Revisions.getAttribute("Name");
        Assert.assertEquals(RevisionsButton, "Revisions...");

    }

    public void ClickRevisionsButton() throws ElementNotVisibleException {
        ribbon.Revisions.click();
    }

    public void RevisionsWindow() throws ElementNotVisibleException {

        String RevisionsWindow = ribbon.RevisionsWindow.getAttribute("Name");
        Assert.assertEquals(RevisionsWindow, "Edit Revisions");
    }

    public void ClickRevisionsWindowClose() throws ElementNotVisibleException {
        ribbon.RevisionsWindowClose.click();
    }

    ///////////////SaveAs/////////////////////////
    public void SaveAsButton() throws ElementNotVisibleException {
        //ribbon.Save_As.isDisplayed();

        String SaveAsButton = ribbon.Save_As.getAttribute("Name");
        Assert.assertEquals(SaveAsButton, "Save As...");

    }

    public void ClickSaveAsButton() throws ElementNotVisibleException {

        ribbon.Save_As.click();
    }

    public void SaveAsTitleBarWindow() throws ElementNotVisibleException {

        String SaveAsTitleBarWindow = ribbon.Save_As_Title_bar.getAttribute("Name");
        Assert.assertEquals(SaveAsTitleBarWindow, "Save As");

    }
////////////////////////AddDocumentsToFavoritesButton/////////////////
    public void AddDocumentsToFavoritesButton() throws ElementNotVisibleException {
        //ribbon.Add_Documents_to_Favorites.isDisplayed();

        String AddDocumentsToFavoritesButton = ribbon.Add_Documents_to_Favorites.getAttribute("Name");
        Assert.assertEquals(AddDocumentsToFavoritesButton, "Add Documents to Favorites");

    }

    public void ClickAddDocumentsToFavoritesButton() throws ElementNotVisibleException {

        ribbon.Add_Documents_to_Favorites.click();
    }

////////////////////////////
    public void CrossReferenceButton() throws ElementNotVisibleException {
        //ribbon.Cross_reference.isDisplayed();

        String CrossReferenceButton = ribbon.Cross_reference.getAttribute("Name");
        Assert.assertEquals(CrossReferenceButton, "Cross-reference...");

    }

    public void SetAccessListsButton() throws ElementNotVisibleException {
        //ribbon.Set_Access_Lists.isDisplayed();

        String SetAccessListsButton = ribbon.Set_Access_Lists.getAttribute("Name");
        Assert.assertEquals(SetAccessListsButton, "Set Access Lists...");

    }



    /////////////Folders button ribbon ///////////

    public void ClickFoldersButtonInRibbon() throws ElementNotVisibleException, FindFailed {
        ribbon = new SaperionHomepagelocator();
        Screen screen=new Screen();
        Pattern FoldersButton=new Pattern("C:\\Users\\pchatterjee\\Documents\\RichClient\\src\\test\\resource\\Images\\FoldersButton.JPG") ;
        screen.wait(FoldersButton,3000);
        screen.click(FoldersButton);

    }
    public void CreateFolderButton() throws ElementNotVisibleException {

        String CreateFolderButton = ribbon.CreateFolder.getAttribute("Name");
        Assert.assertEquals(CreateFolderButton, "Create Folder");

    }
    public void CreateApplicationButton() throws ElementNotVisibleException {

        String CreateApplicationButton = ribbon.CreateApplication.getAttribute("Name");
        Assert.assertEquals(CreateApplicationButton, "Create Application...");

    }
    public void CreateTrayButton() throws ElementNotVisibleException {

        String CreateTrayButton = ribbon.CreateTray.getAttribute("Name");
        Assert.assertEquals(CreateTrayButton, "Create Tray..");

    }
    public void FolderButton() throws ElementNotVisibleException {

        String FolderButton = ribbon.Folder.getAttribute("Name");
        Assert.assertEquals(FolderButton, "Folder...");

    }
    public void DeleteInFoldersButton() throws ElementNotVisibleException {

        String DeleteInFoldersButton = ribbon.DeleteInFolders.getAttribute("Name");
        Assert.assertEquals(DeleteInFoldersButton, "Delete");

    }
    public void AccessListButton() throws ElementNotVisibleException {

        String AccessListButton = ribbon.AccessList.getAttribute("Name");
        Assert.assertEquals(AccessListButton, "Access List...");

    }
    public void ClassesButton() throws ElementNotVisibleException {

        String ClassesButton = ribbon.Classes.getAttribute("Name");
        Assert.assertEquals(ClassesButton, "Classes...");

    }

    /////////////Import button ribbon ///////////

    public void ClickImportTabInRibbon() throws ElementNotVisibleException, FindFailed {
        ribbon = new SaperionHomepagelocator();
        Screen screen=new Screen();
        Pattern importbutton=new Pattern("C:\\Users\\pchatterjee\\Documents\\RichClient\\src\\test\\resource\\Images\\ImportButton.JPG") ;
        screen.wait(importbutton,3000);
        screen.click(importbutton);

    }
/*
    public void ImportTabInRibbon() throws ElementNotVisibleException {

        String ImportTabInRibbon = ribbon.ImportInRibbon.getAttribute("Name");
        Assert.assertEquals(ImportTabInRibbon, "Import");

    }*/


    public void PageFeedButtonInRibbon() throws ElementNotVisibleException {

        String PageFeedButtonInRibbon = ribbon.PageFeed.getAttribute("Name");
        Assert.assertEquals(PageFeedButtonInRibbon, "Page Feed...");

    }

    public void SinglePageButtonInRibbon() throws ElementNotVisibleException {

        String SinglePageButtonInRibbon = ribbon.SinglePage.getAttribute("Name");
        Assert.assertEquals(SinglePageButtonInRibbon, "Single Page...");

    }

    public void ReplacePageButtonInRibbon() throws ElementNotVisibleException {

        String ReplacePageButtonInRibbon = ribbon.ReplacePage.getAttribute("Name");
        Assert.assertEquals(ReplacePageButtonInRibbon, "Replace Page...");

    }
    public void ScanProfileButtonInRibbon() throws ElementNotVisibleException {

        String ScanProfileButtonInRibbon = ribbon.ScanProfile.getAttribute("Name");
        Assert.assertEquals(ScanProfileButtonInRibbon, "Scan Profile");

    }

    public void DuplexButtonInRibbon() throws ElementNotVisibleException {

        String DuplexButtonInRibbon = ribbon.Duplex.getAttribute("Name");
        Assert.assertEquals(DuplexButtonInRibbon, "Duplex");

    }
    public void ConfigurationButtonInRibbon() throws ElementNotVisibleException {

        String ConfigurationButtonInRibbon = ribbon.Configuration.getAttribute("Name");
        Assert.assertEquals(ConfigurationButtonInRibbon, "Configuration...");

    }
    public void LoadFilesButtonInRibbon() throws ElementNotVisibleException {

        String LoadFilesButtonInRibbon = ribbon.LoadFiles.getAttribute("Name");
        Assert.assertEquals(LoadFilesButtonInRibbon, "Load File(s)...");

    }
    public void ClickLoadFilesButtonInRibbon() throws ElementNotVisibleException {

        ribbon.LoadFiles.click();

    }
    public void OpenWindow() throws ElementNotVisibleException {

        String OpenWindow = ribbon.Open.getAttribute("Name");
        Assert.assertEquals(OpenWindow, "Open");

    }

    public void NewPageButtonInRibbon() throws ElementNotVisibleException {

        String NewPageButtonInRibbon = ribbon.NewPage.getAttribute("Name");
        Assert.assertEquals(NewPageButtonInRibbon, "New Page");

    }
    public void BulkImportButtonInRibbon() throws ElementNotVisibleException {

        String BulkImportButtonInRibbon = ribbon.BulkImport.getAttribute("Name");
        Assert.assertEquals(BulkImportButtonInRibbon, "Bulk Import...");

    }

    public void TransferButtonInRibbon() throws ElementNotVisibleException {

        String TransferButtonInRibbon = ribbon.Transfer.getAttribute("Name");
        Assert.assertEquals(TransferButtonInRibbon, "Transfer...");

    }

    public void ScannedPagesButtonInRibbon() throws ElementNotVisibleException {

        String ScannedPagesButtonInRibbon = ribbon.ScannedPages.getAttribute("Name");
        Assert.assertEquals(ScannedPagesButtonInRibbon, "Scanned Pages...");

    }

    public void LoadedFilesButtonInRibbon() throws ElementNotVisibleException {

        String LoadedFilesButtonInRibbon = ribbon.LoadedFiles.getAttribute("Name");
        Assert.assertEquals(LoadedFilesButtonInRibbon, "Loaded Files...");

    }

    public void ImportButtonInImportTab() throws ElementNotVisibleException {

        String ImportButtonInImportTab = ribbon.ImportInTab.getAttribute("Name");
        Assert.assertEquals(ImportButtonInImportTab, "Import...");

    }

    public void FormatPresetButtonInRibbon() throws ElementNotVisibleException {

        String FormatPresetButtonInRibbon = ribbon.FormatPreset.getAttribute("Name");
        Assert.assertEquals(FormatPresetButtonInRibbon, "Format Preset...");

    }

    public void InputButtonInRibbon() throws ElementNotVisibleException {

        String InputButtonInRibbon = ribbon.Input.getAttribute("Name");
        Assert.assertEquals(InputButtonInRibbon, "Input");

    }

    public void DocumentsButtonInRibbon() throws ElementNotVisibleException {

        String DocumentsButtonInRibbon = ribbon.Documents.getAttribute("Name");
        Assert.assertEquals(DocumentsButtonInRibbon, "Documents");

    }

    public void ToDoButtonInRibbon() throws ElementNotVisibleException {

        String ToDoButtonInRibbon = ribbon.ToDo.getAttribute("Name");
        Assert.assertEquals(ToDoButtonInRibbon, "To Do");

    }

    /////////////Advanced tab ribbon ///////////

    public void ClickAdvancedTabInRibbon() throws ElementNotVisibleException, FindFailed {
        ribbon = new SaperionHomepagelocator();
        Screen screen=new Screen();
        Pattern AdvancedTab=new Pattern("C:\\Users\\pchatterjee\\Documents\\RichClient\\src\\test\\resource\\Images\\AdvancedButton.JPG") ;
        screen.wait(AdvancedTab,3000);
        screen.click(AdvancedTab);

    }
    public void CreateReaderButtonInRibbon() throws ElementNotVisibleException {

        String CreateReaderButtonInRibbon = ribbon.CreateReader.getAttribute("Name");
        Assert.assertEquals(CreateReaderButtonInRibbon, "Create Reader...");

    }

    public void QualityAssuranceButtonInRibbon() throws ElementNotVisibleException {

        String QualityAssuranceButtonInRibbon = ribbon.QualityAssurance.getAttribute("Name");
        Assert.assertEquals(QualityAssuranceButtonInRibbon, "Quality Assurance...");

    }

    public void NewButtonInRibbon() throws ElementNotVisibleException {

        String NewButtonInRibbon = ribbon.New.getAttribute("Name");
        Assert.assertEquals(NewButtonInRibbon, "New");

    }
    public void LoadButtonInRibbon() throws ElementNotVisibleException {

        String LoadButtonInRibbon = ribbon.Load.getAttribute("Name");
        Assert.assertEquals(LoadButtonInRibbon, "Load...");

    }

    public void SaveButtonInRibbon() throws ElementNotVisibleException {

        String SaveButtonInRibbon = ribbon.Save.getAttribute("Name");
        Assert.assertEquals(SaveButtonInRibbon, "Save...");

    }
    public void UpdateinAdvancedtabInRibbon() throws ElementNotVisibleException {

        String UpdateinAdvancedtabInRibbon = ribbon.UpdateinAdvancedtab.getAttribute("Name");
        Assert.assertEquals(UpdateinAdvancedtabInRibbon, "Update");

    }
    public void DeleteinAdvancedtabInRibbon() throws ElementNotVisibleException {

        String DeleteinAdvancedtabInRibbon = ribbon.DeleteinAdvancedtab.getAttribute("Name");
        Assert.assertEquals(DeleteinAdvancedtabInRibbon, "Delete...");

    }

    public void BacktoFormButtonInRibbon() throws ElementNotVisibleException {

        String BacktoFormButtonInRibbon = ribbon.BacktoForm.getAttribute("Name");
        Assert.assertEquals(BacktoFormButtonInRibbon, "Back to Form");

    }

    /////////////Design tab ribbon ///////////


    public void createButtonInRibbon() throws ElementNotVisibleException {

        String createButtonInRibbon = ribbon.createbutton.getAttribute("Name");
        Assert.assertEquals(createButtonInRibbon, "Create...");

    }
    public void LoadinDesignTabInRibbon() throws ElementNotVisibleException {

        String LoadinDesignTabInRibbon = ribbon.LoadinDesignTab.getAttribute("Name");
        Assert.assertEquals(LoadinDesignTabInRibbon, "Load...");

    }

    public void EditinDesignTabInRibbon() throws ElementNotVisibleException {

        String EditinDesignTabInRibbon = ribbon.EditinDesignTab.getAttribute("Name");
        Assert.assertEquals(EditinDesignTabInRibbon, "Edit...");

    }

    public void ClickEditinDesignTabInRibbon() throws ElementNotVisibleException {

        ribbon.EditinDesignTab.click();

    }

    public void editTableWindow() throws ElementNotVisibleException {

        String editTableWindow = ribbon.indexcolumns.getAttribute("Name");
        Assert.assertEquals(editTableWindow, "Index columns");

    }


    public void SaveAsButtonInRibbon() throws ElementNotVisibleException {

        String SaveAsButtonInRibbon = ribbon.SaveAs.getAttribute("Name");
        Assert.assertEquals(SaveAsButtonInRibbon, "Save As...");

    }

    public void ClickSaveAsButtonInRibbon() throws ElementNotVisibleException {

        ribbon.SaveAs.click();

    }
    public void SaveDefinitionAsWindow() throws ElementNotVisibleException {

        String SaveDefinitionAsWindow = ribbon.SaveDefinitionAs.getAttribute("Name");
        Assert.assertEquals(SaveDefinitionAsWindow, "Save Definition As...");

    }

    public void DeleteinDesignTabInRibbon() throws ElementNotVisibleException {

        String DeleteinDesignTabInRibbon = ribbon.DeleteinDesignTab.getAttribute("Name");
        Assert.assertEquals(DeleteinDesignTabInRibbon, "Delete...");

    }

    public void ClickDeleteinDesignTabInRibbon() throws ElementNotVisibleException {

        ribbon.DeleteinDesignTab.click();
    }

    public void RemoveDefinitionWindow() throws ElementNotVisibleException {

        String RemoveDefinitionWindow = ribbon.RemoveDefinition.getAttribute("Name");
        Assert.assertEquals(RemoveDefinitionWindow, "Remove Definition...");

    }




    public void DocumentFormatsButtonInRibbon() throws ElementNotVisibleException {

        String DocumentFormatsButtonInRibbon = ribbon.DocumentFormats.getAttribute("Name");
        Assert.assertEquals(DocumentFormatsButtonInRibbon, "Document Formats...");

    }
    public void ProcessDesignerButtonInRibbon() throws ElementNotVisibleException {

        String ProcessDesignerButtonInRibbon = ribbon.ProcessDesigner.getAttribute("Name");
        Assert.assertEquals(ProcessDesignerButtonInRibbon, "Process Designer...");

    }
    public void EventsButtonInRibbon() throws ElementNotVisibleException {

        String EventsButtonInRibbon = ribbon.Events.getAttribute("Name");
        Assert.assertEquals(EventsButtonInRibbon, "Events...");

    }
    public void ClickEventsWindowInRibbon() throws ElementNotVisibleException {

        ribbon.Events.click();

    }
    public void EventsWindow() throws ElementNotVisibleException {

        String EventsWindow = ribbon.EventsWindow.getAttribute("Name");
        Assert.assertEquals(EventsWindow, "Events");

    }


    public void ScriptsButtonInRibbon() throws ElementNotVisibleException {

        String ScriptsButtonInRibbon = ribbon.Scripts.getAttribute("Name");
        Assert.assertEquals(ScriptsButtonInRibbon, "Scripts...");

    }
    public void ClickScriptsButtonInRibbon() throws ElementNotVisibleException {

        ribbon.Scripts.click();

    }
    public void EventScriptWindow() throws ElementNotVisibleException {

        String EventScriptWindow = ribbon.EventScript.getAttribute("Name");
        Assert.assertEquals(EventScriptWindow, "EventScript");

    }


    public void EditFormButtonInRibbon() throws ElementNotVisibleException {

        String EditFormButtonInRibbon = ribbon.EditForm.getAttribute("Name");
        Assert.assertEquals(EditFormButtonInRibbon, "Edit Form...");

    }
    public void ClickEditFormButtonInRibbon() throws ElementNotVisibleException {

        ribbon.EditForm.click();

    }
    public void OpenFormWindow() throws ElementNotVisibleException {

        String OpenFormWindow = ribbon.OpenForm.getAttribute("Name");
        Assert.assertEquals(OpenFormWindow, "Open Form...");

    }


    public void PrintListsButtonInRibbon() throws ElementNotVisibleException {

        String PrintListsButtonInRibbon = ribbon.PrintLists.getAttribute("Name");
        Assert.assertEquals(PrintListsButtonInRibbon, "Print Lists...");

    }
    public void CoverSheetsButtonInRibbon() throws ElementNotVisibleException {

        String CoverSheetsButtonInRibbon = ribbon.CoverSheets.getAttribute("Name");
        Assert.assertEquals(CoverSheetsButtonInRibbon, "Cover Sheets...");

    }

    public void BackgroundFormsButtonInRibbon() throws ElementNotVisibleException {

        String BackgroundFormsButtonInRibbon = ribbon.BackgroundForms.getAttribute("Name");
        Assert.assertEquals(BackgroundFormsButtonInRibbon, "Background Forms...");

    }
    public void CreateSearchFormButtonInRibbon() throws ElementNotVisibleException {

        String CreateSearchFormButtonInRibbon = ribbon.CreateSearchForm.getAttribute("Name");
        Assert.assertEquals(CreateSearchFormButtonInRibbon, "Create Search Form...");

    }
    public void CreateIndexFormButtonInRibbon() throws ElementNotVisibleException {

        String CreateIndexFormButtonInRibbon = ribbon.CreateIndexForm.getAttribute("Name");
        Assert.assertEquals(CreateIndexFormButtonInRibbon, "Create Index Form...");

    }

//////////////////////AdministrationTabInRibbon////////////////////

    public void ClickAdministrationTabInRibbon() throws ElementNotVisibleException, FindFailed {
        ribbon = new SaperionHomepagelocator();
        Screen screen=new Screen();
        Pattern AdministrationTab=new Pattern("C:\\Users\\pchatterjee\\Documents\\RichClient\\src\\test\\resource\\Images\\AdministrationButton.JPG") ;
        screen.wait(AdministrationTab,3000);
        screen.click(AdministrationTab);

    }

    public void NewContentTypeButtonInRibbon() throws ElementNotVisibleException {

        String NewContentTypeButtonInRibbon = ribbon.NewContentType.getAttribute("Name");
        Assert.assertEquals(NewContentTypeButtonInRibbon, "New Content Type...");

    }

    public void EditContentTypeButtonInRibbon() throws ElementNotVisibleException {

        String EditContentTypeButtonInRibbon = ribbon.EditContentType.getAttribute("Name");
        Assert.assertEquals(EditContentTypeButtonInRibbon, "Edit Content Type....");

    }
    public void NewRetentionClassButtonInRibbon() throws ElementNotVisibleException {

        String NewRetentionClassButtonInRibbon = ribbon.NewRetentionClass.getAttribute("Name");
        Assert.assertEquals(NewRetentionClassButtonInRibbon, "New Retention Class...");

    }
    public void EncryptionButtonInRibbon() throws ElementNotVisibleException {

        String EncryptionButtonInRibbon = ribbon.Encryption.getAttribute("Name");
        Assert.assertEquals(EncryptionButtonInRibbon, "Encryption");

    }

    public void LocalizationButtonInRibbon() throws ElementNotVisibleException {

        String LocalizationButtonInRibbon = ribbon.Localization.getAttribute("Name");
        Assert.assertEquals(LocalizationButtonInRibbon, "Localization...");

    }
    public void administrationButtonInRibbon() throws ElementNotVisibleException {

        String administrationButtonInRibbon = ribbon.administrationbutton.getAttribute("Name");
        Assert.assertEquals(administrationButtonInRibbon, "Administration...");

    }
    public void AccessListsButtonInRibbon() throws ElementNotVisibleException {

        String AccessListsButtonInRibbon = ribbon.AccessLists.getAttribute("Name");
        Assert.assertEquals(AccessListsButtonInRibbon, "Access Lists...");

    }

    public void QueryButtonInRibbon() throws ElementNotVisibleException {

        String QueryButtonInRibbon = ribbon.Query.getAttribute("Name");
        Assert.assertEquals(QueryButtonInRibbon, "Query...");

    }
    public void FormButtonInRibbon() throws ElementNotVisibleException {

        String FormButtonInRibbon = ribbon.Form.getAttribute("Name");
        Assert.assertEquals(FormButtonInRibbon, "Form");

    }

    public void ConfigureFormsButtonInRibbon() throws ElementNotVisibleException {

        String ConfigureFormsButtonInRibbon = ribbon.ConfigureForms.getAttribute("Name");
        Assert.assertEquals(ConfigureFormsButtonInRibbon, "Configure Forms...");

    }
    public void SettingsButtonInRibbon() throws ElementNotVisibleException {

        String SettingsButtonInRibbon = ribbon.Settings.getAttribute("Name");
        Assert.assertEquals(SettingsButtonInRibbon, "Settings...");

    }
    public void ExportinAdministrationTab() throws ElementNotVisibleException {

        String ExportinAdministrationTab = ribbon.ExportinAdministrationTab.getAttribute("Name");
        Assert.assertEquals(ExportinAdministrationTab, "Export...");

    }



    ////////////////////Document Tray//////////////
    public void ClickDocumentInImportInRibbon() throws ElementNotVisibleException {

        ribbon.Documents.click();
    }

    public void ClickDocumentTrayInRibbon() throws ElementNotVisibleException, FindFailed {
        ribbon = new SaperionHomepagelocator();
        Screen screen=new Screen();
        Pattern DocumentTraybutton=new Pattern("C:\\Users\\pchatterjee\\Documents\\RichClient\\src\\test\\resource\\Images\\DocumentTrayButton.JPG") ;
        screen.wait(DocumentTraybutton,3000);
        screen.click(DocumentTraybutton);

    }


    public void OrderInDocumentTray() throws ElementNotVisibleException {

        String OrderInDocumentTray = ribbon.Order.getAttribute("Name");
        Assert.assertEquals(OrderInDocumentTray, "Order");

    }

    public void SplitInDocumentTray() throws ElementNotVisibleException {

        String SplitInDocumentTray = ribbon.Split.getAttribute("Name");
        Assert.assertEquals(SplitInDocumentTray, "Split");

    }
    public void FormatInDocumentTray() throws ElementNotVisibleException {

        String FormatInDocumentTray = ribbon.Format.getAttribute("Name");
        Assert.assertEquals(FormatInDocumentTray, "Format");

    }

    public void CompleteInDocumentTray() throws ElementNotVisibleException {

        String CompleteInDocumentTray = ribbon.Complete.getAttribute("Name");
        Assert.assertEquals(CompleteInDocumentTray, "Complete");

    }

    public void AddPageInDocumentTray() throws ElementNotVisibleException {

        String AddPageInDocumentTray = ribbon.AddPage.getAttribute("Name");
        Assert.assertEquals(AddPageInDocumentTray, "Add Page");

    }
    public void AddAllInDocumentTray() throws ElementNotVisibleException {

        String AddAllInDocumentTray = ribbon.AddAll.getAttribute("Name");
        Assert.assertEquals(AddAllInDocumentTray, "Add All");

    }
    public void UpInDocumentTray() throws ElementNotVisibleException {

        String UpInDocumentTray = ribbon.Up.getAttribute("Name");
        Assert.assertEquals(UpInDocumentTray, "Up");

    }

    public void DownInDocumentTray() throws ElementNotVisibleException {

        String DownInDocumentTray = ribbon.Down.getAttribute("Name");
        Assert.assertEquals(DownInDocumentTray, "Down");

    }

    public void RightInDocumentTray() throws ElementNotVisibleException {

        String RightInDocumentTray = ribbon.Right.getAttribute("Name");
        Assert.assertEquals(RightInDocumentTray, "Right");

    }

    public void LeftInDocumentTray() throws ElementNotVisibleException {

        String LeftInDocumentTray = ribbon.Left.getAttribute("Name");
        Assert.assertEquals(LeftInDocumentTray, "Left");

    }
    public void ViewInDocumentTray() throws ElementNotVisibleException {

        String ViewInDocumentTray = ribbon.View.getAttribute("Name");
        Assert.assertEquals(ViewInDocumentTray, "View...");

    }

    public void EditInDocumentTray() throws ElementNotVisibleException {

        String EditInDocumentTray = ribbon.EditInDocumentTray.getAttribute("Name");
        Assert.assertEquals(EditInDocumentTray, "Edit...");

    }

    public void EditNameInDocumentTray() throws ElementNotVisibleException {

        String EditNameInDocumentTray = ribbon.EditName.getAttribute("Name");
        Assert.assertEquals(EditNameInDocumentTray, "Edit Name");

    }

    public void DeleteInDocumentTray() throws ElementNotVisibleException {

        String DeleteInDocumentTray = ribbon.DeleteInDocumentTray.getAttribute("Name");
        Assert.assertEquals(DeleteInDocumentTray, "Delete");

    }

    public void DeleteAllInDocumentTray() throws ElementNotVisibleException {

        String DeleteAllInDocumentTray = ribbon.DeleteAll.getAttribute("Name");
        Assert.assertEquals(DeleteAllInDocumentTray, "Delete All");

    }
    public void SaveAsInDocumentTray() throws ElementNotVisibleException {

        String SaveAsInDocumentTray = ribbon.SaveAsInDocumentTray.getAttribute("Name");
        Assert.assertEquals(SaveAsInDocumentTray, "Save As...");

    }

    public void EncryptInDocumentTray() throws ElementNotVisibleException {

        String EncryptInDocumentTray = ribbon.Encrypt.getAttribute("Name");
        Assert.assertEquals(EncryptInDocumentTray, "Encrypt...");

    }
    public void SecurityInDocumentTray() throws ElementNotVisibleException {

        String SecurityInDocumentTray = ribbon.Security.getAttribute("Name");
        Assert.assertEquals(SecurityInDocumentTray, "Security...");

    }

    public void RenderingInDocumentTray() throws ElementNotVisibleException {

        String RenderingInDocumentTray = ribbon.Rendering.getAttribute("Name");
        Assert.assertEquals(RenderingInDocumentTray, "Rendering...");

    }

    public void SingleDocumentInDocumentTray() throws ElementNotVisibleException {

        String SingleDocumentInDocumentTray = ribbon.SingleDocument.getAttribute("Name");
        Assert.assertEquals(SingleDocumentInDocumentTray, "Single Document");

    }
    public void AllDocumentsInDocumentTray() throws ElementNotVisibleException {

        String AllDocumentsInDocumentTray = ribbon.AllDocuments.getAttribute("Name");
        Assert.assertEquals(AllDocumentsInDocumentTray, "All Documents");

    }

    public void OptionsInDocumentTray() throws ElementNotVisibleException {

        String OptionsInDocumentTray = ribbon.Options.getAttribute("Name");
        Assert.assertEquals(OptionsInDocumentTray, "Options");

    }

    public void ActivateFormsInDocumentTray() throws ElementNotVisibleException {

        String ActivateFormsInDocumentTray = ribbon.ActivateForms.getAttribute("Name");
        Assert.assertEquals(ActivateFormsInDocumentTray, "Activate Forms...");

    }
    public void IndexFormInDocumentTray() throws ElementNotVisibleException {

        String IndexFormInDocumentTray = ribbon.IndexForm.getAttribute("Name");
        Assert.assertEquals(IndexFormInDocumentTray, "Index Form");

    }
    public void IndexInDocumentTray() throws ElementNotVisibleException {

        String IndexInDocumentTray = ribbon.IndexInDocumentTray.getAttribute("Name");
        Assert.assertEquals(IndexInDocumentTray, "Index...");

    }

    public void CreateInDocumentTray() throws ElementNotVisibleException {

        String CreateInDocumentTray = ribbon.Create.getAttribute("Name");
        Assert.assertEquals(CreateInDocumentTray, "Create...");

    }
    public void EditSignatureInDocumentTray() throws ElementNotVisibleException {

        Actions action = new Actions(WiniumDriverHelper.winiumdriver);

        action.moveToElement(ribbon.EditSignature).build().perform();


        String EditSignatureInDocumentTray = ribbon.EditSignature.getAttribute("Name");
        Assert.assertEquals(EditSignatureInDocumentTray, "Edit...");

    }

    public void VerifyInDocumentTray() throws ElementNotVisibleException {

        String VerifyInDocumentTray = ribbon.Verify.getAttribute("Name");
        Assert.assertEquals(VerifyInDocumentTray, "Verify...");

    }

    public void DeleteSignatureInDocumentTray() throws ElementNotVisibleException {

        String DeleteSignatureInDocumentTray = ribbon.DeleteSignature.getAttribute("Name");
        Assert.assertEquals(DeleteSignatureInDocumentTray, "Delete");

    }
    public void FinishInDocumentTray() throws ElementNotVisibleException {

        String FinishInDocumentTray = ribbon.Finish.getAttribute("Name");
        Assert.assertEquals(FinishInDocumentTray, "Finish");

    }

    public void FinishAllInDocumentTray() throws ElementNotVisibleException {

        String FinishAllInDocumentTray = ribbon.FinishAll.getAttribute("Name");
        Assert.assertEquals(FinishAllInDocumentTray, "Finish All");

    }

    public void StartMassSigningInDocumentTray() throws ElementNotVisibleException {

        String StartMassSigningInDocumentTray = ribbon.StartMassSigning.getAttribute("Name");
        Assert.assertEquals(StartMassSigningInDocumentTray, "Start Mass Signing...");

    }

























}

