import java.util.Scanner;

//super class

class Vehicle{

    String make;
    String model;
    int year;
    double rentalPricePerDay;

    public Vehicle(String make, String model, int year, double rentalPricePerDay){
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public double getRentalPricePerDay(){
        return rentalPricePerDay;
    }

    public double calculateRentalCost(int days){

        return rentalPricePerDay*days;

    }

}

//subclass #1

class Car extends Vehicle{
    private int numSeats;
    private int numDoors;

    public Car(String make, String model, int year, double rentalPricePerDay, int numSeats, int numDoors){
        super(make, model, year, rentalPricePerDay);
        this.numSeats = numSeats;
        this.numDoors = numDoors;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public double getRentalPricePerDay(){
        return rentalPricePerDay;
    }

    public int getNumSeats(){
        return numSeats;
    }

    public int getNumDoors(){
        return numDoors;
    }
}

//sublcass #2

class Motorcycle extends Vehicle{
    private int engineSize;

    public int getEngineSize(){
        return engineSize;
    }

    public Motorcycle(String make, String model, int year, double rentalPricePerDay, int engineSize){
        super(make, model, year, rentalPricePerDay);
        this.engineSize = engineSize;
    }
}

public class Inheritance{
    public static void main (String[] args){

        //create instance for both vehicle
        Car car = new Car("Toyota", "Yaris",2021 , 200.00, 5, 4);
        Motorcycle motor = new Motorcycle("Honda", "EX5", 2017, 50.00, 109);

        //initialize day
        int days = 5;

        //Print out car details
        System.out.println("---Car Details---");
        System.out.println("Make:" + car.getMake());
        System.out.println("Model:" + car.getModel());
        System.out.println("Year:" + car.getYear());
        System.out.println("Number of car Seats: " + car.getNumSeats());
        System.out.println("Number of car doors:" + car.getNumDoors());
        System.out.println("Rental price per day: RM" + car.getRentalPricePerDay());
        System.out.println("Total Rental Cost for" + " " + days + " " + "days:" + " " + "RM" + car.calculateRentalCost(days));

        System.out.println();

        //Print out motorcycle details
        System.out.println("---Motorcycle Details---");
        System.out.println("Make:" + motor.getMake());
        System.out.println("Model:" + motor.getModel());
        System.out.println("Year:" + motor.getYear());
        System.out.println("Engine Size: " + motor.getEngineSize() + "cc");
        System.out.println("Rental price per day: RM" + motor.getRentalPricePerDay());
        System.out.println("Total Rental Cost for" + " " + days + " " + "days:" + " " + "RM" + motor.calculateRentalCost(days));

    }


        
}

