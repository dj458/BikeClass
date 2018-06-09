public class Bike {
    public String wheelShape;
    public int wheelNum;
    public String seatShape;

    public Bike(String startWheelShape, int startWheelNum, String startSeatShape) {

        wheelShape = startWheelShape;
        wheelNum = startWheelNum;
        seatShape = startSeatShape;
    }

    public void setWheelShape(String newValue) {

        wheelShape = newValue;
    }

    public void setwheelNum(int newValue) {

        wheelNum = newValue;
    }

    public void setseatShape(String newValue) {

        seatShape = newValue;
    }

    public void print(){
        System.out.println("Bike_wheelShape: "+ wheelShape);
        System.out.println("Bike_wheelNum: "+ wheelNum);
        System.out.println("Bike_seatShape: "+ seatShape);
    }
    public static Bike generateInstance(){
        return new Bike("square",2,"round");
    }

    public static Bicycle generateBicyle(){
        return new Bicycle(2,"1",2,"adsfadsf");
    }
    public static void doNothing(){
        System.out.print("i am doning nothing");
    }
}
