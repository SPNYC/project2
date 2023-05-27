package project2;

public class WebDriverTester {
    public static void main(String[] args) {
        ChromeDriver chrome=new ChromeDriver();
        chrome.open();
        chrome.close();
        chrome.getTitle();
        chrome.navigate();
        chrome.getScreenshot();

        System.out.println("----------------------------------");

        FirefoxDriver fox=new FirefoxDriver();
        fox.open();
        fox.close();
        fox.getTitle();
        fox.navigate();
        fox.getScreenshot();

        System.out.println("-----------------------------------");

        SafariDriver safari=new SafariDriver();
        safari.open();
        safari.close();
        safari.getTitle();
        safari.navigate();
        safari.getScreenshot();
    }
}
