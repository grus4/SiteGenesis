package pages;

import utils.ScreenShotMaker;
import utils.WebDriverWrapper;
import utils.WebElementsActions;

/**
 * Created by Rus on 23.11.2016.
 */
public class SiteGenesis {
    public WebElementsActions web;
    public ScreenShotMaker screenShotMaker;
    public HomePage homePage;
    public Header header;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;
    public CreateAccountPage createAccountPage;

    public SiteGenesis(WebDriverWrapper webDriverWrapper) {
        web = new WebElementsActions(webDriverWrapper);
        screenShotMaker = new ScreenShotMaker(webDriverWrapper);
        homePage = new HomePage(webDriverWrapper);
        header = new Header(webDriverWrapper);
        loginPage = new LoginPage(webDriverWrapper);
        myAccountPage = new MyAccountPage(webDriverWrapper);
        createAccountPage = new CreateAccountPage(webDriverWrapper);
    }


}
