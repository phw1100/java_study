package java_0701.exam06;

public class SportsCar extends Car {
    @Override
    public void speedUp() { speed +=10; }

    //Car의 stop은 final로 정의됨 -> 재정의 불가능
    /*
    @Override
    public void stop() {
        System.out.println("스포츠카를 멈춤.");
        speed = 0;
    }
    */
}
    

