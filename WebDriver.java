package project2;
/*
Provide Implementation for the diagram below. Then create a test class in which you need to create Objects of
ChromeDriver, FirefoxDrive and SafariDriver classes and see which methods available to them.
 */
public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver{
    void navigate();
}
interface TakesScreenShot extends RemoteWebDriver{
    void getScreenshot();
}
class ChromeDriver implements RemoteWebDriver, TakesScreenShot {

    @Override
    public void open() {
        System.out.println("Open Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome Browser");
    }

    @Override
    public String getTitle() {
        return "Get Title Chrome Browser";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Chrome Browser");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take screenshort Chrome ");
    }
}
class FirefoxDriver implements RemoteWebDriver, TakesScreenShot {

    @Override
    public void open() {
        System.out.println("Open Firefox");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox");
    }

    @Override
    public String getTitle() {
        return "Get Title Firefox";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Firefox");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take screenshort Firefox");
    }
}
class SafariDriver implements RemoteWebDriver, TakesScreenShot {

    @Override
    public void open() {
        System.out.println("Open Safari Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Safari Browser");
    }

    @Override
    public String getTitle() {
        return "Get Safari Title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Safari Browser");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take screen short Safari");
    }
}