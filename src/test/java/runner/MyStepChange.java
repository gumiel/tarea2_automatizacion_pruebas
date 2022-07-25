package runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import page.LoginModal;
import page.MainPage;
import page.MenuSection;
import page.SettingModal;
import session.Session;

import java.util.Map;

public class MyStepChange {
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    MenuSection menuSection= new MenuSection();

    SettingModal settingModal = new SettingModal();


    @Given("la pagina {string} este abierta.")
    public void laPaginaEsteAbierta(String url) {
        Session.getInstance().getBrowser().get(url);
    }

    @When("yo quiero realizar el login para cambiar el password")
    public void yoQuieroRealizarElLogin(Map<String,String> credential) {
        mainPage.loginButton.click();
        loginModal.emailTxtBox.writeText(credential.get("email"));
        loginModal.pwdTxtBox.writeText(credential.get("password"));
        loginModal.loginButton.click();
    }

    @Then("yo deberia ingresar a la app web para dar click en Settings")
    public void yoDeberiaIngresarALaAppWebSettings() {

        mainPage.settingsButton.click();
    }

    @Then("yo deberia ingresar el antiguo y nuevo password")
    public void yoDeberiaIngresarAntiguoyNuevoPassword(Map<String,String> credential) throws InterruptedException {

        settingModal.oldPasswordTxtBox.writeText(credential.get("old_password"));
        settingModal.newPasswordTxtBox.writeText(credential.get("new_password"));
        mainPage.okButton.click();

    }

    @Then("cambial el password")
    public void cambiaraPassword() throws InterruptedException {
        if(settingModal.modal.isControlDisplayedWait()){
            System.out.println("Todavia existe modal");
        }else{
            System.out.println("No existe modal");
        }
        Assertions.assertTrue(!settingModal.modal.isControlDisplayedWait(),
                "ERROR el cambio de password");
    }
}
