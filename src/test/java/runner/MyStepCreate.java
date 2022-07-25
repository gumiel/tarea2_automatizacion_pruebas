package runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import page.CreateModal;
import page.MainPage;
import page.MenuSection;
import session.Session;

import java.util.Map;

public class MyStepCreate {

    MainPage mainPage = new MainPage();
    CreateModal createModal = new CreateModal();
    MenuSection menuSection= new MenuSection();

    @Given("la pagina {string} este abierta1")
    public void laPaginaEsteAbierta(String url) {
        Session.getInstance().getBrowser().get(url);
    }

    @When("yo quiero realizar la creacion de usuario")
    public void uno(Map<String,String> credential){
        mainPage.createUserButton.click();
        createModal.fullNameTxtBox.writeText(credential.get("full_name"));
        createModal.emailTxtBox.writeText(credential.get("email"));
        createModal.passwordTxtBox.writeText(credential.get("password"));
        createModal.termsServiceCheckBox.click();

        createModal.createButton.click();
    }

    @Then("yo deberia ingresar a la pagina de inicio")
    public void dos(){
        System.out.println("****************"+menuSection.logoutButton.isControlDisplayed()+"*********");
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(), "ERROR el login fallo");
    }

}
