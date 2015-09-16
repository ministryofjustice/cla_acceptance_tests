package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebLegalAidIsNotUsuallyAvailablePage extends SeleniumPage {
	
	private String expectedTextOnPage = "Legal aid doesn’t usually cover your type of problem";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/article/h1");

	public CLA_WebLegalAidIsNotUsuallyAvailablePage(WebDriver driver) {
		super(driver);
	}
	
	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}
}
