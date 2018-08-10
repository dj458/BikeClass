package com.Bike.core;

public class Bicycle extends Bike {
    public int pedalNum;

    public Bicycle (int startPedalNum, String startWheelShape, int startWheelNum, String startSeatShape){
        super (startWheelShape,  startWheelNum,  startSeatShape);
        pedalNum=startPedalNum;
    }

    public void setPedalNum (int newValue){
        pedalNum = newValue;
    }

    public void print(){
        System.out.println("Bicycle_pedalNum: "+ pedalNum);
        System.out.println("Bicycle_wheelShape: "+ wheelShape);
        System.out.println("Bicycle_wheelNum: "+ wheelNum);
        System.out.println("Bicycle_seatShape: "+ seatShape);
        System.out.println(protectedVariable);
        //System.out.println(privateVariable);
    }
}
