package page;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {
    public Button loginButton = new Button(By.xpath("//img[@src='/Images/design/pagelogin.png']"));

    public Button createUserButton = new Button(By.xpath("//a[@href='javascript:ShowSignup();']"));

    public Button settingsButton = new Button(By.xpath("//a[@href='javascript:OpenSettingsDialog();']"));

    public Button okButton = new Button(By.xpath("/html/body/div[9]/div[2]/div/button[1]"));
}
