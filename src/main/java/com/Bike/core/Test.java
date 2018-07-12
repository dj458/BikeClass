package com.Bike.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public  class Test {
    int gpa;
    String name;
    static String college ="Virginia Tech";//this field get memory only once because of static keyword
    static String faculity="Michale";
    int count=0;//will get memory when instance is created
    static int count2=0;//will get memory only once and retain its value

//static method can access static data member and can change the value of it.
    static void change(){
        college="New College";
    }


    Test(int r,String n){
        gpa = r;
        name = n;
        count++;//instance keyword counter,will not increment according to the number of execution
                //because it will get memory when instance is created
        count2++;//static keyword counter,will increment according to the number of execution
                 //it will get memory only once and retain its value
    }
    void display (){System.out.println(gpa+" "+name+" "+college+faculity+count+count2);}

    //static method no need to create object, if use non static method in main, will cause extra memory
    public static void main(String args[]) {

        //exception in Java
//        int b[]={1,2,3};
//        System.out.println(b[5]);
        // After run the code, the IDE output: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        //	at com.Bike.core.Test.main(Test.java:31)


        //try and catch block
        try {
            int a[] = new int[3];
            System.out.println(a[9]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception throw:............  "+e);
        }

        System.out.println("Out of the block");

        try {
            int a = 0/0;

        }catch (ArithmeticException e){
            System.out.println("ArithmeticException throws........."+e);
        }
        System.out.println("ArithmeticException throws");


        try{
            FileInputStream file1=null;
            throw new FileNotFoundException("FileNotFoundException!");
        }catch (FileNotFoundException f) {
        System.out.println(" FileNotFoundException:....."+f);
        }


        try{
            int k =0/0;
        }catch (Exception g){
            System.out.println("Expection is:....."+g);
        }

        //static keyword test
        Test.change();
        Test tes1= new Test(8,"xu");
        tes1.display();
        Test test2=new Test(100,"Feng");
        tes1.display();;




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

        NewBike myasbtractbike = new NewBike();
        myasbtractbike.setWheelNum();
        myasbtractbike.applyBrake();
        myasbtractbike.makeTurns();

        OldBike a = new OldBike();
        a.setWheelNum();
        a.applyBrake();
        a.applyengine();
        a.applyGas();
        a.privateTest();
    }
}