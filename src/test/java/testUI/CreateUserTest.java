package testUI;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.CreateModal;
import page.MainPage;
import session.Session;

public class CreateUserTest {

    MainPage mainPage = new MainPage();
    CreateModal createModal = new CreateModal();
    @BeforeEach
    public void goWebApp(){
        Session.getInstance().getBrowser().get("http://todo.ly/");
    }

    @AfterEach
    public void closeWebApp(){
        Session.getInstance().closeSession();
    }

    @Test
    public void verifyCreateUserIsSuccessfully(){
        mainPage.createUserButton.click();
        createModal.fullNameTxtBox.writeText("henry p");
        createModal.emailTxtBox.writeText("prez.gumiel1@gmail.com");
        createModal.passwordTxtBox.writeText("1234567");
        createModal.termsServiceCheckBox.click();

        createModal.createButton.click();

    }
}
