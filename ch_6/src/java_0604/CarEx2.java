package java_0604;

public class CarEx2 {
    public static void main(String[] args) {
        Car2 myCar = new Car2();
        myCar.keyTurnOn();
        myCar.run();
        int speed = myCar.getSpeed();
        System.out.println("현재 속도: "+speed+"km/h");
    }
}
