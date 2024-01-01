package DarazStepDefs;

import POM.LoginElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DarazStepDefs.DarazAddCartStepdefs.driver;

public class LoginStepdefs {
    @Test
    public void testAssertFunctions() {
//        System.out.println("Assertion process ongoing");
//        System.setProperty("webdriver.chrome.driver", "C:/Program Files/Google/Chrome/Application/chrome.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("https://www.daraz.com.bd/?spm=a2a0e.home.header.dhome.53cb12f7it2fuX");
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Online Shopping in Bangladesh: Order Now from Daraz.com.bd";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        System.out.println("Assertion passed");
    }
    LoginElements loginElements;
    @Given("Salwar kameez page")
    public void salwarKameezPage() {
        System.out.println("I am already on salwar kameez page");
    }


    @When("click on the first dress")
    public void clickOnTheFirstDress() throws InterruptedException {
        loginElements=new LoginElements(driver);
        loginElements.firstDress();
    }

    @And("click on add to cart button")
    public void clickOnAddToCartButton() throws InterruptedException {
        //LoginElements loginElements=new LoginElements(driver);
        loginElements.addCart();

    }

    @And("click on login with facebook button")
    public void clickOnLoginWithFacebookButton() throws InterruptedException {
       // LoginElements loginElements=new LoginElements(driver);
        loginElements.login();
    }

    @Then("Product added to cart")
    public void productAddedToCart() throws InterruptedException {
        loginElements.login();

    }

}
