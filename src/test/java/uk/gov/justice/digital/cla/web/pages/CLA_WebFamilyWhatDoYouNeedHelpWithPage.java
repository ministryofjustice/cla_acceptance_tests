package uk.gov.justice.digital.cla.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;

import uk.gov.justice.digital.cla.page.SeleniumPage;

public class CLA_WebFamilyWhatDoYouNeedHelpWithPage extends CLA_WebWhatDoYouNeedHelpWithPage {

	public CLA_WebFamilyWhatDoYouNeedHelpWithPage(WebDriver driver) {
		super(driver);
	}
	
	private String expectedTextOnPage = "What do you need help with?";
	private By expectedTextOnPageSelector = new By.ByXPath(
			".//*[@id='content']/div[2]/article/h1");

	
	private By divorceSeparationOrDissolution = new By.ByXPath(xpath_Option_1);
	    private By Under18 = new By.ByXPath(xpath_Option_1);
	    private By domesticAbuse = new By.ByXPath(xpath_Option_2);
	       private By atRiskOfHarm_Yes = new By.ByXPath(xpath_Option_1);
	       private By atRiskOfHarm_No = new By.ByXPath(xpath_Option_2);
   	    private By divorceSeparationOrDissolutionFamilyMediation = new By.ByXPath(xpath_Option_3);
   	       private By divorceSeparationOrDissolutionFamilyMediationStart_Yes = new By.ByXPath(xpath_Option_1);
	       private By divorceSeparationOrDissolutionFamilyMediationStart_No = new By.ByXPath(xpath_Option_2);	       
	    private By anyOtherProblemToDoWithDivorceOrSeparation = new By.ByXPath(xpath_Option_4);
    private By disputesOverChildren = new By.ByXPath(xpath_Option_2);
        private By expartnerDisputesOverChildren = new By.ByXPath(xpath_Option_1);
           private By exPartnerDisputeOverChildrenAndUnder18 = new By.ByXPath(xpath_Option_1);
           private By exPartnerDisputeOverChildrenDomesticViolence = new By.ByXPath(xpath_Option_2);
             private By exPartnerDisputeOverChildrenDomesticViolenceRiskOfHarm_Yes = new By.ByXPath(xpath_Option_1);
             private By exPartnerDisputeOverChildrenDomesticViolenceRiskOfHarm_No = new By.ByXPath(xpath_Option_2);
           private By exPartnerDisputeOverChildrenfamilyMediation = new By.ByXPath(xpath_Option_3);
             private By exPartnerDisputeOverChildrenfamilyMediationStarted_Yes = new By.ByXPath(xpath_Option_1);
             private By exPartnerDisputeOverChildrenfamilyMediationStarted_No = new By.ByXPath(xpath_Option_2);
           private By exPartnerDisputeOverChildrenChildAbduction = new By.ByXPath(xpath_Option_4);
           private By expartnerDisputesOverChildrenAnyOtherProblem = new By.ByXPath(xpath_Option_5);
        private By  disputeOverChildrenIAmARelativeSeekingContactWithAChild = new By.ByXPath(xpath_Option_2);
           private  By  disputeOverChildrenIAmARelativeSeekingContactWithAChildYesTheChildHasBeenAVictiomOfAbuse = new By.ByXPath(xpath_Option_1);
           private  By  disputeOverChildrenIAmARelativeSeekingContactWithAChildNoTheChildHasNotBeenAVictiomOfAbuse = new By.ByXPath(xpath_Option_2);
     	private By financialSettlement = new By.ByXPath(xpath_Option_3);
     	   private By financialSettlementUnder18 = new By.ByXPath(xpath_Option_1);
     	   private By financialSettlementDomesticAbuse = new By.ByXPath(xpath_Option_2);
     	     private By financialSettlementDomesticAbuseYesAtRiskOfHarm = new By.ByXPath(xpath_Option_1);
     	     private By financialSettlementDomesticAbuseNoNotAtRiskOfHarm = new By.ByXPath(xpath_Option_2);
     	   private By financialSettlementInternationalFamilyMaintentenance = new By.ByXPath(xpath_Option_3);
     	   private By financialSettlementFamilyMediation = new By.ByXPath(xpath_Option_4);
     	     private By financialSettlementFamilyMediationYesIAmInFamilyMediation = new By.ByXPath(xpath_Option_1);
     	     private By financialSettlementFamilyMediationNoIAmNotInFamilyMediation = new By.ByXPath(xpath_Option_2);
     	   private By financialSettlementAnyOtherProblem = new By.ByXPath(xpath_Option_5);
       private By familyFamilyMediation = new By.ByXPath(xpath_Option_4);
	      private By familyFamilyMediationYesIAmInFamilyMediation = new By.ByXPath(xpath_Option_1);
	      private By familyFamilyMediationNoIAmNotInFamilyMediation = new By.ByXPath(xpath_Option_2);
//	private By domesticViolenceOrHarrassment = new By.ByXPath(xpath_Option_4);
//	private By familyMediation = new By.ByXPath(xpath_Option_5);
//	private By exPartnerAnyOtherProblem = new By.ByXPath(xpath_Option_5);
//	
//	
//	private By disputesOverChildren = new By.ByXPath(xpath_Option_3);
//	private By childAbduction = new By.ByXPath(xpath_Option_4);
//	private By familyAnyOtherProblem = new By.ByXPath(xpath_Option_5);

//	public void clickExPartnerFinancialSettlementAnyOtherProblem() throws Exception{
//		click(exPartnerFinancialSettlementAnyOtherProblem);
//	}
//
//	public void clickExPartnerFinancialSettlementFamilyMediationStartMediation_No() throws Exception{
//		click(exPartnerFinancialSettlementFamilyMediationStartMediation_No);
//	}
//	
//	public void clickExPartnerFinancialSettlementFamilyMediationStartMediation_Yes() throws Exception{
//		click(exPartnerFinancialSettlementFamilyMediationStartMediation_Yes);
//	}
//	
//	public void clickExPartnerFinancialSettlementFamilyMediation() throws Exception{
//		click(exPartnerFinancialSettlementFamilyMediation);
//	}
//
//	public void clickExPartnerFinancialSettlementInternationalFamilyMaintenance() throws Exception{
//		click(exPartnerFinancialSettlementInternationalFamilyMaintenance);
//	}
//	
//	public void clickExPartnerFinancialSettlementDomesticAbuseRiskOfHarm_No() throws Exception{
//		click(exPartnerFinancialSettlementDomesticAbuseRiskOfHarm_No);
//	}
//	
//	public void clickExPartnerFinancialSettlementDomesticAbuseRiskOfHarm_Yes() throws Exception{
//		click(exPartnerFinancialSettlementDomesticAbuseRiskOfHarm_Yes);
//	}
//	
//	public void clickExPartnerFinancialSettlementDomesticAbuse() throws Exception {
//		click(exPartnerFinancialSettlementDomesticAbuse);
//		
//	}
//	
//	public void clickExPartnerFinancialSettlementYouAreUnder18() throws Exception{
//		click(exPartnerFinancialSettlementYouAreUnder18);
//	}
//	
//	public void clickExPartnerDisputeOverChildrenChildAbductionYouHaveBeenAccusedOfChildAbduction() throws Exception{
//		click(exPartnerDisputeOverChildrenChildAbductionYouHaveBeenAccusedOfChildAbduction);
//	}
//
//	public void clickExPartnerIAmOutsideUkAbductedchildInUK_No() throws Exception{
//		click(exPartnerIAmOutsideUkAbductedchildInUK_No);
//	}
//	
//	public void clickExPartnerIAmOutsideUkAbductedchildInUK_Yes() throws Exception{
//		click(exPartnerIAmOutsideUkAbductedchildInUK_Yes);
//	}
//	
//	public void ClickExPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbductedNoneOfTheAbove() throws Exception {
//		click(exPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbductedNoneOfTheAbove);	
//	}
//
//	
//	public void ClickExPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbductedYoureSeekingOrderRemovalOfChild() 
//	throws Exception{
//		click(exPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbductedYoureSeekingOrderRemovalOfChild);		
//	}
//
//	public void ClickExPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbducted() throws Exception{
//		click(exPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbducted);
//		
//	}	
//	
//	public void clickExPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbducted() throws Exception{
//		click(exPartnerDisputeOverChildrenChildAbductionYourChildHasBeenAbducted);
//	}
//	
//	public void clickExPartnerDisputeOverChildrenChildAbduction() throws Exception{
//		click(exPartnerDisputeOverChildrenChildAbduction);
//	}
//	
//	public void clickExPartnerDisputeOverChildrenAtRiskOfHarm_Yes() throws Exception{
//		click(exPartnerDisputeOverChildrenAtRiskOfHarm_Yes);
//	}
//	
//	public void clickExPartnerDisputeOverChildrenAtRiskOfHarm_No() throws Exception{
//		click(exPartnerDisputeOverChildrenAtRiskOfHarm_No);
//	}
//	
//	public void clickExPartnerDisputeOverChildrenDomesticAbuse() throws Exception{
//		click(exPartnerDisputeOverChildrenDomesticAbuse);
//	}
//	
//	public void clickExPartnerDisputeOverChildrenAndAnyOtherProblem() throws Exception{
//		click(exPartnerDisputeOverChildrenAndAnyOtherProblem);
//	}
//	
//	public void clickExPartnerDisputeOverChildrenAndUnder18() throws Exception{
//		click(exPartnerDisputeOverChildrenAndUnder18);
//	}
	
	public void clickFamilyMediationStart_No() throws Exception{
		click(familyFamilyMediationNoIAmNotInFamilyMediation);
	}
	
	public void clickFamilyMediationStart_Yes() throws Exception{
		click(familyFamilyMediationYesIAmInFamilyMediation);
	
	}
	
    public void clickAtRiskOfHarm_No() throws Exception{
	   click(atRiskOfHarm_No);
    }
    
	public void clickAtRiskOfHarm_Yes() throws Exception{
		click(atRiskOfHarm_Yes);
	}
	
	public void clickDomesticAbuse() throws Exception{
		click(domesticAbuse);
	}
	
	public void clickFamilyMediation() throws Exception{
		click(familyFamilyMediation);
	}
	
	public void clickDivorceSeparationOrDissolution() throws Exception{
		click(divorceSeparationOrDissolution);
	}

	public boolean verifyOnPage() throws Exception{
		waitForPageLoaded();
		return isTextContainedInInnerText(expectedTextOnPageSelector,
				expectedTextOnPage);
	}

	public void clickDiscriminationUnder18() throws Exception {
		click(Under18);	
	}

	public void clickAnyOtherProblemToDoWithDivorceOrSeparation() throws Exception {
		click(anyOtherProblemToDoWithDivorceOrSeparation);
		
	}

	public void clickDisputeOverChildren() throws Exception {
		click(disputesOverChildren);	
	}

	public void clickDisputeOverChildrenWithYourExPartner() throws Exception {
		click(expartnerDisputesOverChildren);		
	}


	public void clickDisputeOverChildrenWithExPartnerUnder18() throws Exception {
		click(exPartnerDisputeOverChildrenAndUnder18);	
	}	

	public void clickDisputeOverChildrenWithExPartnerAnyOtherProblem() throws Exception {
		click(expartnerDisputesOverChildrenAnyOtherProblem);		
	}

	public void clickDisputeOverChildrenWithExPartnerDomesticViolence() throws Exception {
		click(exPartnerDisputeOverChildrenDomesticViolence);
		
	}

	public void clickDisputeOverChildrenWithExPartnerDomesticViolenceRiskOfHarm_Yes() throws Exception {
		click(exPartnerDisputeOverChildrenDomesticViolenceRiskOfHarm_Yes);	
	}

	public void clickDisputeOverChildrenWithExPartnerDomesticViolenceRiskOfHarm_No() throws Exception {
		click(exPartnerDisputeOverChildrenDomesticViolenceRiskOfHarm_No);	
	}

	public void clickDisputeOverChildrenWithExPartnerFamilyMediation() throws Exception {
		click(exPartnerDisputeOverChildrenfamilyMediation);
		
	}

	public void clickDisputeOverChildrenWithExPartnerFamilyMediationStarted_Yes() throws Exception {
		click(exPartnerDisputeOverChildrenfamilyMediationStarted_Yes);
		
	}

	public void clickDisputeOverChildrenWithExPartnerFamilyMediationStarted_No() throws Exception {
		click(exPartnerDisputeOverChildrenfamilyMediationStarted_No);
		
	}

	public void clickDisputeOverChildrenWithExPartnerChildAbduction() throws Exception {
		click(exPartnerDisputeOverChildrenChildAbduction);
		
	}

	public void clickDisputeOverChildrenIAmARelativeSeekingContactWithAChild() throws Exception {
		click(disputeOverChildrenIAmARelativeSeekingContactWithAChild);
		
	}

	public void clickDisputeOverChildrenIAmARelativeSeekingContactWithAChildYesTheChildHasBeenAVictiomOfAbuse() throws Exception {
		click(disputeOverChildrenIAmARelativeSeekingContactWithAChildYesTheChildHasBeenAVictiomOfAbuse);
		
	}

	public void clickDisputeOverChildrenIAmARelativeSeekingContactWithAChildNoTheChildHasNotBeenAVictiomOfAbuse() throws Exception {
		click(disputeOverChildrenIAmARelativeSeekingContactWithAChildNoTheChildHasNotBeenAVictiomOfAbuse);
		
	}

	public void clickFamilyFinancialSettlement() throws Exception {
		click(financialSettlement);
		
	}

	public void clickFamilyFinancialSettlementIAmUnder18() throws Exception {
		click(financialSettlementUnder18);
		
	}

	public void clickFamilyFinancialSettlementFamilyInternationalMaintenance() throws Exception {
		click(financialSettlementInternationalFamilyMaintentenance);
		
	}

	public void clickFamilyFinancialSettlementAnyOtherProblem() throws Exception {
		click(financialSettlementAnyOtherProblem);
		
	}

	public void clickFamilyFinancialSettlementDomsticAbuse() throws Exception {
		click(financialSettlementDomesticAbuse);
		
	}

	public void clickFamilyFinancialSettlementDomesticAbuseYesIAmAtRiskOfHarm() throws Exception {
		click(financialSettlementDomesticAbuseYesAtRiskOfHarm);
	}

	public void clickFamilyFinancialSettlementDomesticAbuseNoIAmNotAtRiskOfHarm() throws Exception {
		click(financialSettlementDomesticAbuseNoNotAtRiskOfHarm);
	}

	public void clickFamilyFinancialSettlementFamilyMediation() throws Exception {
		click(financialSettlementFamilyMediation);
		
	}

	public void clickFamilyFinancialSettlementFamilyMediationYesIAmInFamilyMediation() throws Exception {
		click(financialSettlementFamilyMediationYesIAmInFamilyMediation);
		
	}

	public void clickFamilyFinancialSettlementFamilyMediationNoIAmNotInFamilyMediation() throws Exception {
		click(financialSettlementFamilyMediationNoIAmNotInFamilyMediation);
		
	}

	public void clickFamilyMediationYesIAmInFamilyMediation() throws Exception {
		click(familyFamilyMediationYesIAmInFamilyMediation);
		
	}

	public void clickFamilyMediationNoIAmNotInFamilyMediation() throws Exception {
		click(familyFamilyMediationNoIAmNotInFamilyMediation);
		
	}
	






}
