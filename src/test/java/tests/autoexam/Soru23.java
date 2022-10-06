package tests.autoexam;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercise;
import utilities.ConfigReader;
import utilities.Driver;
public class Soru23 {
    @Test
    public void test01() throws InterruptedException {
        // 2. 'http://automationexercise.com' url'sine gidin
        Driver.getDriver().get(ConfigReader.getProperty("autoE"));
        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        AutomationExercise autoE=new AutomationExercise();
        String expectedUrl="https://automationexercise.com/";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),expectedUrl);
        // 4. 'Kayıt Ol / Giriş Yap' düğmesini tıklayın
        autoE.sign.click();
        // 5. Kaydolma bölümündeki tüm ayrıntıları doldurun ve hesap oluşturun
        Faker faker=new Faker();
        autoE.newName.sendKeys(faker.name().firstName());
        autoE.newEmail.sendKeys(faker.internet().emailAddress());
        autoE.signNewUser.click();
        // 6. 'HESAP OLUŞTURULDU!' seçeneğini doğrulayın. ve 'Devam' düğmesini tıklayın
        autoE.title.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB).sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB).sendKeys("10").sendKeys(Keys.TAB).sendKeys("May").sendKeys(Keys.TAB).sendKeys("1985")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys("team13")
                .sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress()).sendKeys(Keys.TAB).sendKeys(faker.address().cityName())
                .sendKeys(Keys.TAB).sendKeys("Canada").sendKeys(Keys.TAB).sendKeys(faker.address().state()).sendKeys(Keys.TAB)
                .sendKeys(faker.address().city()).sendKeys(Keys.TAB).sendKeys(faker.address().zipCode()).sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
        autoE.contine.click();
        // 7. En üstte 'Kullanıcı adı olarak oturum açıldı' seçeneğini doğrulayın
        Assert.assertTrue(autoE.userDogrulama.isDisplayed());
        Thread.sleep(1000);
        // 8. Sepete ürün ekleyin
        actions.moveToElement(autoE.iframe).click().perform();
        Thread.sleep(2000);
        actions.moveToElement(autoE.firstProduct).click().perform();
        // 9. 'Sepet' düğmesini tıklayın
        autoE.viewCart.click();
        // 10. Sepet sayfasının görüntülendiğini doğrulayın
        Assert.assertTrue(autoE.sepetGorunumu.isDisplayed());
        // 11. Ödemeye Devam Et'e tıklayın
        autoE.sepetGorunumu.click();
        Thread.sleep(1000);
        // 12. Teslimat adresinin, hesap kaydı sırasında girilen adresle aynı olduğunu doğrulayın.
        // 13. Fatura adresinin, hesap kaydı sırasında girilen adresle aynı olduğunu doğrulayın.
        Assert.assertEquals(autoE.teslimatAdresi.getText(),autoE.faturaAdresi.getText());
        // 14. 'Hesabı Sil' düğmesini tıklayın
        autoE.deleteSimgesi.click();
        // 15. 'HESAP SİLİNDİ!' seçeneğini doğrulayın. ve 'Devam' düğmesini tıklayın
        Assert.assertTrue(autoE.hesapSilindi.isDisplayed());
        Driver.closeDriver();
    }
}