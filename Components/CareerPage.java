package Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;

public class CareerPage {

    By link = By.partialLinkText(("Career"));
    By job = By.partialLinkText(("Product"));
    By jobDetail = By.partialLinkText(("Lead Product Tester"));
    By assertionJobDetail = By.xpath("//*[text()='Lead Product Tester']");
    By cvLink = By.xpath("//*[text()=' Send CV ']");

    public CareerPage(WebDriver driver){
        Base.driver = driver;
        PageFactory.initElements(Base.driver, this);
    } 

    public void GoToCareerPage() {
        ClickEvent(link);
    }

    public void SelectJob(){
        ClickEvent(job);
    }

    public void SelectJobDetail(){
        ClickEvent(jobDetail);
    }

    public String Assertion(){
        String detailText = Base.driver.findElement(assertionJobDetail).getText();
        return detailText;
    }

    public void SendCv() throws InterruptedException {
        ClickEvent(cvLink);
        Thread.sleep(1000);
    }

    public void ClickEvent(By element){
        Base.driver.findElement(element).click();
    }
}