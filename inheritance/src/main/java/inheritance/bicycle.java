package inheritance;

public class bicycle extends steeringWheel {

    public bicycle(short numberOfSeats, short numberOfWheels) { // this is the constructor.
        this.setNumberOfSeats(numberOfSeats);
        this.setNumberOfWheels(numberOfWheels);
    }

    public static void main(String[] args) {
        bicycle bike = new bicycle((short)1, (short)2);
        bike.steer("left");
    }
}
