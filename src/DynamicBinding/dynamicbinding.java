package DynamicBinding;

public class dynamicbinding {
    public static void main(String[]args){
        A a = new B();              //a 的编译类型是A，运行类型是B
                                    // 1.调用对象属性时，没有动态绑定机制
                                    // 2.调用对象方法时，方法会和对象内存地址/运行类型（等号右边）绑定
        System.out.println(a.sum());//30
        System.out.println(a.sum1());//30
        //属性看编译，方法看运行
        // 对象的属性则不具备多态性
        // 系统总是试图访问它编译时类所定义的属性，而不是它运行时所定义的属性
        System.out.println(a.i);//10
    }
}
class A{
    public int i=10;
    public int sum(){
        return geti()+10;
    }
    public int sum1(){
        return i+10;
    }
    public int geti(){
        return i;
    }
}
class B extends A{
    public int i=20;
//    public int sum(){
//        return geti()+20;
//    }
    public int geti(){
        return i;
    }
    public int sum1(){
        return i+10;
    }
}
