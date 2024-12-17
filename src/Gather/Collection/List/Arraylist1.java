package Gather.Collection.List;

import java.util.ArrayList;

/**
 * 我亦无他，惟手熟尔
 */

public class Arraylist1 {
    @SuppressWarnings({"all"}) //警告看着不爽，所以抑制一下
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        //add(Object o)         添加某个元素(只要是object子类的对象都可以)
        list.add("小龙女");
        list.add(10);
        list.add(1.0);
        list.add(true);
        System.out.println("add之后的list为"+list);
        //remove      删除某个元素
        list.remove("小龙女");
        list.remove(false);
        System.out.println("remove之后的list为"+list);
        //contains    查找某个元素是否存在
        list.contains(10);
        System.out.println("判断10是否存在:"+list.contains(10));
        //size        获取元素个数
        list.size();
        System.out.println("list长度为"+list.size());
        //clear       清空
        list.clear();
        System.out.println("清空后的集合为"+list);
        //addAll      添加多个元素
            ArrayList list2 = new ArrayList();
            list2.add("红楼梦");
            list2.add("三国演义");
        list.addAll(list2);            //传入的是一种集合
        System.out.println("addAll后的集合为"+list);
        //containsALL 查找多个元素是否都存在
        list.containsAll(list2);        //传入的也是集合
        System.out.println("containsAll之后list为的"+list.containsAll(list2));

        //removeALL   删除多个元素
        list.removeAll(list2);
        System.out.println("removeAll之后的集合为"+list.removeAll(list));
    }
}
