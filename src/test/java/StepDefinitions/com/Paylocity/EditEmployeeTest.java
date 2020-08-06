package StepDefinitions.com.Paylocity;

import PageFactory.AddEmployeePage;
import PageFactory.EditEmployeePage;
import PageFactory.HomePage;
import PageFactory.LoginPage;
import Utils.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EditEmployeeTest {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = HomePage.getPage();
    AddEmployeePage addEmployeePage = AddEmployeePage.getPage();
    EditEmployeePage editEmployeePage = EditEmployeePage.getPage();

    public static String firstName = "Carlos";
    public static String lastName = "Kruz";
    public static String dependants = "3";

    @Then("Click action edit employee button")
    public void click_action_edit_employee_button() {

        homePage.editButton.get(homePage.editButton.size()-1).click();
    }

    @Then("edit employee details")
    public void edit_employee_details() {

        addEmployeePage.firstName.clear();
        addEmployeePage.firstName.sendKeys(firstName);
        addEmployeePage.lastName.clear();
        addEmployeePage.lastName.sendKeys(lastName);
        addEmployeePage.dependants.clear();
        addEmployeePage.dependants.sendKeys(dependants);
        editEmployeePage.updateEmployeeButton.click();

    }

    @Then("validate employee who is edited")
    public void validate_employee_who_is_edited() {

        String expectedFirstName = homePage.firstNames.get(homePage.firstNames.size()-1).getText();
        String expectedLastName = homePage.lastNames.get(homePage.lastNames.size()-1).getText();

        Assert.assertEquals("Conflict in first name",expectedFirstName,firstName);
        Assert.assertEquals(expectedLastName,lastName);

    }
}
