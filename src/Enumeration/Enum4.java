package Enumeration;

/**
 * 我亦无他，惟手熟尔
 */
public class Enum4
{

}
enum BB implements Usb//extends A
{//enum关键字使用后不能再继承其他类，但可以实现接口
   bb("dzy");

    public void say(){
        System.out.println("接口方法被重写..");
    }
    private String name;
    BB(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class A{

}
interface Usb{
    public void say();
}