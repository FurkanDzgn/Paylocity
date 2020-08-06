package PageFactory;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    private HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public static HomePage getPage(){
        return new HomePage();
    }

    @FindBy(xpath = "//button[@id='add']")
    public WebElement addEmployeeButton;

    @FindBy(xpath = "//tr")
    public List<WebElement> countOfEmployees;

    @FindBy(xpath = "//tr[2]//td[2]")
    public WebElement firstName;

    @FindBy(xpath = "//tr[2]//td[3]")
    public WebElement lastName;

    @FindBy(xpath = "//tr[2]//td[7]")
    public WebElement netPay;


}
