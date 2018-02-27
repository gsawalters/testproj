package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearch_Steps {

    @Given("^I go to google search page$")
    public void i_go_to_google_search_page() throws Throwable {
        open("http://google.com");
    }

    @When("^I enter some text$")
    public void i_enter_some_text() throws Throwable {
        $(By.name("q")).setValue("testing").pressEnter();
    }

}
