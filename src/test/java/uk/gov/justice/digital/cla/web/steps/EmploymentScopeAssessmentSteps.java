package uk.gov.justice.digital.cla.web.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.gov.justice.digital.cla.factories.JourneyFactory;
import uk.gov.justice.digital.cla.factories.PageFactory;
import uk.gov.justice.digital.cla.step.StepContext;
import uk.gov.justice.digital.cla.step.StepContextSingleton;
import uk.gov.justice.digital.cla.webdriver.SharedDriver;
import static org.junit.Assert.assertTrue;

public class EmploymentScopeAssessmentSteps {

	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public EmploymentScopeAssessmentSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}
	
	@Then("^I am redirected to the employment what do you need help with page$")
	public void i_am_redirected_to_the_employment_what_do_you_need_help_with_page() throws Throwable {
	    assertTrue(PageFactory.getCLAWebEmploymentWhatDoYouNeedHelpWithPage(driver).verifyOnPage());
	}

	@When("^I select Employment$")
	public void i_select_Employment() throws Throwable {
		PageFactory.getCLAWebProblemPage(driver).clickEmployment();
	}

	@When("^I click employment discrimination$")
	public void i_click_employment_discrimination() throws Throwable {
		PageFactory.getCLAWebEmploymentWhatDoYouNeedHelpWithPage(driver)
				.clickEmploymentDiscrimination();
	}

	@Then("^I verify I am on the You can still seek advice from a legal adviser$")
	public void i_verify_I_am_on_the_You_can_still_seek_advice_from_a_legal_adviser()
			throws Throwable {
		assertTrue(PageFactory.getCLAWebEmploymentFindLegalAdvisorPage(driver)
				.verifyOnPage());
	}

	@When("^I click employment none of the above$")
	public void i_click_employment_none_of_the_above() throws Throwable {
		PageFactory.getCLAWebEmploymentWhatDoYouNeedHelpWithPage(driver)
				.clickEmploymentAnyOtherProblem();
	}

	@Then("^I verify I am on the legal aid is not usually available for this problem page$")
	public void i_verify_I_am_on_the_legal_aid_is_not_usually_available_for_this_problem_page()
			throws Throwable {
		assertTrue(PageFactory.getCLAWebLegalAidIsNotUsuallyAvailablePage(driver).verifyOnPage());
	}
	
	@When("^I click employment human trafficking$")
	public void i_click_employment_human_trafficking() throws Throwable {
		PageFactory.getCLAWebEmploymentWhatDoYouNeedHelpWithPage(driver)
		.clickEmploymentHumanTrafficking();
	}

}
