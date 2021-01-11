$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyTest.feature");
formatter.feature({
  "line": 1,
  "name": "Reset functionality on login page of Application",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verification of Reset button",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "Open the Chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Enter the \"\u003cuname\u003e\" and  \"\u003cpass\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "click login button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "check the login sucessfully or not",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button;",
  "rows": [
    {
      "cells": [
        "uname",
        "pass"
      ],
      "line": 18,
      "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button;;1"
    },
    {
      "cells": [
        "ranjitk",
        "Ranjit7001"
      ],
      "line": 19,
      "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button;;2"
    },
    {
      "cells": [
        "cdscsdc",
        "Ranjit7001"
      ],
      "line": 20,
      "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "Verification of Reset button",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "Open the Chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Enter the \"ranjitk\" and  \"Ranjit7001\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "click login button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "check the login sucessfully or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.open_lunch()"
});
formatter.result({
  "duration": 35993439964,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Step.click()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step.validate()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 20,
  "name": "Verification of Reset button",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-reset-button;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "Open the Chrome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Enter the \"cdscsdc\" and  \"Ranjit7001\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "click login button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "check the login sucessfully or not",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.open_lunch()"
});
formatter.result({
  "duration": 66883289394,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: DevToolsActivePort file doesn\u0027t exist\nBuild info: version: \u00273.141.5\u0027, revision: \u0027d54ebd709a\u0027, time: \u00272018-11-06T11:42:16\u0027\nSystem info: host: \u0027DELL-PC\u0027, ip: \u0027192.168.43.24\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x0033ECE3+3337443]\n\tOrdinal0 [0x0021F041+2158657]\n\tOrdinal0 [0x000A6FA8+618408]\n\tOrdinal0 [0x0002114E+69966]\n\tOrdinal0 [0x0001DEF0+57072]\n\tOrdinal0 [0x0001C38A+50058]\n\tOrdinal0 [0x00045E8E+220814]\n\tOrdinal0 [0x00045BFC+220156]\n\tOrdinal0 [0x0004181B+202779]\n\tOrdinal0 [0x00023D74+81268]\n\tOrdinal0 [0x00024D6E+85358]\n\tOrdinal0 [0x00024CF9+85241]\n\tOrdinal0 [0x00236F2C+2256684]\n\tGetHandleVerifier [0x004C2FAC+1478332]\n\tGetHandleVerifier [0x004C2AFD+1477133]\n\tGetHandleVerifier [0x004CAAD8+1509864]\n\tGetHandleVerifier [0x004C369E+1480110]\n\tOrdinal0 [0x0022D6BD+2217661]\n\tOrdinal0 [0x002389AB+2263467]\n\tOrdinal0 [0x00238AEF+2263791]\n\tOrdinal0 [0x0024D363+2347875]\n\tBaseThreadInitThunk [0x764733CA+18]\n\tRtlInitializeExceptionChain [0x77239ED2+99]\n\tRtlInitializeExceptionChain [0x77239EA5+54]\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:123)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.copyInto(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(Unknown Source)\r\n\tat java.util.stream.AbstractPipeline.evaluate(Unknown Source)\r\n\tat java.util.stream.ReferencePipeline.findFirst(Unknown Source)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:125)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat StepDefination.Step.open_lunch(Step.java:25)\r\n\tat ✽.Given Open the Chrome and launch the application(MyTest.feature:7)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Step.click()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Step.validate()"
});
formatter.result({
  "status": "skipped"
});
});