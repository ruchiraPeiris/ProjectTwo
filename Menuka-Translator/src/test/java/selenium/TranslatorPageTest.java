package selenium;

import hsenid.PropertyHandle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class TranslatorPageTest {

    WebDriver driver;

    PropertyHandle getUrl;

    public TranslatorPageTest() throws IOException {
        getUrl = new PropertyHandle();
    }

    @BeforeTest
    public void starBrowser() {
        driver = new FirefoxDriver();
        driver.get(getUrl.getSeleniumUrl());
    }

    @DataProvider(name = "TranslatorLogins")
    public Object[][] sendCustomerCare() {
        return new Object[][]{
                {"test2", "aaa"},
                {"test122", "123"},
                {"tttyyyywfgd", "yyy"},
                {"NewOne", "newone"},
                {"nbvnbv", "111"},
                {"conflict", "conflict"},
                {"fourthmay", "123456"}
        };
    }

    @Test(dataProvider = "TranslatorLogins")
    public void menuTestTranslatorTranslate(String username, String password) {

        WebElement usernameClear = driver.findElement(By.name("username"));
        usernameClear.clear();

        WebElement passwordClear = driver.findElement(By.name("password"));
        passwordClear.clear();

        usernameClear.sendKeys(username);
        passwordClear.sendKeys(password);

        WebElement element = driver.findElement(By.id("submitButton"));
        element.click();
//        Thread.sleep(2000);

        WebElement Translator = driver.findElement(By.id("Translate"));
        boolean ttt = Translator.isDisplayed();

        Assert.assertTrue(ttt);
        driver.get(getUrl.getSeleniumUrl());

    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }


}
