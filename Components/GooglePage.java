package Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;

public class GooglePage extends Base{

    By googleInputElement = By.cssSelector(("input[class='gLFyf gsfi']"));
    By searchButton = By.className("gNO89b");
    By link = By.partialLinkText(("roofstacks.com"));

    public GooglePage(WebDriver driver){
        Base.driver = driver;
        PageFactory.initElements(Base.driver, this);
    }

    public WebElement SendGoogleInput() {
        return driver.findElement(googleInputElement);
    }

    public void Search() {
        driver.findElement(searchButton).submit();
    }

    public void GoToLink(){
        driver.findElement(link).click();
    }
   

}