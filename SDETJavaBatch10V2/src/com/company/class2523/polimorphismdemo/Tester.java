package com.company.class2523.polimorphismdemo;

public class Tester {
    public static void main(String[] args) {

        WebDriver [] webDrivers={new GoogleChrome(), new FireFox(),new IE(), new Safari()};
        for (WebDriver drive:webDrivers
             ) {
            testOnAllBrowser(drive);
        }


    }
    static void testOnAllBrowser(WebDriver webDriver){
        webDriver.openBrowser();
        webDriver.loadWebsite("www.google.com");
        webDriver.Test1();
        webDriver.Test2();
        webDriver.TestFileDownload();
        webDriver.closeBrowser();
    }
}
