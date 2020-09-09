Feature: Rich client Archiving functionality

  @archieve
  @LoadDocumentPNG
  Scenario: Validate load document functionality of Saperion
    Given User is on the Saperion Homepage
    Then User Click on the import button
    When User click on Load files option
    And User choose files with filetype "PNG"
    When user click ok button
    Then Document should be loaded successfully

  @archieve
  @test
  @Documentbuttonclick
  Scenario: Validate document tray should open when document button is clicked
    Given User is on the Saperion Homepage
    Then User Click on the import button
    And User Click on documents button
    Then User will able to see the Document tray


  @archieve
  @12
  @OrderDocument
  Scenario:Validate the order document Functionality
    Given Document should be loaded successfully
    When User Order the Document
    Then Document Should be order Successfully

  @archieve
  @TrayContentValidation
  Scenario:Validate document tray content
    Given Document should be loaded successfully
    When User Order the Document
    Then Document Should be order Successfully

  @archieve
  @test
  @Archive
  Scenario:Validate the Document archive functionality
    Given Document Should be order Successfully
    When User move the document to the DDC
    And User Enter the index id "25"
    When user click ok button
    And User click on the application
    And User Click on Result button of the DDC











