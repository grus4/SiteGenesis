package tests;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import java.io.File;


/**
 * Created by Rus on 23.01.2017.
 */
public class ExtentManager {
    public static ExtentReports extentReports;

    final static String filePath = "D:\\Selenium\\SiteGenesis\\target\\MyReport\\MyReport.html";

    public synchronized static ExtentReports getReporter(String filePath) {
        if (extentReports == null) {
            extentReports = new ExtentReports(filePath,true);
            extentReports.loadConfig(new File("D:\\Selenium\\SiteGenesis\\extent-config.xml"));
            extentReports
                    .addSystemInfo("Host Name", "GRus")
                    .addSystemInfo("Environment", "QA");

        }

        return extentReports;
    }

}
