package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {

	LoginPage loginPage;
	DatabasePage databasePage;

	@Before
	public void setUp() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		databasePage = new DatabasePage();
	}
	@Given("User is on codefios login page")
	public void userIsOnCodefiosLoginPage() {
//		driver.get("https://qa.codefios.com/login");
		driver.get("https://codefios.com/ebilling");
	}

	@When("User enters username as {string}")
	public void user_enters_username(String username) {
		loginPage.enterUserName(username);
	}

	@When("User enters password as {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);
	}
	
	@When("User enters {string} from Database")
	public void user_enters_from_Database(String credentials) {
		if (credentials.equalsIgnoreCase("username")) {
			loginPage.enterUserName(databasePage.getDataFromDatabase("user_name"));
		}else if(credentials.equalsIgnoreCase("password")) {
			loginPage.enterPassword(databasePage.getDataFromDatabase("user_password"));
		}else {
			System.out.println("Could not retrieve data from DB");
		}
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickSignInButton();
	}

	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
