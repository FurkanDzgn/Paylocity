package StepDefinitions.com.Paylocity;

import PageFactory.AddEmployeePage;
import PageFactory.HomePage;
import PageFactory.LoginPage;
import Utils.BrowserUtils;
import Utils.ConfigReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class AddEmployeeTest {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = HomePage.getPage();
    AddEmployeePage addEmployeePage = AddEmployeePage.getPage();

    public static String firstName = "Carl";
    public static String lastName = "Kylie";
    public static String dependants = "4";

    @Given("User goes to the Website")
    public void user_goes_to_the_Website() {
        driver.navigate().to(ConfigReader.getProperty("url"));
        loginPage.userName.sendKeys(ConfigReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.loginButton.click();
    }

    @When("Valitade url and title")
    public void valitade_url_and_title() {

        String actualUrl = "https://wmxrwq14uc.execute-api.us-east-1.amazonaws.com/Prod/Benefits";
        String actualTitle = "Paylocity";
        String expectedUrl = driver.getCurrentUrl();
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(expectedUrl, actualUrl);
        Assert.assertTrue(expectedTitle.contains(actualTitle));
    }

    @Then("Click add employee button")
    public void click_add_employee_button() {

        homePage.addEmployeeButton.click();
    }

    @Then("enter employee details")
    public void enter_employee_details() throws InterruptedException {

        addEmployeePage.firstName.sendKeys(firstName);
        addEmployeePage.lastName.sendKeys(lastName);
        addEmployeePage.dependants.sendKeys(dependants);
        Thread.sleep(500);
        addEmployeePage.addButton.click();
    }

    @Then("the employee should save")
    public void the_employee_should_save() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        int countOfEmployee = homePage.countOfEmployees.size();
        Assert.assertTrue(countOfEmployee>2);
    }

    @Then("Validate employee who created from table")
    public void validate_employee_who_created_from_table() throws InterruptedException {

        Thread.sleep(1000);
        String expectedFirstName = homePage.firstName.getText();
        String expectedLastName = homePage.lastName.getText();
        Assert.assertEquals(firstName,expectedFirstName);
        Assert.assertEquals(lastName,expectedLastName);
    }

    @Then("the benefit cost calculations are correct")
    public void the_benefit_cost_calculations_are_correct() {
        int dep = Integer.parseInt(dependants);
        int expectedResult = (int) BrowserUtils.calculateNetPay(dep);
        int actualResult = (int) Double.parseDouble(homePage.netPay.getText());
        System.out.println(expectedResult);
        System.out.println(actualResult);
        Assert.assertTrue(expectedResult==actualResult);

    }

}
