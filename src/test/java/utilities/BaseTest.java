package utilities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

import listeners.ResultListeners;
import listeners.TestListeners;

public class BaseTest {

@ExtendWith({TestListeners.class, ResultListeners.class})
@BeforeEach
public void masterSetup(){
    Logs.info("Setup del padre");

}

@AfterEach
public void masterTearDown(){
    Logs.info("TearDown del padre");
}
}
