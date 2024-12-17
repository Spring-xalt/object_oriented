package Throwable.Exception.CustomException;

/**
 * 我亦无他，惟手熟尔
 */
public class CustomException {
    public static void main(String[] args) {
        int age=180;
        if(!(age>=1&&age<=100)){
            throw new AgeRangeException("年龄错误");
        }
        System.out.println("信息正确");
    }
}
class AgeRangeException extends RuntimeException{
    public AgeRangeException(String message){   //父类RuntimeException中有
        super(message);                         //message为调用时的提示信息
    }
}
