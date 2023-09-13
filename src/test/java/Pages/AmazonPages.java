package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept = By.id("sp-cc-accept");
    static By search = By.id("twotabsearchtextbox");
    static By searchButton = By.id("nav-search-submit-button");
    static By amazonFilter = By.xpath("//li[@id='p_98/21345978031']//i[@class='a-icon a-icon-checkbox']");
    static By notebookFilter = By.xpath("//li[@id='p_89/ASUS']//i[@class='a-icon a-icon-checkbox']");
    static By firstProduct =By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_4'] div[class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style'] span:nth-child(1)");
    static By add = By.id("add-to-cart-button");
    static By cart = By.cssSelector(".a-button-text[href='/cart?ref_=sw_gtc']");
    static By check=By.cssSelector(".a-truncate-cut");

    public AmazonPages(WebDriver driver){
        AmazonPages.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        elementHelper = new ElementHelper(driver);
    }

    public static void homePage() {
    }

    public static void clkAcceptCookies() {
        elementHelper.click(accept);
    }

    public static void clkTheSearchButton() {
        elementHelper.click(search);
    }

    public static void wrtProductName() {
        elementHelper.sendKey(search,"notebook");
    }

    public static void clkSearchButton() {
        elementHelper.click(searchButton);
    }

    public static void filterAmazon() {
        elementHelper.click(amazonFilter);
    }

    public static void filterNotebook() {
        elementHelper.click(notebookFilter);
    }

    public static void clkFirstProduct() {
        elementHelper.click(firstProduct);
    }

    public static void addCart() {
        elementHelper.click(add);
        elementHelper.click(cart);
    }

    public static void chkCartPage() {
        elementHelper.checkVisible(check);
    }
}
