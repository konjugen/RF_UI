package Utilities;

import org.openqa.selenium.By;

import BaseClass.Base;

public class Extensions extends Base {
    
    public void ClickEvent(By element)
    {
        driver.findElement(element).click();
    }
    
}