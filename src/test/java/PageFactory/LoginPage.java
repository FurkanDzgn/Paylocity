package PageFactory;

import Utils.ConfigReader;
import Utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='Username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement password;

    @FindBy(xpath="//button[contains(text(),'Log In')]")
    public WebElement loginButton;

}
