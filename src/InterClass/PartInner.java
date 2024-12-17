package InterClass;

/**局部内部类定义在外部类的局部位置
 */

public class PartInner {
    public String logo="外部成员(属性)被调用...";
    public int x=50;
    private void way(){
        System.out.println("外部私有方法被调用...");
    }


    public void getX(){

        //内部类不能添加修饰符，因为内部类本身就是一个局部变量,但可以用final修饰
        class Inner1{

            //局部内部类访问外部成员直接调用，外部类访问内部成员则要创建对象访问
            Inner1 inner =new Inner1();
            final int x=15;
            //作用域仅仅在定义它的方法或代码块中
            String getN(){//局部内部类可以用（外部类名.this.成员） 调用使用外部类成员
                //Other.this本质就是外部类的对象
                final int y=45;//y作用域仅仅在方法内；
                way();
                System.out.println("内部x="+x+"  外部类x="+ PartInner.this.x);
                return logo;
            }
        }
    }


}
