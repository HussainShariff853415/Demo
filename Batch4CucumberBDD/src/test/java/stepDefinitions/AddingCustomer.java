package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ToAddCustomer;

public class AddingCustomer {

	WebDriver driver = new ChromeDriver();
	ToAddCustomer obj = new ToAddCustomer(driver);
	
	@Given("^Launch the Application$")
	public void launch_the_Application() throws Throwable {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		Thread.sleep(5000);
	}

	@When("^i click bank manager login button and add customer button$")
	public void i_click_bank_manager_login_button_and_add_customer_button() throws Throwable {
	  obj.toClickBankManagerButton();
	  obj.toClickAddCustomerButton();
	  obj.passData();
		obj.submitTheData();
	}
	
	//Then i should enter <FirstName> and <LastName> and <PostCode> and click addCustomer button
	@Then("^i should enter ([^\"]*) and ([^\"]*) and ([^\"]*) and click addCustomer button$")
	public void i_should_enter_Anand_and_Anand_and_and_click_addCustomer_button(String firstName, String lastName, String postCode) throws Throwable {
	   
		obj.passData(firstName, lastName, postCode);
		//obj.submitTheData();
	}
	
	@Then("^i should handle the alert box$")
	public void i_should_handle_the_alert_box() throws Throwable {
	  obj.toHandleTheAlert();
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
