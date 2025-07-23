package principal;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.modelos.Monstruo;
import com.junit.reader.ExcelReader;

import annotations.Regression;
import annotations.Smoke;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class ExcelMonstruoTests {
    private List<Monstruo> listaMonstruo;

    @BeforeEach
    public void setUp() {
        listaMonstruo = ExcelReader.obtenerListaMonstruos();
        
    }

    @Test
    @Regression
    @Smoke
    @Description("Verifica que el primer monstruo tenga el nombre correcto")
    @Severity(SeverityLevel.BLOCKER)
    public void primerTest() {
        final var primerMonstruo = listaMonstruo.get(0);
        Assertions.assertEquals(primerMonstruo.getNombre(), "TOLOSA", "El nombre del primer monstruo no es el esperado");
    }

    @Test
    @Regression
    @Smoke
    @Description("Verifica que la lista de monstruos tenga el número correcto de elementos")
    @Severity(SeverityLevel.CRITICAL)
    public void segundoTest() {
        final var n = listaMonstruo.size();
        Assertions.assertEquals(n, 14, "El numero de monstruos debe ser 14");
    }

    @Test
    @Regression
    @Smoke
    @Description("Verifica que el tercer monstruo tenga el nivel correcto")
    @Severity(SeverityLevel.NORMAL)
    public void tercerTest() {
        final var tercerMonstruo = listaMonstruo.get(2);
        Assertions.assertEquals(tercerMonstruo.getNivel(), 22, "El nivel del tercer monstruo no es el esperado");

    }

    @Test
    @Regression
    @Smoke
    @Description("Verifica que el último monstruo tenga los atributos correctos")
    @Severity(SeverityLevel.MINOR)
    public void cuartoTest() {
        final var ultimoMonstruo = listaMonstruo.get(listaMonstruo.size() - 1);
        Assertions.assertAll(
            () -> Assertions.assertEquals(ultimoMonstruo.getNombre(), "LUCENA", "El nombre del ultimo monstruo no es el esperado"),
            () -> Assertions.assertEquals(ultimoMonstruo.getEdad(), 3, "La edad del ultimo monstruo no es la esperada"),
            () -> Assertions.assertEquals(ultimoMonstruo.getPeso(), 8.57, "El peso del ultimo monstruo no es el esperado"),
            () -> Assertions.assertEquals(ultimoMonstruo.getGenero(), "MACHO", "El genero del ultimo monstruo no es el esperado"),
            () -> Assertions.assertEquals(ultimoMonstruo.getTipo(), "PLANTA", "El tipo del ultimo monstruo no es el esperado"),
            () -> Assertions.assertEquals(ultimoMonstruo.getNivel(), 36, "El nivel del ultimo monstruo no es el esperado")
        );
    }


    @AfterEach
    public void tearDown() {
        
    }
    
}
