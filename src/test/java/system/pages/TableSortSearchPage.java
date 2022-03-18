package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import system.helpers.DriverManager;

import java.util.List;

public class TableSortSearchPage {


    /*
     Representação
     */

    private WebDriver driver;
    private WebDriverWait wait;

    private By tabelaSeletor = By.cssSelector("#example");
    private By searchInputSeletor = By.cssSelector("#example_filter input");
    private By mensagemShowingSeletor = By.cssSelector("#example_info");
    private By linhasVisiveisTabelaSeletor = By.cssSelector("tbody tr");


    /*
     Construtor
     */

    public TableSortSearchPage() {
        this.driver = DriverManager.getDriver();
        this.wait = DriverManager.getDriverWait();
    }


    /*
     Interação
     */

    public void pesquisarPor(String texto) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(tabelaSeletor));
        WebElement searchInput = driver.findElement(searchInputSeletor);
        searchInput.sendKeys(texto);
    }

    public void aguardarTabelaSerFiltrada() {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(mensagemShowingSeletor, "filtered"));
    }

    public int getQuantidadeLinhasVisiveisNaTabela() {
        WebElement tabela = driver.findElement(tabelaSeletor);
        List<WebElement> linhasVisiveisTabela = tabela.findElements(linhasVisiveisTabelaSeletor);
        return linhasVisiveisTabela.size();
    }

}
