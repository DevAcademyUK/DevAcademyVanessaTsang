package inheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class garage {

    private List<vehicle> vehicles = new ArrayList<>();

    //sorting
    public static Comparator<vehicle> vehicleMakeComparator = new Comparator<vehicle>() {
        @Override
        public int compare(vehicle o1, vehicle o2) {
            String firstVehicleMake = o1.getMake();
            String secondVehicleMake = o2.getMake();

            return firstVehicleMake.compareTo(secondVehicleMake);
        }
    };

    public static Comparator<vehicle> vehicleModelComparator = new Comparator<vehicle>() {
        @Override
        public int compare(vehicle o1, vehicle o2) {
            String firstVehicleModel = o1.getModel();
            String secondVehicleModel = o2.getModel();

            return firstVehicleModel.compareTo(secondVehicleModel);
        }
    };

    public static Comparator<vehicle> vehicleColourComparator = new Comparator<vehicle>() {
        @Override
        public int compare(vehicle o1, vehicle o2) {
            String firstVehicleColour = o1.getColour();
            String secondVehicleColour = o2.getColour();

            return firstVehicleColour.compareTo(secondVehicleColour);
        }
    };

    //adding
    public void addVehicle(vehicle myVehicle) {
        vehicles.add(myVehicle);
        System.out.println("Added vehicle " + myVehicle);
    }

    //viewing all vehicles

    public void viewAllVehicles() {
        System.out.println("Viewing " + vehicles.size() + " vehicles in garage");
        for (int i = 0; i < vehicles.size(); i++) {
            vehicle currentVehicle = vehicles.get(i);
            System.out.println(currentVehicle.getMake() + ", " + currentVehicle.getModel() + ", " + currentVehicle.getColour());
        }
    }

    //sorting methods
    public void sortVehiclesByModel() {
        Collections.sort(vehicles, vehicleModelComparator);
    }

    public void sortVehiclesByMake() {
        Collections.sort(vehicles, vehicleMakeComparator);
    }

    public void sortVehiclesByColour() {
        Collections.sort(vehicles, vehicleColourComparator);
    }

}
