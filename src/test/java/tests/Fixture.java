package tests;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.SiteGenesis;
import utils.ClassNameUtil;
import utils.PropertyLoader;
import utils.UIMappingSingleton;
import utils.WebDriverWrapper;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class Fixture {

    static WebDriverWrapper webDriverWrapper;
    public static SiteGenesis siteGenesis;

    public static final Logger log = Logger.getLogger(ClassNameUtil.getCurrentClassName());

    //Looks not soo good
    private static final String IMPLICIT_WAIT = PropertyLoader.loadProperty("wait.timeout");
    protected static final String EMAIL = PropertyLoader.loadProperty("user.email");
    protected static final String PASSWORD = PropertyLoader.loadProperty("user.pass");
    protected static final String INVALID_EMAIL_MISSING_AT = PropertyLoader.loadProperty("invalid.email.missing.at");
    protected static final String INVALID_EMAIL_MISSING_ADDRESS = PropertyLoader.loadProperty("invalid.email.missing.address");
    protected static final String INVALID_EMAIL_SUPERFLUOUS_TEXT = PropertyLoader.loadProperty("invalid.email.superfluous.text");
    protected static final String INVALID_EMAIL_COPY_PASTE_FROM_ADDRESS_BOOK_WITH_NAME = PropertyLoader.loadProperty("invalid.email.copy.paste.from.address.book");
    protected static final String INVALID_EMAIL_SPECIAL_CHARACTERS = PropertyLoader.loadProperty("invalid.email.special.characters");
    protected static final String INVALID_EMAIL_COPY_WITH_TWO_AT = PropertyLoader.loadProperty("invalid.email.two.at");
    protected static final String INVALID_PASSWORD = PropertyLoader.loadProperty("invalid.password");
    protected static final String INVALID_PASSWORD_LENGTH = PropertyLoader.loadProperty("invalid.password.length");
    protected static final String PAYPAL_EMAIL = PropertyLoader.loadProperty("user.paypal.email");
    protected static final String PAYPAL_PASSWORD = PropertyLoader.loadProperty("user.paypal.password");
    protected static final String EMAILFORREGISTEREDUSER = PropertyLoader.loadProperty("registered.user.email");
    protected static final String PASSWORDFORREGISTEREDUSER = PropertyLoader.loadProperty("password.registered.user");
    protected static final String COUNTRY = PropertyLoader.loadProperty("country");
    protected static final String INT_COUNTRY = PropertyLoader.loadProperty("country.international");
    protected static final String SITE_URL = PropertyLoader.loadProperty("site.url");
    protected static final String FIRSTNAME = PropertyLoader.loadProperty("first.name");
    protected static final String LASTNAME = PropertyLoader.loadProperty("last.name");
    protected static final String ADDRESS_1 = PropertyLoader.loadProperty("address_1");
    protected static final String CITY = PropertyLoader.loadProperty("city");
    protected static final String STATE = PropertyLoader.loadProperty("state");
    protected static final String ZIP = PropertyLoader.loadProperty("zip");
    protected static final String PHONE = PropertyLoader.loadProperty("phone");
    protected static final String ADDRESS_INT = PropertyLoader.loadProperty("address.international");
    protected static final String CITY_INT = PropertyLoader.loadProperty("city.international");
    protected static final String STATE_INT = PropertyLoader.loadProperty("state.international");
    protected static final String ZIP_INT = PropertyLoader.loadProperty("zip.international");
    protected static final String CARDNAME_VISA = PropertyLoader.loadProperty("card.name1");
    protected static final String CARDNUMBER_VISA = PropertyLoader.loadProperty("card.number1");
    protected static final String CARDNAME_MASTERCARD = PropertyLoader.loadProperty("card.name2");
    protected static final String CARDNUMBER_MASTERCARD = PropertyLoader.loadProperty("card.number2");
    protected static final String MONTH = PropertyLoader.loadProperty("month");
    protected static final String YEAR = PropertyLoader.loadProperty("year");
    protected static final String VISA_CVV = PropertyLoader.loadProperty("cvv1");
    protected static final String MASTERCARD_CVV = PropertyLoader.loadProperty("cvv2");
    protected static final String CARDNAME_AMEX = PropertyLoader.loadProperty("card.name3");
    protected static final String CARDNUMBER_AMEX = PropertyLoader.loadProperty("card.number3");
    protected static final String AMEX_CVV = PropertyLoader.loadProperty("cvv3");
    protected static final String CARDNAME_DISCOVER = PropertyLoader.loadProperty("card.name4");
    protected static final String CARDNUMBER_DISCOVER = PropertyLoader.loadProperty("card.number4");
    protected static final String DISCOVER_CVV = PropertyLoader.loadProperty("cvv4");
    protected static final String CARD_TYPE_2 = PropertyLoader.loadProperty("card.type.master.card");
    protected static final String CARD_TYPE_3 = PropertyLoader.loadProperty("card.type.amex");
    protected static final String CARD_TYPE_4 = PropertyLoader.loadProperty("card.type.discover");

    //need to switch to one class like ExtentReportsManager
    public static ExtentReports extentReports;
    public static ExtentTest extentTest;

    //pay attention about file path!
    final static String filePath = "E:\\Old projects\\Rusia\\SiteGenesis\\target\\MyReport\\MyReport.html";

    public synchronized static ExtentReports getReporter(String filePath) {
        if (extentReports == null) {
            extentReports = new ExtentReports(filePath, false);
            extentReports.loadConfig(new File("E:\\Old projects\\Rusia\\SiteGenesis\\extent-config.xml"));
            extentReports
                    .addSystemInfo("Host Name", "Anshoo")
                    .addSystemInfo("Environment", "QA");
        }

        return extentReports;
    }

    @BeforeSuite
    public static void setUp() {
        extentReports = getReporter(filePath);

        System.setProperty("webdriver.chrome.driver", "C:\\Tool\\chromedriver.exe");
        webDriverWrapper = new WebDriverWrapper(new ChromeDriver());
        //webDriverWrapper = new WebDriverWrapper(new ChromeDriver());
        //webDriverWrapper = WebDriverFactory.initDriver();
        //webDriverWrapper = WebDriverFactory.getInstance();
        //siteGenesis = new SiteGenesis(webDriverWrapper);

        UIMappingSingleton.getInstance();
        webDriverWrapper.manage().timeouts().implicitlyWait(Long.parseLong(IMPLICIT_WAIT), TimeUnit.SECONDS);
        webDriverWrapper.manage().window().maximize();
        log.info("Start Test Suite execution");
    }

    @AfterSuite
    public static void tearDown() {
        webDriverWrapper.quit();
        log.info("Tests Suite execution completed.");

        extentReports.close();
    }
}
