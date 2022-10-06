package tests.autoexam;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercise;
import utilities.ConfigReader;
import utilities.Driver;

public class Soru21 {
    @Test
    public void test01() throws InterruptedException {

        // 2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("autoE"));
        AutomationExercise autoE = new AutomationExercise();
        // 3. Click on 'Products' button
        autoE.product.click();
        // 4. Verify user is navigated to ALL PRODUCTS page successfully
        Assert.assertTrue(autoE.allProduct.isDisplayed());
        // 5. Click on 'View Product' button
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(autoE.iframe).click().perform();
        Thread.sleep(2000);
        autoE.firstviewProduct.click();
        // 6. Verify 'Write Your Review' is visible
        Assert.assertTrue(autoE.writeYourReview.isDisplayed());
        // 7. Enter name, email and review
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        autoE.productYourName.sendKeys("Kemal");
        autoE.productEmail.sendKeys("kskdksdldss12@gmail.com");
        autoE.addReview.sendKeys("asklfalkf aslfjnalfk asfnknalfk");
        // 8. Click 'Submit' button
        autoE.Submit.click();
        // 9. Verify success message 'Thank you for your review.'
        Assert.assertTrue(autoE.thankYou.isDisplayed());
    }
}
