package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;

public class LeftMenuPage {

    private WebDriver driver;
    private WebDriverWait wait;

    /*
     Seletores
     */

    // Nav Menu
    private By navMenuSeletor = By.cssSelector("#navbar-brand-centered");
    private By tableBotaoSeletor = By.cssSelector(".nav > li:nth-child(3) a");

    // Table sub menu
    private By tableSortSearchBotaoSeletor = By.cssSelector(".nav > li:nth-child(3) .dropdown-menu > li:nth-child(4) a");


    /*
     Construtor
     */

    public LeftMenuPage() {
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }


    /*
     Interação
     */

    public void clicarBotaoTable() {
        WebElement navMenu = driver.findElement(navMenuSeletor);
        navMenu.findElement(tableBotaoSeletor).click();
    }

    public void clicarBotaoTableSortSearch() {
        WebElement navMenu = driver.findElement(navMenuSeletor);
        wait.until(ExpectedConditions.presenceOfElementLocated(tableSortSearchBotaoSeletor));
        navMenu.findElement(tableSortSearchBotaoSeletor).click();
    }
}
