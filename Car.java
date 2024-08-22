public class Car extends Vehicle {
    private int doors = 4;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(", Doors: " + this.doors);
    }
}
