package interface_;

public class Interface04 {
    public static void main(String[] args) {
        //接口中属性的访问方式： 接口名.属性名；
        System.out.println(AB.a);
        System.out.println(AABB.salary);
    }
}
//接口不能继承别的类，但可以继承多个别的接口
interface AB extends AABB{
    public static final int a=1;//同public int a=1;
    public void eat();
}
//public interface AABB{}也可以，接口和类在一个包中地位类似，都只能有一个public,而这修饰符只能是public或者默认
//原因 类似于子类不能缩小父类的访问权限
interface AABB{
    public double salary =1500.0;
    public void drink();
}

class ABC implements AB,AABB{    //一个类可以同时实现多个接口
//alt+enter快捷键
    public void drink(){
        System.out.println("AABB中的抽象方法已被实现");
    }

    @Override
    public void eat() {
        System.out.println("AB中的抽象方法已被实现");
    }
}