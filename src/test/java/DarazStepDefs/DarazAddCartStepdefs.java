package DarazStepDefs;

import POM.AddToCartElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import webHelper.Helper;

public class DarazAddCartStepdefs {
    static WebDriver driver;
    AddToCartElements elements;

    @Given("Daraz homepage")
    public void darazHomepage() {
        Helper helper=new Helper();
        driver=helper.chromeLaunch();

    }

    @When("Mouse hover on Womans and Girls Fashion")
    public void mouseHoverOnWomansAndGirlsFashion() throws InterruptedException {
        elements=new AddToCartElements(driver);
        elements.mouseHoverOne();

    }

    @And("Mouse hover on traditional wear")
    public void mouseHoverOnTraditionalWear() throws InterruptedException {
        System.out.println(".......");
        elements.mouseHoverTwo();

    }

    @And("Click on Salwar Kameez")
    public void clickOnSalwarKameez() throws InterruptedException {
        System.out.println(".......");
        elements.mouseHoverThree();

    }

    @And("Click on Add to cart button")
    public void clickOnAddToCartButton() {
        System.out.println(".......");

    }

    @Then("It will take to login window")
    public void itWillTakeToLoginWindow() {
        System.out.println(".......");
    }
}
