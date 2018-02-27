import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private ArrayList<Person> passengers;
    private Person person;

    @Before
    public void before() {
        person = new Person();
//        passengers.add(person);
//        passengers.add(person);
//        passengers.add(person);
        bus = new Bus("Edinburgh", 3);
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }

}
