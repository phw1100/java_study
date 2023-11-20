public class CompareOp2 {
    public static void main(String[] args) {
        int v1 = 1;
        double v2 = 1.0;
        System.out.println(v1==v2);

        double v3 = 0.1;
        float v4 = 0.1f; //부동소수점 방식은 0.1을 정확히 표현 불가
        System.out.println(v3==v4);
        System.out.println((float)v3==v4);
    }
}
