import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentTestReports {
	
	public static ExtentReports extentReport;
	public static ExtentSparkReporter reporter;
	public static ExtentTest extentTest;
	
	
	public static ExtentTest test()
	{
		extentReport = new ExtentReports();
		String path = System.getProperty("user.dir")+"//src//index.html";
		reporter = new ExtentSparkReporter(path);
		extentReport.attachReporter(reporter);
		extentTest = extentReport.createTest("Test-01");
		return extentTest;
	}
	
	public static void flush()
	{
		extentReport.flush();
	}
	
	
	

}
