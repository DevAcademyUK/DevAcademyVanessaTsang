package inheritance;

public class train extends vehicle {

    public train (short numberOfSeats, short numberOfWheels) {
        this.setNumberOfSeats(numberOfSeats);
        this.setNumberOfWheels(numberOfWheels);
    }

    public void steer(String dir) {
        System.out.println("I don't need to do anything " +
                "to turn " + dir + ", I just follow the tracks.");
    }
}
