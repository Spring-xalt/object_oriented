package Final_;
public class final1 {
}



final class a{

}
//  final 修饰的类无法被继承
        // class b extends a{}



class c{
    public final void say(){
        System.out.println("=======");
    }
}
//final 修饰的方法不能被重写
        //class d extends c{ public void say(){} }


//final修饰的实例变量。必须手动赋值
//   final修饰的变量，只能赋一次值