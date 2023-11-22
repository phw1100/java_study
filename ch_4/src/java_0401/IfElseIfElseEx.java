package java_0401;

public class IfElseIfElseEx {
    public static void main(String[] args) {
        int score = 75;

        if(score>=90){
            System.out.println("점수가 90~100 이다.");
            System.out.println("등급: A");
        }
        else if(score>=80){
            System.out.println("점수가 80~89 이다.");
            System.out.println("등급: B");
        }
        else if(score>=70){
            System.out.println("점수가 70~79 이다.");
            System.out.println("등급: C");
        }
        else{
            System.out.println("점수가 70 미만이다.");
            System.out.println("등급: D");
        }
    }
}
