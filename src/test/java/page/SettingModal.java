package page;

import control.Button;
import control.CheckBox;
import control.Modal;
import control.TextBox;
import org.openqa.selenium.By;

public class SettingModal {

    public TextBox oldPasswordTxtBox = new TextBox(By.id("TextPwOld"));

    public TextBox newPasswordTxtBox = new TextBox(By.id("TextPwNew"));

    public Button okButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));

    public Modal modal = new Modal(By.xpath("/html/body/div[9]"));

}