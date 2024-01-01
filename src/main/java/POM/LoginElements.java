package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class LoginElements {
    WebDriver driver;
    public LoginElements(WebDriver driver){
        this.driver= driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        int z= 10;
    }
    public void firstDress() throws InterruptedException {
        System.out.println("...........text");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@title=\"Multicolor Glorious Designed Stitched Linen Naira Kat Stylist and Fashionable Three Pis For Women / Girls\"]")).click();
    }
    public void addCart() throws InterruptedException {
        System.out.println("...........text1");
        String mainWindowHandle = driver.getWindowHandle();

        // Open a new window by clicking a link that opens in a new window
        WebElement newWindowLink = driver.findElement(By.xpath("//button[@class=\"add-to-cart-buy-now-btn  pdp-button pdp-button_type_text pdp-button_theme_orange pdp-button_size_xl\"]"));
        newWindowLink.click();

        // Get all window handles
//        Set<String> windowHandles = driver.getWindowHandles();
//        Thread.sleep(3000);


//        // Iterate through the handles and switch to the new window
//        for (String handle : windowHandles) {
//            if (!handle.equals(mainWindowHandle)) {
//                driver.switchTo().window(handle);
                // Perform actions on the new window
               // WebElement newWindowElement = driver.findElement(By.xpath("//button[text()=\"Facebook\"]"));
                //newWindowElement.click();
                //Thread.sleep(3000);
//                try {
//                    Thread.sleep(10000); // Sleep for 10 seconds
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                // Switch to the pop-up
                driver.switchTo().activeElement();

// Find the 'Login' button
                //WebElement loginButton = driver.findElement(By.xpath("//button[text()=\"Facebook\"]")); // replace 'id' with the appropriate locator (id, name, xpath, etc.)
                //Thread.sleep(3000);
                WebElement Username = driver.findElement(By.xpath("//input[@placeholder=\"Please enter your Phone Number or Email\"]"));
                Username.sendKeys("test@gmail.com");
                Thread.sleep(3000);
                WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"Please enter your password\"]"));
                password.sendKeys("12345");
// Click the 'Login' button
                //loginButton.click();
                Thread.sleep(3000);


// Switch back to the original tab
                driver.switchTo().defaultContent();

//                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//                WebElement xyz = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("0.0.0.i0.38cc2829Bu5ijU")));
//                //WebElement xyz = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='container']/div/div/div/div[2]/form/div/div/div/input")));
//                xyz.sendKeys("test@gmail.com");

                //WebElement xyz=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[1]/div[1]/input"));
                //WebElement xyz = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("yourElementId")));
                //xyz.sendKeys("test@gmail.com");

                // Close the new window if needed
                // driver.close();
            }
        //}

        //Thread.sleep(3000);
        // Switch back to the main window
        //driver.switchTo().window(mainWindowHandle);
        //Thread.sleep(3000);
        //driver.findElement(By.xpath("//button[@class=\"add-to-cart-buy-now-btn  pdp-button pdp-button_type_text pdp-button_theme_orange pdp-button_size_xl\"]")).click();
    //}
    public void login() throws InterruptedException {
        System.out.println(".............text2");
        //Thread.sleep(3000);
        //driver.findElement(By.xpath("//button[text()=\"Facebook\"]")).click();
        //driver.findElement(By.xpath("//input[@placeholder=\"Please enter your Phone Number or Email\"]")).sendKeys("test@gmail.com");


    }



}
