public class Test {
    public static void main(String args[]) {
        Bike myBike = new Bike("round",2,"square");
        myBike.print();

        Bicycle myBicycle = new Bicycle(3,"square",5,"square");
        myBicycle.print();


        Motorcycle myMotorcycle = new Motorcycle(5,6,9,"round",8,"square");
        myMotorcycle.print();
        //        myBike.generateInstance();


        Bike bike1 = Bike.generateInstance();
        Bike bike2 = Bike.generateInstance();
//        Bike.print()
        Bike.generateBicyle();
        Bike.doNothing();
    }

}