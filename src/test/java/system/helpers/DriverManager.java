package system.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.logging.Level;
import java.util.logging.Logger;

import static system.helpers.Constants.CHROME_DRIVER_PATH;

public class DriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
            System.setProperty("webdriver.chrome.silentOutput", "true"); // opcional
            Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF); // opcional
            driver = new ChromeDriver();
        }

        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}