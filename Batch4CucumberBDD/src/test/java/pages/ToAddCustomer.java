package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ToAddCustomer {
	
	WebDriver driver;
	
	public ToAddCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
	WebElement bankManagerButton;
	
	@FindBy(xpath = "//button[contains(text(),'Add Customer')]")
	WebElement addCustomerButton;
	
	@FindBy(xpath = "(//input)[1]")
	WebElement firstName;
	
	
	
	
	
	
	@FindBy(xpath = "(//input)[2]")
	WebElement lastName;
	
	@FindBy(xpath = "(//input)[3]")
	WebElement pinCode;
	
	@FindBy(xpath = "(//button[contains(text(),'Add Customer')])[2]")
	WebElement addCustomerButton2;
	
	
	public void toClickBankManagerButton() throws InterruptedException
	{
		bankManagerButton.click();
		Thread.sleep(3000);
	}
	
	
	public void toClickAddCustomerButton() throws InterruptedException
	{
		addCustomerButton.click();
		Thread.sleep(3000);
		
	}
	
	
	public void passData(String fname, String lname, String postCode)
	{
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		pinCode.sendKeys(postCode);
	}
		
	public void passData()
	{
		firstName.sendKeys("Hussain");
		lastName.sendKeys("Shariff");
		pinCode.sendKeys("534001");
	}
	
	
	
	
	public void submitTheData() throws InterruptedException
	{
		addCustomerButton2.click();
		
		
		Thread.sleep(2000);
	}
	
	public void toHandleTheAlert()
	{
		driver.switchTo().alert().accept();
	}
	
	
	

}
