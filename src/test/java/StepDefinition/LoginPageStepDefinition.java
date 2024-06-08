package StepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class LoginPageStepDefinition {


    WebDriver chomedriver;
    WebDriver safaridriver;

    @Given("User opens Parabank website in chrome")
    public void user_opens_parabank_website() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        chomedriver = new ChromeDriver();
        //String url = " https://www.tutorialspoint.com/questions/index.php";
        chomedriver.get("https://parabank.parasoft.com/parabank/index.htm");

    }
    @When("User enters incorrect username and password in the text fields and click on Login button in chrome")
    public void user_enters_incorrect_username_and_password_in_the_text_fields_and_click_on_login_button() {
        WebElement uid= chomedriver.findElement(By.name("username"));
        uid.sendKeys("test1s");
        WebElement pwd= chomedriver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input" ));
        pwd.sendKeys("test");
        WebElement login= chomedriver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input"));
        login.click();
    }
    @Then("User should see the error message in chrome")
    public void user_should_see_the_error_message() {
        WebElement error = chomedriver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p"));
        System.out.println(error.getText());
    }


    @Given("User opens Parabank website in safari")
    public void user_opens_parabank_website_in_safari() {
        //System.setProperty("webdriver.safari.driver", "src/main/resources/chromedriver");
        safaridriver = new SafariDriver();
        //String url = " https://www.tutorialspoint.com/questions/index.php";
        safaridriver.get("https://parabank.parasoft.com/parabank/index.htm");

    }
    @When("User enters incorrect username and password in the text fields and click on Login button in safari")
    public void user_enters_incorrect_username_and_password_in_the_text_fields_and_click_on_login_button_in_safari() {

    }
    @Then("User should see the error message in safari")
    public void user_should_see_the_error_message_in_safari() {

    }

}
