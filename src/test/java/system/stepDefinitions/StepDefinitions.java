package system.stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import static org.junit.jupiter.api.Assertions.*;

import system.pages.MainPage;

public class StepDefinitions {

    @Dado("que o usuário acessou o SeleniumEasy")
    public void acessarPaginaPrincipal() {
        MainPage paginaPrincipal = new MainPage();
        paginaPrincipal.acessar();
    }

    @Quando("o conteúdo da página principal é mostrado")
    public void conteudoMostrado() {
        // nada
    }

    @Então("o usuário visualiza que o nome do site é {string}")
    public void visualizarNomeDoSite(String nomeSiteEsperado) {
        MainPage paginaPrincipal = new MainPage();

        assertEquals(
                nomeSiteEsperado,
                paginaPrincipal.getSiteName(),
                "O nome do site está correto"
        );
    }

}
