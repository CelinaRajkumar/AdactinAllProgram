$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/AdactingUsingBaseClass.feature");
formatter.feature({
  "name": "Book a Ticket using Adacting Page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Adactin"
    }
  ]
});
formatter.background({
  "name": "User need to be in the Aadactin Page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "User need to book a Hotel ticket in the Adacting Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Adactin"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Launch Adactin Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinusingBaseClass.launch_Adactin_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter the credntials username and password",
  "rows": [
    {
      "cells": [
        "DiyaReneesh",
        "Diya@2015"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AdactinusingBaseClass.the_user_enter_the_credntials_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Login",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinusingBaseClass.click_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the entered details are correct",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinusingBaseClass.verify_the_entered_details_are_correct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search the required hotel location and room and inDate and outDate and adult along with the Dates and click Search",
  "rows": [
    {
      "cells": [
        "Adelaide",
        "4 - Four",
        "23/06/2021",
        "25/06/2021",
        "3 - Three"
      ]
    },
    {
      "cells": [
        "Paris",
        "2 - Two",
        "25/06/2021",
        "30/06/2021",
        "4 - Four"
      ]
    },
    {
      "cells": [
        "Los Angeles",
        "2 - Two",
        "26/06/2021",
        "27/06/2021",
        "3 - Three"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AdactinusingBaseClass.search_the_required_hotel_location_and_room_and_inDate_and_outDate_and_adult_along_with_the_Dates_and_click_Search(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the Required Hotel and Continue",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinusingBaseClass.select_the_Required_Hotel_and_Continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter details fname and lname and address and cc and cvv for booking Confimration and Book",
  "rows": [
    {
      "cells": [
        "fname",
        "lname",
        "address",
        "cc",
        "ccType",
        "eDate",
        "eYear",
        "cvv"
      ]
    },
    {
      "cells": [
        "Drizzle",
        "Drew",
        "Chennai",
        "4567123445671234",
        "VISA",
        "July",
        "2022",
        "300"
      ]
    },
    {
      "cells": [
        "Thunder",
        "Roger",
        "Chennai",
        "4569789412345698",
        "Master Card",
        "June",
        "2022",
        "289"
      ]
    },
    {
      "cells": [
        "Pepper",
        "Clint",
        "Chennai",
        "6589456915987532",
        "American Express",
        "April",
        "2022",
        "199"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AdactinusingBaseClass.enter_details_fname_and_lname_and_address_and_cc_and_cvv_for_booking_Confimration_and_Book(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Print the Order number",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinusingBaseClass.print_the_Order_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Logout",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinusingBaseClass.click_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User need to be in the Aadactin Page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "User needs to check the iternary",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Adactin"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User launch the Adacting browser",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinusingBaseClass.user_launch_the_Adacting_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "CelinaRaj88",
        "Diya@2015"
      ]
    },
    {
      "cells": [
        "DiyaReneesh",
        "Diya@2015"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AdactinusingBaseClass.user_enter_the_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks booked Itenary",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinusingBaseClass.the_user_clicks_booked_Itenary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Logout",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinusingBaseClass.click_Logout()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/Amazon.feature");
formatter.feature({
  "name": "User must search for a product and add to cart",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Amazon"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the Amazon App",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinusingBaseClass.launch_the_Amazon_App()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search for the Apple Watch and give a Search",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinusingBaseClass.search_for_the_Apple_Watch_and_give_a_Search()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User must launch amazon app and search for Apple watch",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Amazon"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "the user must click on Apple Watch 6",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinusingBaseClass.the_user_must_click_on_Apple_Watch(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the Amazon App",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinusingBaseClass.launch_the_Amazon_App()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search for the Apple Watch and give a Search",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinusingBaseClass.search_for_the_Apple_Watch_and_give_a_Search()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User must launch amazon app and search for Apple watch",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Amazon"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "the user must click on Apple Watch 5",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinusingBaseClass.the_user_must_click_on_Apple_Watch(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/Gmail.feature");
formatter.feature({
  "name": "Login into Gmail account and checking sent Items",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Gmail"
    }
  ]
});
formatter.scenario({
  "name": "User login to Gmail account using valid credentials and checks sent items",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Gmail"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Login into the Gamil account",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinusingBaseClass.login_into_the_Gamil_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters UserID and Password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "CelinaRenu",
        "Daddylove@1954"
      ]
    },
    {
      "cells": [
        "autotest1988",
        "Diya@2015"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AdactinusingBaseClass.the_user_enters_UserID_and_Password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Login",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinusingBaseClass.the_user_clicks_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to verify if the user has entered the right page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinusingBaseClass.to_verify_if_the_user_has_entered_the_right_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/GreensCourses.feature");
formatter.feature({
  "name": "To Navigate across different courses in the Greens Application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Greens"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in Green Technology Page",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinusingBaseClass.userIsInGreenTechnologyPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Navigate across different course",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Greens"
    }
  ]
});
formatter.step({
  "name": "the user selects courses",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinusingBaseClass.theUserSelectsCourses()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on Selecting Courses navigates to Java Training",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinusingBaseClass.onSelectingCoursesNavigatesToJavaTraining()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects J2EE training",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinusingBaseClass.userSelectsJEETraining(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in Green Technology Page",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinusingBaseClass.userIsInGreenTechnologyPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To Navigate across different course",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Greens"
    }
  ]
});
formatter.step({
  "name": "the user selects courses",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinusingBaseClass.theUserSelectsCourses()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "on Selecting Courses navigates to software testing Training",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinusingBaseClass.onSelectingCoursesNavigatesToSoftwareTestingTraining()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects LoadRunner training",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinusingBaseClass.userSelectsLoadRunnerTraining()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in Green Technology Page",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinusingBaseClass.userIsInGreenTechnologyPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Greens"
    }
  ]
});
formatter.step({
  "name": "the User Click on careers",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinusingBaseClass.theUserClickOnCareers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on syllabus",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinusingBaseClass.clickOnSyllabus()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in Green Technology Page",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinusingBaseClass.userIsInGreenTechnologyPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Greens"
    }
  ]
});
formatter.step({
  "name": "the User Click on Contact Us",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinusingBaseClass.theUserClickOnContactUs()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/Nykka.feature");
formatter.feature({
  "name": "To search  a product from a given site",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Nykaa"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To Search for a cosmetic brand in Nykaa Site",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch to the Nykaa site",
  "keyword": "Given "
});
formatter.step({
  "name": "User navigates to Brands",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on a particular \"\u003cBrands\u003e\" brand",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Brands"
      ]
    },
    {
      "cells": [
        "M.A.C"
      ]
    },
    {
      "cells": [
        "Lakme"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To Search for a cosmetic brand in Nykaa Site",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Nykaa"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch to the Nykaa site",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinusingBaseClass.launchToTheNykaaSite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Brands",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinusingBaseClass.userNavigatesToBrands()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on a particular \"M.A.C\" brand",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinusingBaseClass.userClicksOnAParticularBrand(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d91.0.4472.124)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-QUOG6GQ\u0027, ip: \u0027192.168.29.19\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.124, chrome: {chromedriverVersion: 91.0.4472.101 (af52a90bf870..., userDataDir: C:\\Users\\celin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:57961}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: e8f3c2456c3f4b26697a30b1a93fda3d\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy20.sendKeys(Unknown Source)\r\n\tat com.basePack.BaseClass.toInput(BaseClass.java:61)\r\n\tat com.StepDef.AdactinusingBaseClass.userClicksOnAParticularBrand(AdactinusingBaseClass.java:400)\r\n\tat ✽.User clicks on a particular \"M.A.C\" brand(file:src/test/resources/Features/Nykka.feature:7)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To Search for a cosmetic brand in Nykaa Site",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Nykaa"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch to the Nykaa site",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinusingBaseClass.launchToTheNykaaSite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Brands",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinusingBaseClass.userNavigatesToBrands()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on a particular \"Lakme\" brand",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinusingBaseClass.userClicksOnAParticularBrand(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#brandSearchBox\"}\n  (Session info: chrome\u003d91.0.4472.124)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-QUOG6GQ\u0027, ip: \u0027192.168.29.19\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 91.0.4472.124, chrome: {chromedriverVersion: 91.0.4472.101 (af52a90bf870..., userDataDir: C:\\Users\\celin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:63798}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d5131d38d76a5f0ffd3320318c08babb\n*** Element info: {Using\u003did, value\u003dbrandSearchBox}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.sendKeys(Unknown Source)\r\n\tat com.basePack.BaseClass.toInput(BaseClass.java:61)\r\n\tat com.StepDef.AdactinusingBaseClass.userClicksOnAParticularBrand(AdactinusingBaseClass.java:400)\r\n\tat ✽.User clicks on a particular \"Lakme\" brand(file:src/test/resources/Features/Nykka.feature:7)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To Search Cotton saree in Hand Made Saree Site",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Nykaa"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch to the Sundariihandmade site",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinusingBaseClass.launchToTheSundariihandmadeSite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user navigates to shop by category",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinusingBaseClass.theUserNavigatesToShopByCategory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks Cotton Blouses",
  "rows": [
    {
      "cells": [
        "Type"
      ]
    },
    {
      "cells": [
        "Cotton"
      ]
    },
    {
      "cells": [
        "Silk"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AdactinusingBaseClass.theUserClicksCottonBlouses(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});