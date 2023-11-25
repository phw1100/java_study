package java_0603;

public class KoreanEx {
    public static void main(String[] args) {
        Korean k1 = new Korean("박자바","010-1234-5678");
        System.out.println("k1.name : "+k1.name);
        System.out.println("k1.ssn : "+k1.ssn);

        Korean k2 = new Korean("김자바","010-9876-5432");
        System.out.println("k2.name : "+k2.name);
        System.out.println("k2.ssn : "+k2.ssn);
    }
}
