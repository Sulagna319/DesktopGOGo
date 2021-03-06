Feature: Desktop rich client Functionality

	@regression1
	@login
	Scenario: Validate the login functionality of Saperion
		Given User on Saperion login page and give credentials "administrator" and "qa"
		When user select role
		And user select appropriate client
		When user click ok button
		Then User will sign on to the application


	@regression1
	@IndexTableCreation
	Scenario: Validate the functionality of creation of Index table
		Given User is on the Saperion Homepage
		When User Click on design button
		And User Click on create button
		Then User Click on Ok button
		And User click on new column section
		Then User Click on New section
		Then User Enter Index field name "id"
		And User Choose the datatype of that index field
		Then User Click on Ok button
		Then User Click on Ok button
		And User Enter the name of the Index table "ddc1"
		Then User Click on Ok button
		Then Validate index table created successfully of ddc name "ddc1"
		Then User Click on Ok button

	@regression1
	@SearchFormCreation
	Scenario: Validate the functionality of creation of Index table
		Given User is on the Saperion Homepage
		When User Click on design button
		And User Click on Create Search form
		And User Click Create button in form
		Then User click on Form button
		And User click on Save button
		Then User Enter the Search form name "ddc1_q"
		Then User Click on Ok button


	@regression1
	@IndexFormCreation
	Scenario: Validate the functionality of creation of Index table
		Given User is on the Saperion Homepage
		When User Click on design button
		And User Click on Create Index form
		And User Click Create button in form
		Then User click on Form button
		And User click on Save button
		Then User Enter the Index form name "ddc1_i"
		Then User Click on Ok button

	@regression1
	@DDCreation
	Scenario: Validate DDC creation Functionality
		Given User is on the Saperion Homepage
		When User Click on design button
		When User right click on workspace pane and select create application
		And User Enter application Details applicationname "Test1" indexform "ddc1_i" searchform "ddc1_q"
		Then User Click on Ok button

	@LookuptableScenario
	@LookupTableCreation
	Scenario: Validate the functionality of creation of Lookup table
		Given User is on the Saperion Homepage
		When User Click on design button
		And User Click on create button
		And User choose Lookup table from Definition type dropdown
		Then User Click on Ok button
		And User click on new column section
		Then User Click on New section
		Then User Enter Index field name "id"
		And User Choose the datatype of that index field
		Then User Click on Ok button
		Then User Click on Ok button
		And User Enter the name of the Index table "Lookup01a"
		Then User Click on Ok button
	@LookuptableScenario
	@SearchFormCreation
	Scenario: Validate the functionality of creation of Index table
		Given User is on the Saperion Homepage
		When User Click on design button
		And User Click on Create Search form
		And User Click Create button in form
		Then User click on Form button
		And User click on Save button
		Then User Enter the Search form name "lookup_q01a"
		Then User Click on Ok button

	@LookuptableScenario
	@IndexFormCreation
	Scenario: Validate the functionality of creation of Index table
		Given User is on the Saperion Homepage
		When User Click on design button
		And User Click on Create Index form
		And User Click Create button in form
		Then User click on Form button
		And User click on Save button
		Then User Enter the Index form name "lookup_i01a"
		Then User Click on Ok button

	@LookuptableScenario
	@LookupDDCreation
	Scenario: Validate Lookup DDC creation Functionality
		Given User is on the Saperion Homepage
		When User right click on workspace pane and select create application
		And User Enter application Details applicationname "Lookup01" searchform "lookup_q01a" indexform "lookup_i01a"
		Then User Click on Ok button

	@LookuptableScenario
	@LinkIndexTableWithLookup
	Scenario: Validate the functionality of linking Index table to Lookup table
		Given User is on the Saperion Homepage
		When User Click on design button
		And User Click on create button
		Then User Click on Ok button
		And User click on new column section
		Then User Click on New section
		And User Choose the datatype of that index field
		Then enter Lookup Table information applicationname "Lookup01a" searchform "lookup_q01a"
		Then User Enter Index field name "id"
		Then User Click on Ok button
		Then User Click on Ok button
		And User Enter the name of the Index table "Index_lookup01a"
		Then User Click on Ok button

	@LookuptableScenario
	@SearchFormCreation
	Scenario: Validate the functionality of creation of Search table
		Given User is on the Saperion Homepage
		When User Click on design button
		And User Click on Create Search form
		And User Click Create button in form
		Then User click on Form button
		And User click on Save button
		Then User Enter the Search form name "Index_lookup01a_q"
		Then User Click on Ok button

	@LookuptableScenario
	@IndexFormCreation
	Scenario: Validate the functionality of creation of Index table
		Given User is on the Saperion Homepage
		When User Click on design button
		And User Click on Create Index form
		And User Click Create button in form
		Then User click on Form button
		And User click on Save button
		Then User Enter the Index form name "Index_lookup01a_i"
		Then User Click on Ok button





