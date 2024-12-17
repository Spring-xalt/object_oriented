package Generics;

import java.util.ArrayList;

/**
 * 我亦无他，惟手熟尔
 */
public class Gernerics1 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add("aaa");
//        list.add("bbb");
//        list.add("ccc");
//        list.add(111);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println((String)list.get(i));
//                        //将传入的Object对象向下转型，但遇到integer则无法正常运行
//                        //ClassCastException
//            //故引出泛型:不要让他在程序运行后再报错，而在编译时就报失误，防止程序员不小心
//        }


        //源码public class ArrayList<E>  E就是一个泛型 String->E
        ArrayList<String> list=new ArrayList<String>();
        //限制了 ArrayList 集合中存放对象的数据类型只能是 String，当添加一个非 String 对象时，编译器会直接报错。
        // 这样，我们便解决了上面产生的 ClassCastException 异常的问题（这样体现了泛型的类型安全检测机制

        //参数化类型,保证数据类型的安全性
        //保证程序如果在编译时没有发出警告，运行时就不会警告
        //在类声明时用一个标识表示一个类的属性类型，方法返回值类型，参数类型
    }
}
