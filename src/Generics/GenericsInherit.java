package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 我亦无他，惟手熟尔
 */
public class GenericsInherit {
    public static void main(String[] args) {
        Object obj = new String("dzy");

        //泛型不具备继承性
        //List<Object> list=new ArrayList<String>();
        /*
            <?>支持任意类型泛型
            <? extends A>支持A以及A的子类，规定了泛型的上限
            <？ super A> 支持A以及A的父类，规定了泛型的下限
        */


        //list都为空，仅供测试
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AAA> list3 = new ArrayList<>();
        List<BBB> list4 = new ArrayList<>();
        List<CCC> list5 = new ArrayList<>();

        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        //printCollection2();   list1 list2都不可
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list4);

        //printCollection3();   list2 list4 list5都不可
        printCollection3(list3);
        printCollection3(list1);

    }
    public static void printCollection1(List<?> l){
        for(Object obj1:l){
            System.out.println(obj1);
        }
    }
    public static void printCollection2(List<?extends AAA> l){              //AAA以及AAA的子类
        for(Object obj2:l){
            System.out.println(obj2);
        }
    }
    public static void printCollection3(List<?super AAA> l){                //AAA以及AAA的父类
        for(Object obj3:l){
            System.out.println(obj3);
        }
    }
}

//CCC --- BBB --- AAA
class AAA{
}
class BBB extends AAA{
}
class CCC extends BBB{
}