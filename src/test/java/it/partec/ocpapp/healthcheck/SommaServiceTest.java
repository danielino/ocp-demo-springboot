package it.partec.ocpapp.healthcheck;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import it.partec.ocpapp.healthcheck.services.SommaService;

public class SommaServiceTest {

    @Test
    public void sommaIntegerTest() {
        SommaService service = new SommaService();
        assertEquals(30, service.sommaInteger(10, 20));
    }
}