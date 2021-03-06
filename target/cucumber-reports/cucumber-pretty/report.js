$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Desktop.feature");
formatter.feature({
  "line": 1,
  "name": "Desktop rich client Functionality",
  "description": "",
  "id": "desktop-rich-client-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Validate the login functionality of Saperion",
  "description": "",
  "id": "desktop-rich-client-functionality;validate-the-login-functionality-of-saperion",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@regression1"
    },
    {
      "line": 4,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User on Saperion login page and give credentials \"administrator\" and \"qa\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user select role",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user select appropriate client",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click ok button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User will sign on to the application",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "administrator",
      "offset": 50
    },
    {
      "val": "qa",
      "offset": 70
    }
  ],
  "location": "DesktopLoginstepdef.User_on_Saperion_login_page_and_give_credentials_and(String,String)"
});
formatter.result({
  "duration": 8534244600,
  "status": "passed"
});
formatter.match({
  "location": "DesktopLoginstepdef.user_select_role()"
});
formatter.result({
  "duration": 1502220500,
  "status": "passed"
});
formatter.match({
  "location": "DesktopLoginstepdef.user_select_appropriate_client()"
});
formatter.result({
  "duration": 1378196600,
  "status": "passed"
});
formatter.match({
  "location": "DesktopLoginstepdef.user_click_ok_button()"
});
formatter.result({
  "duration": 575003900,
  "status": "passed"
});
formatter.match({
  "location": "DesktopHomepagestepdef.User_will_sign_on_to_the_application()"
});
formatter.result({
  "duration": 10586719000,
  "status": "passed"
});
formatter.uri("ZAnnotationn.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#//////////////sulagna/////////////"
    }
  ],
  "line": 2,
  "name": "Desktop rich client Annotation functionality",
  "description": "",
  "id": "desktop-rich-client-annotation-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 81,
  "name": "Validate that file cannot be editted/deleted when checkedout from another user",
  "description": "",
  "id": "desktop-rich-client-annotation-functionality;validate-that-file-cannot-be-editted/deleted-when-checkedout-from-another-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 80,
      "name": "@CheckOutValidationDiffUser"
    }
  ]
});
formatter.step({
  "line": 82,
  "name": "User is on the Saperion Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 83,
  "name": "DDC named \"DDC\" is present in Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 84,
  "name": "Search for file in the ddc with name \"doc\"",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "Right click on the \"doc\" file",
  "keyword": "Then "
});
formatter.step({
  "line": 86,
  "name": "Select option \"CheckOut\"",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "Switch user with id \"user2\" and password \"user22222\"",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "find \"DDC\" and search for doc named \"doc\"",
  "keyword": "When "
});
formatter.step({
  "line": 89,
  "name": "Look for checkout indicator present for the \"doc\"",
  "keyword": "Then "
});
formatter.step({
  "line": 90,
  "name": "The \"doc\" doesnot have Delete option",
  "keyword": "Then "
});
formatter.match({
  "location": "DesktopHomepagestepdef.user_is_on_the_Saperion_Homepage()"
});
formatter.result({
  "duration": 427924500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DDC",
      "offset": 11
    }
  ],
  "location": "AnnotationStepDef.ddc_named_something_is_present_in_homepage(String)"
});
formatter.result({
  "duration": 2410702500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "doc",
      "offset": 38
    }
  ],
  "location": "AnnotationStepDef.search_for_jpg_file_in_the_ddc_with_name_something(String)"
});
formatter.result({
  "duration": 5758958500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "doc",
      "offset": 20
    }
  ],
  "location": "AnnotationStepDef.right_click_on_the_something_file(String)"
});
formatter.result({
  "duration": 1066731600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CheckOut",
      "offset": 15
    }
  ],
  "location": "AnnotationStepDef.select_option_something(String)"
});
formatter.result({
  "duration": 3528465600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user2",
      "offset": 21
    },
    {
      "val": "user22222",
      "offset": 42
    }
  ],
  "location": "AnnotationStepDef.switch_user_with_id_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 14062327100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DDC",
      "offset": 6
    },
    {
      "val": "doc",
      "offset": 37
    }
  ],
  "location": "AnnotationStepDef.find_something_and_search_for_doc_named_something(String,String)"
});
formatter.result({
  "duration": 11977415600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "doc",
      "offset": 45
    }
  ],
  "location": "AnnotationStepDef.look_for_ckeckout_indicator_present_for_the_something(String)"
});
formatter.result({
  "duration": 240683700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "doc",
      "offset": 5
    }
  ],
  "location": "AnnotationStepDef.the_something_doesnot_have_delete_option(String)"
});
formatter.result({
  "duration": 2339375900,
  "status": "passed"
});
});