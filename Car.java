public class Car extends Vehicle{

    private int doors;

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model
                + ", Year: " + year + ", Doors: " + doors);
    }
}
