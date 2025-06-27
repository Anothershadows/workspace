package utiles;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Automation_report {

	public static ExtentReports extend;
	public static ExtentTest createTest;
	//public String desc=""; public String author=""; public String catagory="";
	

	@BeforeSuite
	public static void startreport() {
		ExtentSparkReporter report = new ExtentSparkReporter("./1TestReport.html");
		extend = new ExtentReports();
		extend.attachReporter(report);
	}


	 public static void create(String desc, String author, String category) {
	        createTest = extend.createTest(desc);
	        createTest.assignAuthor(author);
	        createTest.assignCategory(category);
	    }


	public static void stepReport(String status, String description) {
		switch (status) {
		case "Pass":
			createTest.pass(description);
			break;
		case "fail":
			createTest.fail(description);
			break;
		case "info":
			createTest.info(description);
			break;
		case "warning":
			createTest.warning(description);
			break;
		default:
			System.out.println("Status is not define ");
			break;
		}

	}
}
