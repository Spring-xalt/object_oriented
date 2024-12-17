package Final_;

public class final2{
    public static void main(String[]args){

    }
}

/*
1.一般情况下
 实例变量如果还没有赋值的话，系统会赋默认值
2.final 修饰实例(对象)变量：
 系统不负责赋默认值，要求程序员必须手动赋值，只能赋一次!!
 这个手动赋值，在变量后面赋值可以，在构造方法中赋值也可以
*/


//1
class ab{
    int age;
}
class abtest extends ab{
    public void test(){
        System.out.println("age="+age);
    }
}

class user{
    //错误final int age;

}
