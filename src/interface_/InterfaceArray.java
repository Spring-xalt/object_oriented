package interface_;

public class InterfaceArray {
    public static void main(String[] args) {
        Usb []usb=new Usb[2];
        usb[0]=new Camera_();
        usb[1]=new Ipad_();
        for (int i = 0; i < 2; i++) {
            usb[i].work();
            //子类可以随意调用父类方法（遵守访问权限），父类调用子类特有方法需要向下转型（强制转换），向下转型不一定成功
            //需要instanceof验证，用法   引用类型变量(object) instanceof 类(class)
            //判断前者是否为后者类的对象实例
            if(usb[i]instanceof Camera_){
                ((Camera_)usb[i]).ka();//usb接口内五ka方法，需要强制转换为目标类
            }
        }
    }
}
interface Usb{
    void work();
}
class Camera_ implements Usb{

    public void ka(){
        System.out.println("相机可以照相");
    }

    @Override
    public void work() {
        System.out.println("相机可以工作...");
    }
}
class Ipad_ implements Usb{
    @Override
    public void work() {
        System.out.println("ipad可以工作...");
    }
}