package Throwable.Exception.RuntimeError;

/**
 * 我亦无他，惟手熟尔
 */
//空指针,数学运算,数组越界,类型转换,数字转换

//1.空指针异常 NullPointerException
public class ExceptionExanple5 {
    public static void main(String[] args) {
        //1.
            String name=null;
            System.out.println(name.length());

        //4.
        A a=new B();        //通过向上转型创建了一个 B 类的实例，并将其赋给了 A 类型的引用变量 a(B继承A)
        B b=(B)a;           //通过向下转型将 a 引用强制转换为 B 类型，实际上 a 引用指向的是 B 类的实例
        C c= (C)a;          // a 引用实际上指向的是 B 类的实例，而不是 C 类的实例，
                                // 所以这个转换将在运行时导致 ClassCastException 异常
    }
}
//2.ArithmeticException数学运算异常 eg：1/0

//3.ArrayIndexOutOfBoundsException数组下标越界异常
class AA{
    public void say(){
        int []arr=new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=5;
        }
        for(int i=1;i<6;i++){
            System.out.println(arr[i]);
        }
    }
}

//4.ClassCastException 类型转换异常
class A{
}
class B extends A{
}
class C extends A{
}

//NumberFormatException  数字转换异常:字符串不能转换为组正常的数值类型(使用异常确保输入的是满足条件的数字)
class NumberFormatException{
    public static void main(String[] args) {
        String name ="dzy";         //"1234"则正确
        int num=Integer.parseInt(name);     //抛出异常
    }
}