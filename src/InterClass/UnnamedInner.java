package InterClass;

public class UnnamedInner {
    public static void main(String[] args) {
        Outer2 outer2=new Outer2();
        outer2.method();
    }
}
class Outer2{
    private int n1=10;
    public void method(){
        //基于接口的匿名内部类：

        //需求：使用A接口创建对象
        //传统实现接口：创建一个类实现接口，在创建对象使用如下class Tiger，但弊端在于Tiger一直存在，若只用一次，怎么修改？


        //A tiger=new Tiger();//利用多态特性
        //tiger.cry();


        //接口本来不能通过对象实例化
        //我们并没有实例化这个接口的类，便实现了里面的方法，所以称之为匿名内部类
        //其实，这个类是被临时创建了，在内存中存在系统设定的名字


        //tiger的编译类型看左边，为 接口A
        //tiger的运行类型 是匿名内部类（类名未知）（我们注意到等号右边为灰，猜测不是A类）
        //底层实现：
        /*    class XXXX implements A{
                    public void cry(){
                       System.out.println("老虎叫唤...");
                    }
                }
         */
        //XXXX类名实际是"外部类$1",即Outer2$1
                 A tiger=new A() {
                    public void cry(){
                        System.out.println("老虎叫唤...");
                    }
                 };//分号勿忘记
                 tiger.cry();
                 System.out.println("tiger的实际运行类型"+tiger.getClass());//对象.getClass获取对象地址/真正的运行类型


            //father编译类型是Father，运行类型是匿名内部类Outer2$2
            //底层代码：
            /*class Outer2$2 extends Father{

            }
            */
        Father father =new Father("dzy"){//此处不加中括号则是创建了一个father对象
                                                // 加了则是匿名内部类
        };
        System.out.println("father的实际运行类型为"+father.getClass());
    }
            }
            interface A{
                public void cry();
            }

            //class Tiger implements A{
            //    public void cry(){
            //        System.out.println("老虎叫唤....");
            //    }
            //}


//基于类的匿名内部类
class Father{
    public Father(String name){

    }
    public void test(){

    }
}