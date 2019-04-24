package inheritance;

public class motorBike extends steeringWheel {
    public motorBike(short numberOfSeats, short numberOfWheels) { // this is the constructor.
        this.setNumberOfSeats(numberOfSeats);
        this.setNumberOfWheels(numberOfWheels);
    }

}