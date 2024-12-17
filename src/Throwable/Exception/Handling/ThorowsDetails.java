package Throwable.Exception.Handling;

/**
 * 我亦无他，惟手熟尔
 */

//编译异常必须处理，运行时异常不处理则默认throws给jvm处理报错
public class ThorowsDetails {
    public static void main(String[] args) {

    }
    public void f1(){
        //eg:10/0 报数学运算异常
    }
}
//对于父类子类重写时异常的规定:所抛出的异常类型要么和父类一致，要么为父类抛出异常的子类型(子类不能扩大父类的异常类型)
class Aa{
    public void say(){
        int n1=1,n2=0;
        System.out.println(n1/n2);
    }
}
class Bb extends Aa{
    @Override
    public void say(){
        int n1=10,n2=0;
        System.out.println(n1/n2);
    }
}