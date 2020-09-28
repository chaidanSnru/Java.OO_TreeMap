public class Car extends Vehicle{
    Student carOwner;
    String carName;

    public Car(String brand, String model) {
        super(brand, model);
    }

        public Car(String brand, String model, Student owner, String name) {
        super(brand, model);
        carOwner =  owner;
        carName = name;
    }
}
