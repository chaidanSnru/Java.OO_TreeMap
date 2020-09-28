import java.util.*;
public class MainApp {
    public static void main(String[] args) {
        Student chaidan = new Student("chaidan");
        Car chaidanCarHonda = new Car("Honda", "Civic", chaidan, "LadyGray");
        Car chaidanCarMazda = new Car("Mazda", "Mazda2", chaidan, "LadyGreen");
        TreeMap<Integer, Float> chaidanGpaMap = new TreeMap<Integer, Float>();
        chaidanGpaMap.put(1, 2.3f);
        chaidanGpaMap.put(2, 2.1f);
        chaidanGpaMap.put(3, 1.92f);
        chaidanGpaMap.put(4, 1.97f);
        chaidanGpaMap.put(1, 2.02f);
        TreeMap<Integer, Vehicle> chaidanVehicleMap = new TreeMap<Integer, Vehicle>();
        chaidanVehicleMap.put(1, chaidanCarHonda);
        chaidanVehicleMap.put(2, chaidanCarMazda);
        chaidan.addGPAMap(chaidanGpaMap);
        chaidan.caculateGPA();
        chaidan.addVehicalMap(chaidanVehicleMap);
        chaidan.rideVehicel();
    }
}
