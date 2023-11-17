//자동타입변환
public class Promtion {
    public static void main(String[] args) {
        byte bytevalue = 10;
        int intvalue = bytevalue;
        System.out.println("intValue: "+intvalue);

        char charvalue = '가';
        intvalue = charvalue;
        System.out.println("가의 유니코드: "+intvalue);

        intvalue = 50;
        long longvalue = intvalue;
        System.out.println("longValue: "+longvalue);

        longvalue = 100;
        float floatvalue = longvalue;
        System.out.println("floatValue: "+floatvalue);

        floatvalue = 100.5F;
        double doublevalue = floatvalue;
        System.out.println("doubleValue: "+doublevalue);
    }
}
