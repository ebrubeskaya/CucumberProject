package StepDefinitions;

import Pages.AmazonPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AmazonSteps {
    WebDriver driver = DriverFactory.getDriver();
    AmazonPages amazonPages = new AmazonPages(driver);

    @Given("User is on homepage")
    public void userIsOnHomepage() {
       AmazonPages.homePage();

    }

    @When("Click accept cookies")
    public void clickAcceptCookies() {
        AmazonPages.clkAcceptCookies();

    }

    @When("Click the search button")
    public void clickTheSearchButton() {
        AmazonPages.clkTheSearchButton();

    }

    @When("Write product name")
    public void writeProductName() {
        AmazonPages.wrtProductName();

    }

    @When("Click search button")
    public void clickSearchButton() {
        AmazonPages.clkSearchButton();

    }

    @When("Filter for Shipped by Amazon")
    public void filterForShippedByAmazon() {
        AmazonPages.filterAmazon();

    }

    @When("Filter for Notebook")
    public void filterForNotebook() {
        AmazonPages.filterNotebook();

    }

    @When("Click the first product")
    public void clickTheFirstProduct() {
        AmazonPages.clkFirstProduct();

    }

    @When("Add to Cart")
    public void addToCart() {
        AmazonPages.addCart();

    }

    @When("Check at cart page")
    public void checkAtCartPage() {
        AmazonPages.chkCartPage();
    }
}
