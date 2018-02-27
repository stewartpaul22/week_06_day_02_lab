import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;
    private Person person;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if (this.passengerCount() < this.capacity) {
            this.passengers.add(person);
        }
    }

    public void removePassenger() {
        if (this.passengerCount() > 0) {
            this.passengers.remove(0);
        }
    }
}
