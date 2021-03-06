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

public class FamilyScopeAssessmentSteps {

	private StepContext stepContext = StepContextSingleton.getInstance();
	private WebDriver driver;
	private JourneyFactory journeyFactory;

	public FamilyScopeAssessmentSteps(SharedDriver driver) {
		this.driver = driver;
		journeyFactory = new JourneyFactory(driver);
	}

	@Then("^I am redirected to the family what do you need help with page$")
	public void i_am_redirected_to_the_family_what_do_you_need_help_with_page()
			throws Throwable {
		assertTrue(PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.verifyOnPage());
	}

	@When("^I click divorce separation or dissolution$")
	public void i_click_divorce_separation_or_dissolution() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickDivorceOrDissolution();
	}

	@When("^I click \\(divorce separation or dissolution\\) I am under (\\d+)$")
	public void i_click_divorce_separation_or_dissolution_I_am_under(int arg1)
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickIAmUnder18();
	}

	@When("^I click \\(divorce separation or dissolution\\) domestic abuse$")
	public void i_click_divorce_separation_or_dissolution_domestic_abuse()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickDomesticAbuse();
	}

	@When("^I click \\(domestic abuse\\) risk of harm - yes$")
	public void i_click_domestic_abuse_risk_of_harm_yes() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickDomesticAbuseRiskOfHarm_Yes();
	}

	@When("^I click \\(domestic abuse\\) risk of harm - no$")
	public void i_click_domestic_abuse_risk_of_harm_no() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickDomesticAbuseRiskOfHarm_No();
	}

	@When("^I click \\(divorce separation or dissolution\\) family mediation$")
	public void i_click_divorce_separation_or_dissolution_family_mediation()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickDivorceOrDissolutionFamilyMediation();
	}
	
	@When("^I click \\(divorce separation or dissolution\\) family mediation family mediation started - yes$")
	public void i_click_divorce_separation_or_dissolution_family_mediation_family_mediation_started_yes() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickDivorceOrDissolutionFamilyMediationStartedMediation_Yes();
	}

	@When("^I click \\(divorce separation or dissolution\\) family mediation family mediation started - no$")
	public void i_click_divorce_separation_or_dissolution_family_mediation_family_mediation_started_no() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickDivorceOrDissolutionFamilyMediationStartedMediation_No();
	}
	

	@Then("^I verify I am on the legal aid maybe available for family mediation page$")
	public void i_verify_I_am_on_the_legal_aid_maybe_available_for_family_mediation_page()
			throws Throwable {
		assertTrue(PageFactory
				.getCLAWebYouMaybeAbleToGetLegalAidForFamilyMediationPage(
						driver).verifyOnPage());
	}

	@When("^I click \\(divorce separation or dissolution\\) any other problem$")
	public void i_click_divorce_separation_or_dissolution_any_other_problem()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickOther();
	}

	@Then("^I click disputes over children$")
	public void i_click_disputes_over_children() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickDisputesOverChildren();
	}

	@Then("^I click \\(dispute over children\\) with your ex-partner$")
	public void i_click_dispute_over_children_with_your_ex_partner()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickWithYourExPartner();
	}

	@Then("^I click \\(dispute over children\\) dispute over children with your ex-partner I am under (\\d+)$")
	public void i_click_dispute_over_children_dispute_over_children_with_your_ex_partner_I_am_under(
			int arg1) throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickWithYourExPartnerUnder18();
	}

	@Then("^I click \\(dispute over children\\) dispute over children with your ex-partner Child abduction$")
	public void i_click_dispute_over_children_dispute_over_children_with_your_ex_partner_Child_abduction()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickWithYourExPartnerChildAbduction();
	}

	@Then("^I click \\(dispute over children\\) dispute over children with your ex-partner any other problem$")
	public void i_click_dispute_over_children_dispute_over_children_with_your_ex_partner_any_other_problem()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickWithYourExPartnerAnyOther();
	}

	@Then("^I click \\(dispute over children\\) with your ex-partner I am under (\\d+)$")
	public void i_click_dispute_over_children_with_your_ex_partner_I_am_under(
			int arg1) throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickWithYourExPartnerUnder18();
	}

	@When("^I click \\(dispute over children\\) with your ex-partner and domestic abuse$")
	public void i_click_dispute_over_children_with_your_ex_partner_and_domestic_abuse()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickDomesticAbuse();
	}

	@When("^I click \\(family\\) yes in risk of harm$")
	public void i_click_family_yes_in_risk_of_harm() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickDomesticAbuseAtRisk_Yes();
	}

	@When("^I click \\(family\\) no not in risk of harm$")
	public void i_click_family_no_not_in_risk_of_harm() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickDomesticAbuseAtRisk_No();
	}

	@When("^I click \\(dispute over children\\) with your ex-partner and family mediation$")
	public void i_click_dispute_over_children_with_your_ex_partner_and_family_mediation()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickDivorceOrDissolutionFamilyMediation();
	}

	@When("^I click \\(dispute over children\\) yes started mediation$")
	public void i_click_dispute_over_children_yes_started_mediation()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickDivorceOrDissolutionFamilyMediationStartedMediation_Yes();
	}

	@When("^I click \\(dispute over children\\) no not started mediation$")
	public void i_click_dispute_over_children_no_not_started_mediation()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickDivorceOrDissolutionFamilyMediationStartedMediation_No();

	}

	@Then("^I verify I am on the you maybe able to get legal aid for family mediation page$")
	public void i_verify_I_am_on_the_you_maybe_able_to_get_legal_aid_for_family_mediation_page()
			throws Throwable {
		assertTrue(PageFactory
				.getCLAWebYouMaybeAbleToGetLegalAidForFamilyMediationPage(
						driver).verifyOnPage());
	}

	@When("^I click \\(dispute over children\\) with your ex-partner child abduction$")
	public void i_click_dispute_over_children_with_your_ex_partner_child_abduction()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickChildeAbduction();

	}

	@When("^I click \\(dispute over children\\) with your ex-partner any other problem$")
	public void i_click_dispute_over_children_with_your_ex_partner_any_other_problem()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickYourExPartnerAnyOtherProblem();
	}

	@When("^I click \\(dispute over children\\) I am relative seeking contact with a child$")
	public void i_click_dispute_over_children_I_am_relative_seeking_contact_with_a_child()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickIAmARelativeSeekingContactWithAChild();
	}

	@When("^I click \\(dispute over children\\) I am relative seeking contact with a child yes the child has been a victim of abuse$")
	public void i_click_dispute_over_children_I_am_relative_seeking_contact_with_a_child_yes_the_child_has_been_a_victim_of_abuse()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickIAmARelativeSeekingContactWithAChildVictimOfAbuse_Yes();
	}

	@When("^I click \\(dispute over children\\) I am relative seeking contact with a child no the child has not been a victim of abuse$")
	public void i_click_dispute_over_children_I_am_relative_seeking_contact_with_a_child_no_the_child_has_not_been_a_victim_of_abuse()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickIAmARelativeSeekingContactWithAChildVictimOfAbuse_No();
	}

	@Then("^I click financial settlement$")
	public void i_click_financial_settlement() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickFinacialSettlement();

	}

	@Then("^I click \\(financial settlement\\) I am under (\\d+)$")
	public void i_click_financial_settlement_I_am_under(int arg1)
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
				.clickFinacialSettlementIAmUnder18();

	}
	
	@Then("^I click \\(financial settlement\\) domestic abuse$")
	public void i_click_financial_settlement_domestic_abuse() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickFinacialSettlementDomesticAbuse();
	}

	@Then("^I click \\(financial settlement\\) domestic abuse yes in risk of harm$")
	public void i_click_financial_settlement_domestic_abuse_yes_in_risk_of_harm()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickFinacialSettlementDomesticAbuseRiskOfHarm_Yes();
	}

	@Then("^I click \\(financial settlement\\) domestic abuse no not in risk of harm$")
	public void i_click_financial_settlement_domestic_abuse_no_not_in_risk_of_harm()
			throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickFinacialSettlementDomesticAbuseRiskOfHarm_No();
	}
	
	@Then("^I click \\(financial settlement\\) international family maintenance$")
	public void i_click_financial_settlement_international_family_maintenance() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickFinacialSettlementInternationalFamilyMaintenance();
	}
	
	@When("^I click family mediation$")
	public void i_click_family_mediation() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickFamilyMediation();
	}

	@When("^I click \\(family mediation\\) yes started mediation$")
	public void i_click_family_mediation_yes_started_mediation() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickFamilyMediationStartedMediation_Yes();
	}

	@When("^I click \\(family mediation\\) no not started mediation$")
	public void i_click_family_mediation_no_not_started_mediation() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickFamilyMediationStartedMediation_No();
	}

	@When("^I click \\(family\\) domestic abuse$")
	public void i_click_family_domestic_abuse() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickFamilyDomesticAbuse();
	}
	
	@When("^I click child been taken into care and adoption$")
	public void i_click_child_been_taken_into_care_and_adoption() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickFamilyChildBeenTakenIntoCare();
	}

	@When("^I click the council is taking your child into care - yes$")
	public void i_click_the_council_is_taking_your_child_into_care_yes() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickFamilyChildBeenTakenIntoCareByCouncil_Yes();
	}

	@When("^I click the council is taking your child into care - no$")
	public void i_click_the_council_is_taking_your_child_into_care_no() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickFamilyChildBeenTakenIntoCareByCouncil_No();
	}
	
	@When("^I click child abduction$")
	public void i_click_child_abduction() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickFamilyChildAbduction();
	}
	
	@When("^I click \\(family\\) other problem$")
	public void i_click_family_other_problem() throws Throwable {
		PageFactory.getCLAWebFamilyWhatDoYouNeedHelpWithPage(driver)
		.clickFamilyOtherProblem();
	}

}
