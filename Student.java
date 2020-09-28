import java.util.*;

public class Student extends Person{
    TreeMap<Integer, Float> studentGpaMap = new TreeMap<Integer, Float>();
    TreeMap<Integer, Vehicle> studentVehicleMap = new TreeMap<Integer, Vehicle>();
    
    public Student(String name) {
        super(name);
    }

    public Student(String name,TreeMap<Integer, Float> gpaMap,TreeMap<Integer, Vehicle> vehicleMap){
        super(name);
        studentGpaMap = gpaMap;
        studentVehicleMap = vehicleMap;
    }

    public void addGPAMap(TreeMap<Integer, Float> gpaMap){
        studentGpaMap = gpaMap;
    }

    public void addVehicalMap(TreeMap<Integer, Vehicle> vehicleMap){
        studentVehicleMap = vehicleMap;
    }

    public void caculateGPA(){
        Float f = 0f;
        Float gpa = 0f;
        System.out.println(personName);
        System.out.println(studentGpaMap);
        for (Map.Entry<Integer, Float> m : studentGpaMap.entrySet())
            f += m.getValue();
        gpa = f/studentGpaMap.size();
        System.out.println("gps = "+gpa.toString());
    }
    
    public void rideVehicel(){
        System.out.println(studentVehicleMap);
        for (Map.Entry<Integer, Vehicle> m : studentVehicleMap.entrySet())
            System.out.println(this.personName+" ride "+ m.getValue().vehicleBrand+m.getValue().vehicleModel);
        
    }
}