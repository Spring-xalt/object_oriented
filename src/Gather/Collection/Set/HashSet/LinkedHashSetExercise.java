package Gather.Collection.Set.HashSet;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * 我亦无他，惟手熟尔
 */
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet lkt = new LinkedHashSet();
        lkt.add(new Car("奥迪",380000.0));
        lkt.add(new Car("梅赛德斯",1000000.0));
        lkt.add(new Car("奥迪",380000.0));
        System.out.println("lkt="+lkt);
    }
}
class Car{
    private String name;
    private double prices;

    public Car(String name,double prices) {
        this.name = name;
        this.prices=prices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(prices, car.prices) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, prices);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", prices=" + prices +
                '}';
    }
}