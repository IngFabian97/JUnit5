package principal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.modelos.User;
import com.junit.reader.JsonReader;

import annotations.Regression;
import annotations.Smoke;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import utilities.BaseTest;

public class JsonUserTests extends BaseTest{
    private User user;

    @BeforeEach
    public void setUp() {
        user = JsonReader.leerUsuarioJson();
    }

    @Test
    @Regression
    @Smoke
    @Description("Verifica que el ID del usuario sea mayor que cero")
    @Severity(SeverityLevel.BLOCKER)
    public void primerTest() {
        Assertions.assertTrue(user.getId() > 0, "El ID del usuario debe ser mayor que cero");
    }

    @Test
    @Regression
    @Smoke
    @Description("Verifica que el valor de lng sea el esperado")
    @Severity(SeverityLevel.CRITICAL)
    public void segundoTest() {
        Assertions.assertEquals(user.getAddress().getGeo().getLng(), 71.7478, "El valor de lng no es el esperado");
    }

    @Test
    @Regression
    @Smoke
    @Description("Verifica que el valor de bs sea mayor que 10 caracteres")
    @Severity(SeverityLevel.NORMAL)
    public void tercerTest() {
        System.out.println("El company.bs es: " + user.getCompany().getBs());
        Assertions.assertTrue(user.getCompany().getBs().length()>10, "El valor de bs debe ser mayor que 10");
    }

    @Test
    @Regression
    @Smoke
    @Description("Verifica que el nombre, username, ID y website del usuario sean correctos")
    @Severity(SeverityLevel.MINOR)
    public void cuartoTest() {
        Assertions.assertAll(
            () -> Assertions.assertEquals(user.getName(), "Mrs. Dennis Schulist", "El nombre del usuario no es el esperado"),
            () -> Assertions.assertEquals(user.getUsername(), "Leopoldo_Corkery", "El username del usuario no es el esperado"),
            () -> Assertions.assertEquals(user.getId(), 6, "El ID del usuario no es el esperado"),
            () -> Assertions.assertEquals(user.getWebsite(), "ola.org", "El website del usuario no es el esperado")
        );
    }



}
