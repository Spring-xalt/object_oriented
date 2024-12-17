package interface_;

public class InterfaceVsInderit {
    public static void main(String[] args) {
        //继承实现小猴子 继承 猴子
        LittleMonkey Wukong=new LittleMonkey("悟空");
        Wukong.say();
        //接口实现小猴子飞，游
        Wukong.fly();
        Wukong.swim();
    }
}
//继承
class Monkey{
    private String name;
    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say(){
        System.out.println(name+"猴子叫...");
    }
}

//核心
class LittleMonkey extends Monkey implements Bird,Fish{
    public LittleMonkey(String name) {
        super(name);
    }
    public void fly(){
        System.out.println(super.getName()+"会飞翔");
    }
    public void swim(){
        System.out.println(super.getName()+"会游泳");
    }
}
//核心

//接口
interface Bird{
    public void fly();
}
interface Fish{
    public void swim();
}

//总结：子类继承父类可以得到父类的相关功能，如果需要拓展功能则需要实现接口
  //eg：你爹有10w，你想要15w，可以继承（继承）10w，然后自己发力拓展功能赚钱（接口）5w