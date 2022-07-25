package page;

import control.Button;
import control.CheckBox;
import control.TextBox;
import org.openqa.selenium.By;

public class CreateModal {

    public TextBox fullNameTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));

    public TextBox emailTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));

    public TextBox passwordTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));

    public CheckBox termsServiceCheckBox = new CheckBox(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));

    public Button createButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));

}
