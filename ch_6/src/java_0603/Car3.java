package java_0603;

public class Car3 {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car3(){

    }
    Car3(String model){
        this(model,"은색",250);
    }
    Car3(String model,String color){
        this(model,color,250);
    }
    Car3(String model,String color,int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}

