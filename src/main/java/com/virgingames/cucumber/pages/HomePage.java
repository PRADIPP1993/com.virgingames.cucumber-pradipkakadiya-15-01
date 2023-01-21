package com.virgingames.cucumber.pages;

import com.virgingames.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Accept')]")
    WebElement Accept;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Poker')]")
    WebElement poker;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[@id='styledApp']/div[1]/a[1]/div[1]/canvas[1]")
    WebElement JoinNow;


    public void clickOnAccept() {
        log.info("Clicking on Accept Cookie : " + Accept.toString());
        clickOnElement(Accept);

    }

    public void clickOnPoker() {
        log.info("Clicking on login link : " + poker.toString());
        clickOnElement(poker);
    }

    public void clickOncanvas() {
        log.info("Clicking on login link : " + JoinNow.toString());
        clickOnElement(JoinNow);
    }


}
