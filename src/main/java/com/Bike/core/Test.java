package com.Bike.core;
public class Test {
    public static void main(String args[]) {
        Bike myBike = new Bike("round",2,"square");
        myBike.print();

        Bicycle myBicycle = new Bicycle(3,"square",5,"square");
        myBicycle.print();

        Motorcycle myMotorcycle = new Motorcycle(5,6,9,"round",8,"square");
        myMotorcycle.print();

        Bike bike1 = Bike.generateInstance();
        Bike bike2 = Bike.generateInstance();
        Bike.generateBicyle();
        Bike.doNothing();

        //Interface
        MyNewBike mynewbike = new MyNewBike();//instantiate the class that implement the interface
        mynewbike.setTwoWheels();
        mynewbike.runTheBike();
        mynewbike.applyBrake();


        MySecondBike mysecondbike = new MySecondBike();//instantiate the second class that implement the interface
        mysecondbike.setTwoWheels();
        mysecondbike.runTheBike();
        mysecondbike.applyBrake();

        //Abstract class
        //Bike_abstract bikeabstract = new Bike_abstract();  this is error because Bike_abstract is abstract, can't be instantiated

        MyAbstractBike myasbtractbike = new MyAbstractBike();
        myasbtractbike.setWheelNum();
        myasbtractbike.applyBrake();
        myasbtractbike.makeTurns();

        MyAbstractBikeTwo a = new MyAbstractBikeTwo();
        a.setWheelNum();
        a.applyBrake();
        a.applyengine();
        a.applyGas();
        a.privateTest();
    }
}