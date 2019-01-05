package testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.TestUtil;

public class AddCustomerTest extends TestBase {

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void addCustomerTest(Hashtable<String, String> data) throws InterruptedException {

		if (!(data.get("runMode").equals("Y"))) {

			throw new SkipException("Skipping the test case as the run mode is NO");
		}

		click("addCustBtn_XPATH");
		type("firstName_CSS", data.get("firstName"));
		type("lastName_CSS", data.get("lastName"));
		type("postCode_CSS", data.get("postCode"));
		click("addBtn_CSS");

		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		Assert.assertTrue(alert.getText().contains(data.get("alertText")));
		Thread.sleep(3000);
		alert.accept();

		// Assert.fail("Customer not added successfully");
	}

}
