package com.Bike.core;

//abstract class can't be instantiated
//An abstract class is used by creating an inheriting subclass that can be instantiated (similar to interface)
//

public abstract class GiantBike {

    abstract void setWheelNum();// if not implement the method, need a abstract keyword
    public void applyBrake(){System.out.println("Abstract class method applyBrake");}
    final public void makeTurns(){System.out.println("Abstract class method(final) makeTurns");}
    //final, no other implementation of this method is allowed, ever
    private void privateTest(){System.out.println("Private class test");}
    private  int a=10;

}

class NewBike extends GiantBike{
    void setWheelNum(){System.out.println("implement the abstract class method setWheelNum");}
    public void applyBrake(){System.out.println("OverRidden the applyBrake method");}
    //int b =a; can't use a because a is private and in different class

}

class OldBike extends GiantBike{
    void setWheelNum(){System.out.println("Second abstract class implement the abstract class method setWheelNum");}
    public void applyBrake(){System.out.println("Second abstract class OverRidden the applyBrake method");}
    public void applyengine(){System.out.println("Apply engine");}
    protected void applyGas(){System.out.println("Apply gas");}
    private void applyOil(){System.out.println("Apply oil");}//can't be accessed in TestForInterview.java class
    public void privateTest(){System.out.println("Private TestForInterview");}
}