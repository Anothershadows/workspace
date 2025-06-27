$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\featutes\\palasibazar.feature");
formatter.feature({
  "name": "Travel Insurance Flow",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "Apply for travel insurance",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "the user navigates to the application",
  "keyword": "Given "
});
formatter.match({
  "location": "palasibazarpage.theUserNavigatesToTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects a travel date",
  "keyword": "And "
});
formatter.match({
  "location": "palasibazarpage.theUserSelectsATravelDate()"
});
formatter.result({
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found in the current frame\n  (Session info: chrome\u003d135.0.7049.115)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#stale-element-reference-exception\nBuild info: version: \u00274.27.0\u0027, revision: \u0027d6e718d134\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002721.0.6\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [3142460d65ee35489b89bcab60dfda40, clickElement {id\u003df.10EF4A5BC070C6E16B7F0DA6CBF22FDC.d.BEFB3AB99A5DD0AD84C27D076183D461.e.57}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 135.0.7049.115, chrome: {chromedriverVersion: 135.0.7049.114 (63fd8a7d9d0..., userDataDir: C:\\Users\\gokul\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:61642}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:61642/devtoo..., se:cdpVersion: 135.0.7049.115, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nElement: [[ChromeDriver: chrome on windows (3142460d65ee35489b89bcab60dfda40)] -\u003e xpath: //span[starts-with(text(), \u0027Start date\u0027)]]\nSession ID: 3142460d65ee35489b89bcab60dfda40\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)\r\n\tat org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:167)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:138)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:50)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:190)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:223)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:76)\r\n\tat java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:580)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy19.click(Unknown Source)\r\n\tat Pages.palasibazarpage.theUserSelectsATravelDate(palasibazarpage.java:31)\r\n\tat ✽.the user selects a travel date(src\\test\\java\\featutes\\palasibazar.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the user selects the destination place",
  "keyword": "And "
});
formatter.match({
  "location": "palasibazarpage.theUserSelectsTheDestinationPlace()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks the \"Travel\" button",
  "keyword": "When "
});
formatter.match({
  "location": "palasibazarpage.theUserClicksTheButton(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user reads the policy details",
  "keyword": "And "
});
formatter.match({
  "location": "palasibazarpage.theUserReadsThePolicyDetails()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the travel count should be displayed correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "palasibazarpage.theTravelCountShouldBeDisplayedCorrectly()"
});
formatter.result({
  "status": "skipped"
});
});