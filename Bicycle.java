public class Bicycle extends Vehicle {

private int wheels;

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model
                + ", Year: " + year + ", Wheels: " + wheels);
    }
}
