package Homework2;

/**
 * 我亦无他，惟手熟尔
 */
public class Hw1 {
    public static void main(String[] args) {
        Car c = new Car();
        Car c2 = new Car(11);
        System.out.println(c);
        System.out.println(c2);
    }
}
class Car{
    double price=10.0;
    static String color="blue" ;
    public String toString (){
        return price+"\t"+color;// c对象时price=9.0，color为red
                                //c2对象时price=传入的11，color为static所以为red
    }
    public Car(){
        this.price=9.0;
        this.color="red";
    }
    public Car(double price){
        this.price=price;
    }
}