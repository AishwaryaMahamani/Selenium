package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.SignInPojo;
import io.cucumber.datatable.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleProject extends BaseClass {

	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
		launchBrowser();
		windowMaximize();
	}
    
	@When("To launch the url of the scent arts website")
	public void to_launch_the_url_of_the_scent_arts_website() {
		launchUrl("https://www.scentarts.ae/");
	}

	@When("Click the {String} button")
	public void click_the_button(String string) {
		WebElement aboutas = driver.findElement(By.xpath("(//a[text()='About Us'])[3]"));
		aboutas.click();
	}
	
	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	}

}