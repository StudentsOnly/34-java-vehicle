## Exercise: Inheritance – Vehicles

#### Objective:

Practice inheritance by creating a hierarchy of vehicle classes.

#### Description:

You should create a set of vehicle classes using inheritance. There should be a base class Vehicle, and two derived classes: Car and Bicycle. The base class Vehicle should have common attributes like brand, model, year, and methods to set these attributes. The derived classes should inherit these attributes and methods and add their own attributes and methods for specific vehicle types.

#### Guidelines:

1. Create a base class Vehicle with the following attributes:
    - String brand
    - String model
    - int year
2. Implement the following methods in the Vehicle class:
    - public void setBrand(String brand) - to set the brand of the vehicle.
    - public void setModel(String model) - to set the model of the vehicle.
    - public void setYear(int year) - to set the year of the vehicle.
    - public void displayInfo() - to display the brand, model, and year of the vehicle.
3. Create a derived class Car that inherits from Vehicle and has the following additional attributes:
    - int doors
4. Implement the following methods in the Car class:
    - Override the displayInfo() method to display the brand, model, year, and number of doors of the car.
5. Create another derived class Bicycle that inherits from Vehicle and has the following additional attributes:
    - int wheels
6. Implement the following methods in the Bicycle class:
    - Override the displayInfo() method to display the brand, model, year, and number of wheels of the bicycle.
7. In the main method, create instances of Car and Bicycle, set their attributes, and display their information.
