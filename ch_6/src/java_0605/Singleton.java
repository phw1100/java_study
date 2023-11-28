package java_0605;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){}

    static Singleton getIntance(){
        return singleton;
    }
}
