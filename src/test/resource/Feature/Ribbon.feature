Feature: Desktop rich client ribbon Functionality

@StartTabInRibbon
Scenario: Validate the functionality of the start ribbon in saperion
    Given user click on the Start button
    Then Update button is visible
    Then Reset button is visible
    Then Check Out button is visible
    Then Cross-reference button is visible
    Then Set Access Lists button is visible

@StartTabInRibbon
@AddtoFavoritesButtonInStartRibbon
Scenario: Validate the functionality of the Add to Favorites Button in the Start ribbon in saperion
    Given user click on the Start button
    When Add to Favorites button is visible
    Then Click on index table Indextest
    Then Click on result Button
    Then Click on Add to Favorites button
    Then Favorites Tab Opens

@StartTabInRibbon
@ExportButtonInStartRibbon
Scenario: Validate the functionality of the Export Button in the Start ribbon in saperion
    Given user click on the Start button
    When Export button is visible
    Then Click on index table Indextest
    Then Click on result Button
    Then Click on Export Button
    Then Save Folder window opens
    Then Click on Cancel Button

@StartTabInRibbon
@EditButtonInStartRibbon
Scenario: Validate the functionality of the Edit Button in the Start ribbon in saperion
    Given user click on the Start button
    When Edit button is visible
    Then Click on index table Indextest
    Then Click on result Button
    Then Click on the Document 111 in Result Pane
    Then Click on Edit Button
    Then Edit Document Window opens

@StartTabInRibbon
@DisplayButtonInStartRibbon
Scenario: Validate the functionality of the Display Button in the Start ribbon in saperion
    Given user click on the Start button
    When Display button is visible
    Then Click on index table Indextest
    Then Click on result Button
    Then Click on the Document 111 in Result Pane
    Then Click on Display Button
    Then Display Document Window opens

@StartTabInRibbon
@IndexButtonInStartRibbon
Scenario: Validate the functionality of the Index Button in the Start ribbon in saperion
    Given user click on the Start button
    When Index button is visible
    Then Click on index table Indextest
    Then Click on result Button
    Then Click on the Document 111 in Result Pane
    Then Click on Index Button
    Then Index Window opens
    Then Click on Cancel Button


@StartTabInRibbon
@StructureButtonInStartRibbon
Scenario: Validate the functionality of the Structure Button in the Start ribbon in saperion
    Given user click on the Start button
    When Structure button is visible
    Then Click on index table Indextest
    Then Click on result Button
    Then Click on the Document 111 in Result Pane
    Then Click on Structure Button
    Then Structure Window opens
    Then Click on Cancel Button

@StartTabInRibbon
@DeleteButtonInStartRibbon
Scenario: Validate the functionality of the Delete Button in the Start ribbon in saperion
    Given user click on the Start button
    When Delete button is visible
    Then Click on index table Indextest
    Then Click on result Button
    Then Click on the Document 111 in Result Pane
    Then Click on Delete Button
    Then Delete window opens
    Then Click No on Delete Message
    Then User Click on Ok button

@StartTabInRibbon
@RevisionsButtonInStartRibbon
Scenario: Validate the functionality of the Revisions Button in the Start ribbon in saperion
    Given user click on the Start button
    When Revisions button is visible
    Then Click on index table Indextest
    Then Click on result Button
    Then Click on the Document 111 in Result Pane
    Then Click on Revisions Button
    Then Revisions window opens
    Then User Click on close button

@StartTabInRibbon
@SaveAsButtonInStartRibbon
Scenario: Validate the functionality of the SaveAs Button in the Start ribbon in saperion
    Given user click on the Start button
    When Save As button is visible
    Then Click on index table Indextest
    Then Click on result Button
    Then Click on the Document 111 in Result Pane
    Then Click on Save As Button
    Then Save As window opens
    Then User Click on close button

@StartTabInRibbon
@AddDocumentstoFavoritesButtonInStartRibbon
Scenario: Validate the functionality of the Delete Button in the Start ribbon in saperion
    Given user click on the Start button
    When Add Documents to Favorites button is visible
    Then Click on index table Indextest
    Then Click on result Button
    Then Click on the Document 111 in Result Pane
    Then Click on Add Documents to Favorites button
    Then Favorites Pane opens




@FoldersTabInRibbon
Scenario: Validate the functionality of the Folders ribbon in saperion
    Given User click on the Folders tab
    When Create Folder button is visible
    Then Create Applicaion button is visible
    Then Create Tray button is visible
    Then Folder button is visible
    Then Delete button in Folder is visible
    Then Access List button is visible
    Then Classes button is visible



@ImportTabInRibbon
Scenario: Validate the functionality of the Import ribbon in saperion
    Given User Click on the import tab in Ribbon
    Then Page Feed button is visible
    Then Single Page button is visible
    Then Replace Page button is visible
    Then Scan Profile button is visible
    Then Duplex button in Folder is visible
    Then Configuration button is visible
    Then New Page button is visible
    Then Bulk Import button is visible
    Then Transfer button is visible
    Then Scanned Pages button is visible
    Then Loaded Files button in Folder is visible
    Then Import button is visible in Import tab
    Then Format Preset button is visible
    Then Input button in Folder is visible
    Then Documents button is visible
    Then To Do button is visible

@ImportTabInRibbon
@LoadFilesButtonInImportRibbon
Scenario: Validate the functionality of the Load Files button in Import ribbon in saperion
    Given User Click on the import tab in Ribbon
    When Load Files button is visible
    Then User click on Load Files
    Then Open Window opens
    Then Click on Cancel Button




@AdvancedTabInRibbon
Scenario: Validate the functionality of the Advanced ribbon in saperion
    Given User Click on the Advanced Tab in Ribbon
    When Create Reader button is visible
    Then Quality Assurance button is visible
    Then New button is visible
    Then Load button is visible
    Then Save button is visible
    Then Update in Advanced tab is visible
    Then Delete in Advanced tab is visible
    Then Back to Form button is visible


@DesignTabInRibbon
Scenario: Validate the functionality of the Design ribbon in saperion
    Given User is on the Saperion Homepage
    When User Click on design button
    Then Create in Design Tab is visible
    Then Load in Design Tab is visible
    Then Document Formats button is visible
    Then Process Designer button is visible
    Then Events button is visible
    Then Scripts button is visible
    Then Edit Form button is visible
    Then Create Search Form button is visible
    Then Create Index Form button is visible
    Then Print Lists button is visible
    Then Cover Sheets button is visible
    Then Background Forms button is visible

@DesignTabInRibbon
@EditbuttonInRibbon
Scenario: Validate the functionality of Edit button in Design ribbon
    Given User is on the Saperion Homepage
    When User Click on design button
    Then Edit in Design Tab is visible
    Then Click on Edit Button in Design Tab
    Then Edit Table Window opens
    Then Click on Cancel Button

@DesignTabInRibbon
@SaveAsbuttonInRibbon
Scenario: Validate the functionality of Save As button in Design ribbon
    Given User is on the Saperion Homepage
    When User Click on design button
    Then Save As in Design Tab is visible
    Then Click on Save As Button in Design Tab
    Then Save Definition As window opens
    Then Click on Cancel Button

@DesignTabInRibbon
@DeletebuttonInRibbon
Scenario: Validate the functionality of Delete button in Design ribbon
    Given User is on the Saperion Homepage
    When User Click on design button
    Then Delete in Design Tab is visible
    Then Click on Delete Button in Design Tab
    Then Remove Definition window opens
    Then Click on Cancel Button

@DesignTabInRibbon
@EventsbuttonInRibbon
Scenario: Validate the functionality of Events button in Design ribbon
    Given User is on the Saperion Homepage
    When User Click on design button
    Then Events button is visible
    Then Click on Events Button in Design Tab
    Then Events window opens
    Then User Click on close button

@DesignTabInRibbon
@ScriptsbuttonInRibbon
Scenario: Validate the functionality of Scripts button in Design ribbon
    Given User is on the Saperion Homepage
    When User Click on design button
    Then Scripts button is visible
    Then Click on Scripts Button in Design Tab
    Then EventScript window opens
    Then Click on Cancel Button

@DesignTabInRibbon
@EditFormbuttonInRibbon
Scenario: Validate the functionality of Edit Form button in Design ribbon
    Given User is on the Saperion Homepage
    When User Click on design button
    Then Edit Form button is visible
    Then Click on Edit Form Button in Design Tab
    Then Open Form window opens
    Then Click on Cancel Button




@AdministrationTabInRibbon
Scenario: Validate the functionality of the Administration ribbon in saperion
    Given User Click on Administration button
    When New Content Type is visible
    Then Edit Content Type is visible
    Then New Retention Class is visible
    Then Encryption is visible
    Then Localization is visible
    Then Administration is visible
    Then Access Lists is visible
    Then Query is visible
    Then Form is visible
    Then Configure Forms is visible
    Then Settings is visible
    Then Export is visible


@DocumentTrayTabInRibbon
Scenario: Validate the functionality of the Document Tray ribbon in saperion
    Given User Click on the import tab in Ribbon
    When User Click on the Documents button
    Then Click on Document Tray
    Then Order is visible
    Then Split is visible
    Then Format is visible
    Then Complete is visible
    Then Add Page is visible
    Then Up is visible
    Then Down is visible
    Then Right is visible
    Then Left Forms is visible
    Then View is visible
    Then Edit is visible
    Then Edit Name is visible
    Then Delete is visible
    Then Delete All is visible
    Then Save As in DocumentTray is visible
    Then Encrypt is visible
    Then Security is visible
    Then Rendering is visible
    Then Single Document is visible
    Then All Documents is visible
    Then Options is visible
    Then Activate Forms is visible
    Then Index Form is visible
    Then Index in DocumentTray is visible
    Then Create is visible
    Then Edit Signature is visible
    Then Verify is visible
    Then Delete Signature is visible
    Then Finish is visible
    Then Finish All is visible
    Then Start Mass Signing is visible

    @wImportTabButtons
    Scenario: Validate the visibility of buttons in the Import ribbon in saperion
        Given User is on the Saperion Homepage
        When User Click on the import tab in Ribbon
        Then New Page button is visible
        Then Bulk Import button is visible
        Then Transfer button is visible
        Then Loaded Files button in Folder is visible














