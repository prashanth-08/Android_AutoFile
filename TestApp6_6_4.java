package tests;
//Github
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofSeconds;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.springframework.util.SystemPropertyUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import api.APIException;
import common.Property;
import config.Config;
import functionalLibrary.TestBase;
import functionalLibrary.TestBase.Direction;
import functionalLibrary.TestBase.PRESS_TYPES;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import pages.PageObjectManager;

public class TestApp6_6_4 extends TestBase {
	PageObjectManager page = new PageObjectManager();
	SoftAssert soft = new SoftAssert();
	String newMail = null;
	int passCode = 1;
	int sleepTime = 5000;
	int implicitWait = 20;
	boolean check = false;
	String nook = "6.0";

	@BeforeClass
	public void testOnLocaldevice() throws Exception {
		// String propertyFileName = System.getProperty("user.dir") +
		// "/device_Input/general.properties";
		String propertyFileName = System.getProperty("user.dir") + File.separator + "device_Input" + File.separator
				+ "general.properties";
		propertyMap = new Property().getMap(propertyFileName);
		TEST_RUN_ID = propertyMap.get("TEST_RUN_ID");
		TESTRAIL_USERNAME = propertyMap.get("TESTRAIL_USERNAME");
		TESTRAIL_PASSWORD = propertyMap.get("TESTRAIL_PASSWORD");

		if (propertyMap.get("APP_VERSION").equalsIgnoreCase("6.0")) {
			DesiredCapabilities capabilities = Config.getNook6_0();
			setup(capabilities);
			baseDriverwait(implicitWait);
		} else if (propertyMap.get("APP_VERSION").equalsIgnoreCase("6.1")) {
			DesiredCapabilities capabilities = Config.getNook6_1();
			setup(capabilities);
			baseDriverwait(implicitWait);
		} else {
			DesiredCapabilities capabilities = Config.getNook6();
			setup(capabilities);
			baseDriverwait(implicitWait);
		}
	}
	
	@Test(priority = 1)
	public void rewardsInPricedContents() throws Exception 
	{
		
		System.out.println("----------------Rewards in Priced Contents Test Started----------");
		
		try {
		
		waitUntilVisible(page.getWelcomeScreen().getBtnSignIn());
		touchAtCenterOfElement(page.getWelcomeScreen().getBtnSignIn());
		waitUntilVisible(page.getSignInScreen().getTxtBoxEmail());
		touchAtCenterOfElement(page.getSignInScreen().getTxtBoxEmail());
		sendKeys("Bnrewardsan@bn.com");
		waitUntilVisible(page.getSignInScreen().getTxtBoxPassword());
		touchAtCenterOfElement(page.getSignInScreen().getTxtBoxPassword());
		sendKeys("Test1234");
		waitUntilVisible(page.getSignInScreen().getBtnSignIn());
		touchAtCenterOfElement(page.getSignInScreen().getBtnSignIn());
		waitUntilVisible(page.getWhatsNewScreen().getBtnContinue());
		touchAtCenterOfElement(page.getWhatsNewScreen().getBtnContinue());
		waitUntilVisible(page.getWhatsNewScreen().getBtnNotNow());
		touchAtCenterOfElement(page.getWhatsNewScreen().getBtnNotNow());
		waitUntilVisible(page.getLibraryScreen().getTxtTipSortFilter());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtTipSortFilter());
		waitUntilVisible(page.getLibraryScreen().getTxtTipMoreOptions());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtTipMoreOptions());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtTabRecent());
		waitUntilVisible(page.getLibraryScreen().getBtnCloseNookTipsSnackContent());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnCloseNookTipsSnackContent());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtTabAllTitles());
		waitUntilVisible(page.getLibraryScreen().getTxtTipListViewGridView());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtTipListViewGridView());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnFilterMediaType());
		waitUntilVisible(page.getLibraryScreen().getTxtFilterAudioBooks());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtFilterAudioBooks());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtTabRecent());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtTabAllTitles());
		if (isElementDisplayed(page.getLibraryScreen().getTxtTipInTheCloud()) == true) {
			touchAtCenterOfElement(page.getLibraryScreen().getTxtTipInTheCloud());
		}
		waitUntilVisible(page.getLibraryScreen().getBtnAccountTabGlobalNavBar());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnAccountTabGlobalNavBar());
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"SIGN OUT\").instance(0))"));
		waitUntilVisible(page.getProfileScreen().getTxtAppSettings());
		touchAtCenterOfElement(page.getProfileScreen().getTxtAppSettings());
		waitUntilVisible(page.getSettingsScreen().getTxtAbout());
		touchAtCenterOfElement(page.getSettingsScreen().getTxtAbout());
		macOrWinEasterEgg();
		waitUntilVisible(page.getSettingsScreen().getTxtSelectPurchaseType());
		touchAtCenterOfElement(page.getSettingsScreen().getTxtSelectPurchaseType());
		waitUntilVisible(page.getSettingsScreen().getTxtPurchaseInApp());
		touchAtCenterOfElement(page.getSettingsScreen().getTxtPurchaseInApp());
		press(PRESS_TYPES.BACK);
		System.out.println("Device Purchase in-App is Enabled Now");
		waitUntilVisible(page.getLibraryScreen().getTxtBottomBarBookstore());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtBottomBarBookstore());
		if (isElementDisplayed(page.getWhatsNewScreen().getBtnNotNow())) {
			touchAtCenterOfElement(page.getWhatsNewScreen().getBtnNotNow());
		}
		if (isElementDisplayed(page.getBookstoreScreen().getTxtTipWishListIcn())) {
			touchAtCenterOfElement(page.getBookstoreScreen().getTxtTipWishListIcn());
		}
		
		//Case ID 1: Rewards Announcement Section in the PDP (Priced eBook) (Unbought)
		waitUntilVisible(page.getBookstoreScreen().getBtnSearch());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnSearch());
		sendKeys("Fortune And Glory");
		press(PRESS_ENTER);
		waitUntilVisible(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		waitUntilVisible(page.getBookstoreScreen().getTxtBooks());
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBooks());
		waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		//Book 1
		String priceInfoBelowCover1 = page.getBookstoreScreen().getTxtPriceInfoBelowCover1().getText();
		boolean priceInfoBook1 = priceInfoBelowCover1.contains("US$");
		//Book 2
		String priceInfoBelowCover2 = page.getBookstoreScreen().getTxtPriceInfoBelowCover2().getText();
		boolean priceInfoBook2 = priceInfoBelowCover2.contains("US$");
		//Book 3
		String priceInfoBelowCover3 = page.getBookstoreScreen().getTxtPriceInfoBelowCover3().getText();
		boolean priceInfoBook3 = priceInfoBelowCover3.contains("US$");
		
		if (priceInfoBook1) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		} else if (priceInfoBook2) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
		} else if (priceInfoBook3) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion3Bookstore());
		} else {
			System.out.println("Please Find Priced Book");
		}
		
		String buy_CTA_Button_Priced_PDP = page.getPdpScreen().getBtnBuyInPricedBook().getText();
		boolean buyButton = buy_CTA_Button_Priced_PDP.contains("BUY");
		boolean defaultRewardsPDP = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (buyButton && defaultRewardsPDP) {
			System.out.println("Test Passed Case ID 1: Rewards Announcement Section in the PDP (Priced eBook) (Unbought)");
		} else {
			System.out.println("Buy button in Priced Book is not Displayed");
			System.out.println("Test Failed Case ID 1: Rewards Announcement Section in the PDP (Priced eBook) (Unbought)");
		}

		// Case ID 2: Default - Rewards Announcement Section - UI check
		boolean DefaultRewardsStatement = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsStatement());
		if (DefaultRewardsStatement) {
			//To Print the Default Rewards Statement
			String PrintDefaultRewardsStatement = page.getPdpScreen().getTxtDefaultRewardsStatement().getText();
			System.out.println(PrintDefaultRewardsStatement);
			System.out.println("Test Passed Case ID 2: Default - Rewards Statement - UI check in eBook");
		} else {
			System.out.println("Test Failed Case ID 2: Default - Rewards Statement - UI check in eBook");
		}

		// Case ID 3: Rewards Announcement Section - detail link 
		waitUntilVisible(page.getPdpScreen().getTxtDefaultRewardsPDP());
		tapOnLinkTextRewardsDetails_TermsAndCondition(page.getPdpScreen().getTxtDefaultRewardsPDP());
		waitUntilVisible(page.getPdpScreen().getBtnGotItInRewards());
		if (isElementDisplayed(page.getPdpScreen().getBtnGotItInRewards())) {
			System.out.println("Test Passed Case ID 3: Rewards Announcement Section - detail link in eBook");
		} else {
			System.out.println("Test Failed Case ID 3: Rewards Announcement Section - detail link in eBook");
		}

		// Case ID 4: Rewards Detail s modal - Check title wording
		boolean DefaultRewardsTitle = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsDetailTitle());
		if (DefaultRewardsTitle) {
			//To Print the Default Rewards Title
			String PrintDefaultRewardsTitle = page.getPdpScreen().getTxtDefaultRewardsDetailTitle().getText();
			System.out.println(PrintDefaultRewardsTitle);
			System.out.println("Test Passed Case ID 4: Rewards Details modal - Check title wording in eBook");
		} else {
			System.out.println("Test Failed Case ID 4: Rewards Details modal - Check title wording in eBook");
		}

		// Case ID 5: Rewards Details modal - Check Rewards Banner
		boolean DefaultRewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsBanner());
		if (DefaultRewardsBanner) {
			//To Print Default Rewards Banner
			String PrintDefaultRewardsBanner = page.getPdpScreen().getTxtDefaultRewardsBanner().getText();
			System.out.println(PrintDefaultRewardsBanner);
			System.out.println("Test Passed Case ID 5: Rewards Details modal - Check Rewards Banner in eBook");
		} else {
			System.out.println("Test Failed Case ID 5: Rewards Details modal - Check Rewards Banner in eBook");
		}

		// Case ID 6: Rewards Details modal - Check Body
		waitUntilVisible(page.getPdpScreen().getTxtRewardsDetails());
		String rewardsDetailElement = page.getPdpScreen().getTxtRewardsDetails().getText();
		System.out.println(rewardsDetailElement);
		
		String defaultRewardsText = "Eligible purchases made on NOOK Devices will be aggregated over a designated 24-hour period; stamps can take about 48 hours to appear in your account.\n\n"
                + "B&N Audiobook subscription purchases, audiobooks purchased with credits, and newsstand subscriptions "
                + "are currently not eligible to earn stamps towards rewards.\n\n"
                + "You can enroll in free Rewards or sign up for Premium Membership on bn.com/membership or in your local store.\n\n";
		
		if (rewardsDetailElement.equalsIgnoreCase(defaultRewardsText)) {
			System.out.println("Test Passed Case ID 6: Rewards Details modal - Check Body in eBook");
		} else {
			System.out.println("Test Failed Case ID 6: Rewards Details modal - Check Body in eBook");
		}

		// Case ID 7: Rewards Details modal - Check Acknowledge button
		if (isElementDisplayed(page.getPdpScreen().getBtnDefaultGotItInRewards()) == true) {
			System.out.println("Test Passed Case ID 7: Rewards Details modal - Check Acknowledge button in eBook");
		} else {
			System.out.println("Test Failed Case ID 7: Rewards Details modal - Check Acknowledge button in eBook");
		}

		// Case ID 8: Rewards Details modal - Open terms page
		tapOnLinkTextRewardsDetails_TermsAndCondition(page.getPdpScreen().getTxtRewardsFooter());
		waitUntilVisible(page.getSettingsScreen().getTxtTiltleRewardsMembershipTerms());
		if (isElementDisplayed(page.getSettingsScreen().getTxtTiltleRewardsMembershipTerms()) == true) {
			System.out.println("Test Passed Case ID 8: Rewards Details modal - Open terms page in eBook");
			waitUntilVisible(page.getSettingsScreen().getBtnClose());
			touchAtCenterOfElement(page.getSettingsScreen().getBtnClose());
		} else {
			System.out.println("Test Failed Case ID 8: Rewards Details modal - Open terms page in eBook");
		}

		// Case ID 9: Rewards Details modal - Close
		waitUntilVisible(page.getPdpScreen().getBtnGotItInRewards());
		touchAtCenterOfElement(page.getPdpScreen().getBtnGotItInRewards());
		sleep(1000);
		waitUntilVisible(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP()) == true) {
			System.out.println("Test Passed Case ID 9: Rewards Details modal - Close in eBook");
		} else {
			System.out.println("Test Failed Case ID 9: Rewards Details modal - Close in eBook");
		}

		// Case ID 10: Purchase Confirmation modal has rewards related message - Priced eBook
		String buy_CTA_Button_Priced_PDP1 = page.getPdpScreen().getBtnBuyInPricedBook().getText();
		boolean buyButton1 = buy_CTA_Button_Priced_PDP1.contains("BUY");
		if (buyButton1 == true) {
			touchAtCenterOfElement(page.getPdpScreen().getBtnBuyInPricedBook());
			boolean confirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseTitle());
			boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
			boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
			boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
			boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
			boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
			boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
			boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
			if (confirmPurchaseTitle == true && confirmPurchaseMessage == true && coverImage == true
					&& bookDetailLayout == true && legalTermsView == true && confirmButton == true
					&& cancelButton == true && rewardsBanner == true) {
				System.out.println(
						"Test Passed Case ID 10: Purchase Confirmation modal has rewards related message - Priced eBook");
				touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
			} else {
				System.out.println(
						"Test Failed Case ID 10: Purchase Confirmation modal has rewards related message - Priced eBook");
			}
		} else {
			System.out.println("Buy Button is not Displayed");
		}

		// Case ID 11: Rewards Announcement Section in the PDP (Priced Audiobook)
		if(isElementDisplayed(page.getPdpScreen().getBtnAudiobookSegmentControlPDP())) {
			touchAtCenterOfElement(page.getPdpScreen().getBtnAudiobookSegmentControlPDP());
		} else {
			touchAtCenterOfElement(page.getPdpScreen().getBtnNavUp());
			waitUntilVisible(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
			touchAtCenterOfElement(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
			waitUntilVisible(page.getBookstoreScreen().getTxtAudiobooks());
			touchAtCenterOfElement(page.getBookstoreScreen().getTxtAudiobooks());
			waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
			String priceInfoBelowCover11 = page.getBookstoreScreen().getTxtPriceInfoBelowCover1().getText();
			boolean priceInfoBook11 = priceInfoBelowCover11.contains("US$");
			//Book 2
			String priceInfoBelowCover21 = page.getBookstoreScreen().getTxtPriceInfoBelowCover2().getText();
			boolean priceInfoBook21 = priceInfoBelowCover21.contains("US$");
			//Book 3
			String priceInfoBelowCover31 = page.getBookstoreScreen().getTxtPriceInfoBelowCover3().getText();
			boolean priceInfoBook31 = priceInfoBelowCover31.contains("US$");
			if (priceInfoBook11) {
				touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
			} else if (priceInfoBook21) {
				touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
			} else if (priceInfoBook31) {
				touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
			} else {
				System.out.println("Please Find Priced AudioBook");
			}	
		}
		waitUntilVisible(page.getPdpScreen().getTxtDefaultRewardsPDP());
		String buy_CTA_Button_Priced_PDP11 = page.getPdpScreen().getBtnBuyInPricedBook().getText();
		boolean buyButton11 = buy_CTA_Button_Priced_PDP11.contains("BUY");
		boolean defaultRewardsPDP1 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (buyButton11 && defaultRewardsPDP1) {
			System.out.println("Test Passed Case ID 11: Rewards Announcement Section in the PDP (Priced Audiobook)");
		} else {
			System.out.println("Test Failed Case ID 11: Rewards Announcement Section in the PDP (Priced Audiobook)");
		}
		sleep(1000);
		tapOnLinkTextRewardsDetails_TermsAndCondition(page.getPdpScreen().getTxtDefaultRewardsPDP());
		waitUntilVisible(page.getPdpScreen().getBtnGotItInRewards());
		System.out.println("To check the Elements/Layouts are present in Reward Details Popup");
		//Case ID 12: Rewards Details modal in Audiobook
		boolean rewardsDetailTitle = isElementDisplayed(page.getPdpScreen().getTxtRewardsDetailTitle());
		boolean rewardBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
		boolean rewardDetails = isElementDisplayed(page.getPdpScreen().getTxtRewardsDetails());
		boolean rewardsGotItButton = isElementDisplayed(page.getPdpScreen().getBtnGotItInRewards());
		boolean rewardsTermsandConditionLink = isElementDisplayed(page.getPdpScreen().getTxtRewardsFooter());
		if (rewardsDetailTitle && rewardBanner && rewardDetails && rewardsGotItButton && rewardsTermsandConditionLink) {
			System.out.println("Test Passed Case ID 12: Rewards Details modal in Audiobook");
			touchAtCenterOfElement(page.getPdpScreen().getBtnGotItInRewards());
		} else {
			System.out.println("Test Failed Case ID 12: Rewards Details modal in Audiobook");
		}

		// Case ID 13: Purchase Confirmation modal has rewards related message - Priced Audiobook
		String buy_CTA_Button_Priced_PDP111 = page.getPdpScreen().getBtnBuyInPricedBook().getText();
		boolean buyButton111 = buy_CTA_Button_Priced_PDP111.contains("BUY");
		if (buyButton111 == true) {
			touchAtCenterOfElement(page.getPdpScreen().getBtnBuyInPricedBook());
			boolean confirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseTitle());
			boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
			boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
			boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
			boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
			boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
			boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
			boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
			if (confirmPurchaseTitle == true && confirmPurchaseMessage == true && coverImage == true
					&& bookDetailLayout == true && legalTermsView == true && confirmButton == true
					&& cancelButton == true && rewardsBanner == true) {
				System.out.println(
						"Test Passed Case ID 13: Purchase Confirmation modal has rewards related message - Priced Audiobook");
				touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
			} else {
				System.out.println(
						"Test Failed Case ID 13: Purchase Confirmation modal has rewards related message - Priced Audiobook");
			}
		} else {
			System.out.println("Buy Button is not Displayed");
		}
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBottomBarEbooksTab());
		if (isElementDisplayed(page.getWhatsNewScreen().getBtnNotNow())) {
		touchAtCenterOfElement(page.getWhatsNewScreen().getBtnNotNow());
	    }
		
		// Case ID 14: Rewards Announcement Section in the PDP (Priced Newspaper)
		waitUntilVisible(page.getBookstoreScreen().getBtnSearch());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnSearch());
		sendKeys("New York Times");
		press(PRESS_ENTER);
		sleep(3000);
		waitUntilVisible(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		waitUntilVisible(page.getBookstoreScreen().getTxtNewspapers());
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtNewspapers());
		waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());	
		String priceInfoBelowCover11 = page.getBookstoreScreen().getTxtPriceInfoBelowCover1().getText();
		boolean priceInfoBook11 = priceInfoBelowCover11.contains("US$");
		//Book 2
		String priceInfoBelowCover21 = page.getBookstoreScreen().getTxtPriceInfoBelowCover2().getText();
		boolean priceInfoBook21 = priceInfoBelowCover21.contains("US$");
		//Book 3
		String priceInfoBelowCover31 = page.getBookstoreScreen().getTxtPriceInfoBelowCover3().getText();
		boolean priceInfoBook31 = priceInfoBelowCover31.contains("US$");
		if (priceInfoBook11) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		} else if (priceInfoBook21) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
		} else if (priceInfoBook31) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
		} else {
			System.out.println("Please Find Priced Newspaper");
		}
		
		String buyIssueButtoninDRP = page.getPdpScreen().getBtnBuyButtonCurrentIssue().getText();
		boolean buyIssueButton = buyIssueButtoninDRP.contains("BUY");
		boolean defaultRewardsPDP11 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (buyIssueButton && defaultRewardsPDP11) {
			System.out.println("Test Passed Case ID 14: Rewards Announcement Section in the PDP (Priced Newspaper)	");
		} else {
			System.out.println("Buy Issue button is not displayed");
			System.out.println("Test Failed Case ID 14: Rewards Announcement Section in the PDP (Priced Newspaper)	");
		}

		// Case ID 15: Purchase Confirmation modal has rewards related message - Priced Newspaper
		String buyIssueButtoninDRP1 = page.getPdpScreen().getBtnBuyButtonCurrentIssue().getText();
		boolean buyIssueButton1 = buyIssueButtoninDRP1.contains("BUY");
		if (buyIssueButton1 == true) {
			touchAtCenterOfElement(page.getPdpScreen().getBtnBuyButtonCurrentIssue());
			boolean confirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseTitle());
			boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
			boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
			boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
			boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
			boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
			boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
			boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
			if (confirmPurchaseTitle == true && confirmPurchaseMessage == true && coverImage == true
					&& bookDetailLayout == true && legalTermsView == true && confirmButton == true
					&& cancelButton == true && rewardsBanner == true) {
				System.out.println(
						"Test Passed Case ID 15: Purchase Confirmation modal has rewards related message - Priced Newspaper");
				touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
			} else {
				System.out.println(
						"Test Failed Case ID 15: Purchase Confirmation modal has rewards related message - Priced Newspaper");
			}
		} else {
			System.out.println("Buy Issue button is not displayed");
		}
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBottomBarEbooksTab());

		// Case ID 16: Rewards Announcement Section in the PDP (Priced Magazine)
		waitUntilVisible(page.getBookstoreScreen().getBtnSearch());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnSearch());
		sendKeys("Magazines");
		press(PRESS_ENTER);
		sleep(5000);
		waitUntilVisible(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		waitUntilVisible(page.getBookstoreScreen().getTxtMagazines());
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtMagazines());
		waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		String priceInfoBelowCover111 = page.getBookstoreScreen().getTxtPriceInfoBelowCover1().getText();
		boolean priceInfoBook111 = priceInfoBelowCover111.contains("US$");
		//Book 2
		String priceInfoBelowCover211 = page.getBookstoreScreen().getTxtPriceInfoBelowCover2().getText();
		boolean priceInfoBook211 = priceInfoBelowCover211.contains("US$");
		//Book 3
		String priceInfoBelowCover311 = page.getBookstoreScreen().getTxtPriceInfoBelowCover3().getText();
		boolean priceInfoBook311 = priceInfoBelowCover311.contains("US$");
		if (priceInfoBook111) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		} else if (priceInfoBook211) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
		} else if (priceInfoBook311) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
		} else {
			System.out.println("Please Find Priced Magazine");
		}
		
		String buyIssueButtoninDRP11 = page.getPdpScreen().getBtnBuyButtonCurrentIssue().getText();
		boolean buyIssueButton11 = buyIssueButtoninDRP11.contains("BUY");
		boolean defaultRewardsPDP111 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (buyIssueButton11 && defaultRewardsPDP111) {
			System.out.println("Test Passed Case ID 16: Rewards Announcement Section in the PDP (Priced Magazine)");
		} else {
			System.out.println("Buy Issue button is not displayed");
			System.out.println("Test Failed Case ID 16: Rewards Announcement Section in the PDP (Priced Magazine)");
		}

		// Case ID 17: Purchase Confirmation modal has rewards related message - Priced Magazine
		String buyIssueButtoninDRP111 = page.getPdpScreen().getBtnBuyButtonCurrentIssue().getText();
		boolean buyIssueButton111 = buyIssueButtoninDRP111.contains("BUY");
		if (buyIssueButton111 == true) {
			sleep(1000);
			touchAtCenterOfElement(page.getPdpScreen().getBtnBuyButtonCurrentIssue());
			sleep(1000);
			boolean confirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseTitle());
			boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
			boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
			boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
			boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
			boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
			boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
			boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
			if (confirmPurchaseTitle == true && confirmPurchaseMessage == true && coverImage == true
					&& bookDetailLayout == true && legalTermsView == true && confirmButton == true
					&& cancelButton == true && rewardsBanner == true) {
				System.out.println("Test Passed Case ID 17: Purchase Confirmation modal has rewards related message - Priced Magazine");
				touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
			} else {
				System.out.println("Test Failed Case ID 17: Purchase Confirmation modal has rewards related message - Priced Magazine");
			}
		} else {
			System.out.println("Buy Issue button is not displayed");
		}
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBottomBarEbooksTab());

		// Case ID 18: Rewards Announcement Section in the PDP (Priced Comic)
		waitUntilVisible(page.getBookstoreScreen().getBtnSearch());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnSearch());
		sendKeys("9780593528105");
		press(PRESS_ENTER);	
		boolean Cover_9780593528105_Image = isElementDisplayed(page.getBookstoreScreen().getImgEANSearchResultCoverImage());
		if(Cover_9780593528105_Image==true) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgEANSearchResultCoverImage());
			String buy_CTA_Button_Priced_PDP1111 = page.getPdpScreen().getBtnBuyInPricedBook().getText();
			boolean buyButton1111 = buy_CTA_Button_Priced_PDP1111.contains("BUY");
			boolean defaultRewardsPDP123 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
			if (buyButton1111 && defaultRewardsPDP123) {
				System.out.println("Test Passed Case  ID 18: Rewards Announcement Section in the PDP (Priced Comic)");
			} else {
				System.out.println("Buy button is not displayed");
				System.out.println("Test Failed Case  ID 18: Rewards Announcement Section in the PDP (Priced Comic)");
			}
			
				touchAtCenterOfElement(page.getPdpScreen().getBtnBuyInPricedBook());
				boolean confirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseTitle());
				boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
				boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
				boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
				boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
				boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
				boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
				boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
				if (confirmPurchaseTitle == true && confirmPurchaseMessage == true && coverImage == true
						&& bookDetailLayout == true && legalTermsView == true && confirmButton == true
						&& cancelButton == true && rewardsBanner == true) {
					System.out.println("Test Passed Case ID 19: Purchase Confirmation modal has rewards related message - Priced Comic");
					touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
				} else {
					System.out.println("Test Failed Case ID 19: Purchase Confirmation modal has rewards related message - Priced Comic");
				}	
				
		} else if (Cover_9780593528105_Image == false) { 
			//Image 1
			touchAtCenterOfElement(page.getBookstoreScreen().getBtnNavigateUp());
			waitUntilVisible(page.getBookstoreScreen().getBtnSearch());
			touchAtCenterOfElement(page.getBookstoreScreen().getBtnSearch());
			sendKeys("Comic");
			press(PRESS_ENTER);
			sleep(3000);
			waitUntilVisible(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
			touchAtCenterOfElement(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
			waitUntilVisible(page.getBookstoreScreen().getTxtComics());
			touchAtCenterOfElement(page.getBookstoreScreen().getTxtComics());
			waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
			boolean buyButton12 = isElementDisplayed(page.getPdpScreen().getBtnBuyInPricedBook());
			if (buyButton12 == true) {
				boolean defaultRewardsPDP12 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
				if (defaultRewardsPDP12 == true) {
					System.out.println("Test Passed Case  ID 18: Rewards Announcement Section in the PDP (Priced Comic)");
				} else {
					System.out.println("Test Failed Case  ID 18: Rewards Announcement Section in the PDP (Priced Comic)");
				} 
				touchAtCenterOfElement(page.getPdpScreen().getBtnBuyInPricedBook());
				boolean confirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseTitle());
				boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
				boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
				boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
				boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
				boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
				boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
				boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
				if (confirmPurchaseTitle == true && confirmPurchaseMessage == true && coverImage == true
						&& bookDetailLayout == true && legalTermsView == true && confirmButton == true
						&& cancelButton == true && rewardsBanner == true) {
					System.out.println("Test Passed Case ID 19: Purchase Confirmation modal has rewards related message - Priced Comic");
					touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
				} else {
					System.out.println("Test Failed Case ID 19: Purchase Confirmation modal has rewards related message - Priced Comic");
				}	
						} else {
							System.out.println("Please Find the Priced comic book");
						}
							
		} else {
			System.out.println("Please Find the Priced comic book");
		}
		
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBottomBarEbooksTab());
		
		
		
		System.out.println("-------------Rewards in Priced Contents Test Finished------------");

//		driver.closeApp();
//		driver.resetApp();

	} catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
		System.out.println("-------------Rewards in Priced Contents Test Crashed------------");
//		driver.resetApp();
		driver.launchApp();
	}
}
	
	
	@Test(priority = 2)
	public void rewardsInFreeContents() throws Exception {
		
		System.out.println("----------------Rewards in FREE Contents Test Started----------");
		
		try {
		
		// Case ID 20: Rewards Announcement Section in the PDP (FREE eBook)
		waitUntilVisible(page.getBookstoreScreen().getTxtBottomBarEbooksTab());
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBottomBarEbooksTab());
		waitUntilVisible(page.getBookstoreScreen().getBtnSearch());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnSearch());
		sendKeys("Free");
		press(PRESS_ENTER);
		sleep(3000);
		waitUntilVisible(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		waitUntilVisible(page.getBookstoreScreen().getTxtBooks());
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBooks());
		waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		//Book 1
		String freeInfoBelowCover1 = page.getBookstoreScreen().getTxtFreeBelowCoverImage1().getText();
		boolean freeInfoBook1 = freeInfoBelowCover1.contains("Free");
		//Book 2
		String freeInfoBelowCover2 = page.getBookstoreScreen().getTxtFreeBelowCoverImage2().getText();
		boolean freeInfoBook2 = freeInfoBelowCover2.contains("Free");
		//Book 3
		String freeInfoBelowCover3 = page.getBookstoreScreen().getTxtFreeBelowCoverImage3().getText();
		boolean freeInfoBook3 = freeInfoBelowCover3.contains("Free");
		
		if (freeInfoBook1) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		} else if (freeInfoBook2) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
		} else if (freeInfoBook3) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
		} else {
			System.out.println("Please Find Free Book");
		}
		waitUntilVisible(page.getPdpScreen().getBtnFreeCTAButton());
		boolean FreeCTAButton = isElementDisplayed(page.getPdpScreen().getBtnFreeCTAButton());
		boolean defaultRewardsPDP = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (FreeCTAButton == true && defaultRewardsPDP == true) {
			System.out.println("Test Passed Case ID 20: Rewards Announcement Section in the PDP (FREE eBook)");
		} else {
			System.out.println("Free button is not Displayed");
			System.out.println("Test Failed Case ID 20: Rewards Announcement Section in the PDP (FREE eBook)");
		}

		// Case ID 21: Purchase Confirmation modal has rewards related message - FREE eBook
		boolean FreeCTAButton1 = isElementDisplayed(page.getPdpScreen().getBtnFreeCTAButton());
		if (FreeCTAButton1 == true) {
			touchAtCenterOfElement(page.getPdpScreen().getBtnFreeCTAButton());
			boolean confirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseTitle());
			boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
			boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
			boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
			boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
			boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
			boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
			boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
			if (confirmPurchaseTitle && confirmPurchaseMessage && coverImage && bookDetailLayout && legalTermsView
					&& confirmButton && cancelButton && rewardsBanner) {
				System.out.println("Test Passed Case ID 21: Purchase Confirmation modal has rewards related message - FREE eBook");
				touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
			} else {
				System.out.println("Test Failed Case ID 21: Purchase Confirmation modal has rewards related message - FREE eBook");
			}
		} else {
			System.out.println("Free button is not Displayed");
		}
		touchAtCenterOfElement(page.getLibraryScreen().getTxtBottomBarBookstore());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtBottomBarAudioBooks());
		if (isElementDisplayed(page.getWhatsNewScreen().getBtnNotNow())) {
			touchAtCenterOfElement(page.getWhatsNewScreen().getBtnNotNow());
		}
		// Case ID 22: Rewards Announcement Section in the PDP (FREE Audiobook)
		waitUntilVisible(page.getAudioBooksScreen().getBtnSearch());
		touchAtCenterOfElement(page.getAudioBooksScreen().getBtnSearch());
		sendKeys("Free");
		press(PRESS_ENTER);
		sleep(3000);
		waitUntilVisible(page.getAudioBooksScreen().getImgSearchResIndex1AudioBooks());
		String freeInfoBelowCover11 = page.getBookstoreScreen().getTxtFreeBelowCoverImage1().getText();
		boolean freeInfoBook11 = freeInfoBelowCover11.contains("Free");
		//Book 2
		String freeInfoBelowCover21 = page.getBookstoreScreen().getTxtFreeBelowCoverImage2().getText();
		boolean freeInfoBook21 = freeInfoBelowCover21.contains("Free");
		//Book 3
		String freeInfoBelowCover31 = page.getBookstoreScreen().getTxtFreeBelowCoverImage3().getText();
		boolean freeInfoBook31 = freeInfoBelowCover31.contains("Free");
		if (freeInfoBook11) {
			touchAtCenterOfElement(page.getAudioBooksScreen().getImgSearchResIndex1AudioBooks());
		} else if (freeInfoBook21) {
			touchAtCenterOfElement(page.getAudioBooksScreen().getImgSearchResIndex2AudioBooks());
		} else if (freeInfoBook31) {
			touchAtCenterOfElement(page.getAudioBooksScreen().getImgSearchResIndex3AudioBooks());
		} else {
			System.out.println("Please Find Free Book");
		}
		boolean FreeCTAButton11 = isElementDisplayed(page.getPdpScreen().getBtnFreeCTAButton());
		boolean defaultRewardsPDP1 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (FreeCTAButton11 == true && defaultRewardsPDP1 == true) {
			System.out.println("Test Passed Case ID 22: Rewards Announcement Section in the PDP (FREE Audiobook)");
		} else {
			System.out.println("Free button is not Displayed");
			System.out.println("Test Failed Case ID 22: Rewards Announcement Section in the PDP (FREE Audiobook)");
		}

		// Case ID 23: Purchase Confirmation modal has rewards related message - (FREE Audiobook )
		boolean FreeCTAButton111 = isElementDisplayed(page.getPdpScreen().getBtnFreeCTAButton());
		if (FreeCTAButton111 == true) {
			sleep(3000);
			touchAtCenterOfElement(page.getPdpScreen().getBtnFreeCTAButton());
			boolean confirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseTitle());
			boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
			boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
			boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
			boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
			boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
			boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
			boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
			if (confirmPurchaseTitle == true && confirmPurchaseMessage == true && coverImage == true
					&& bookDetailLayout == true && legalTermsView == true && confirmButton == true
					&& cancelButton == true && rewardsBanner == true) {
				System.out.println("Test Passed Case ID 23: Purchase Confirmation modal has rewards related message - (FREE Audiobook )");
				touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
			} else {
				System.out.println("Test Failed Case ID 23: Purchase Confirmation modal has rewards related message - (FREE Audiobook )");
			}
		} else {
			System.out.println("Free button is not Displayed");
		}
		
		touchAtCenterOfElement(page.getLibraryScreen().getTxtBottomBarAudioBooks());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtBottomBarBookstore());
		
		// Case ID 24: Rewards Announcement Section in the PDP (FREE Magazine )
		waitUntilVisible(page.getBookstoreScreen().getBtnSearch());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnSearch());
		sendKeys("Free");
		press(PRESS_ENTER);
		sleep(3000);
		waitUntilVisible(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		waitUntilVisible(page.getBookstoreScreen().getTxtMagazines());
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtMagazines());
		waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		String freeInfoBelowCover111 = page.getBookstoreScreen().getTxtPriceInfoBelowCover1().getText();
		boolean freeInfoBook111 = freeInfoBelowCover111.contains("Free");
		//Book 2
		String freeInfoBelowCover211 = page.getBookstoreScreen().getTxtPriceInfoBelowCover2().getText();
		boolean freeInfoBook211 = freeInfoBelowCover211.contains("Free");
		//Book 3
		String freeInfoBelowCover311 = page.getBookstoreScreen().getTxtPriceInfoBelowCover3().getText();
		boolean freeInfoBook311 = freeInfoBelowCover311.contains("Free");
		if (freeInfoBook111) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		} else if (freeInfoBook211) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
		} else if (freeInfoBook311) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
		} else {
			System.out.println("Please Find Free Book");
		}
		waitUntilVisible(page.getPdpScreen().getTxtDefaultRewardsPDP());
		boolean FreeCTAButton1111 = isElementDisplayed(page.getPdpScreen().getBtnFreeCTAButton());
		boolean defaultRewardsPDP11 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (FreeCTAButton1111 == true && defaultRewardsPDP11 == true) {
			System.out.println("Test Passed Case ID 24: Rewards Announcement Section in the PDP (FREE Magazine )");
		} else {
			System.out.println("Free button is not Displayed");
			System.out.println("Test Failed Case ID 24: Rewards Announcement Section in the PDP (FREE Magazine )");
		}

		// Case ID 25: Purchase Confirmation modal has rewards related message - FREE Magazine
		boolean FreeCTAButton11111 = isElementDisplayed(page.getPdpScreen().getBtnFreeCTAButton());
		if (FreeCTAButton11111 == true) {
			touchAtCenterOfElement(page.getPdpScreen().getBtnFreeCTAButton());
			boolean confirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseTitle());
			boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
			boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
			boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
			boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
			boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
			boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
			boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
			if (confirmPurchaseTitle == true && confirmPurchaseMessage == true && coverImage == true
					&& bookDetailLayout == true && legalTermsView == true && confirmButton == true
					&& cancelButton == true && rewardsBanner == true) {
				System.out.println("Test Passed Case ID 25: Purchase Confirmation modal has rewards related message - FREE Magazine");
				touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
			} else {
				System.out.println("Test Failed Case ID 25: Purchase Confirmation modal has rewards related message - FREE Magazine");
			}
		} else {
			System.out.println("Free button is not Displayed");
		}
		waitUntilVisible(page.getBookstoreScreen().getBtnNavigateUp());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnNavigateUp());

		// Case ID 26: Rewards Announcement Section in the PDP (FREE Comic)
		waitUntilVisible(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		waitUntilVisible(page.getBookstoreScreen().getTxtComics());
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtComics());
		waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		String freeInfoBelowCover1111 = page.getBookstoreScreen().getTxtFreeBelowCoverImage1().getText();
		boolean freeInfoBook1111 = freeInfoBelowCover1111.contains("Free");
		//Book 2
		String freeInfoBelowCover2111 = page.getBookstoreScreen().getTxtFreeBelowCoverImage2().getText();
		boolean freeInfoBook2111 = freeInfoBelowCover2111.contains("Free");
		//Book 3
		String freeInfoBelowCover3111 = page.getBookstoreScreen().getTxtFreeBelowCoverImage3().getText();
		boolean freeInfoBook3111 = freeInfoBelowCover3111.contains("Free");
		if (freeInfoBook1111) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		} else if (freeInfoBook2111) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
		} else if (freeInfoBook3111) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
		} else {
			System.out.println("Please Find Free Book");
		}
		
		waitUntilVisible(page.getPdpScreen().getTxtDefaultRewardsPDP());
		boolean FreeCTAButton111111 = isElementDisplayed(page.getPdpScreen().getBtnFreeCTAButton());
		boolean defaultRewardsPDP111 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (FreeCTAButton111111 == true && defaultRewardsPDP111 == true) {
			System.out.println("Test Passed Case ID 26: Rewards Announcement Section in the PDP (FREE Comic)");
		} else {
			System.out.println("Free button is not Displayed");
			System.out.println("Test Failed Case ID 26: Rewards Announcement Section in the PDP (FREE Comic)");
		}

		// Case ID 27: Purchase Confirmation modal has rewards related message - FREE Comic
		boolean FreeCTAButton1111111 = isElementDisplayed(page.getPdpScreen().getBtnFreeCTAButton());
		if (FreeCTAButton1111111 == true) {
			touchAtCenterOfElement(page.getPdpScreen().getBtnFreeCTAButton());
			boolean confirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseTitle());
			boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
			boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
			boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
			boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
			boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
			boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
			boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
			if (confirmPurchaseTitle == true && confirmPurchaseMessage == true && coverImage == true
					&& bookDetailLayout == true && legalTermsView == true && confirmButton == true
					&& cancelButton == true && rewardsBanner == true) {
				System.out.println("Test Passed Case ID 27: Purchase Confirmation modal has rewards related message - FREE Comic");
				touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
			} else {
				System.out.println("Test Failed Case ID 27: Purchase Confirmation modal has rewards related message - FREE Comic");
			}
		} else {
			System.out.println("Free button is not Displayed");
		}
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBottomBarEbooksTab());
		
		System.out.println("-------------Rewards in FREE Contents Test Finished------------");
//		driver.closeApp();

//		driver.resetApp();

	} catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
		System.out.println("-------------Rewards in FREE Contents Test Crashed------------");
//		driver.resetApp();
		driver.launchApp();

	}
}
			
	@Test(priority = 3)
	public void rewardsInPreOrder() throws Exception {
		
		System.out.println("----------------Rewards in Pre-Order Test Started----------");
		
		try {
			
		// Case ID 28: Rewards Announcement Section in the PDP (Priced PRE-ORDER eBook)
		waitUntilVisible(page.getBookstoreScreen().getTxtBottomBarEbooksTab());
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBottomBarEbooksTab());	
		waitUntilVisible(page.getBookstoreScreen().getBtnSearch());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnSearch());
		sendKeys("Coming Soon");
		press(PRESS_ENTER);
		sleep(3000);
		waitUntilVisible(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		waitUntilVisible(page.getBookstoreScreen().getTxtBooks());
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBooks());
		waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		//Book 1
		boolean preOrderLabelBookInfoInBook1 = isElementDisplayed(page.getBookstoreScreen().getTxtPreOrderLabelBookInfoInBook1());
		String priceInfoBelowCover1 = page.getBookstoreScreen().getTxtPriceInfoBelowCover1().getText();
		boolean priceInfoBook1 = priceInfoBelowCover1.contains("US$");
		//Book 2
		boolean preOrderLabelBookInfoInBook2 = isElementDisplayed(page.getBookstoreScreen().getTxtPreOrderLabelBookInfoInBook2());
		String priceInfoBelowCover2 = page.getBookstoreScreen().getTxtPriceInfoBelowCover2().getText();
		boolean priceInfoBook2 = priceInfoBelowCover2.contains("US$");
		//Book 3
		boolean preOrderLabelBookInfoInBook3 = isElementDisplayed(page.getBookstoreScreen().getTxtPreOrderLabelBookInfoInBook3());
		String priceInfoBelowCover3 = page.getBookstoreScreen().getTxtPriceInfoBelowCover3().getText();
		boolean priceInfoBook3 = priceInfoBelowCover3.contains("US$");

		if (preOrderLabelBookInfoInBook1 && priceInfoBook1) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		} else if (preOrderLabelBookInfoInBook2 && priceInfoBook2) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
		} else if (preOrderLabelBookInfoInBook3 && priceInfoBook3) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion3Bookstore());
		} else {
			System.out.println("Please Find Priced Pre-Order Book");
		}
		String actualCTAButton = page.getPdpScreen().getBtnPreOrder().getText();
		boolean CTAButtonWithPreOrder = actualCTAButton.contains("PRE-ORDER");
		boolean defaultRewardsPDP = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (CTAButtonWithPreOrder == true && defaultRewardsPDP == true) {
			System.out.println("Test Passed Case ID 28: Rewards Announcement Section in the PDP (Priced PRE-ORDER eBook)");
		} else {
			System.out.println("PreOrder Button is not Displayed");
			System.out.println("Test Failed Case ID 28: Rewards Announcement Section in the PDP (Priced PRE-ORDER eBook)");
		}

		// Case ID 29: Purchase Confirmation modal has rewards related message - Priced PRE-ORDER eBook
		if (CTAButtonWithPreOrder == true) {
			touchAtCenterOfElement(page.getPdpScreen().getBtnPreOrder());
			boolean PreOrderconfirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtPreOrderConfirmationTitle());
			boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
			boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
			boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
			boolean PreOrderWarningMsg = isElementDisplayed(page.getPdpScreen().getTxtPreOrderWarningMsg());
			boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
			boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
			boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
			boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
			if (PreOrderconfirmPurchaseTitle == true && confirmPurchaseMessage == true && coverImage == true
					&& bookDetailLayout == true && PreOrderWarningMsg == true && legalTermsView == true
					&& confirmButton == true && cancelButton == true && rewardsBanner == true) {
				System.out.println("Test Passed Case ID 29: Purchase Confirmation modal has rewards related message - Priced PRE-ORDER eBook");
				touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
			} else {
				System.out.println("Test Failed Case ID 29: Purchase Confirmation modal has rewards related message - Priced PRE-ORDER eBook");
			}
		} else {
			System.out.println("PreOrder Button is not Displayed");
		}
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnNavigateUp());

		// Case ID 30: Rewards Announcement Section in the PDP (FREE PRE-ORDER ebook)
		waitUntilVisible(page.getBookstoreScreen().getBtnSearchResSortType());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnSearchResSortType());
		waitUntilVisible(page.getBookstoreScreen().getTxtPriceLowToHigh());
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtPriceLowToHigh());
		waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		// Book1
		boolean preOrderLabelBookInfoInBook11 = isElementDisplayed(page.getBookstoreScreen().getTxtPreOrderLabelBookInfoInBook1());
		String freeInfoBelowCover1 = page.getBookstoreScreen().getTxtFreeBelowCoverImage1().getText();
		boolean freeInfoBook1 = freeInfoBelowCover1.contains("Free");
		//Book 2
		boolean preOrderLabelBookInfoInBook21 = isElementDisplayed(page.getBookstoreScreen().getTxtPreOrderLabelBookInfoInBook2());
		String freeInfoBelowCover2 = page.getBookstoreScreen().getTxtFreeBelowCoverImage2().getText();
		boolean freeInfoBook2 = freeInfoBelowCover2.contains("Free");
		//Book 3
		boolean preOrderLabelBookInfoInBook31 = isElementDisplayed(page.getBookstoreScreen().getTxtPreOrderLabelBookInfoInBook3());
		String freeInfoBelowCover3 = page.getBookstoreScreen().getTxtFreeBelowCoverImage3().getText();
		boolean freeInfoBook3 = freeInfoBelowCover3.contains("Free");

		if (preOrderLabelBookInfoInBook11 && freeInfoBook1) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		} else if (preOrderLabelBookInfoInBook21 && freeInfoBook2) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
		} else if (preOrderLabelBookInfoInBook31 && freeInfoBook3) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion3Bookstore());
		} else {
			System.out.println("Please Find Free Pre-Order Book");
		}
		
		String actualCTAButton1 = page.getPdpScreen().getBtnPreOrder().getText();
		boolean CTAButtonWithPreOrder1 = actualCTAButton1.contains("PRE-ORDER");
		boolean defaultRewardsPDP1 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (CTAButtonWithPreOrder1 == true && defaultRewardsPDP1 == true) {
			System.out.println("Test Passed Case ID 30: Rewards Announcement Section in the PDP (FREE PRE-ORDER ebook)");
		} else {
			System.out.println("PreOrder Button is not Displayed");
			System.out.println("Test Failed Case ID 30: Rewards Announcement Section in the PDP (FREE PRE-ORDER ebook)");
		}

		// Case ID 31: Purchase Confirmation modal has rewards related message - FREE PRE-ORDER ebook
		if (CTAButtonWithPreOrder1 == true) {
			touchAtCenterOfElement(page.getPdpScreen().getBtnPreOrder());
			boolean PreOrderconfirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtPreOrderConfirmationTitle());
			boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
			boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
			boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
			boolean PreOrderWarningMsg = isElementDisplayed(page.getPdpScreen().getTxtPreOrderWarningMsg());
			boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
			boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
			boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
			boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
			if (PreOrderconfirmPurchaseTitle == true && confirmPurchaseMessage == true && coverImage == true
					&& bookDetailLayout == true && PreOrderWarningMsg == true && legalTermsView == true
					&& confirmButton == true && cancelButton == true && rewardsBanner == true) {
				System.out.println(
						"Test Passed Case ID 31: Purchase Confirmation modal has rewards related message - FREE PRE-ORDER ebook");
				touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
			} else {
				System.out.println(
						"Test Failed Case ID 31: Purchase Confirmation modal has rewards related message - FREE PRE-ORDER ebook");
			}
		} else {
			System.out.println("PreOrder Button is not Displayed");
		}
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBottomBarEbooksTab());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtBottomBarAudioBooks());

		// Case ID 32: Rewards Announcement Section in the PDP (Priced PRE-ORDER Audiobook)
		waitUntilVisible(page.getAudioBooksScreen().getBtnSearch());
		touchAtCenterOfElement(page.getAudioBooksScreen().getBtnSearch());
		sendKeys("Coming Soon");
		press(PRESS_ENTER);
		sleep(3000);
		waitUntilVisible(page.getAudioBooksScreen().getBtnFilterMediaTypeSearchResult());
		touchAtCenterOfElement(page.getAudioBooksScreen().getBtnFilterMediaTypeSearchResult());
		waitUntilVisible(page.getAudioBooksScreen().getTxtAudiobooks());
		touchAtCenterOfElement(page.getAudioBooksScreen().getTxtAudiobooks());
		waitUntilVisible(page.getAudioBooksScreen().getImgSearchResIndex1AudioBooks());
		boolean preOrderLabelBookInfoInBook111 = isElementDisplayed(page.getBookstoreScreen().getTxtPreOrderLabelBookInfoInBook1());
		String priceInfoBelowCover11 = page.getBookstoreScreen().getTxtPriceInfoBelowCover1().getText();
		boolean priceInfoBook11 = priceInfoBelowCover11.contains("US$");
		//Book 2
		boolean preOrderLabelBookInfoInBook211 = isElementDisplayed(page.getBookstoreScreen().getTxtPreOrderLabelBookInfoInBook2());
		String priceInfoBelowCover21 = page.getBookstoreScreen().getTxtPriceInfoBelowCover2().getText();
		boolean priceInfoBook21 = priceInfoBelowCover21.contains("US$");
		//Book 3
		boolean preOrderLabelBookInfoInBook311 = isElementDisplayed(page.getBookstoreScreen().getTxtPreOrderLabelBookInfoInBook3());
		String priceInfoBelowCover31 = page.getBookstoreScreen().getTxtPriceInfoBelowCover3().getText();
		boolean priceInfoBook31 = priceInfoBelowCover31.contains("US$");
		if (preOrderLabelBookInfoInBook111 && priceInfoBook11) {
			touchAtCenterOfElement(page.getAudioBooksScreen().getImgSearchResIndex1AudioBooks());
		} else if (preOrderLabelBookInfoInBook211 && priceInfoBook21) {
			touchAtCenterOfElement(page.getAudioBooksScreen().getImgSearchResIndex2AudioBooks());
		} else if (preOrderLabelBookInfoInBook311 && priceInfoBook31) {
			touchAtCenterOfElement(page.getAudioBooksScreen().getImgSearchResIndex3AudioBooks());
		} else {
			System.out.println("Please Find Pre-Order AudioBook");
		}

		boolean CTAPreOrderWithPriceButton11 = isElementDisplayed(page.getPdpScreen().getBtnPreOrderWithPrice());
		boolean defaultRewardsPDP11 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		
		if (CTAPreOrderWithPriceButton11 == true && defaultRewardsPDP11 == true) {
			System.out.println("Test Passed Case ID 32: Rewards Announcement Section in the PDP (Priced PRE-ORDER Audiobook)");
		} else {
			System.out.println("Test Failed Case ID 32: Rewards Announcement Section in the PDP (Priced PRE-ORDER Audiobook)");
		}

		// Case ID 33: Purchase Confirmation modal has rewards related message - Priced PRE-ORDER Audiobook
		if (CTAPreOrderWithPriceButton11 == true) {
			touchAtCenterOfElement(page.getPdpScreen().getBtnPreOrderWithPrice());
			boolean PreOrderconfirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtPreOrderConfirmationTitle());
			boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
			boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
			boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
			boolean PreOrderWarningMsg = isElementDisplayed(page.getPdpScreen().getTxtPreOrderWarningMsg());
			boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
			boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
			boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
			boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
			if (PreOrderconfirmPurchaseTitle == true && confirmPurchaseMessage == true && coverImage == true
					&& bookDetailLayout == true && PreOrderWarningMsg == true && legalTermsView == true
					&& confirmButton == true && cancelButton == true && rewardsBanner == true) {
				System.out.println("Test Passed Case ID 33: Purchase Confirmation modal has rewards related message - Priced PRE-ORDER Audiobook");
				touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
			} else {
				System.out.println("Test Failed Case ID 33: Purchase Confirmation modal has rewards related message - Priced PRE-ORDER Audiobook");
			}
		} else {
			System.out.println("PreOrder Button is not Displayed");
		}
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnNavigateUp());

		// Case ID 34: Rewards Announcement Section in the PDP (FREE PRE-ORDER AudioBook)
		waitUntilVisible(page.getAudioBooksScreen().getBtnSearchResSortType());
		touchAtCenterOfElement(page.getAudioBooksScreen().getBtnSearchResSortType());
		waitUntilVisible(page.getAudioBooksScreen().getTxtPriceLowToHigh());
		touchAtCenterOfElement(page.getAudioBooksScreen().getTxtPriceLowToHigh());
		waitUntilVisible(page.getAudioBooksScreen().getImgSearchResIndex1AudioBooks());
		boolean preOrderLabelBookInfoInBook1111 = isElementDisplayed(page.getBookstoreScreen().getTxtPreOrderLabelBookInfoInBook1());
		String priceInfoBelowCover111 = page.getBookstoreScreen().getTxtPriceInfoBelowCover1().getText();
		boolean priceInfoBook111 = priceInfoBelowCover111.contains("Free");
		//Book 2
		boolean preOrderLabelBookInfoInBook2111 = isElementDisplayed(page.getBookstoreScreen().getTxtPreOrderLabelBookInfoInBook2());
		String priceInfoBelowCover211 = page.getBookstoreScreen().getTxtPriceInfoBelowCover2().getText();
		boolean priceInfoBook211 = priceInfoBelowCover211.contains("Free");
		//Book 3
		boolean preOrderLabelBookInfoInBook3111 = isElementDisplayed(page.getBookstoreScreen().getTxtPreOrderLabelBookInfoInBook3());
		String priceInfoBelowCover311 = page.getBookstoreScreen().getTxtPriceInfoBelowCover3().getText();
		boolean priceInfoBook311 = priceInfoBelowCover311.contains("Free");
		if (preOrderLabelBookInfoInBook1111 && priceInfoBook111) {
			touchAtCenterOfElement(page.getAudioBooksScreen().getImgSearchResIndex1AudioBooks());
		} else if (preOrderLabelBookInfoInBook2111 && priceInfoBook211) {
			touchAtCenterOfElement(page.getAudioBooksScreen().getImgSearchResIndex2AudioBooks());
		} else if (preOrderLabelBookInfoInBook3111 && priceInfoBook311) {
			touchAtCenterOfElement(page.getAudioBooksScreen().getImgSearchResIndex3AudioBooks());
		} else {
			System.out.println("Please Find Free Pre-Order AudioBook");
		}
		boolean CTAPreOrderWithPriceButton111 = isElementDisplayed(page.getPdpScreen().getBtnPreOrderWithPrice());
		boolean defaultRewardsPDP111 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());

		if (CTAPreOrderWithPriceButton111 == true && defaultRewardsPDP111 == true) {
			System.out.println("Test Passed Case ID 34: Rewards Announcement Section in the PDP  (FREE PRE-ORDER AudioBook)");
		} else {
			System.out.println("PreOrder Button is not Displayed");
			System.out.println("Test Failed Case ID 34: Rewards Announcement Section in the PDP  (FREE PRE-ORDER AudioBook)");
		}

		// Case ID 35: Purchase Confirmation modal has rewards related message - FREE PRE-ORDER AudioBook
		if (CTAPreOrderWithPriceButton111 == true) {
			touchAtCenterOfElement(page.getPdpScreen().getBtnPreOrderWithPrice());
			boolean PreOrderconfirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtPreOrderConfirmationTitle());
			boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
			boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
			boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
			boolean PreOrderWarningMsg = isElementDisplayed(page.getPdpScreen().getTxtPreOrderWarningMsg());
			boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
			boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
			boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
			boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
			if (PreOrderconfirmPurchaseTitle == true && confirmPurchaseMessage == true && coverImage == true
					&& bookDetailLayout == true && PreOrderWarningMsg == true && legalTermsView == true
					&& confirmButton == true && cancelButton == true && rewardsBanner == true) {
				System.out.println("Test Passed Case ID 35: Purchase Confirmation modal has rewards related message - FREE PRE-ORDER AudioBook");
				touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
			} else {
				System.out.println("Test Failed Case ID 35: Purchase Confirmation modal has rewards related message - FREE PRE-ORDER AudioBook");
			}
		} else {
			System.out.println("PreOrder Button is not Displayed");
		}
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBottomBarEbooksTab());
		System.out.println("-------------Rewards in Pre-Order Test Finished------------");
//		driver.closeApp();
//		driver.resetApp();
	} catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
		System.out.println("-------------Rewards in Pre-Order Test Crashed------------");
//		driver.resetApp();
		driver.launchApp();
	}
}	
		
	@Test(priority = 4)
	public void rewardsCheckInPurchasedContents() throws Exception {
		
		System.out.println("----------------Rewards in Purchased Contents Test Started----------");
		
		try {
		// Case ID 36: No Rewards Announcement Section in PDP for Purchased AudioBook 
		waitUntilVisible(page.getLibraryScreen().getTxtBottomBarLibrary());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtBottomBarLibrary());
		if (isElementDisplayed(page.getLibraryScreen().getBtnSkipTour()) == true) {
			touchAtCenterOfElement(page.getLibraryScreen().getBtnSkipTour());
		}
		waitUntilVisible(page.getLibraryScreen().getBtnFilterMediaType());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnFilterMediaType());
		waitUntilVisible(page.getLibraryScreen().getTxtFilterAudioBooks());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtFilterAudioBooks());
		waitUntilVisible(page.getLibraryScreen().getTxtProduct1());
		waitUntilVisible(page.getLibraryScreen().getIcnOverflowMenuInLibrary());
		touchAtCenterOfElement(page.getLibraryScreen().getIcnOverflowMenuInLibrary());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnViewDetails());
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		boolean RewardsCheckInLibraryPDP = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if(!RewardsCheckInLibraryPDP) {
			System.out.println("Test Passed Case ID 36: No Rewards Announcement Section in PDP for Purchased AudioBook ");
		} else {
			System.out.println("Test Failed Case ID 36: No Rewards Announcement Section in PDP for Purchased AudioBook ");
		}
		
		//Case ID 37: No Rewards Announcement Section in PDP for Purchased ebook
		touchAtCenterOfElement(page.getPdpScreen().getBtnNavUp());
		waitUntilVisible(page.getLibraryScreen().getBtnFilterMediaType());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnFilterMediaType());
		waitUntilVisible(page.getLibraryScreen().getTxtFilterByBooks());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtFilterByBooks());
		waitUntilVisible(page.getLibraryScreen().getImgEbookProductWhitleyCox());
		longPress(page.getLibraryScreen().getImgEbookProductWhitleyCox());
		waitUntilVisible(page.getLibraryScreen().getBtnViewDetails());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnViewDetails());
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		boolean RewardsCheckInLibraryPDP1 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (!RewardsCheckInLibraryPDP1) {
			System.out.println("Test Passed Case ID 37: No Rewards Announcement Section in PDP for Purchased eBook ");
		} else {
			System.out.println("Test Failed Case ID 37: No Rewards Announcement Section in PDP for Purchased eBook ");
		}
		
		//Case ID 38: No Rewards Announcement Section in PDP for Purchased Comic
		touchAtCenterOfElement(page.getPdpScreen().getBtnNavUp());
		waitUntilVisible(page.getLibraryScreen().getBtnFilterMediaType());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnFilterMediaType());
		waitUntilVisible(page.getLibraryScreen().getTxtFilterComics());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtFilterComics());
		waitUntilVisible(page.getLibraryScreen().getTxtProduct1());
		waitUntilVisible(page.getLibraryScreen().getIcnOverflowMenuInLibrary());
		touchAtCenterOfElement(page.getLibraryScreen().getIcnOverflowMenuInLibrary());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnViewDetails());
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		boolean RewardsCheckInLibraryPDP11 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (!RewardsCheckInLibraryPDP11) {
			System.out.println("Test Passed Case ID 38: No Rewards Announcement Section in PDP for Purchased Comic");
		} else {
			System.out.println("Test Failed Case ID 38: No Rewards Announcement Section in PDP for Purchased Comic");
		}
		
		//Case ID 39: No Rewards Announcement Section in PDP for Purchased Magazine
		touchAtCenterOfElement(page.getPdpScreen().getBtnNavUp());
		waitUntilVisible(page.getLibraryScreen().getBtnFilterMediaType());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnFilterMediaType());
		waitUntilVisible(page.getLibraryScreen().getTxtFilterByMagazines());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtFilterByMagazines());
		waitUntilVisible(page.getLibraryScreen().getTxtProduct1());
		waitUntilVisible(page.getLibraryScreen().getIcnOverflowMenuInLibrary());
		touchAtCenterOfElement(page.getLibraryScreen().getIcnOverflowMenuInLibrary());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnViewDetails());
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		boolean RewardsCheckInLibraryPDP111 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (!RewardsCheckInLibraryPDP111) {
			System.out.println("Test Passed Case ID 39: No Rewards Announcement Section in PDP for Purchased Magazine");
		} else {
			System.out.println("Test Failed Case ID 39: No Rewards Announcement Section in PDP for Purchased Magazine");
		}
		touchAtCenterOfElement(page.getPdpScreen().getBtnNavUp());
		
		//Case ID 40: No Rewards Announcement Section in PDP for Purchased Audiobook - SHOP PDP
		waitUntilVisible(page.getLibraryScreen().getTxtBottomBarBookstore());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtBottomBarBookstore());
		waitUntilVisible(page.getBookstoreScreen().getBtnSearch());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnSearch());
		sendKeys("2940169130362");
		press(PRESS_ENTER);
		waitUntilVisible(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		waitUntilVisible(page.getBookstoreScreen().getTxtAudiobooks());
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtAudiobooks());
		waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		boolean RewardsCheckInLibraryPDP1111 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (!RewardsCheckInLibraryPDP1111) {
			System.out.println("Test Passed Case ID 40: No Rewards Announcement Section in PDP for Purchased Audiobook");
		} else {
			System.out.println("Test Failed Case ID 40: No Rewards Announcement Section in PDP for Purchased Audiobook");
		}
		
		//Case ID 41: Check Rewards in ebook (Not Purchased)  via Segment Control - SHOP PDP
		boolean ebookSegmentControlPDP = isElementDisplayed(page.getPdpScreen().getBtnebookSegmentControlPDP());
		if (ebookSegmentControlPDP == true) {
			sleep(2000);
			touchAtCenterOfElement(page.getPdpScreen().getBtnebookSegmentControlPDP());
			sleep(2000);
			waitUntilVisible(page.getPdpScreen().getTxtDefaultRewardsPDP());
			boolean RewardsCheckInSegmentPDP = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (RewardsCheckInSegmentPDP == true) {
			System.out.println("Test Passed Case ID 41: Check Rewards in ebook (Not Purchased)  via Segment Control - SHOP PDP");
		} else {
			System.out.println("Test Failed Case ID 41: Check Rewards in ebook (Not Purchased)  via Segment Control - SHOP PDP");
		}
		} else {
			System.out.println("SegmentControl is not displayed");
		}
		touchAtCenterOfElement(page.getPdpScreen().getBtnNavUp());

		//Case ID 42: No Rewards Announcement Section in PDP for Purchased ebook - SHOP - PDP
		waitUntilVisible(page.getLibraryScreen().getTxtBottomBarBookstore());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtBottomBarBookstore());
		waitUntilVisible(page.getBookstoreScreen().getBtnSearch());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnSearch());
		sendKeys("2940160951829");
		press(PRESS_ENTER);
		waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		boolean RewardsCheckInLibraryPDP11111 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (!RewardsCheckInLibraryPDP11111) {
			System.out.println("Test Passed Case ID 42: No Rewards Announcement Section in PDP for Purchased ebook - SHOP - PDP");
		} else {
			System.out.println("Test Failed Case ID 42: No Rewards Announcement Section in PDP for Purchased ebook - SHOP - PDP");
		}	
		
		//Case ID 43: Check Rewards in  Audiobook (Not Purchased)  via Segment Control - SHOP PDP
		boolean audiobookSegmentControlPDP = isElementDisplayed(page.getPdpScreen().getBtnAudiobookSegmentControlPDP());
		if (audiobookSegmentControlPDP == true) {
			sleep(2000);
			touchAtCenterOfElement(page.getPdpScreen().getBtnAudiobookSegmentControlPDP());
			waitUntilVisible(page.getPdpScreen().getTxtDefaultRewardsPDP());
			boolean RewardsCheckInSegmentPDP = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (RewardsCheckInSegmentPDP == true) {
			System.out.println("Test Passed Case ID 43: Check Rewards in  Audiobook (Not Purchased)  via Segment Control - SHOP PDP");
		} else {
			System.out.println("Test Failed Case ID 43: Check Rewards in  Audiobook (Not Purchased)  via Segment Control - SHOP PDP");
		}
		} else {
			System.out.println("SegmentControl is not displayed");
		}
		
		//Case ID 44: No Rewards Announcement Section in PDP for Purchased Comic - SHOP PDP
		waitUntilVisible(page.getLibraryScreen().getTxtBottomBarBookstore());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtBottomBarBookstore());
		waitUntilVisible(page.getBookstoreScreen().getBtnSearch());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnSearch());
		sendKeys("2940153635613");
		press(PRESS_ENTER);
		waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		boolean RewardsCheckInLibraryPDP2 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (!RewardsCheckInLibraryPDP2) {
			System.out.println("Test Passed Case ID 44: No Rewards Announcement Section in PDP for Purchased Comic - SHOP PDP");
		} else {
			System.out.println("Test Failed Case ID 44: No Rewards Announcement Section in PDP for Purchased Comic - SHOP PDP");
		}
		
		//Case ID 45: No Rewards Announcement Section in PDP for Purchased Magazine - SHOP - PDP
		waitUntilVisible(page.getLibraryScreen().getTxtBottomBarBookstore());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtBottomBarBookstore());
		waitUntilVisible(page.getBookstoreScreen().getBtnSearch());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnSearch());
		sendKeys("2940149148103"); 
		press(PRESS_ENTER);
		waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		boolean RewardsCheckInLibraryPDP3 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (!RewardsCheckInLibraryPDP3) {
			System.out.println("Test Passed Case ID 45: No Rewards Announcement Section in PDP for Purchased Magazine - SHOP PDP");
		} else {
			System.out.println("Test Failed Case ID 45: No Rewards Announcement Section in PDP for Purchased Magazine - SHOP PDP");
		}
		
		touchAtCenterOfElement(page.getPdpScreen().getBtnNavUp());
		touchAtCenterOfElement(page.getPdpScreen().getBtnNavUp());
		System.out.println("-------------Rewards in Purchased Contents Test Finished------------");
//		driver.closeApp();
//		driver.resetApp();

	} catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
		System.out.println("-------------Rewards in Purchased Contents Test Crashed------------");
//		driver.resetApp();
		driver.launchApp();
	}
}
	
	@Test(priority = 5)
	public void rewardsCheckInSampleBook() throws Exception {
		
		System.out.println("----------------Rewards in Sample book Test Started----------");
		
		try {
		
		
		//Case ID 46: Rewards section in Library Sample PDP
		waitUntilVisible(page.getLibraryScreen().getTxtBottomBarLibrary());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtBottomBarLibrary());
		if (isElementDisplayed(page.getLibraryScreen().getBtnSkipTour()) == true) {
			touchAtCenterOfElement(page.getLibraryScreen().getBtnSkipTour());
		}
		waitUntilVisible(page.getLibraryScreen().getBtnFilterMediaType());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnFilterMediaType());
		waitUntilVisible(page.getLibraryScreen().getTxtFilterByBooks());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtFilterByBooks());
		waitUntilVisible(page.getLibraryScreen().getImgSampleProductRewards());
//		clickAndHoldOnElement(page.getLibraryScreen().getImgSampleProductRewardsBy());
		longPress(page.getLibraryScreen().getImgSampleProductRewards());
		sleep(1000);
		waitUntilVisible(page.getLibraryScreen().getBtnViewDetails());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnViewDetails());
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		boolean RewardsCheckInLibraryPDP = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (RewardsCheckInLibraryPDP == true) {
			System.out.println("Test Passed Case ID 46: Rewards section in Library Sample PDP");
		} else {
			System.out.println("Test Failed Case ID 46: Rewards section in Library Sample PDP");
		}
		
		//Case ID 47: Rewards section in sample EOB
		touchAtCenterOfElement(page.getLibraryScreen().getBtnNavigateBack());
		waitUntilVisible(page.getLibraryScreen().getImgSampleProductRewards());
		longPress(page.getLibraryScreen().getImgSampleProductRewards());
		boolean removeDownload = isElementDisplayed(page.getLibraryScreen().getBtnRemoveDownload());
		if(removeDownload == true) {
			press(PRESS_TYPES.BACK);
			System.out.println("Sample book Already downloaded");
		} else {
			waitUntilVisible(page.getLibraryScreen().getBtnDownload());
			touchAtCenterOfElement(page.getLibraryScreen().getBtnDownload());
			waitUntilInvisible(page.getLibraryScreen().getImgDownloadProgressBy());
		}
		touchAtCenterOfElement(page.getLibraryScreen().getImgSampleProductRewards());
		waitUntilVisible(page.getReaderScreen().getImgCurlOglView());
		waitUntilVisible(page.getReaderScreen().getImgSwipeTip());
		sleep(3000);
		tapRightSideofScreen();
		waitUntilVisible(page.getReaderScreen().getImgSwipeTip());
		sleep(2000);
		tapLeftSideofScreen();
		sleep(2000);
		if (isElementDisplayed(page.getReaderScreen().getImgOobeCenterTapTip()) == true) {
			touchAtCenterOfElement(page.getReaderScreen().getImgOobeCenterTapTip());
		}
		if(isElementDisplayed(page.getReaderScreen().getTxtTextSettingsPopup()) == true) {
			touchAtCenterOfElement(page.getReaderScreen().getTxtTextSettingsPopup());
		}
		waitUntilVisible(page.getReaderScreen().getImgCurlOglView());
		touchAtCenterOfElement(page.getReaderScreen().getImgCurlOglView());
		tapRightSideofScreen();
		sleep(3000);
		waitUntilVisible(page.getReaderScreen().getImgCurlOglView());
		tapRightSideofScreen();
		sleep(3000);
		tapRightSideofScreen();
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		boolean RewardsCheckInLibraryPDP1 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (RewardsCheckInLibraryPDP1 == true) {
			System.out.println("Test Passed Case ID 47: Rewards section in sample EOB");
		} else {
			System.out.println("Test Failed Case ID 47: Rewards section in sample EOB");
		}
		
		//Case ID 48: Rewards section in sample - Reader - PDP
		touchAtCenterOfElement(page.getLibraryScreen().getBtnNavigateBack());
		touchAtCenterOfElement(page.getLibraryScreen().getImgSampleProductRewards());
		sleep(3000);
		if (isElementDisplayed(page.getReaderScreen().getTxtTipFooter())) {
			touchAtCenterOfElement(page.getReaderScreen().getTxtTipFooter());
		}
		waitUntilVisible(page.getReaderScreen().getImgCurlOglView()); 
		touchAtCenterOfElement(page.getReaderScreen().getImgCurlOglView());
		waitUntilVisible(page.getReaderScreen().getBtnOverFlow());
		touchAtCenterOfElement(page.getReaderScreen().getBtnOverFlow());
		waitUntilVisible(page.getReaderScreen().getBtnViewDetails());
		touchAtCenterOfElement(page.getReaderScreen().getBtnViewDetails());
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		boolean RewardsCheckInLibraryPDP2 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (RewardsCheckInLibraryPDP2 == true) {
			System.out.println("Test Passed Case ID 48: Rewards section in sample - Reader - PDP");
		} else {
			System.out.println("Test Failed Case ID 48: Rewards section in sample - Reader - PDP");
		}
		touchAtCenterOfElement(page.getPdpScreen().getBtnNavUp());
		
		
		System.out.println("-------------Rewards in Sample book Test Finished------------");
//		driver.closeApp();
//		driver.resetApp();

	} catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
		System.out.println("-------------Rewards in Sample book Test Crashed------------");
//		driver.resetApp();
		driver.launchApp();
	}
}
		
    @Test(priority = 6)
	public void rewardsCheckInWishlistPDP() throws Exception {
		
		System.out.println("----------------Rewards in Wishlist Test Started----------");
		
		try {
			
		
		//Case ID 49: Rewards in Wishlist - eBook
    	waitUntilVisible(page.getBookstoreScreen().getTxtBottomBarEbooksTab());
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBottomBarEbooksTab());
		if (isElementDisplayed(page.getWhatsNewScreen().getBtnNotNow())) {
			touchAtCenterOfElement(page.getWhatsNewScreen().getBtnNotNow());
		}
		waitUntilVisible(page.getBookstoreScreen().getBtnWishlist());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnWishlist());
		waitUntilVisible(page.getBookstoreScreen().getImgEbookInWishlistReward());
		touchAtCenterOfElement(page.getBookstoreScreen().getImgEbookInWishlistReward());
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		boolean RewardsCheckInLibraryPDP = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (RewardsCheckInLibraryPDP == true) {
			System.out.println("Test Passed Case ID 49: Rewards in Wishlist - eBook");
		} else {
			System.out.println("Test Failed Case ID 49: Rewards in Wishlist - eBook");
		}
		touchAtCenterOfElement(page.getPdpScreen().getBtnNavUp());
		
		//Case ID 50: Rewards in Wishlist - Audiobook
		waitUntilVisible(page.getBookstoreScreen().getImgAudiobookInWishlistReward());
		touchAtCenterOfElement(page.getBookstoreScreen().getImgAudiobookInWishlistReward());
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		boolean RewardsCheckInLibraryPDP1 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (RewardsCheckInLibraryPDP1 == true) {
			System.out.println("Test Passed Case ID 50: Rewards in Wishlist - Audiobook");
		} else {
			System.out.println("Test Failed Case ID 50: Rewards in Wishlist - Audiobook");
		}
		touchAtCenterOfElement(page.getPdpScreen().getBtnNavUp());

		//Case ID 51: Rewards in Wishlist - Magazine
		waitUntilVisible(page.getBookstoreScreen().getImgMagazineInWishlistReward());
		touchAtCenterOfElement(page.getBookstoreScreen().getImgMagazineInWishlistReward());
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		boolean RewardsCheckInLibraryPDP2 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (RewardsCheckInLibraryPDP2 == true) {
			System.out.println("Test Passed Case ID 51: Rewards in Wishlist - Magazine");
		} else {
			System.out.println("Test Failed Case ID 51: Rewards in Wishlist - Magazine");
		}
		touchAtCenterOfElement(page.getPdpScreen().getBtnNavUp());
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBottomBarEbooksTab());
		
		
		System.out.println("-------------Rewards in Wishlist Test Finished------------");
//		driver.closeApp();
//		driver.resetApp();

	} catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
		System.out.println("-------------Rewards in Wishlist Test Crashed------------");
//		driver.resetApp();
		driver.launchApp();
	}
}
	
	@Test(priority = 7)
	public void rewardsSecondaryProfile() throws Exception {
		
		System.out.println("----------------Rewards in Secondary Profile Test Started----------");
		
		try {
		
		//Case ID 52: Rewards section in Secondary Profile shop eBook PDP
		waitUntilVisible(page.getLibraryScreen().getBtnAccountTabGlobalNavBar());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnAccountTabGlobalNavBar());
		waitUntilVisible(page.getProfileScreen().getTxtManageProfiles());
		touchAtCenterOfElement(page.getProfileScreen().getTxtManageProfiles());
		waitUntilVisible(page.getProfileScreen().getBtnProfile2());
		touchAtCenterOfElement(page.getProfileScreen().getBtnProfile2());
		waitUntilVisible(page.getLibraryScreen().getTxtBottomBarBookstore());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtBottomBarBookstore());
		if (isElementDisplayed(page.getWhatsNewScreen().getBtnNotNow())) {
			touchAtCenterOfElement(page.getWhatsNewScreen().getBtnNotNow());
		}
		waitUntilVisible(page.getBookstoreScreen().getBtnSearch());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnSearch());
		sendKeys("Fortune And Glory");
		press(PRESS_ENTER);
		waitUntilVisible(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		waitUntilVisible(page.getBookstoreScreen().getTxtBooks());
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBooks());
		waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		//Book 1
		String priceInfoBelowCover1 = page.getBookstoreScreen().getTxtPriceInfoBelowCover1().getText();
		boolean priceInfoBook1 = priceInfoBelowCover1.contains("US$");
		//Book 2
		String priceInfoBelowCover2 = page.getBookstoreScreen().getTxtPriceInfoBelowCover2().getText();
		boolean priceInfoBook2 = priceInfoBelowCover2.contains("US$");
		//Book 3
		String priceInfoBelowCover3 = page.getBookstoreScreen().getTxtPriceInfoBelowCover3().getText();
		boolean priceInfoBook3 = priceInfoBelowCover3.contains("US$");
		
		if (priceInfoBook1) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		} else if (priceInfoBook2) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
		} else if (priceInfoBook3) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion3Bookstore());
		} else {
			System.out.println("Please Find Priced Book");
		}
		
		String buy_CTA_Button_Priced_PDP = page.getPdpScreen().getBtnBuyInPricedBook().getText();
		boolean buyButton = buy_CTA_Button_Priced_PDP.contains("BUY");
		boolean defaultRewardsPDP = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (buyButton && defaultRewardsPDP) {
			System.out.println("Test Passed Case ID 52: Rewards section in Secondary Profile shop eBook PDP");
		} else {
			System.out.println("Buy button in Priced Book is not Displayed");
			System.out.println("Test Failed Case ID 52: Rewards section in Secondary Profile shop eBook PDP");
		}
		
		// Case ID 53: Details in Rewards Secondary Profile shop PDP
		tapOnLinkTextRewardsDetails_TermsAndCondition(page.getPdpScreen().getTxtDefaultRewardsPDP());
		waitUntilVisible(page.getPdpScreen().getBtnGotItInRewards());
		boolean defaultRewardsTitle = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsDetailTitle());
		boolean defaultRewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsBanner());
		boolean rewardsDetailElement = isElementDisplayed(page.getPdpScreen().getTxtRewardsDetails());
		boolean defaultRewardsTermsAndCondition = isElementDisplayed(page.getPdpScreen().getTxtRewardsFooter());
		boolean defaultRewardsGotItButton = isElementDisplayed(page.getPdpScreen().getBtnGotItInRewards());
		if(defaultRewardsTitle && defaultRewardsBanner && rewardsDetailElement && defaultRewardsTermsAndCondition && defaultRewardsGotItButton) {
			System.out.println("Test Passed Case ID 53: Details in Rewards Secondary Profile shop PDP");
		} else {
			System.out.println("Test Failed Case ID 53: Details in Rewards Secondary Profile shop PDP");
		}
		
		// Case ID 54: Terms and conditions in shop PDP
		tapOnLinkTextRewardsDetails_TermsAndCondition(page.getPdpScreen().getTxtRewardsFooter());
		waitUntilVisible(page.getSettingsScreen().getTxtTiltleRewardsMembershipTerms());
		if (isElementDisplayed(page.getSettingsScreen().getTxtTiltleRewardsMembershipTerms()) == true) {
			System.out.println("Test Passed Case ID 54: Terms and conditions in shop PDP");
			waitUntilVisible(page.getSettingsScreen().getBtnClose());
			touchAtCenterOfElement(page.getSettingsScreen().getBtnClose());
		} else {
			System.out.println("Test Failed Case ID 54: Terms and conditions in shop PDP");
		}

		// Case ID 55: Rewards Details modal - Close in secondary Profile shop PDP
		waitUntilVisible(page.getPdpScreen().getBtnGotItInRewards());
		touchAtCenterOfElement(page.getPdpScreen().getBtnGotItInRewards());
		sleep(1000);
		waitUntilVisible(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP()) == true) {
			System.out.println("Test Passed Case ID 55: Rewards Details modal - Close in secondary Profile shop PDP");
		} else {
			System.out.println("Test Failed Case ID 55: Rewards Details modal - Close in secondary Profile shop PDP");
		}
		
		//Case ID 56: Purchase Confirmation modal in Secondary Profile ebook shop PDP
		String buy_CTA_Button_Priced_PDP1 = page.getPdpScreen().getBtnBuyInPricedBook().getText();
		boolean buyButton1 = buy_CTA_Button_Priced_PDP1.contains("BUY");
		if (buyButton1 == true) {
			touchAtCenterOfElement(page.getPdpScreen().getBtnBuyInPricedBook());
			boolean confirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseTitle());
			boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
			boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
			boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
			boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
			boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
			boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
			boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
			if (confirmPurchaseTitle == true && confirmPurchaseMessage == true && coverImage == true
					&& bookDetailLayout == true && legalTermsView == true && confirmButton == true
					&& cancelButton == true && rewardsBanner == true) {
				System.out.println(
						"Test Passed Case ID 56: Purchase Confirmation modal in Secondary Profile ebook shop PDP");
				touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
			} else {
				System.out.println(
						"Test Failed Case ID 56: Purchase Confirmation modal in Secondary Profile ebook shop PDP");
			}
		} else {
			System.out.println("Buy Button is not Displayed");
		}
		
		//Case ID 57: Rewards section in Secondary Profile shop Audiobook PDP
		if(isElementDisplayed(page.getPdpScreen().getBtnAudiobookSegmentControlPDP())) {
			touchAtCenterOfElement(page.getPdpScreen().getBtnAudiobookSegmentControlPDP());
		} else {
			touchAtCenterOfElement(page.getPdpScreen().getBtnNavUp());
			waitUntilVisible(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
			touchAtCenterOfElement(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
			waitUntilVisible(page.getBookstoreScreen().getTxtAudiobooks());
			touchAtCenterOfElement(page.getBookstoreScreen().getTxtAudiobooks());
			waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
			String priceInfoBelowCover11 = page.getBookstoreScreen().getTxtPriceInfoBelowCover1().getText();
			boolean priceInfoBook11 = priceInfoBelowCover11.contains("US$");
			//Book 2
			String priceInfoBelowCover21 = page.getBookstoreScreen().getTxtPriceInfoBelowCover2().getText();
			boolean priceInfoBook21 = priceInfoBelowCover21.contains("US$");
			//Book 3
			String priceInfoBelowCover31 = page.getBookstoreScreen().getTxtPriceInfoBelowCover3().getText();
			boolean priceInfoBook31 = priceInfoBelowCover31.contains("US$");
			if (priceInfoBook11) {
				touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
			} else if (priceInfoBook21) {
				touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
			} else if (priceInfoBook31) {
				touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
			} else {
				System.out.println("Please Find Priced AudioBook");
			}	
		}
		waitUntilVisible(page.getPdpScreen().getTxtDefaultRewardsPDP());
		String buy_CTA_Button_Priced_PDP11 = page.getPdpScreen().getBtnBuyInPricedBook().getText();
		boolean buyButton11 = buy_CTA_Button_Priced_PDP11.contains("BUY");
		boolean defaultRewardsPDP1 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (buyButton11 && defaultRewardsPDP1) {
			System.out.println("Test Passed Case ID 57: Rewards section in Secondary Profile shop Audiobook PDP");
		} else {
			System.out.println("Test Failed Case ID 57: Rewards section in Secondary Profile shop Audiobook PDP");
		}
		
		//Case ID 58: Purchase Confirmation modal in Secondary Profile Audiobook shop PDP
		if (buyButton11 == true) {
			touchAtCenterOfElement(page.getPdpScreen().getBtnBuyInPricedBook());
			boolean confirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseTitle());
			boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
			boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
			boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
			boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
			boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
			boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
			boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
			if (confirmPurchaseTitle == true && confirmPurchaseMessage == true && coverImage == true
					&& bookDetailLayout == true && legalTermsView == true && confirmButton == true
					&& cancelButton == true && rewardsBanner == true) {
				System.out.println(
						"Test Passed Case ID 58: Purchase Confirmation modal in Secondary Profile Audiobook shop PDP");
				touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
			} else {
				System.out.println(
						"Test Failed Case ID 58: Purchase Confirmation modal in Secondary Profile Audiobook shop PDP");
			}
		} else {
			System.out.println("Buy Button is not Displayed");
		}
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBottomBarEbooksTab());

		//Case ID 59: Rewards section in Secondary Profile shop Magazine PDP
		waitUntilVisible(page.getBookstoreScreen().getBtnSearch());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnSearch());
		sendKeys("Magazines");
		press(PRESS_ENTER);
		sleep(3000);
		waitUntilVisible(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		waitUntilVisible(page.getBookstoreScreen().getTxtMagazines());
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtMagazines());
		waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		String priceInfoBelowCover11 = page.getBookstoreScreen().getTxtPriceInfoBelowCover1().getText();
		boolean priceInfoBook11 = priceInfoBelowCover11.contains("US$");
		//Book 2
		String priceInfoBelowCover21 = page.getBookstoreScreen().getTxtPriceInfoBelowCover2().getText();
		boolean priceInfoBook21 = priceInfoBelowCover21.contains("US$");
		//Book 3
		String priceInfoBelowCover31 = page.getBookstoreScreen().getTxtPriceInfoBelowCover3().getText();
		boolean priceInfoBook31 = priceInfoBelowCover31.contains("US$");
		if (priceInfoBook11) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		} else if (priceInfoBook21) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
		} else if (priceInfoBook31) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
		} else {
			System.out.println("Please Find Priced Magazine");
		}
		
		String buyIssueButtoninDRP = page.getPdpScreen().getBtnBuyButtonCurrentIssue().getText();
		boolean buyIssueButton = buyIssueButtoninDRP.contains("BUY");
		boolean defaultRewardsPDP11 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (buyIssueButton && defaultRewardsPDP11) {
			System.out.println("Test Passed Case ID 59: Rewards section in Secondary Profile shop Magazine PDP");
		} else {
			System.out.println("Buy Issue button is not displayed");
			System.out.println("Test Failed Case ID 59: Rewards section in Secondary Profile shop Magazine PDP");
		}

		// Case ID 60: Purchase Confirmation modal in Secondary Profile Magazine shop PDP
		if (buyIssueButton == true) {
			touchAtCenterOfElement(page.getPdpScreen().getBtnBuyButtonCurrentIssue());
			boolean confirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseTitle());
			boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
			boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
			boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
			boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
			boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
			boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
			boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
			if (confirmPurchaseTitle == true && confirmPurchaseMessage == true && coverImage == true
					&& bookDetailLayout == true && legalTermsView == true && confirmButton == true
					&& cancelButton == true && rewardsBanner == true) {
				System.out.println("Test Passed Case ID 60: Purchase Confirmation modal in Secondary Profile Magazine shop PDP");
				touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
			} else {
				System.out.println("Test Failed Case ID 60: Purchase Confirmation modal in Secondary Profile Magazine shop PDP");
			}
		} else {
			System.out.println("Buy Issue button is not displayed");
		}
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBottomBarEbooksTab());
		
		//Case ID 61: No Rewards section in Secondary Profile Library Audiobook PDP
		waitUntilVisible(page.getLibraryScreen().getTxtBottomBarLibrary());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtBottomBarLibrary());
		if (isElementDisplayed(page.getLibraryScreen().getBtnSkipTour()) == true) {
			touchAtCenterOfElement(page.getLibraryScreen().getBtnSkipTour());
		}
		waitUntilVisible(page.getLibraryScreen().getBtnFilterMediaType());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnFilterMediaType());
		waitUntilVisible(page.getLibraryScreen().getTxtFilterAudioBooks());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtFilterAudioBooks());
		waitUntilVisible(page.getLibraryScreen().getTxtProduct1());
		waitUntilVisible(page.getLibraryScreen().getIcnOverflowMenuInLibrary());
		touchAtCenterOfElement(page.getLibraryScreen().getIcnOverflowMenuInLibrary());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnViewDetails());
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		boolean RewardsCheckInLibraryPDP = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if(!RewardsCheckInLibraryPDP) {
			System.out.println("Test Passed Case ID 61: No Rewards section in Secondary Profile Library Audiobook PDP");
		} else {
			System.out.println("Test Failed Case ID 61: No Rewards section in Secondary Profile Library Audiobook PDP");
		}
		
		//Case ID 62: No Rewards section in Secondary Profile Library eBook PDP
		touchAtCenterOfElement(page.getPdpScreen().getBtnNavUp());
		waitUntilVisible(page.getLibraryScreen().getBtnFilterMediaType());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnFilterMediaType());
		waitUntilVisible(page.getLibraryScreen().getTxtFilterByBooks());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtFilterByBooks());
		waitUntilVisible(page.getLibraryScreen().getImgEbookProduct1());
		touchAtCenterOfElement(page.getLibraryScreen().getImgEbookProduct1());
		waitUntilVisible(page.getLibraryScreen().getBtnViewDetails());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnViewDetails());
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		boolean RewardsCheckInLibraryPDP1 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (!RewardsCheckInLibraryPDP1) {
			System.out.println("Test Passed Case ID 62: No Rewards section in Secondary Profile Library eBook PDP");
		} else {
			System.out.println("Test Failed Case ID 62: No Rewards section in Secondary Profile Library eBook PDP");
		}
		
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnNavigateBack());
		
		//Case ID 64: Rewards section in Library Sample PDP
		waitUntilVisible(page.getLibraryScreen().getImgSampleProductRewards());
//		clickAndHoldOnElement(page.getLibraryScreen().getImgSampleProductRewardsBy());
		longPress(page.getLibraryScreen().getImgSampleProductRewards());
		waitUntilVisible(page.getLibraryScreen().getBtnViewDetails());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnViewDetails());
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		Boolean RewardsCheckinSample = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (RewardsCheckinSample == true) {
			System.out.println("Test Passed Case ID 64: Rewards section in Library Sample PDP");
		} else {
			System.out.println("Test Failed Case ID 64: Rewards section in Library Sample PDP");
		}
		
		//Case ID 63: No Rewards section in Secondary Profile Library Comic PDP
		touchAtCenterOfElement(page.getPdpScreen().getBtnNavUp());
		waitUntilVisible(page.getLibraryScreen().getBtnFilterMediaType());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnFilterMediaType());
		waitUntilVisible(page.getLibraryScreen().getTxtFilterComics());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtFilterComics());
		waitUntilVisible(page.getLibraryScreen().getTxtProduct1());
		waitUntilVisible(page.getLibraryScreen().getIcnOverflowMenuInLibrary());
		touchAtCenterOfElement(page.getLibraryScreen().getIcnOverflowMenuInLibrary());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnViewDetails());
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		boolean RewardsCheckInLibraryPDP2 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (!RewardsCheckInLibraryPDP2) {
			System.out.println("Test Passed Case ID 63: No Rewards section in Secondary Profile Library Comic PDP");
		} else {
			System.out.println("Test Failed Case ID 63: No Rewards section in Secondary Profile Library Comic PDP");
		}
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnNavigateBack());
		
		System.out.println("-------------Rewards in Secondary Profile Test Finished------------");

		driver.resetApp();

	} catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
		System.out.println("-------------Rewards in Secondary Profile Test Crashed------------");
		driver.resetApp();
	}
}

	@Test(priority = 8)
	public void rewardsNewAccount() throws Exception {
		
		System.out.println("----------------Rewards in New Account Test Started----------");
		
		try {
		
		waitUntilVisible(page.getWelcomeScreen().getBtnCreateAccount());
		touchAtCenterOfElement(page.getWelcomeScreen().getBtnCreateAccount());
		waitUntilVisible(page.getSignupScreen().getTxtBoxFirstName());
		touchAtCenterOfElement(page.getSignupScreen().getTxtBoxFirstName());
		sendKeys("FName");
		driver.hideKeyboard();
		waitUntilVisible(page.getSignupScreen().getTxtBoxLastName());
		touchAtCenterOfElement(page.getSignupScreen().getTxtBoxLastName());
		sendKeys("LName");
		driver.hideKeyboard();
		waitUntilVisible(page.getSignupScreen().getTxtBoxEmailId());
		touchAtCenterOfElement(page.getSignupScreen().getTxtBoxEmailId());
		String emailid = date();
		String emailid1 = "Test" + emailid + "@bn.com";
		sendKeys(emailid1);
		driver.hideKeyboard();
		newMail = emailid1;
		waitUntilVisible(page.getSignupScreen().getTxtBoxPassword());
		touchAtCenterOfElement(page.getSignupScreen().getTxtBoxPassword());
		sendKeys("Test12345");
		driver.hideKeyboard();
		waitUntilVisible(page.getSignupScreen().getTxtBoxConfirmPassword());
		touchAtCenterOfElement(page.getSignupScreen().getTxtBoxConfirmPassword());
		sendKeys("Test12345");
		driver.hideKeyboard();
		waitUntilVisible(page.getSignupScreen().getTxtBoxSecurityAnswer());
		touchAtCenterOfElement(page.getSignupScreen().getTxtBoxSecurityAnswer());
		sendKeys("Nook");
		sleep(sleepTime);
		driver.hideKeyboard();
		sleep(sleepTime);
		waitUntilVisible(page.getSignupScreen().getBtnSubmit());
		touchAtCenterOfElement(page.getSignupScreen().getBtnSubmit());
		waitUntilVisible(page.getSignupScreen().getBtnPopupAccept());
		touchAtCenterOfElement(page.getSignupScreen().getBtnPopupAccept());
		waitUntilVisible(page.getWhatsNewScreen().getBtnContinue());
		touchAtCenterOfElement(page.getWhatsNewScreen().getBtnContinue());
		waitUntilVisible(page.getNookTipsScreen().getBtnNotNow());
		touchAtCenterOfElement(page.getNookTipsScreen().getBtnNotNow());
		waitUntilVisible(page.getLibraryScreen().getTxtTipSortFilter());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtTipSortFilter());
		waitUntilVisible(page.getLibraryScreen().getTxtTipMoreOptions());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtTipMoreOptions());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtTabRecent());
		waitUntilVisible(page.getLibraryScreen().getBtnCloseNookTipsSnackContent());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnCloseNookTipsSnackContent());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtTabAllTitles());
		waitUntilVisible(page.getLibraryScreen().getTxtTipListViewGridView());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtTipListViewGridView());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnFilterMediaType());
		waitUntilVisible(page.getLibraryScreen().getTxtFilterByMagazines());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtFilterByMagazines());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtTabRecent());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtTabAllTitles());
		if (isElementDisplayed(page.getLibraryScreen().getTxtTipInTheCloud()) == true) {
			touchAtCenterOfElement(page.getLibraryScreen().getTxtTipInTheCloud());
		}
		waitUntilVisible(page.getLibraryScreen().getBtnAccountTabGlobalNavBar());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnAccountTabGlobalNavBar());
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"SIGN OUT\").instance(0))"));
		waitUntilVisible(page.getProfileScreen().getTxtAppSettings());
		touchAtCenterOfElement(page.getProfileScreen().getTxtAppSettings());
		waitUntilVisible(page.getSettingsScreen().getTxtAbout());
		touchAtCenterOfElement(page.getSettingsScreen().getTxtAbout());
		macOrWinEasterEgg();
		waitUntilVisible(page.getSettingsScreen().getTxtSelectPurchaseType());
		touchAtCenterOfElement(page.getSettingsScreen().getTxtSelectPurchaseType());
		waitUntilVisible(page.getSettingsScreen().getTxtPurchaseInApp());
		touchAtCenterOfElement(page.getSettingsScreen().getTxtPurchaseInApp());
		press(PRESS_TYPES.BACK);
		waitUntilVisible(page.getLibraryScreen().getTxtBottomBarBookstore());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtBottomBarBookstore());
		if (isElementDisplayed(page.getWhatsNewScreen().getBtnNotNow())) {
			touchAtCenterOfElement(page.getWhatsNewScreen().getBtnNotNow());
		}
		if (isElementDisplayed(page.getBookstoreScreen().getTxtTipWishListIcn())) {
			touchAtCenterOfElement(page.getBookstoreScreen().getTxtTipWishListIcn());
		}
		waitUntilVisible(page.getBookstoreScreen().getBtnSearch());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnSearch());
		sendKeys("Fortune And Glory");
		press(PRESS_ENTER);
		waitUntilVisible(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		waitUntilVisible(page.getBookstoreScreen().getTxtBooks());
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBooks());
		waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		//Book 1
		String priceInfoBelowCover1 = page.getBookstoreScreen().getTxtPriceInfoBelowCover1().getText();
		boolean priceInfoBook1 = priceInfoBelowCover1.contains("US$");
		//Book 2
		String priceInfoBelowCover2 = page.getBookstoreScreen().getTxtPriceInfoBelowCover2().getText();
		boolean priceInfoBook2 = priceInfoBelowCover2.contains("US$");
		//Book 3
		String priceInfoBelowCover3 = page.getBookstoreScreen().getTxtPriceInfoBelowCover3().getText();
		boolean priceInfoBook3 = priceInfoBelowCover3.contains("US$");
		
		if (priceInfoBook1) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		} else if (priceInfoBook2) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
		} else if (priceInfoBook3) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion3Bookstore());
		} else {
			System.out.println("Please Find Priced Book");
		}
		
		String buy_CTA_Button_Priced_PDP = page.getPdpScreen().getBtnBuyInPricedBook().getText();
		boolean buyButton = buy_CTA_Button_Priced_PDP.contains("BUY");
		boolean defaultRewardsPDP = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (buyButton && defaultRewardsPDP) {
			System.out.println("Test Passed Case ID 01: Rewards Announcement Section in the PDP (Priced eBook) - New Account");
		} else {
			System.out.println("Buy button in Priced Book is not Displayed");
			System.out.println("Test Failed Case ID 01: Rewards Announcement Section in the PDP (Priced eBook)- New Account");
		}
		
		// Case ID 02: Details in Rewards shop PDP - New Account
		tapOnLinkTextRewardsDetails_TermsAndCondition(page.getPdpScreen().getTxtDefaultRewardsPDP());
		waitUntilVisible(page.getPdpScreen().getBtnGotItInRewards());
		boolean defaultRewardsTitle = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsDetailTitle());
		boolean defaultRewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsBanner());
		boolean rewardsDetailElement = isElementDisplayed(page.getPdpScreen().getTxtRewardsDetails());
		boolean defaultRewardsTermsAndCondition = isElementDisplayed(page.getPdpScreen().getTxtRewardsFooter());
		boolean defaultRewardsGotItButton = isElementDisplayed(page.getPdpScreen().getBtnGotItInRewards());
		if(defaultRewardsTitle && defaultRewardsBanner && rewardsDetailElement && defaultRewardsTermsAndCondition && defaultRewardsGotItButton) {
			System.out.println("Test Passed Case ID 02: Details in Rewards shop PDP - New Account");
		} else {
			System.out.println("Test Failed Case ID 02: Details in Rewards shop PDP - New Account");
		}
		
		// Case ID 03: Terms and conditions in shop PDP - New Account
		tapOnLinkTextRewardsDetails_TermsAndCondition(page.getPdpScreen().getTxtRewardsFooter());
		waitUntilVisible(page.getSettingsScreen().getTxtTiltleRewardsMembershipTerms());
		boolean RewardsLegalTermsPage = isElementDisplayed(page.getSettingsScreen().getTxtTiltleRewardsMembershipTerms());
		if (RewardsLegalTermsPage == true) {
			System.out.println("Test Passed Case ID 03: Terms and conditions in shop PDP - New Account");
			waitUntilVisible(page.getSettingsScreen().getBtnClose());
			touchAtCenterOfElement(page.getSettingsScreen().getBtnClose());
		} else {
			System.out.println("Test Failed Case ID 03: Terms and conditions in shop PDP - New Account");
		}

		// Case ID 04: Rewards Details modal - Close in shop PDP - New Account
		waitUntilVisible(page.getPdpScreen().getBtnGotItInRewards());
		touchAtCenterOfElement(page.getPdpScreen().getBtnGotItInRewards());
		sleep(1000);
		waitUntilVisible(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP()) == true) {
			System.out.println("Test Passed Case ID 04: Rewards Details modal - Close in shop PDP - New Account");
		} else {
			System.out.println("Test Failed Case ID 04: Rewards Details modal - Close in shop PDP - New Account");
		}
		
		//Case ID 05: Purchase Confirmation modal in ebook shop PDP - New Account
		
		String buy_CTA_Button_Priced_PDP1 = page.getPdpScreen().getBtnBuyInPricedBook().getText();
		boolean buyButton1 = buy_CTA_Button_Priced_PDP1.contains("BUY");
		if (buyButton1 == true) {
			touchAtCenterOfElement(page.getPdpScreen().getBtnBuyInPricedBook());
			boolean confirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseTitle());
			boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
			boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
			boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
			boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
			boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
			boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
			boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
			if (confirmPurchaseTitle == true && confirmPurchaseMessage == true && coverImage == true
					&& bookDetailLayout == true && legalTermsView == true && confirmButton == true
					&& cancelButton == true && rewardsBanner == true) {
				System.out.println(
						"Test Passed Case ID 05: Purchase Confirmation modal in ebook shop PDP - New Account");
				touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
			} else {
				System.out.println(
						"Test Failed Case ID 05: Purchase Confirmation modal in ebook shop PDP - New Account");
			}
		} else {
			System.out.println("Buy Button is not Displayed");
		}
		
		//Case ID 06: Rewards section in shop Audiobook PDP - New Account
		if(isElementDisplayed(page.getPdpScreen().getBtnAudiobookSegmentControlPDP())) {
			touchAtCenterOfElement(page.getPdpScreen().getBtnAudiobookSegmentControlPDP());
		} else {
			touchAtCenterOfElement(page.getPdpScreen().getBtnNavUp());
			waitUntilVisible(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
			touchAtCenterOfElement(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
			waitUntilVisible(page.getBookstoreScreen().getTxtAudiobooks());
			touchAtCenterOfElement(page.getBookstoreScreen().getTxtAudiobooks());
			waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
			String priceInfoBelowCover11 = page.getBookstoreScreen().getTxtPriceInfoBelowCover1().getText();
			boolean priceInfoBook11 = priceInfoBelowCover11.contains("US$");
			//Book 2
			String priceInfoBelowCover21 = page.getBookstoreScreen().getTxtPriceInfoBelowCover2().getText();
			boolean priceInfoBook21 = priceInfoBelowCover21.contains("US$");
			//Book 3
			String priceInfoBelowCover31 = page.getBookstoreScreen().getTxtPriceInfoBelowCover3().getText();
			boolean priceInfoBook31 = priceInfoBelowCover31.contains("US$");
			if (priceInfoBook11) {
				touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
			} else if (priceInfoBook21) {
				touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
			} else if (priceInfoBook31) {
				touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
			} else {
				System.out.println("Please Find Priced AudioBook");
			}	
		}
		waitUntilVisible(page.getPdpScreen().getTxtDefaultRewardsPDP());
		String buy_CTA_Button_Priced_PDP11 = page.getPdpScreen().getBtnBuyInPricedBook().getText();
		boolean buyButton11 = buy_CTA_Button_Priced_PDP11.contains("BUY");
		boolean defaultRewardsPDP1 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (buyButton11 && defaultRewardsPDP1) {
			System.out.println("Test Passed Case ID 06: Rewards section in shop Audiobook PDP - New Account");
		} else {
			System.out.println("Test Failed Case ID 06: Rewards section in shop Audiobook PDP - New Account");
		}
		
		//Case ID 07: Purchase Confirmation modal in Audiobook shop PDP - New Account
		String buy_CTA_Button_Priced_PDP111 = page.getPdpScreen().getBtnBuyInPricedBook().getText();
		boolean buyButton111 = buy_CTA_Button_Priced_PDP111.contains("BUY");
		if (buyButton111 == true) {
			touchAtCenterOfElement(page.getPdpScreen().getBtnBuyInPricedBook());
			boolean confirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseTitle());
			boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
			boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
			boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
			boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
			boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
			boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
			boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
			if (confirmPurchaseTitle == true && confirmPurchaseMessage == true && coverImage == true
					&& bookDetailLayout == true && legalTermsView == true && confirmButton == true
					&& cancelButton == true && rewardsBanner == true) {
				System.out.println(
						"Test Passed Case ID 07: Purchase Confirmation modal in Audiobook shop PDP - New Account");
				touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
			} else {
				System.out.println(
						"Test Failed Case ID 07: Purchase Confirmation modal in Audiobook shop PDP - New Account");
			}
		} else {
			System.out.println("Buy Button is not Displayed");
		}
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBottomBarEbooksTab());
		if (isElementDisplayed(page.getWhatsNewScreen().getBtnNotNow())) {
			touchAtCenterOfElement(page.getWhatsNewScreen().getBtnNotNow());
		}

		//Case ID 08: Rewards section in shop Magazine PDP - New Account
		waitUntilVisible(page.getBookstoreScreen().getBtnSearch());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnSearch());
		sendKeys("Magazines");
		press(PRESS_ENTER);
		sleep(3000);
		waitUntilVisible(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnFilterMediaTypeSearchResult());
		waitUntilVisible(page.getBookstoreScreen().getTxtMagazines());
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtMagazines());
		waitUntilVisible(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		String priceInfoBelowCover11 = page.getBookstoreScreen().getTxtPriceInfoBelowCover1().getText();
		boolean priceInfoBook11 = priceInfoBelowCover11.contains("US$");
		//Book 2
		String priceInfoBelowCover21 = page.getBookstoreScreen().getTxtPriceInfoBelowCover2().getText();
		boolean priceInfoBook21 = priceInfoBelowCover21.contains("US$");
		//Book 3
		String priceInfoBelowCover31 = page.getBookstoreScreen().getTxtPriceInfoBelowCover3().getText();
		boolean priceInfoBook31 = priceInfoBelowCover31.contains("US$");
		
		if (priceInfoBook11) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion1Bookstore());
		} else if (priceInfoBook21) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
		} else if (priceInfoBook31) {
			touchAtCenterOfElement(page.getBookstoreScreen().getImgSearchRespostion2Bookstore());
		} else {
			System.out.println("Please Find Priced Magazine");
		}
		
		String buyIssueButtoninDRP = page.getPdpScreen().getBtnBuyButtonCurrentIssue().getText();
		boolean buyIssueButton = buyIssueButtoninDRP.contains("BUY");
		boolean defaultRewardsPDP11 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (buyIssueButton && defaultRewardsPDP11) {
			System.out.println("Test Passed Case ID 08: Rewards section in shop Magazine PDP - New Account");
		} else {
			System.out.println("Buy Issue button is not displayed");
			System.out.println("Test Failed Case ID 08: Rewards section in shop Magazine PDP - New Account");
		}

		// Case ID 09: Purchase Confirmation modal in Magazine shop PDP - New Account
		String buyIssueButtoninDRP1 = page.getPdpScreen().getBtnBuyButtonCurrentIssue().getText();
		boolean buyIssueButton1 = buyIssueButtoninDRP1.contains("BUY");
		if (buyIssueButton1 == true) {
			touchAtCenterOfElement(page.getPdpScreen().getBtnBuyButtonCurrentIssue());
			boolean confirmPurchaseTitle = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseTitle());
			boolean confirmPurchaseMessage = isElementDisplayed(page.getPdpScreen().getTxtConfirmPurchaseMsg());
			boolean coverImage = isElementDisplayed(page.getPdpScreen().getImgCoverImage());
			boolean bookDetailLayout = isElementDisplayed(page.getPdpScreen().getTxtBookDetails());
			boolean legalTermsView = isElementDisplayed(page.getPdpScreen().getTxtLegalTerms());
			boolean confirmButton = isElementDisplayed(page.getPdpScreen().getBtnConfirm());
			boolean cancelButton = isElementDisplayed(page.getPdpScreen().getBtnCancel());
			boolean rewardsBanner = isElementDisplayed(page.getPdpScreen().getTxtRewardsBanner());
			if (confirmPurchaseTitle == true && confirmPurchaseMessage == true && coverImage == true
					&& bookDetailLayout == true && legalTermsView == true && confirmButton == true
					&& cancelButton == true && rewardsBanner == true) {
				System.out.println("Test Passed Case ID 09: Purchase Confirmation modal in Magazine shop PDP - New Account");
				touchAtCenterOfElement(page.getPdpScreen().getBtnCancel());
			} else {
				System.out.println("Test Failed Case ID 09: Purchase Confirmation modal in Magazine shop PDP - New Account");
			}
		} else {
			System.out.println("Buy Issue button is not displayed");
		}
		touchAtCenterOfElement(page.getBookstoreScreen().getTxtBottomBarEbooksTab());
		
		//Case ID 011: No Rewards section in Library eBook PDP - New Account
		waitUntilVisible(page.getLibraryScreen().getTxtBottomBarLibrary());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtBottomBarLibrary());
		if (isElementDisplayed(page.getLibraryScreen().getBtnSkipTour()) == true) {
			touchAtCenterOfElement(page.getLibraryScreen().getBtnSkipTour());
		}
		waitUntilVisible(page.getLibraryScreen().getBtnFilterMediaType());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnFilterMediaType());
		waitUntilVisible(page.getLibraryScreen().getTxtFilterByBooks());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtFilterByBooks());
		waitUntilVisible(page.getLibraryScreen().getImgEbookProduct1());
		touchAtCenterOfElement(page.getLibraryScreen().getImgEbookProduct1());
		waitUntilVisible(page.getLibraryScreen().getBtnViewDetails());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnViewDetails());
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		boolean RewardsCheckInLibraryPDP = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (!RewardsCheckInLibraryPDP) {
			System.out.println("Test Passed Case ID 011: No Rewards section in Library eBook PDP - New Account");
		} else {
			System.out.println("Test Failed Case ID 011: No Rewards section in Library eBook PDP - New Account");
		}
		
		touchAtCenterOfElement(page.getBookstoreScreen().getBtnNavigateBack());
		
		//Case ID 011: No Rewards section in Library Magazine PDP - New Account
		waitUntilVisible(page.getLibraryScreen().getBtnFilterMediaType());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnFilterMediaType());
		waitUntilVisible(page.getLibraryScreen().getTxtFilterByMagazines());
		touchAtCenterOfElement(page.getLibraryScreen().getTxtFilterByMagazines());
		waitUntilVisible(page.getLibraryScreen().getImgEbookProduct1());
		touchAtCenterOfElement(page.getLibraryScreen().getImgEbookProduct1());
		waitUntilVisible(page.getLibraryScreen().getBtnViewDetails());
		touchAtCenterOfElement(page.getLibraryScreen().getBtnViewDetails());
		waitUntilVisible(page.getLibraryScreen().getTxtToCheckDisplayPDP());
		boolean RewardsCheckInLibraryPDP1 = isElementDisplayed(page.getPdpScreen().getTxtDefaultRewardsPDP());
		if (!RewardsCheckInLibraryPDP1) {
			System.out.println("Test Passed Case ID 011: No Rewards section in Library Magazine PDP - New Account");
		} else {
			System.out.println("Test Failed Case ID 011: No Rewards section in Library Magazine PDP - New Account");
		}

		System.out.println("-------------Rewards in New Account Test Finished------------");

		driver.resetApp();

	} catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
		System.out.println("-------------Rewards in New Account Test Crashed------------");
//		driver.resetApp();
	}
}
	
	
	

}
	
