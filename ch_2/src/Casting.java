//강제타입변환
public class Casting {
    public static void main(String[] args) {
        int intvalue = 44032;
        char charvalue = (char)intvalue;
        System.out.println(charvalue);

        long longvalue = 500;
        intvalue = (int)longvalue;
        System.out.println(intvalue);

        double doublevalue = 3.14;
        intvalue = (int)doublevalue;
        System.out.println(intvalue);
    }
}
