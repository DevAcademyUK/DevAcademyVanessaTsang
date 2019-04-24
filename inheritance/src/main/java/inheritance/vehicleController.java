package inheritance;

import java.util.Scanner;

public class vehicleController {

    private garage garage = new garage();
    private Scanner myScanner = new Scanner(System.in);


    public static void main(String[] args) {
        vehicleController vc = new vehicleController();
        vc.mainMenu();
    }

    private void mainMenu() {
        System.out.println("Select an option (press any other key to exit):");
        System.out.println("1 - View vehicles");
        System.out.println("2 - Create vehicle");
        System.out.println("3 - Sort vehicle");

        int optionChosen = Integer.parseInt(myScanner.nextLine());

        switch (optionChosen) {
            case 1:
                garage.viewAllVehicles();
                mainMenu();
                break;

            case 2:
                createMenu();
                break;

            case 3:
                sortMenu();
                break;

            default:
                break;

        }
    }

    private void createMenu() {
        System.out.println("Choose vehicle to create:");
        System.out.println("1 - Car");
        System.out.println("2 - Bus");
        System.out.println("3 - Truck");
        System.out.println("4 - Train");
        System.out.println("5 - Motorbike");
        System.out.println("6 - Bicycle");
        System.out.println("7 - Return to the main menu");

        int createOptionChosen = Integer.parseInt(myScanner.nextLine());

        switch (createOptionChosen) {
            case 1:
                createCar();
                break;

            case 2:
                createBus();
                break;

            case 3:
                createTruck();
                break;

            case 4:
                createTrain();
                break;

            case 5:
                createMotobike();
                break;

            case 6:
                createBicycle();
                break;

            case 7:
                mainMenu();
                break;
        }
    }

    private void createCar() {
        System.out.println("Enter the make of the vehicle");
        String make = myScanner.nextLine();

        System.out.println("Enter the model of the vehicle");
        String model = myScanner.nextLine();

        System.out.println("Enter the colour of the vehicle");
        String colour = myScanner.nextLine();

        System.out.println("Enter the number of seats");
        int numberOfSeats = Integer.parseInt(myScanner.nextLine());

        System.out.println("Enter the number of wheels");
        int numberOfWheels = Integer.parseInt(myScanner.nextLine());

        car car = new car((short)numberOfSeats, (short)numberOfWheels);
        car.setMake(make);
        car.setModel(model);
        car.setColour(colour);

        garage.addVehicle(car);

        System.out.println("Created and added car to the garage. Going to main menu.");
        mainMenu();
    }

    private void createBus() {
        System.out.println("Enter the make of the vehicle");
        String make = myScanner.nextLine();

        System.out.println("Enter the model of the vehicle");
        String model = myScanner.nextLine();

        System.out.println("Enter the colour of the vehicle");
        String colour = myScanner.nextLine();

        System.out.println("Enter the number of seats");
        int numberOfSeats = Integer.parseInt(myScanner.nextLine());

        System.out.println("Enter the number of wheels");
        int numberOfWheels = Integer.parseInt(myScanner.nextLine());

        bus bus = new bus((short)numberOfSeats, (short)numberOfWheels);
        bus.setMake(make);
        bus.setModel(model);
        bus.setColour(colour);

        garage.addVehicle(bus);

        System.out.println("Created and added bus to the garage. Going to main menu.");
        mainMenu();

    }

    private void createTruck() {
        System.out.println("Enter the make of the vehicle");
        String make = myScanner.nextLine();

        System.out.println("Enter the model of the vehicle");
        String model = myScanner.nextLine();

        System.out.println("Enter the colour of the vehicle");
        String colour = myScanner.nextLine();

        System.out.println("Enter the number of seats");
        int numberOfSeats = Integer.parseInt(myScanner.nextLine());

        System.out.println("Enter the number of wheels");
        int numberOfWheels = Integer.parseInt(myScanner.nextLine());

        truck truck = new truck((short)numberOfSeats, (short)numberOfWheels);
        truck.setMake(make);
        truck.setModel(model);
        truck.setColour(colour);

        garage.addVehicle(truck);

        System.out.println("Created and added truck to the garage. Going to main menu.");
        mainMenu();
    }

    private void createTrain() {
        System.out.println("Enter the make of the vehicle");
        String make = myScanner.nextLine();

        System.out.println("Enter the model of the vehicle");
        String model = myScanner.nextLine();

        System.out.println("Enter the colour of the vehicle");
        String colour = myScanner.nextLine();

        System.out.println("Enter the number of seats");
        int numberOfSeats = Integer.parseInt(myScanner.nextLine());

        System.out.println("Enter the number of wheels");
        int numberOfWheels = Integer.parseInt(myScanner.nextLine());

        train train = new train((short)numberOfSeats, (short)numberOfWheels);
        train.setMake(make);
        train.setModel(model);
        train.setColour(colour);

        garage.addVehicle(train);

        System.out.println("Created and added train to the garage. Going to main menu.");
        mainMenu();    }

    private void createMotobike() {
        System.out.println("Enter the make of the vehicle");
        String make = myScanner.nextLine();

        System.out.println("Enter the model of the vehicle");
        String model = myScanner.nextLine();

        System.out.println("Enter the colour of the vehicle");
        String colour = myScanner.nextLine();

        System.out.println("Enter the number of seats");
        int numberOfSeats = Integer.parseInt(myScanner.nextLine());

        System.out.println("Enter the number of wheels");
        int numberOfWheels = Integer.parseInt(myScanner.nextLine());

        motorBike motorBike = new motorBike((short)numberOfSeats, (short)numberOfWheels);
        motorBike.setMake(make);
        motorBike.setModel(model);
        motorBike.setColour(colour);

        garage.addVehicle(motorBike);

        System.out.println("Created and added bike to the garage. Going to main menu.");
        mainMenu();
    }

    private void createBicycle() {
        System.out.println("Enter the make of the vehicle");
        String make = myScanner.nextLine();

        System.out.println("Enter the model of the vehicle");
        String model = myScanner.nextLine();

        System.out.println("Enter the colour of the vehicle");
        String colour = myScanner.nextLine();

        System.out.println("Enter the number of seats");
        int numberOfSeats = Integer.parseInt(myScanner.nextLine());

        System.out.println("Enter the number of wheels");
        int numberOfWheels = Integer.parseInt(myScanner.nextLine());

        bicycle bicycle = new bicycle((short)numberOfSeats, (short)numberOfWheels);
        bicycle.setMake(make);
        bicycle.setModel(model);
        bicycle.setColour(colour);

        garage.addVehicle(bicycle);

        System.out.println("Created and added bicycle to the garage. Going to main menu.");
        mainMenu();
    }

    public void sortMenu() {
        System.out.println("Choose how to sort the vehicles:");
        System.out.println("1 - By Make");
        System.out.println("2 - By Model");
        System.out.println("3 - By Colour");
        System.out.println("4 - Return to the main menu");

        int sortOptionChosen = Integer.parseInt(myScanner.nextLine());

        switch (sortOptionChosen) {
            case 1:
                garage.sortVehiclesByMake();
                garage.viewAllVehicles();
                mainMenu();
                break;

            case 2:
                garage.sortVehiclesByModel();
                garage.viewAllVehicles();
                mainMenu();
                break;

            case 3:
                garage.sortVehiclesByColour();
                garage.viewAllVehicles();
                mainMenu();
                break;

            case 4:
                mainMenu();
                break;
        }
    }
}

