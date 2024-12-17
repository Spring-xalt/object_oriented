package interface_;

public class Camera implements Usbinterface01 {
    @Override
    public void start() {
        System.out.println("相机开始工作..");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作..");
    }
}
