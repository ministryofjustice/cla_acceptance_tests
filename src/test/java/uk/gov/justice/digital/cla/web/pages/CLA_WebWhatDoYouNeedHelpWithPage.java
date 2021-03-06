package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebWhatDoYouNeedHelpWithPage extends SeleniumPage {
	
	
	protected By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div/article/h1");
	
	protected String  xpath_Option_1 = ".//*[@id='content']/div/article/div/ul/li[1]/a";
	protected String  xpath_Option_2 = ".//*[@id='content']/div/article/div/ul/li[2]/a";
	protected String  xpath_Option_3 = ".//*[@id='content']/div/article/div/ul/li[3]/a";
	protected String  xpath_Option_4 = ".//*[@id='content']/div/article/div/ul/li[4]/a";
	protected String  xpath_Option_5 = ".//*[@id='content']/div/article/div/ul/li[5]/a";
	protected String  xpath_Option_6 = ".//*[@id='content']/div/article/div/ul/li[6]/a";
	protected String  xpath_Option_7 = ".//*[@id='content']/div/article/div/ul/li[7]/a";
	protected String  xpath_Option_8 = ".//*[@id='content']/div/article/div/ul/li[8]/a";

	public CLA_WebWhatDoYouNeedHelpWithPage(WebDriver driver) {
		super(driver);
	}
	
	

}
