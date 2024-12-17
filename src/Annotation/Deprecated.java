package Annotation;
/**
 * 我亦无他，惟手熟尔
 */

//@Deprecated用于表示某个程序元素已过时(类，方法，属性,字段，包 等)
    //常用于应用新旧版本兼容
public class Deprecated {
    public static void main(String[] args) {
        A a=new A();
        a.say();
    }
}
@java.lang.Deprecated
//表示元素已经过时，不再推荐使用，但仍然可以使用

class A{
    public int n=110;
    @java.lang.Deprecated
    public void say(){
    }
}