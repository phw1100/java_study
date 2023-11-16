public class Long {
    public static void main(StringEx[] args) {
        long var1 = 10; //허용범위 안에 있어 L을 붙이지 않아도 됨
        long var2 = 20L; 
        //long var3 = 10000000000; //컴파일 에러 
        long var4 = 10000000000L;

        System.out.println(var1);
        System.out.println(var2);
        //System.out.println(var3);
        System.out.println(var4);
    }
}
