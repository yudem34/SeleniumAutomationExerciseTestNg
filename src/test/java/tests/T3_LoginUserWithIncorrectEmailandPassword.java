package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class T3_LoginUserWithIncorrectEmailandPassword extends TestBaseRapor {
    AutomationExercise autoE;

    @Test
    public void LoginUserWithIncorrectEmailAndPassword() {
        // 1. Tarayıcıyı başlatın
        extentTest = extentReports.createTest("Negatif Test", "Yanlis kullanici adi ve sifre girildi");
        // 2. 'http://automationexercise.com' url'sine gidin'
        Driver.getDriver().get(ConfigReader.getProperty("autoE"));
        extentTest.info("Automation Exercise sitesine gidildi");
        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Automation Exercise"));
        extentTest.info("Ana sayfanın basariyla goruntulendigi dogrulandi");
        autoE = new AutomationExercise();
        // 4. 'Kayıt Ol / Giriş Yap' düğmesine tıklayın
        autoE.sign.click();
        extentTest.info("Kayit ol / Giris yap buttonuna basildi");
        // 5. 'Hesabınıza giriş yapın' ifadesinin görünür olduğunu doğrulayın
        Assert.assertTrue(autoE.loginAccountTex.isDisplayed());
        extentTest.info("Hesabiniza giris yapin ifadesinin gorundugu dogrulandi");
        // 6. Yanlış e-posta adresi ve şifre girin
        autoE.emailGiris.sendKeys(ConfigReader.getProperty("wrongEmail"));
        extentTest.info("Yanlis email adresi girildi");
        autoE.passwordGiris.sendKeys(ConfigReader.getProperty("wrongPassword"));
        extentTest.info("Yanlis parola girildi");
        // 7. 'Giriş' düğmesini tıklayın
        autoE.loginButton.click();
        extentTest.info("Giris yap butonuna basildi");
        // 8. 'E-postanız veya şifreniz yanlış!' hatasını doğrulayın. görünür
        Assert.assertTrue(autoE.emailPasswordWrong.isDisplayed());
        extentTest.pass("Basarili giris yapilamadigi test edildi");
    }
}
