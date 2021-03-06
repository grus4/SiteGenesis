package pages;

import org.apache.log4j.Logger;
import org.testng.Assert;
import utils.ClassNameUtil;
import utils.JsExecutorWrapper;
import utils.WebDriverWrapper;
import utils.WebElementsActions;

/**
 * Created by user on 6/17/2016.
 */
public abstract class Page {

    Logger log = Logger.getLogger(ClassNameUtil.getCurrentClassName());

    private String PAGE;
    public WebDriverWrapper webDriverWrapper;
    public WebElementsActions web;
    public JsExecutorWrapper js;


    public Page(WebDriverWrapper dr, String page) {
        webDriverWrapper = dr;
        PAGE = page;
        web = new WebElementsActions(dr);
        js = new JsExecutorWrapper(dr);
    }

    public Page(WebDriverWrapper dr) {
        webDriverWrapper = dr;
        web = new WebElementsActions(dr);
        js = new JsExecutorWrapper(dr);
    }


    /*
     * Open Page in a browser
     */
    public boolean openPage(){
        try{
            log.info("Start open page.");
            webDriverWrapper.get(PAGE);
            webDriverWrapper.getCurrentUrl();
        } catch (Exception e){
            log.error("Error in open page!\n");
            return false;
        }
        log.info("Page open successful.");
        return true;
    }

    public void openPage(String pageURL) {
        get(pageURL);
        sleep(6000);
        log.info("Start open page.");
        log.info("I'm on the " + getCurrentPageURL());

        if (pageURL.equals(getCurrentPageURL())) {
            log.info("Page open successful.");
        } else {
            log.error("Error in open page!\n");
            Assert.fail("pageURL - " + pageURL + "\n" +
                    "CurrentUrl - " + getCurrentPageURL());
        }
    }

    /*
     * Verification Page open correct. Check on pageLocator
     */
    public boolean isOpenPage(String checkLocator){
        if (web.isElementPresent(checkLocator)) {
            log.info("Page: Check is page open. " + checkLocator + " is present!");
            log.info(ClassNameUtil.getCurrentClassName() + ": Page is open.");
            return true;
        } else {
            log.error("Page: Error with check page!\n");
            Assert.fail("Incorrect swatch");
        }
        return false;
    }

    /*
     * Get page title for verification correct switch between pages
     */
    public String getTitle() {
        return webDriverWrapper.getTitle();
    }

    public String getCurrentPageURL() {
        return webDriverWrapper.getCurrentUrl();
    }

    public void deleteAllCookies() {
        webDriverWrapper.manage().deleteAllCookies();
    }

    public void get(String URL) {
        webDriverWrapper.get(URL);
    }

    public void sleep(long millis) {
        try {
            log.info("*Start TO* Wait " + millis + " milliseconds");
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}