package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class AutomationExercise {
    public AutomationExercise() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//*[@style='font-size: 16px;']")
    public WebElement product;
    @FindBy (xpath = "//*[text()='All Products']")
    public WebElement allProduct;
    @FindBy (xpath = "(//*[@class='fa fa-shopping-cart'])[2]")
    public WebElement firstviewProduct;
    @FindBy (xpath = "//*[text()='Write Your Review']")
    public WebElement writeYourReview;
    @FindBy (xpath = "//*[@type='text']")
    public WebElement productYourName;
    @FindBy (xpath = "(//*[@type='email'])[1]")
    public WebElement productEmail;
    @FindBy (xpath = "//*[@name='review']")
    public WebElement addReview;
    @FindBy (id = "button-review")
    public WebElement Submit;
    @FindBy (xpath = "//*[@style='font-size: 20px;']")
    public WebElement thankYou;
    @FindBy (xpath = "//*[text()=' Signup / Login']")
    public WebElement sign;
    @FindBy (xpath = "//*[@name='name']")
    public WebElement newName;
    @FindBy (xpath = "(//*[@name='email'])[2]")
    public WebElement newEmail;
    @FindBy (xpath = "//*[text()='Signup']")
    public WebElement signNewUser;
    @FindBy (xpath = "//*[@id='id_gender1']")
    public WebElement title;
    @FindBy (xpath = "//*[text()='Continue']")
    public WebElement contine;
    @FindBy (xpath = "//*[text()=' Logged in as ']")
    public WebElement userDogrulama;
    @FindBy (xpath = "(//*[text()='Add to cart'])[1]")
    public WebElement firstProduct;

    @FindBy (xpath = "(//*[@class='btn btn-default add-to-cart'])[7]")
    public WebElement prductFour;
    @FindBy (xpath = "//*[text()='View Cart']")
    public WebElement viewCart;
    @FindBy (xpath = "//*[text()='Proceed To Checkout']")
    public WebElement sepetGorunumu;
    @FindBy (xpath = "(//*[@class='address_city address_state_name address_postcode'])[1]")
    public WebElement teslimatAdresi;
    @FindBy (xpath = "(//*[@class='address_city address_state_name address_postcode'])[2]")
    public WebElement faturaAdresi;
    @FindBy (xpath = "//*[@class='fa fa-trash-o']")
    public WebElement deleteSimgesi;
    @FindBy (xpath = "(//*[text()='Delete Account'])[2]")
    public WebElement hesapSilindi;
    @FindBy (xpath = "//*[@class='grippy-host']")
    public WebElement iframe;
    @FindBy (xpath = "//*[text()='Login to your account']")
    public WebElement loginAccountTex;
    @FindBy(xpath = "(//*[@class='btn btn-default'])[1]")
    public WebElement loginButton;
    @FindBy(xpath = "(//*[@name='email'])[1]")
    public WebElement emailGiris;
    @FindBy(xpath = "(//*[@name='password'])[1]")
    public WebElement passwordGiris;
    @FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
    public WebElement emailPasswordWrong;




}
