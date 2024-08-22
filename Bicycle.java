public class Bicycle extends Vehicle {
    private int wheels = 2;

    @Override
    public void displayInfo() {
        System.out.println("Type: " + this.getClass().getName() +
                ",\tBrand: " + this.getBrand() +
                ",\tModel: " + this.getModel() +
                ",\tYear: " + this.getYear() +
                ",\tWheels: " + this.wheels);
    }
}
