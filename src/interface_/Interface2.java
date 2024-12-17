package interface_;

public interface Interface2 {
    public int x=15;
    //抽象，默认，静态方法都可以，此处默认方法为抽象的（abstract可写可不写）,真正的默认方法需要default
    public void say();      //抽象
    public static void wo(){ //静态
        System.out.println(1);
    }
    public default int i(){  //默认
        return 1;
    }
}

