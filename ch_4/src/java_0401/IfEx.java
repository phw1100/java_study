package java_0401;

public class IfEx {
    public static void main(String[] args) {
        int score = 93;

        if(score>=90){
            System.out.println("점수가 90보다 크다.");
            System.out.println("등급: A");
        }
        if(score<90){
            System.out.println("점수가 90보다 작다.");
            System.out.println("등급: B");
        }
    }
}
