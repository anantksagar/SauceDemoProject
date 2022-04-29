package listeners;
import org.openqa.selenium.WebDriver;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Screenshot;

public class Listeners implements ITestListener {
	WebDriver w;
//	TakesScreenshot t = (TakesScreenshot)w;
	public void onTestStart(ITestResult result) {
		System.out.println("Heyyy... Test Case Started ");
	}

	public void onTestSuccess(ITestResult result) {
		
//		this.w=w;
//		String path ="B:\\Velocitytraining\\Setup\\Screenshot\\screenshot1.png";
//		File src = t.getScreenshotAs(OutputType.FILE);
//		File f = new File(path);
//		try {
//			FileHandler.copy(src, f);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		Screenshot s1 = new Screenshot();
		s1.screen();
		System.out.println("Hureyyy... Test case is Successed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Ohhh Shit !!! Test case is Fail Zali Na");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Arrr.. Test case is Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onStart(ITestContext context) {
		System.out.println("Testing Of User Story Start");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Testing Of User Story Finishied");
	}
	
}
