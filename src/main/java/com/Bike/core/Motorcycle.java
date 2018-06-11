package com.Bike.core;
public class Motorcycle extends Bicycle{

    public int gasTank;
    public int motor;

    public Motorcycle (int startGasTank, int startMotor, int startPedalNum, String startWheelShape, int startWheelNum, String startSeatShape){
        super ( startPedalNum,  startWheelShape,  startWheelNum,  startSeatShape);

        gasTank = startGasTank;
        motor = startMotor;
    }


    public void setgasTank(int newValue){
        gasTank = newValue;
    }

    public void setmotor (int newValue){
        motor = newValue;
    }


    public void print(){
        System.out.println("Motorcycle_gasTank: "+ gasTank);
        System.out.println("Motorcycle_motor: "+ motor);
        System.out.println("Motorcycle_pedalNum: "+ pedalNum);
        System.out.println("Motorcycle_wheelShape: "+ wheelShape);
        System.out.println("Motorcycle_wheelNum: "+ wheelNum);
        System.out.println("Motorcycle_seatShape: "+ seatShape);
    }
}
