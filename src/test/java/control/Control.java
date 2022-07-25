package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import session.Session;

import java.time.Duration;

public class Control {
    protected WebElement control;
    protected By locator;

    public Control(By locator) {
        this.locator = locator;
    }

    protected void findControl() {
        control = Session.getInstance().getBrowser().findElement(locator);
    }

    public void click() {
        this.findControl();
        control.click();

    }

    public boolean isControlDisplayed() {
        try {
            this.findControl();
            return control.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isControlDisplayedWait() {
        try {
            WebDriverWait wait = new WebDriverWait(Session.getInstance().getBrowser(), Duration.ofSeconds(5));
            if(wait.until(ExpectedConditions.alertIsPresent())==null) {
                System.out.println("alert was not present");
                this.findControl();
                return control.isDisplayed();
            }else{
                return false;
            }

        } catch (Exception e) {
            return false;
        }
    }

    public boolean isAlert() throws InterruptedException {
        WebDriver driver = Session.getInstance().getBrowser();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        if(wait.until(ExpectedConditions.alertIsPresent())==null){
            System.out.println("alert was not present");
        }else{
            System.out.println("alert was present");
        }
        return true;
    }

}
