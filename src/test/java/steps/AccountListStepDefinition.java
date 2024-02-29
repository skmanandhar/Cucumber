package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.AccountListPage;
import pages.TestBase;

public class AccountListStepDefinition extends TestBase{
	
	AccountListPage accountListPage;
	
	@Then("User should be landing on account list page")
	public void user_should_be_landing_on_account_list_page() {
	
		accountListPage = PageFactory.initElements(driver, AccountListPage.class);
		
		String expectedAccountListText = "Account List";
		String actualAccountListText = accountListPage.getAccountListText();
		Assert.assertEquals("Account List Page not found!!", expectedAccountListText,actualAccountListText);
		
	}
	
	@When("User clicks on Add account button")
	public void user_clicks_on_Add_account_button() {
		accountListPage.clickAddAccount();
	}

	@When("User enters account name as {string}")
	public void user_enters_account_name_as(String accountName) {
		accountListPage.enterAccountName(accountName);
	}

	@When("User enters description as {string}")
	public void user_enters_description_as(String description) {
		accountListPage.enterDescription(description);
	}

	@When("User enters initial balance as {string}")
	public void user_enters_initial_balance_as(String balance) {
		accountListPage.enterBalance(balance);
	}

	@When("User enters account number as {string}")
	public void user_enters_account_number_as(String accountNum) {
		accountListPage.enterAccountNumber(accountNum);
	}

	@When("User enters contact person as {string}")
	public void user_enters_contact_person_as(String contact) {
		accountListPage.enterContact(contact);
	}
	
	@When("User clicks on save button")
	public void user_clicks_on_save_button() {
		accountListPage.clickSaveButton();
	}
	
	@Then("User should be able to see account added alert")
	public void user_should_be_able_to_see_account_added_alert() {
		String expectedAlertText = "Account Added Successfully.";
		String actualAlertText = accountListPage.getAccountAddedAlertText();
		Assert.assertEquals("Account added alert not found!!", expectedAlertText, actualAlertText);
	}


}
