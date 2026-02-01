package elements;

import org.openqa.selenium.By;

public class LoginElements {
    public By usernameField = By.id("user-name");
    public By passwordField = By.id("password");
    public By loginButton = By.id("login-button");
    public By errorMessage = By.cssSelector("h3[data-test='error']");
}
