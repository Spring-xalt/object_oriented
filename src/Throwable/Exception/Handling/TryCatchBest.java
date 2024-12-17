package Throwable.Exception.Handling;
import java.util.Scanner;
/**
 * 我亦无他，惟手熟尔
 */

//要求一个用户输入，字符串转换为数字
public class TryCatchBest {
    public static void main(String[] args) {
        int number=0;
        Scanner x=new Scanner(System.in);
        while(true){
            System.out.println("请输入一个数字");
            String str=x.next();
            try{
                number+=Integer.parseInt(str);
                break;
            }catch(ClassCastException e){
                System.out.println("输入错误，请重新输入");
            }
        }
    }
}
