public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.setBrand("Audi");
        car.setModel("A7");
        car.setYear(2024);
        car.displayInfo();

        bicycle.setBrand("Something");
        bicycle.setModel("T1000");
        bicycle.setYear(3024);
        bicycle.displayInfo();
    }

}
