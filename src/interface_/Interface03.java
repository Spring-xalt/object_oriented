package interface_;

public class Interface03 {
    public static void main(String[] args) {
        //接口是抽象的，无法被实例化   IN in=new IN() 错误 ;
    }
}
interface IN{
    //接口中的所有方法都是public的
    //接口中的抽象方法可以不用abstract
    //接口默认方法要default
    public default void say(){
        System.out.println("1");
    }
    public void eat();
}
//普通类实现接口，必须实现接口所有抽象方法
//抽象类则不需要
class INTER implements IN{
    @Override
    public void eat() {
        System.out.println("抽象方法已被实现...");
    }
}
abstract class Abstract{ }