package system;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import system.helpers.DriverManager;


class Main {

    private WebDriver driver;

    @BeforeEach
    void before() {
        this.driver = DriverManager.getDriver();
    }

    @AfterEach
    void after() {
        DriverManager.quitDriver();
    }

    @Disabled("...")
    @Test
    void atividade13() {
    }

    @Disabled("...")
    @Test
    void atividade14() {
    }

    @Disabled("...")
    @Test
    void atividade15() {
    }
}
