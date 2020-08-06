package PageFactory;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {

    private AddEmployeePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public static AddEmployeePage getPage(){
        return new AddEmployeePage();
    }

    @FindBy(xpath = "//button[@id='add']")
    public WebElement addEmployeeButton;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='dependants']")
    public WebElement dependants;

    @FindBy(id = "addEmployee")
    public WebElement addButton;
}
