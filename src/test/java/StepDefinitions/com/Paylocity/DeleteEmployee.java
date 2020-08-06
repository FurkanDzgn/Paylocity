package StepDefinitions.com.Paylocity;

import PageFactory.AddEmployeePage;
import PageFactory.DeleteEmployeePage;
import PageFactory.HomePage;
import PageFactory.LoginPage;
import Utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.hu.De;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DeleteEmployee {

    HomePage homePage = HomePage.getPage();
    DeleteEmployeePage deleteEmployee= DeleteEmployeePage.getPage();
    List<String> employeesID;
    String lastEmp;

    @Then("Click delete employee button")
    public void click_delete_employee_button() {

        employeesID = new ArrayList<>();
        for(WebElement empId:homePage.employeesID){
            employeesID.add(empId.getText());
        }
        lastEmp=homePage.employeesID.get(homePage.employeesID.size()-1).toString();
        homePage.deleteButton.click();
        deleteEmployee.deleteOption.click();

    }

    @Then("validate the employee deleted")
    public void validate_the_employee_deleted() {

        for(WebElement empID:homePage.employeesID){
            if(lastEmp.equalsIgnoreCase(empID.getText())){
                Assert.fail();
            }
        }

    }
}
