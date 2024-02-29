package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.DashboardPage;
import pages.TestBase;

public class DashboardStepDefinition extends TestBase{

	DashboardPage dashboardPage;
	
	
	@Then("User should be landing on dashboard page")
	public void user_should_be_landing_on_dashboard_page() {

		takeScreenshot(driver);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);

		String expDashboardText = "Dashboard";
		String actualDashboardText = dashboardPage.getDashboardText();
		Assert.assertEquals("Dashboard page not found",expDashboardText, actualDashboardText);
		
	}
	
	@When("User clicks on list accounts link")
	public void user_clicks_on_list_accounts_link() {
	   dashboardPage.clickListAccount();
	}

	

	
}
