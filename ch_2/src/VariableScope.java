
public class VariableScope {
    public static void main(StringEx[] args) {
        int v1=15;
        if(v1>10){
            int v2;
            v2=v1-10;
        }
        int v3 = v1 + v2 + 5;
        //에러 발생 : v2는 if안에서만 사용가능 
    }
}
