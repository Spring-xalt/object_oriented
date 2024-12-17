package Gather.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 我亦无他，惟手熟尔
 */

//Set接口是无序的（添加与取出顺序不一致），没有索引
    //不允许重复元素，最多一个null
    //point:和collection接口一样都可以使用迭代器，但由于没有索引，只能增强for

public class SetIntroduction {
    public static void main(String[] args) {
        //不允许重复元素，最多一个null
        //Set接口对象：实现了Set接口的类的对象
        Set set=new HashSet();
        set.add("john");
        set.add("john");
        set.add("jack");
        set.add(null);
        set.add(null);
        //System.out.println(set);//类似于栈 先进后出 的数据结构[null john jack]

        //遍历
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println("obj="+obj);
        }

    }
}
