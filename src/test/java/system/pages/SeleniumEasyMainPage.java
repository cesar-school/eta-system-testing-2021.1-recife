package system.pages;

import org.openqa.selenium.WebDriver;
import system.helpers.DriverManager;
import static system.helpers.PagesURL.SELENIUM_EASY_MAIN_PAGE;

public class SeleniumEasyMainPage {

    /*
     Representação
     */
    private WebDriver driver;


    /*
     Interação
     */

    public SeleniumEasyMainPage() {
        this.driver = DriverManager.getDriver();
    }

    public void acessar() {
        this.driver.get(SELENIUM_EASY_MAIN_PAGE);
    }
}
