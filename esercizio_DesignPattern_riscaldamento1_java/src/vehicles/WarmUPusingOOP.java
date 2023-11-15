package vehicles;

import java.util.ArrayList;
import java.util.List;

public class WarmUPusingOOP {
    public static void main(String[] args) {
//        ArrayList<Vehicle> list = new ArrayList<Vehicle>();
//        list.add(new Car());
//        list.add(new Boat());
//        for (Vehicle vehicle : list) {
//            vehicle.move();
//
//
//        }
        List<Vehicle> vehicleList = List.of(new Car(), new Boat());
        vehicleList.forEach(Vehicle::move);
    }
}
