package prWeek8.reflection8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThermostatTest {
    private Thermostat skiiThermostat = new Skii(temp->temp<0,temp->temp+" degrees Celsius.");
    private Thermostat saunaThermostat = new Skii(temp->temp>=80, temp->(temp+273.15)+" degrees Kelvin.");


    @Test
    void testSkii() {
        String message = skiiThermostat.sense(12.3);
        String expected = "12.3 degrees Celsius.";
        Assertions.assertEquals(expected,message);

        message = skiiThermostat.sense(-3.0);
        expected = "Warning!";
        Assertions.assertEquals(expected,message);
    }

    @Test
    void testSauna() {
        String message = saunaThermostat.sense(79.0);
        String expected = "352.15 degrees Kelvin.";
        Assertions.assertEquals(expected,message);

        message = saunaThermostat.sense(80.0);
        expected = "Warning!";
        Assertions.assertEquals(expected,message);
    }
}