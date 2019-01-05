package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.TestBase;

public class BankManagerLoginTest extends TestBase {

	@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException {

		verifyEquals("abc", "xyz");
		// Thread.sleep(3000);

		log.debug("Start test case");
		click("bmlBtn_CSS");
		// Thread.sleep(3000);
		// Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_XPATH"))),
		// "Login not successful");

		log.debug("TC executed !!!");

		// Assert.fail("Login not successful");

	}
}
