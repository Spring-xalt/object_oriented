package interface_;

public class Phone implements Usbinterface01 {
    //Phone实现接口,Phone类需要实现usbinterface的方法

    @Override
    public void start() {
        System.out.println("手机开始工作..");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作..");
    }
}
