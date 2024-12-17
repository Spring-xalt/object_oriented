package interface_;

public class Computer {
    public void work(Usbinterface01 usbinterface){
        usbinterface.start();
        usbinterface.stop();
    }
}
