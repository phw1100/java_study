public class VariableUse {
    public static void main(StringEx[] args) {
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시간 " + minute + "분");

        int totalMinute = (hour*60)+minute;
        System.out.println("총 "+totalMinute+"분");
    }
}