package Components;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;

public class DialogPage {
    By emailInput = By.id("email");
    By file = By.id("file");
    By submitButton = By.id("btn_upload");
    

    public DialogPage(WebDriver driver){
        Base.driver = driver;
        PageFactory.initElements(Base.driver, this);
    } 

    public void SetEmail() {
        SendKeys(emailInput, "anl.grbz@gmail.com");
    }

    public void UploadCv(){
        File filePath = new File("/Users/aag/Downloads/file123.png");       
        String absPath = filePath.getAbsolutePath();
        SendKeys(file, absPath);
    }

    public void Submit(){
        SubmitEvent(submitButton);
    }

    public void SendKeys(By element, String keys){
        Base.driver.findElement(element).sendKeys(keys);;
    }

    public void SubmitEvent(By element){
        Base.driver.findElement(element).submit();
    }

  
}