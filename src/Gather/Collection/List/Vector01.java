package Gather.Collection.List;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Vector;

/**
 * 我亦无他，惟手熟尔
 */
//源码
//public class Vector<E> extends AbstractList<E>
//implements List<E> , RandomAccess,Cloneable, Serializable

    //底层也是一个对象数组 protected Object[] elementData
    //线程安全，Vector的操作方法都有synchronized(同步)来保障线程安全
    //效率不高

public class Vector01 {
    public static void main(String[] args) {
        //如果是无参构造器,首次默认为10，接着2倍扩容
        //有参构造器时，如果指定大小，则每次按2倍扩容

        Vector<String> str = new Vector<>();
        //添加元素
        str.add("Sort your shity life");
        str.add("fuck the fucking life");
        str.add("ge");
        str.add("gf");
        System.out.println(str);
        //获取指定元素
        System.out.println(str.get(1));
        //删除指定元素
        str.remove(0);
        System.out.println(str);

        str.add(1,"d");
        System.out.println(str);

        Vector vector=new Vector();
        
    }
}