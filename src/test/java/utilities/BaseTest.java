package utilities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

@BeforeEach
public void masterSetup(){
    Logs.info("Setup del padre");

}

@AfterEach
public void masterTearDown(){
    Logs.info("TearDown del padre");
}
}
