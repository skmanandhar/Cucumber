package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {

	WebDriver driver;
	
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//strong[contains(text(),'Dashboard')]")
	public WebElement DASHBOARD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'List Accounts')]")
	public WebElement LIST_ACCOUNTS_ELEMENT;

	public String getDashboardText() {
		return DASHBOARD_ELEMENT.getText();
	}
	
	public void clickListAccount() {
		LIST_ACCOUNTS_ELEMENT.click();
	}
}
