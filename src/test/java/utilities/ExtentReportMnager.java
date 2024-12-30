package utilities;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.testng.ITestContext;
import org.testng.ITestListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportMnager implements ITestListener{
	
	public ExtentSparkReporter sparkreporter;
	public ExtentReports reports;
	public ExtentTest test;
	
	String repName;
	
	public void onStart(ITestContext itextcontent)
	{
		String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date(0));
	}
	

}
