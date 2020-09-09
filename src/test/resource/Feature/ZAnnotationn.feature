   #//////////////sulagna/////////////
Feature: Desktop rich client Annotation functionality

  @AnnotationValidation
  @StampCheckjpg
  Scenario: Validate the functionality of Stamp annotation in jpg file
    Given User is on the Saperion Homepage
    When DDC named "DDC" is present in Homepage
    And Search for file in the ddc with name "jpg"
    Then Right click on the "jpg" file
    Then Click on the file and edit
    Then Click on stamp and select stamp
    And save file with change


  @degreeRotation
  Scenario Outline: Validate the functionality of degree rotation annotation in jpg file
    Given User is on the Saperion Homepage
    When DDC named "DDC" is present in Homepage
    And Search for file in the ddc with name "jpg"
    Then Right click on the "jpg" file
    Then Click on the file and edit
    Then Click on "<angle>" degree rotation
    And save file with change
    Examples:
      |angle|
      | 90  |
      | 180 |
      | 270 |



  @jpgNoteModeCheck
  Scenario: Validate the functionality of note marker annotation in jpg file
    Given User is on the Saperion Homepage
    When DDC named "DDC" is present in Homepage
    And Search for file in the ddc with name "jpg"
    Then Right click on the "jpg" file
    Then Click on the file and edit
    Then Click on note mode and write "hello from saperion" on note
    And save file with change



  @documentContextClick
  Scenario Outline: Validate the functionality of context click Index on a document
    Given User is on the Saperion Homepage
    When DDC named "DDC" is present in Homepage
    And Search for file in the ddc with name "jpg"
    Then Right click on the "jpg" file
    And Select option "<Option>"
    And Close the windows for "<Option>"
    Examples:
      | Option   |
      | Edit     |
      | View     |
      | Print    |
      | Save     |
      | Security |
      | Index    |
      | CheckOut |
      | Delete   |



  @checkinCheckout
  Scenario: Validate the functionality of context click Checkin-CheckOut on a document
    Given User is on the Saperion Homepage
    When DDC named "DDC" is present in Homepage
    And Search for file in the ddc with name "doc"
    Then Right click on the "doc" file
    Then Select option "CheckOut"
    And Right click on the "doc" file
    And Maximize,Edit document and write "Hello!! Testing CheckIN-CheckOut"
    And saved the file for checkout
    Then Look for the checkout sign in the doc
    And Checkin the document with checkout sign


  @CheckOutValidationDiffUser
  Scenario: Validate that file cannot be editted/deleted when checkedout from another user
    Given User is on the Saperion Homepage
    When DDC named "DDC" is present in Homepage
    And Search for file in the ddc with name "doc"
    Then Right click on the "doc" file
    And Select option "CheckOut"
    Then Switch user with id "user2" and password "user22222"
    When find "DDC" and search for doc named "doc"
    Then Look for checkout indicator present for the "doc"
    Then The "doc" doesnot have Delete option


    #And Try to update the "doc"
    #Then File cannot be saved with update


	#////////////sulagna////////////