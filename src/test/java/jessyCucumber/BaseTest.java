package jessyCucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import static org.junit.Assert.*;

public class BaseTest {
  public WebDriver driver = new FirefoxDriver();
}
