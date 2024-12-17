package Homework2;

/**
 * 我亦无他，惟手熟尔
 */
public class Hw4 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Boat());//思考如何不浪费这次传入的交通工具数据
        tang.PassEasyRiver();
        tang.PassHardRiver();
    }
}
class Person{
    private String name;
    private Vehicles vehicles;        //此处vehicles 注意用接口型的变量
    public Person(String name, Vehicles vehicles) {//创建人的时候传入一个交通工具，再和后来的工具做一个判断
        this.name = name;
        this.vehicles=vehicles;
    }
    public void PassHardRiver(){        //对应于河流湍急
        Boat boat = VehiclesFactory.getBoat();
        if(vehicles instanceof Boat){
            boat.work();
        }

    }
    public void PassEasyRiver(){        //对应于河流平静
       Horse horse=VehiclesFactory.getHorse();
       if(vehicles instanceof Horse){
           horse.work();
       }

    }
}
interface Vehicles{
    public String work();
}
class Horse  extends VehiclesFactory implements Vehicles{
    @Override
    public String  work() {
        System.out.println("河水平静时骑马过河");
        return "horse";
    }
}
class Boat extends VehiclesFactory implements Vehicles{
    @Override
    public String  work() {
        System.out.println("河水湍急时坐船过河");
        return "boat";
    }
}
class VehiclesFactory{

    public static Horse getHorse(){
        return new Horse();
    }
    public static Boat getBoat(){
        return new Boat();
    }
}