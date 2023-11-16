public class VariableExchange {
    public static void main(StringEx[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:" + x + " ,y:" + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x + " ,y:" + y);

    }
}