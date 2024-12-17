package Abstract_;

public class abstract1 {
    public static void main(String[] args) {
        //抽象类不能被实例化 animal a=new animal();
    }
}
abstract class animal{
    private String name;

    public animal(String name) {
        this.name = name;
    }
    public void say(){//抽象类不一定都要是抽象方法
        System.out.println(1);
    }
    public abstract void eat();
}