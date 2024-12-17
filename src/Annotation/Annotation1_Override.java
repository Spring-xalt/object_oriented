package Annotation;

/**
 * 我亦无他，惟手熟尔
 */
//注解(也被称为元数据)类似于注释，用于解释数据各种信息，但相比注释，注解可以被编译或运行
//@Target是修饰注解的注解，称为元注解
public class Annotation1_Override {
    //@Override 重写父类方法，只能用于方法,不能修饰类，包，属性等
}
class Father{
    public void fly(){
        System.out.println("Father fly..");
    }
}
class Son extends Father{
    @Override//有没有都可以,表示子类重写了父类的方法
             //其存在意义在于让编译器检查是否完成重写，未完成则编译错误

    public void fly(){
        System.out.println("Son fly..");
    }
    /**eg:
    @Override  //报错
    public void say(){}
    */
}