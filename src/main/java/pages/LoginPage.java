package pages;

import core.BasePage;
import elements.LoginElements;

public class LoginPage extends BasePage {
    private LoginElements elements = new LoginElements();

    public void login(String usuario, String senha) {
        driver.findElement(elements.usernameField).sendKeys(usuario);
        driver.findElement(elements.passwordField).sendKeys(senha);
        driver.findElement(elements.loginButton).click();
    }

    public String obterTituloDaPagina() {
        return driver.getTitle();
    }
}
