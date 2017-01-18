package pages;

import utils.WebDriverWrapper;

/**
 * Created by Rus on 18.01.2017.
 */
public class OrderReceiptPage extends Page{
    public OrderReceiptPage(WebDriverWrapper dr) {
        super(dr);
    }

    public boolean isThankYouMessageAvailable() {
        if(web.isElementPresent("ThankYouMessage")) {
            log.info("Order is successfully created - " + web.getElementText("OrderNumber"));
            return true;
        } else {
            log.info("Order has not been created");
            return false;
        }
    }
}

