package interface_;

/**
 初识interface
 */
public class Interface1 {
    public static void main(String[] args) {
        Camera camera=new Camera();
        Phone phone=new Phone();

        Computer comp=new Computer();
        comp.work(phone);
        System.out.println("===");
        comp.work(camera);
    }
}
