public class Vehicle {

    protected String brand;
    protected String model;
    protected int year;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model
                + ", Year: " + year);
    }

}
