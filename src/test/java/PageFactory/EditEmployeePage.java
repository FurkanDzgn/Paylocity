package PageFactory;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditEmployeePage {

    private EditEmployeePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public static EditEmployeePage getPage(){
        return new EditEmployeePage();
    }

    @FindBy(xpath = "//button[@id='updateEmployee']")
    public WebElement updateEmployeeButton;

}
