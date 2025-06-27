package utiles;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import base.reusable;

public class Automation_report extends reusable{
    public static ExtentReports extent;
    public static ExtentTest createTest;

    public static void startReport() {
        ExtentSparkReporter spark = new ExtentSparkReporter("test-output/spark/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
       
    }

    public static void endReport() {
        extent.flush();
    }

    public static void create(String desc, String author, String category) {
		createTest = extent.createTest(desc).assignAuthor(author).assignCategory(category);
	}


    public static void stepReport(String status, String description) throws IOException {
        switch (status.toLowerCase()) {
            case "pass":
                createTest.pass(description);
                break;
            case "fail":
                createTest.fail(description);
                String screenshotPath = captureScreenshot(driver);

                if (screenshotPath != null) {
                    // Convert absolute path to relative path from report
                    File reportDir = new File("test-output/spark/ExtentReport.html").getParentFile();
                    File screenshotFile = new File(screenshotPath);
                    String relativePath = reportDir.toURI().relativize(screenshotFile.toURI()).getPath();

                    // Attach to ExtentReport with relative path
                    createTest.addScreenCaptureFromPath(relativePath);
                }
                break;
            case "info":
                createTest.info(description);
                break;
            case "warning":
                createTest.warning(description);
                break;
            default:
                System.out.println("Status not defined.");
        }}
    public static String captureScreenshot(WebDriver driver) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        String path = "test-output/screenshots/" + System.currentTimeMillis() + ".png";
        File dest = new File(path);
        dest.getParentFile().mkdirs(); // Ensure folder exists

        try {
            Files.copy(src.toPath(), dest.toPath());
            return path;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    }
    