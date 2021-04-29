package Tests;

import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import BaseClass.Base;
import Components.CareerPage;
import Components.DialogPage;
import Components.GooglePage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UITest extends Base {
    private static boolean setUpIsDone = false;

    @Before
    public void Initiliaze() {
        if (setUpIsDone) {
            return;
        }
        setUpIsDone = true;
        super.Init();
        driver.get("https://www.google.com.tr");
    }

    @Test
    public void A_SearchAndGo() {
        GooglePage googlePage = new GooglePage(driver);
        googlePage.SendGoogleInput().sendKeys("Roof Stack Yazılım");
        googlePage.Search();
        googlePage.GoToLink();
    }

    CareerPage careerPage = new CareerPage(driver);
    @Test
    public void B_SearchJob(){
        careerPage.GoToCareerPage();
        careerPage.SelectJob();
        careerPage.SelectJobDetail();
    }

    @Test
    public void C_IShouldSeeJobDetailHead(){
        Assert.assertEquals("Lead Product Tester", careerPage.Assertion());
    }

    @Test
    public void D_UploadCv() throws InterruptedException {
        careerPage.SendCv();
    }

    DialogPage dialogPage = new DialogPage(driver);
    @Test
    public void E_SendAllInfo(){
        dialogPage.SetEmail();
        dialogPage.UploadCv();
    }

    @Test
    public void F_Submit(){
        dialogPage.Submit();
    }
}