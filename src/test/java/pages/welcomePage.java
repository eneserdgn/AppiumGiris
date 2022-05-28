package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;


public class welcomePage {

    By icon = By.id("com.faladdin.app:id/imgIcon");
    By txt_Title = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Welcome\")");
    By txt_TitleDesc = By.id("com.faladdin.app:id/welcomeInfo");
    By btn_Explore = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.faladdin.app:id/getStartedButton\")");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public welcomePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkAppOpen() {
        elementHelper.checkElementPresence(icon);
    }

    public void checkFaladdinIcon() {
        elementHelper.checkElementPresence(icon);
    }

    public void checkTitle(String title) {
        elementHelper.checkElementText(txt_Title, title);
    }

    public void checkTitleDescription(String titleDesc) {
        elementHelper.checkElementText(txt_TitleDesc, titleDesc);
    }

    public void checkButtonName(String btn) {
        elementHelper.checkElementText(btn_Explore, btn);
    }

    public void clickButtonName() {
        elementHelper.click(btn_Explore);
    }


}
