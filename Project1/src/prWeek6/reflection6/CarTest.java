package prWeek6.reflection6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private Car car1 = new AutomaticCar("Mercedes");
    private Car car2 = new ManualCar("Audi");

    @Test
    void driveAutomatic() {
        String expected = "Automatic Mercedes";
        String result = car1.drive();
        Assertions.assertEquals(expected,result);
    }

    @Test
    void driveManual() {
        String expected = "Manual Audi";
        String result = car2.drive();
        Assertions.assertEquals(expected,result);
    }
}