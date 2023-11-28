package java_0605;

public class PersonEx {
    public static void main(String[] args) {
        Person p1 = new Person("010-1234-5678", "홍길동");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        //p1.nation="usa";
        //p1.ssn="010-0987-6543";
        p1.name = "홍삼원";
    }
}
