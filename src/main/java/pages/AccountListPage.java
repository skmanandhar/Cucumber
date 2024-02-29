package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountListPage {

	WebDriver driver;
	
	public AccountListPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//strong[contains(text(),'Account List')]") 
	public WebElement ACCOUNT_LIST_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']") 
	public WebElement ADD_ACCOUNT_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//input[@id='account_name']") 
	public WebElement ACCOUNT_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//textarea[@id='description']") 
	public WebElement DESCRIPTION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']") 
	public WebElement BALANCE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']") 
	public WebElement ACCOUNT_NUM_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']") 
	public WebElement CONTACT_PERSON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id='accountSave']") 
	public WebElement SAVE_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Account Added Successfully.')]") 
	public WebElement ACCOUNT_ADDED_ALERT_ELEMENT;
	
	
	public String getAccountListText() {
		return ACCOUNT_LIST_ELEMENT.getText();
	}
	
	public void clickAddAccount() {
		ADD_ACCOUNT_ELEMENT.click();
	}
	
	public void enterAccountName(String accountName) {
		ACCOUNT_NAME_ELEMENT.sendKeys(accountName);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void enterDescription(String description) {
		DESCRIPTION_ELEMENT.sendKeys(description);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void enterBalance(String balance) {
		BALANCE_ELEMENT.sendKeys(balance);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void enterAccountNumber(String accountNum) {
		ACCOUNT_NUM_ELEMENT.sendKeys(accountNum);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public void enterContact(String contact) {
		CONTACT_PERSON_ELEMENT.sendKeys(contact);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void clickSaveButton() {
		SAVE_BUTTON_ELEMENT.click();
	}

	public String getAccountAddedAlertText() {
		return ACCOUNT_ADDED_ALERT_ELEMENT.getText();
	}
	
}
