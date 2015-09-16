package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CLA_WebTroubleWithThePoliceFindLegalAdvisorPage extends CLA_WebFindALegalAdvisorPage {
	
	private String expectedTextOnPage = "A legal adviser may be able to help you";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/article/h1");
	

	public CLA_WebTroubleWithThePoliceFindLegalAdvisorPage(WebDriver driver) {
		super(driver);
	}
	

	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

}
