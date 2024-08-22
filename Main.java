public class Main{

    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.setModel("Carrera");
        car.setBrand("Porsche");
        car.setYear(2020);
        car.setDoors(2);
        car.displayInfo();
        System.out.println();

        bicycle.setModel("All-terrain");
        bicycle.setBrand("KTM");
        bicycle.setYear(2018);
        bicycle.setWheels(2);
        bicycle.displayInfo();
    }

}
