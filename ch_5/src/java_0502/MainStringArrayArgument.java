package java_0502;

public class MainStringArrayArgument {
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("값의 수가 부족함");
            System.exit(0);
        }

        //launch.json에 "args": ["10","20"] 추가

        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println(num1+"+"+num2+"="+result);
    }
}
