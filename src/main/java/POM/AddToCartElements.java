package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class AddToCartElements {

    WebDriver driver;
    public AddToCartElements(WebDriver driver){
        this.driver= driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void mouseHoverOne() throws InterruptedException {
        Thread.sleep(2000);
        WebElement mainMenu = driver.findElement(By.xpath("//span[text()=\"Women's & Girls' Fashion\"]"));
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.moveToElement(mainMenu).perform();

    }
    public void mouseHoverTwo() throws InterruptedException {


//        driver.findElement(By.xpath("(//span[text()=\"Traditional Wear\"])[1]")).click();

        Thread.sleep(3000);
        WebElement subMenuOne = driver.findElement(By.xpath("(//span[text()=\"Traditional Wear\"])[1]"));
        Actions actions = new Actions(driver);
        Thread.sleep(6000);
        actions.moveToElement(subMenuOne).perform();

    }
    public void mouseHoverThree() throws InterruptedException {
//        Thread.sleep(2000);
//        Actions actions = new Actions(driver);
//        WebElement subMenuTwo = driver.findElement(By.xpath("//a[text()=\"Shalwar Kameez\"]"));
//        Thread.sleep(3000);
//        actions.moveToElement(subMenuTwo).perform();
        System.out.println("Hello World");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()=\"Shalwar Kameez\"]")).click();


    }

}
