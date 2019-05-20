package jessyCucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.After;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import static org.junit.Assert.*;

public class Login extends BaseTest{

  public String url = "https://www.propins.cl/login";
  private WebElement emailInput;
  private WebElement passwordInput;

  @Given("URL login section")
  public void url_login_section() {
    driver.get(url);
  }

  @When("I fill email {string}")
  public void i_fill_email(String email) {
    emailInput = driver.findElement(By.name("email"));
    emailInput.sendKeys(email);
  }

  @And("I fill password {string}")
  public void i_fill_password(String password) {
    passwordInput = driver.findElement(By.name("password"));
    passwordInput.sendKeys(password);
  }

  @Then("I'm in home page")
  public void i_m_in_home_page() {
    throw new cucumber.api.PendingException();
  }

  @After
  public void closeDriver() {
    driver.close();
  }
}

