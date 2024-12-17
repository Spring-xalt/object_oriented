package Generics;

/**
 * 我亦无他，惟手熟尔
 */
public class CustomGenerics {
    public static void main(String[] args) {
            //调用泛型方法
        BB bb = new BB();
        bb.hi("dzy",100);       //调用时传值时就确定了其类型，赋给了泛型类型
            // String   Integer
    }
}

/*    自定义泛型类
        1.普通成员可以使用泛型作为属性或者方法
        2.泛型数组不能初始化
        3.静态方法不能使用类的泛型
        4.泛型类的类型是在创建类时确定的(没有指定则为object)

*/
class AB<T,K,M>{        //AB即为自定义泛型类,T,K,M为泛型标识符,可以有多个
    T t;
    K k;
    M m;
    //T[] ts=new T[5];          泛型数组不能初始化，实例化
    T[] ts;
//    public static T say(){    静态方法不能使用类的泛型
//        return t;
//    }

    <R> void hi(R r,K k){           //泛型方法在泛型类中
                //泛型方法可以使用自己定义的泛型，也可使用类定义的泛型
    }
    public void go(K k){
        //该方法不是泛型方法，判断是否为泛型方法关键在前面的<>
        //此处只是使用了类定义的泛型
    }
    public AB(T t,K k,M m) {
        this.t = t;
        this.m=m;
        this.k=k;
    }

    public void setT(T t) {     //作为传参属性
        this.t = t;
    }
}
/*
    自定义泛型接口
        静态成员也不能使用泛型
        泛型接口的类型在继承接口或者实现接口时实现
        没有指定类型默认object
* */
interface inter<T ,R>{                  //接口中的方法和属性默认都是公共的,不需要public
    int n=10;                                       //review：接口中的属性都是static final的
    void say();
    default void hi(){
    }
}
class BB implements inter<String ,Integer>{                 //实现接口
    @Override
    public void say() {}
    /*
        泛型方法可以在普通类中，也可以在泛型类中
           R T为泛型，提供给方法使用
    * */
    <R,T> void hi(R r,T t){                           //泛型方法在普通类
        System.out.println(r.getClass()+""+t.getClass());
    }
}
interface inte extends inter<String ,Double>{               //继承接口
    //接口之间的继承不需要实现抽象类
    default <String> void hi(String str){                   //要么抽象类要么普通类+defalut
    }
}