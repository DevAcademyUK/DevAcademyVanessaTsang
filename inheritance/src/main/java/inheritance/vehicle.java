package inheritance;

public class vehicle { // this class holds vehicle information and dose vehicle things like break, accelerate and steer.

    private short numberOfSeats;
    private short numberOfWheels;
    private int speed = 0; // the variable is called 'speed' and it holds numbers.
    private char currentGear = 'N';
    // below is task 03 - Add additional states to the vehicle superclass such as make, model, colour etc.
    private String make;
    private String model;
    private String colour;

    public void changeGears(char newGear) {
        setCurrentGear(newGear);

        System.out.println("Your current gear is " + getCurrentGear()); // this is using the variable of speed.
    }

    /* Activity - Task 02: Add additional functionality to the vehicles - This could be something like changeGear(String dir) that will limit the maximum speed of the vehicle if in too low of a gear.
     * Models vehicle acceleration where the speed will increase depending on the current gear the car is in. If an
     * attempt is made to go faster in a slower gear, the car will not increase speed.
     */
    public void accelerate() { // the name of this method is accelerate.

        if (getCurrentGear() == '1' && getSpeed() < 10) { // This is task 01 - increase the speed by 1mph.
            setSpeed(getSpeed() + 1); // what ever the speed value is increase it by 1. Then it saves that to the speed variable.
        }
        if (getCurrentGear() =='2' && getSpeed() < 20) {
            setSpeed(getSpeed() + 1); // what ever the speed value is increase it by 1. Then it saves that to the speed variable.
        }
        if (getCurrentGear() == '3' && getSpeed() < 30) {
            setSpeed(getSpeed() + 1); // what ever the speed value is increase it by 1. Then it saves that to the speed variable.
        }
        if (getCurrentGear() == '4' && getSpeed() >= 30) {
            setSpeed(getSpeed() + 1); // what ever the speed value is increase it by 1. Then it saves that to the speed variable.
        }

        System.out.println("Your speed is " + getSpeed()); // this is using the varible of speed.
    }

    public void brake() {

        if (getSpeed() > 0) {
            // below is task 01 - decrease the speed by 1mph
            setSpeed(getSpeed() - 1); // what ever the speed value is lower it by 1. Then it saves that to the speed variable.
        }


        System.out.println("Your speed is " + getSpeed()); // this is using the variable of speed.
    }

    public short getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(short numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public short getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(short numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public char getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(char currentGear) {
        this.currentGear = currentGear;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    /*
    * Activity - task 03: Add additional states to the vehicle superclass such as make, model, colour etc.
    * making use of the additional state within the main method.
    * */

    public static void main(String[] args) {
        vehicle v = new vehicle();
        v.setMake("Honda");
        v.setModel("Civic");
        v.setColour("Silver");
        System.out.println("Vehicle info: " + v.getColour() + ", " + v.getMake() + ", " + v.getModel());

        v.changeGears('1');

        for (int i = 0; i < 12; i++) {
            v.accelerate();
        }

        v.changeGears('2');

        for (int i = 0; i < 12; i++) {
            v.accelerate();
        }
    }
}
