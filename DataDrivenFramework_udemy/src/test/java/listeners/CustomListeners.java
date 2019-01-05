package listeners;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import base.TestBase;
import utilities.TestUtil;

public class CustomListeners extends TestBase implements ITestListener, ISuiteListener {

	public String messageBody;

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		try {
			TestUtil.captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.FAIL, arg0.getName().toUpperCase() + "Failed with exception: " + arg0.getThrowable());
		test.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screenshotName));

		Reporter.log("Click to see screenshot");
		Reporter.log("<a href=" + TestUtil.screenshotName + ">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<br>");
		Reporter.log("<a href=" + TestUtil.screenshotName + "><img src= " + TestUtil.screenshotName
		        + " height = 400 width = 600></img></a>");
		rep.endTest(test);
		rep.flush();

	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

		test.log(LogStatus.SKIP, arg0.getName().toUpperCase() + "Skipped the test as the run mode is NO");
		rep.endTest(test);
		rep.flush();
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		test = rep.startTest(arg0.getName().toUpperCase());
		System.out.println(TestUtil.isTestRunnable(arg0.getName(), excel));

	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub

		test.log(LogStatus.PASS, arg0.getName().toUpperCase() + "PASS");
		rep.endTest(test);
		rep.flush();
	}

	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub

		// MonitoringMail mail = new MonitoringMail();
		//
		// try {
		// messageBody = "http://" + InetAddress.getLocalHost().getHostAddress()
		// + ":6789/job/DataDriven_maven/Extent_20Reports/";
		// } catch (UnknownHostException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// try {
		// mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to,
		// TestConfig.subject, messageBody);
		// } catch (AddressException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (MessagingException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub

	}

}
