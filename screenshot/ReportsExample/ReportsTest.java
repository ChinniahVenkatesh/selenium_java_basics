package ReportsExample;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportsTest {

	
	public ExtentReports reports = new ExtentReports();
	public ExtentSparkReporter reporter;
	public ExtentTest tes;

	public ExtentReports startReport()
	{
		
		String path = System.getProperty("user.dir")+"//index1.html";
		reporter = new ExtentSparkReporter(path);
		reports.attachReporter(reporter);
		
		return reports;
	}
	
	public ExtentTest createTestR(ExtentReports reports,String name)
	{
		tes = reports.createTest(name);
		return tes;
	}
	
	
	public void StopReport(ExtentReports reports)
	{
		reports.flush();
	}
	
	
	
}
