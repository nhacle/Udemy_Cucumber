package testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.SkipException;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.TestUtil;

public class OpenAccountTest extends TestBase {

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void openAccountTest(Hashtable<String, String> data) throws InterruptedException {

		if (!(TestUtil.isTestRunnable("openAccountTest", excel))) {

			throw new SkipException("Skpping the test" + "openAccountTest".toUpperCase() + "as the run mode is No");
		}

		click("openAccountBtn_XPATH");
		select("customerDrop_XPATH", data.get("customer"));
		select("currencyDrop_XPATH", data.get("currency"));
		click("processBtn_XPATH");

		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		alert.accept();
	}

}
