package java_0701.exam02;

public class StudentEx {
    public static void main(String[] args) {
        Student student = new Student("홍길동", "010-1234-5678", 1);
        System.out.println("name : " + student.name);
        System.out.println("ssn : " + student.ssn);
        System.out.println("studentNo : " + student.studentNo);
    }
}
