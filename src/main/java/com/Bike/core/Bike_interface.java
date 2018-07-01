package com.Bike.core;

//interface practice:
// interface just have signature of methods
// interface has no data member nor constructor
//can implement multi interfaces
public interface Bike_interface {
        int setTwoWheels();
        void runTheBike();
        void   applyBrake();

}

// if i don't apply all the method from the interface, the IDE will rise error and ask me to use abstract class,
//after I apply all the methods from interface, the error will disappear
 class MyNewBike implements Bike_interface{
    @Override
    public int setTwoWheels() {
        System.out.println("setTwoWheels from interface");
        return 0;
    }

    @Override
    public void runTheBike() {
        System.out.println("runTheBike from interface");
    }

    @Override
    public void applyBrake() {
        System.out.println("appleBrake from interface");
    }
    private void applyOil(){System.out.println(" private Interface appli oil ");}
}

 class MySecondBike implements Bike_interface{
    @Override
    public int setTwoWheels() {
        System.out.println("setTwoWheels from second class implements the interface");
        return 0;
    }

     @Override
     public void runTheBike() {
         System.out.println("runTheBike from second class implements the interface");
     }

     @Override
     public void applyBrake() {
         System.out.println("appleBrake from second class implements the interface");
     }

}