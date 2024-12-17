package Gather.Map.MapIn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 我亦无他，惟手熟尔
 */
//Map也可以用迭代器
    //Map.Entry是一个重要的方法，HashMap$Node实现了Map.Entry
public class MapTraverse {
    @SuppressWarnings("all")
    //六种遍历方法
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("邓超","孙俪");
        map.put("王宝强","马蓉");
        map.put("宋晶","马蓉");
        map.put(null,"刘亦菲");
        map.put("鹿晗","关晓彤");

        //第一组：先取出所有的key，再通过key得到value
        Set set=map.keySet();       //Returns a Set view of the keys contained in this map.
            //  (1)增强for
                System.out.println("---第一种方法(Set增强for)---");
                for(Object obj:set){        //把获取了key的set遍历
                    System.out.println(obj+"-"+map.get(obj));       //obj是set集合的每个key，map.get() 是通过键来获取对应value值的常见方法
                }
            //  (2)迭代器
                System.out.println("---第二种方法(Set迭代器)---");
                Iterator iterator=set.iterator();
                while(iterator.hasNext()){
                    Object obj=iterator.next();
                    System.out.println(obj+"-"+map.get(obj));
                }
        //(第二组)EntrySet获取k-v(把node做成entry，放入entrySet)
        Set entrySet =map.entrySet();
                System.out.println("---第三种方法(EntrySet增强for)---");
            //  (1)增强for
                //entrySet中存放的是entry,但是当使用迭代器后，编译类型变成了obj,之后向下转型，entry就可以调用相关方法了
                for(Object entry:entrySet){
                    Map.Entry m=(Map.Entry)entry;           //m是node转换成的
                    System.out.println(m.getKey()+"-"+m.getValue());
                }
            //  (2)迭代器
                Iterator iterator1=entrySet.iterator();
                System.out.println("---第四种方法(EntrySet迭代器)---");
//这相当于第二种方法
//                  while(iterator1.hasNext()){
//                      Object obj1=iterator1.next();
//                       System.out.println(obj1);
//                  }
                while(iterator1.hasNext()) {
                    Object next = iterator1.next();
                    //System.out.println(next.getClass());                //class java.util.HashMap$Node
                    //HashMap$Node实现了Map.Entry,直接将object向下转型转到Map.Entry，有相应的getKey和getValue方法可以使用
                    Map.Entry met = (Map.Entry) next;

                    System.out.println(met.getKey() + "-" + met.getValue());
                }
        //(第三组)
    }
}
