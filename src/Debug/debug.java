package Debug;

public class debug {
    public static void main(){
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=i;
            System.out.println("i="+i);
            System.out.println("sum="+sum);
        }
        System.out.println("for结束");
    }
}
