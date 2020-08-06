package PageFactory;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteEmployeePage {

    private DeleteEmployeePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public static DeleteEmployeePage getPage(){
        return new DeleteEmployeePage();
    }
    @FindBy(xpath = "//button[@id='deleteEmployee']")
    public WebElement deleteOption;
}
