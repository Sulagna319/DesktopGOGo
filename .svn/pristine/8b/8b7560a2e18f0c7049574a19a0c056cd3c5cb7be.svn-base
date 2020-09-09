Feature: Desktop rich client user management functionality


  @UM
  @ProfileCreation
  Scenario: Validate the Profile Creation functionality

    Given User is on the Saperion Homepage
    When User click Administration tab
    And User click Administration button
    When User click on profiles tab
    Then User Click on NEW button
    Then User Give profile description "prf1"
    And User select definite access list
    Then User Click on Ok button
    And User Close the Usermanagement Section


  @UM
  @ProfileDeletion
  Scenario: Validate the Profile Deletion Functionality

    Given User is on the Saperion Homepage
    When User click Administration tab
    And User click Administration button
    When User click on profiles tab
    Then User will check for the profile he wants to delete
    And User select that perticular User
    And User Click on delete button
    And User click yes on deletePopup
    Then Profile should be deleted
    And User Close the Usermanagement Section

  @UM
  @ProfileChange
  Scenario: Validate the Profile Edit Functionality
    Given User is on the Saperion Homepage
    When User click Administration tab
    And User click Administration button
    When User click on profiles tab
    Then User will check for the profile he wants to delete
    And User select that perticular User
    And User Click Edit button
    Then User Give profile description "prf3"
    Then User Click on Ok button
    And User Close the Usermanagement Section

  @UM
  @Groupcreation
  Scenario: Validate the Group Creation Functionality
    Given User is on the Saperion Homepage
    When User click Administration tab
    And User click Administration button
    When User click on Groups tab
    Then User Click on NEW button
    Then User Give Group description "groupname"
    And User Select Profile name
    Then User Click on Ok button
    And User Close the Usermanagement Section

  @UM
  @GroupDeletion
  Scenario: Validate the Group Creation Functionality
    Given User is on the Saperion Homepage
    When User click Administration tab
    And User click Administration button
    When User click on Groups tab
    And User select group to be deleted
    And User Click on delete button
    And User click yes on deletePopup
    Then Group should be deleted
    And User Close the Usermanagement Section


  @UM
  @GroupEdit
  Scenario: Validate the Group Creation Functionality
    Given User is on the Saperion Homepage
    When User click Administration tab
    And User click Administration button
    When User click on Groups tab
    And User select a group for edit
    And user give group new name
    And User Click on Ok button
    Then group should be edited successfully
    And User Close the Usermanagement Section


  @UM
  @UserCreation
  Scenario: Validate the User Creation Functionality
    Given User is on the Saperion Homepage
    When User click Administration tab
    And User click Administration button
    Then User Click on NEW button
    Then User Give User description "u1"
    Then User Click on Ok button
    And User Close the Usermanagement Section


  @UM
  @UsercreationwithGroup
  Scenario: Validate the User Creation Functionality
    Given User is on the Saperion Homepage
    When User click Administration tab
    And User click Administration button
    When User click on User tab
    Then User Click on NEW button
    Then User Give User description "username"
    And User Select Group name "groupname"
    Then User Click on Ok button
    And User Close the Usermanagement Section

  @UserEdit
  Scenario: Validate the User Creation Functionality
    Given User is on the Saperion Homepage
    When User click Administration tab
    And User click Administration button
    When User click on User tab
    Then User Click on NEW button
    Then User Give User description
    And User Select Group name
    Then User Click on Ok button
    And User Close the Usermanagement Section

  @UM
  @ButtonDisplay
  Scenario: Validate various Button in User Management
    Given User is on the Saperion Homepage
    When User click Administration tab
    And User click Administration button
    Then User Should able to see all the buttons
    And User Close the Usermanagement Section

  @UM
  @UserManagerWindow
  Scenario:Validate the User Manager Window
    Given User is on the Saperion Homepage
    When User click Administration tab
    And User click Administration button
    Then User should able to see Usermanager Window

  @UM
  @CheckGroupTabs
  Scenario: Validate the Group tab in usermanagement
    Given User is on the Saperion Homepage
    When User click Administration tab
    And User click Administration button
    Then User should able to all the tab
    And User Close the Usermanagement Section

  @UM
  @ACLGUITEST
  Scenario:Validate that user can able to create an ACL
    Given User is on the Saperion Homepage
    When User click Administration tab
    And User click Administration button
    When User Click on Access Right tabs
    And User Click on NEW button
    Then User should able to see all the element
    And User Close the Usermanagement Section

