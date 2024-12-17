package Homework2;
/**
 * 我亦无他，惟手熟尔
 */
public class Hw5 {
    public static void main(String[] args) {
        Car1 car1 = new Car1(50);
        car1.get();
        Car1 car2 = new Car1(-10.0);
        car2.get();
        Car1 car3 = new Car1(20);
        car3.get();
    }
}
class Car1{
    private double temperature;

    public Car1(double temperature) {
        this.temperature = temperature;
    }
    public void get()
    {
        class Air {
            public void flow() {
                if (temperature > 40.0) {
                    System.out.println("吹冷风...");
                } else if (temperature < 0.0) {
                    System.out.println("吹热风...");
                } else {
                    System.out.println("关空调...");
                }
            }
        }
    }
}