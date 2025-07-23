package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.junit.jupiter.api.Tag;

@Tag("regression")
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Regression {

}
