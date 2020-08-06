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

    @FindBy(xpath = "//tr[2]//td[9]//i[2]")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[@id=\"employeesTable\"]//tbody//tr//td[1]")
    public List<WebElement> employeesID;

    @FindBy(xpath = "//tbody//td//i[@class='fas fa-edit']")
    public List<WebElement> editButton;

    @FindBy(xpath = "//tbody//tr//td[2]")
    public List<WebElement> firstNames;

    @FindBy(xpath = "//tbody//tr//td[3]")
    public List<WebElement> lastNames;







}
