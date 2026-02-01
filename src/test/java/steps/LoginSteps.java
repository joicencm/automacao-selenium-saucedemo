package steps;

import io.cucumber.java.en.*;
import pages.LoginPage;
import static org.junit.Assert.*;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("que eu acesso a página de login")
    public void acessarLogin() {
        loginPage.acessarUrl("https://www.saucedemo.com/");
    }

    @When("eu informo usuário {string} e senha {string}")
    public void informarUsuarioSenha(String usuario, String senha) {
        loginPage.login(usuario, senha);
    }

    @Then("devo ser direcionado para a página de produtos")
    public void validarLogin() {
        String titulo = loginPage.obterTituloDaPagina();
        assertEquals("Swag Labs", titulo);
    }
}
