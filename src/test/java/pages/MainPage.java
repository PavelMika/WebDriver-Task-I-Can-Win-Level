package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }
    public void openPage(){
        driver.get("https://pastebin.com");
    }

    public void writeTextInToNewPasteField(String textForNewPaste){
        driver.findElement(By.id("postform-text")).sendKeys(textForNewPaste);
    }

    public void selectPasteExpiration(){
        driver.findElement(By.id("select2-postform-expiration-container")).click();
        driver.findElement(By.xpath("//li[text()='10 Minutes']")).click();
    }

    public void writeTextInToPasteNameField(String textForPasteName){
        driver.findElement(By.id("postform-name")).sendKeys(textForPasteName);
    }

    public void pressCreateNewPasteButton(){
        driver.findElement(By.xpath("//button[@class='btn -big']")).click();
    }
}
