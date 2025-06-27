$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\featutes\\irda.feature");
formatter.feature({
  "name": "irda",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.scenario({
  "name": "irda of india",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "error_message": "io.github.bonigarcia.wdm.config.WebDriverManagerException: java.net.UnknownHostException: googlechromelabs.github.io\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.handleException(WebDriverManager.java:1421)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:1190)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.fallback(WebDriverManager.java:1437)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.handleException(WebDriverManager.java:1415)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:1190)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.setup(WebDriverManager.java:427)\r\n\tat base.reusable.browserLaunch(reusable.java:38)\r\n\tat base.Myhooks.beforeScanerio(Myhooks.java:13)\r\n\tat java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:580)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:40)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:65)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:22)\r\n\tat java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:580)\r\n\tat org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeMethod(TestInvoker.java:664)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeTestMethod(TestInvoker.java:227)\r\n\tat org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:50)\r\n\tat org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:957)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:200)\r\n\tat org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:148)\r\n\tat org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.base/java.util.ArrayList.forEach(ArrayList.java:1596)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:848)\r\n\tat org.testng.TestRunner.run(TestRunner.java:621)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:443)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:437)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:397)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:336)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1280)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1200)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1114)\r\n\tat org.testng.TestNG.run(TestNG.java:1082)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:293)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:91)\r\nCaused by: java.net.UnknownHostException: googlechromelabs.github.io\r\n\tat java.base/java.net.InetAddress$CachedLookup.get(InetAddress.java:988)\r\n\tat java.base/java.net.InetAddress.getAllByName0(InetAddress.java:1818)\r\n\tat java.base/java.net.InetAddress.getAllByName(InetAddress.java:1688)\r\n\tat org.apache.hc.client5.http.SystemDefaultDnsResolver.resolve(SystemDefaultDnsResolver.java:43)\r\n\tat org.apache.hc.client5.http.impl.io.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:141)\r\n\tat org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:447)\r\n\tat org.apache.hc.client5.http.impl.classic.InternalExecRuntime.connectEndpoint(InternalExecRuntime.java:162)\r\n\tat org.apache.hc.client5.http.impl.classic.InternalExecRuntime.connectEndpoint(InternalExecRuntime.java:172)\r\n\tat org.apache.hc.client5.http.impl.classic.ConnectExec.execute(ConnectExec.java:142)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement.execute(ExecChainElement.java:51)\r\n\tat org.apache.hc.client5.http.impl.classic.ProtocolExec.execute(ProtocolExec.java:192)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement.execute(ExecChainElement.java:51)\r\n\tat org.apache.hc.client5.http.impl.classic.HttpRequestRetryExec.execute(HttpRequestRetryExec.java:96)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement.execute(ExecChainElement.java:51)\r\n\tat org.apache.hc.client5.http.impl.classic.ContentCompressionExec.execute(ContentCompressionExec.java:152)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement.execute(ExecChainElement.java:51)\r\n\tat org.apache.hc.client5.http.impl.classic.RedirectExec.execute(RedirectExec.java:115)\r\n\tat org.apache.hc.client5.http.impl.classic.ExecChainElement.execute(ExecChainElement.java:51)\r\n\tat org.apache.hc.client5.http.impl.classic.InternalHttpClient.doExecute(InternalHttpClient.java:170)\r\n\tat org.apache.hc.client5.http.impl.classic.CloseableHttpClient.execute(CloseableHttpClient.java:87)\r\n\tat org.apache.hc.client5.http.impl.classic.CloseableHttpClient.execute(CloseableHttpClient.java:55)\r\n\tat org.apache.hc.client5.http.classic.HttpClient.executeOpen(HttpClient.java:183)\r\n\tat io.github.bonigarcia.wdm.online.HttpClient.execute(HttpClient.java:157)\r\n\tat io.github.bonigarcia.wdm.online.Parser.parseJson(Parser.java:54)\r\n\tat io.github.bonigarcia.wdm.managers.ChromeDriverManager.getDriverUrls(ChromeDriverManager.java:117)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.createUrlHandler(WebDriverManager.java:1442)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.download(WebDriverManager.java:1268)\r\n\tat io.github.bonigarcia.wdm.WebDriverManager.manage(WebDriverManager.java:1184)\r\n\t... 45 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "verify user can navigate irda",
  "keyword": "Given "
});
formatter.match({
  "location": "irda.verifyUserCanNavigateIrda()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select eserivce",
  "keyword": "When "
});
formatter.match({
  "location": "irda.selectEserivce()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select form",
  "keyword": "And "
});
formatter.match({
  "location": "irda.selectForm()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select date",
  "keyword": "And "
});
formatter.match({
  "location": "irda.selectDate()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "test",
  "keyword": "And "
});
formatter.match({
  "location": "irda.test()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click clear",
  "keyword": "Then "
});
formatter.match({
  "location": "irda.clickClear()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(org.openqa.selenium.OutputType)\" because \"base.Myhooks.driver\" is null\r\n\tat base.Myhooks.Afterscanerio(Myhooks.java:22)\r\n\tat java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:580)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:48)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runScenario(TestNGCucumberRunner.java:65)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.runScenario(AbstractTestNGCucumberTests.java:22)\r\n\tat java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:580)\r\n\tat org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeMethod(TestInvoker.java:664)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeTestMethod(TestInvoker.java:227)\r\n\tat org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:50)\r\n\tat org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:957)\r\n\tat org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:200)\r\n\tat org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:148)\r\n\tat org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.base/java.util.ArrayList.forEach(ArrayList.java:1596)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:848)\r\n\tat org.testng.TestRunner.run(TestRunner.java:621)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:443)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:437)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:397)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:336)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1280)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1200)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1114)\r\n\tat org.testng.TestNG.run(TestNG.java:1082)\r\n\tat org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)\r\n\tat org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:293)\r\n\tat org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:91)\r\n",
  "status": "failed"
});
});