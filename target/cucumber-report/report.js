$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("abtesting.feature");
formatter.feature({
  "line": 1,
  "name": "AB testing page navigation test",
  "description": "",
  "id": "ab-testing-page-navigation-testformatter.before({
  "durationformatter.before({
  "duration": 34843104900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Automate navigation to HerokuApp",
  "description": "",
  "id": "ab-testing-page-navigation-test;automate-navigation-to-herokuapp",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Verify that user is on herokuapp homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks on AB testing link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User navigates to AB Testing page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "formatter.result({
  "duration": 1560917570formatter.before({
  "duration": 30875443700,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Automate formatter.result({
  "duration": 300328517900,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//h2[contains(@class,\"ribe-page-title\")]\"}\n  (Session info: chrome\u003d76.0.3809.132)\n  (Driver info: chromedriver\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a),platform\u003dWindows NT 10.0.18362 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.9.1\u0027, revision: \u002763f7b50\u0027, time: \u00272018-02-07T22:25:02.294Z\u0027\nSystem info: host: \u0027DESKTOP-ELP0SLD\u0027, ip: \u002710.0.0.13\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.43.600210 (68dcf5eebde371..., userDataDir: C:\\Users\\Asifa\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:51572}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 76.0.3809.132, webStorageEnabled: true}\nSession ID: 996b3500cf6f716cc4ec39c9d51c82bb\n*** Element info: {Using\u003dxpath, value\u003d//h2[contains(@class,\"ribe-page-title\")]}\r\n\tat sun.reflect.GeneratedConstructorAccessor11.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.getText(Unknown Source)\r\n\tat com.automation.Utils.AssertionUtils.assertPresent(AssertionUtils.java:12)\r\n\tat com.automation.Pages.SelectDepartingFlightPage.verifyFlightBookingResults(SelectDepartingFlightPage.java:20)\r\n\tat com.automation.Steps.SelectDepartingFlightSteps.verify_flight_booking_results(SelectDepartingFlightSteps.java:11)\r\n\tat ✽.Then verify flight booking results(bookingflight.feature:6)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 36000,
  "status": "passed"
});
});