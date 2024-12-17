package Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 我亦无他，惟手熟尔
 */

//泛型也可用于接口  (list)
//T,K,V都不代表值，而是类型
public class Generics2 {
    public static void main(String[] args) {
        Person<String> p=new Person<String>();


        //泛型的实例化
        List<String> list=new ArrayList<String>();
        Iterator<String> it=list.iterator();
    }
}
//在类声明时用一个标识表示一个类的属性类型，方法返回值类型，参数类型
class  Person<E>{

    //此处E究竟时什么类型?未知，在创建Person对象时传入
    E e;                    //一个类的属性类型

    public E say(){         //方法返回值类型
        return e;
    }
    public void say(E e){   //参数类型
    }
}