import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends AbstractPageTest {
    @Test @Feature("Вход авторизированного пользователя")

    public void logIn () {

        driver.get("http://10.100.21.24/uf-configurator/login");
        LoginPage page = new LoginPage(driver);
        page.logIn();
        Assertions.assertTrue(driver.getTitle().equals("МВД России / Конфигуратор"));
    }



}
