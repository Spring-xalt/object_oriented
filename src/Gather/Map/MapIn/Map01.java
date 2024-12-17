package Gather.Map.MapIn;


import java.util.HashMap;
import java.util.Map;

/**
 * 我亦无他，惟手熟尔
 */
//双列集合map   Interface Map:class Hashtable, class HashMap, class TreeMap
        //class Hashtable:class Properties     //class HashMap:class LinkedHashMap

//Map与collection并列，保存具有映射关系的数据：Key-Value(双列)
    //key和value可以是任何引用类型的数据，都会封装到hashmap$Node对象中去
    //key不允许重复，原因在hashmap那里讲过；value可以重复；key和value都可以有null，但key只能由一个，value可以有多个
    //常用String类作为map的key
    //key和value是单项一对一的关系，通过指定的key总能得到value值（键值对应）
public class Map01 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("num1","dzy");
        map.put("num2","hk");

        map.put("num1","lwl");      //覆盖value
        //key不允许重复，原因在hashmap那里讲过；value可以重复；key和value都可以有null，但key只能由一个，value可以有多个
        //key决定hash值大小，由源码只putval收取的是key的hash，hash值不同，索引不同
        //有相同的key，就相当于替换
        //        public V put(K key, V value) {
        //            return putVal(hash(key), key, value, false, true);
        //        }
        map.put(null,null);
        map.put(null,"abs");     //key和value都可以有null，但key只能由一个，value可以有多个
                                    //此时key的null只能有一个，但value会被替换
        map.put(null,null);     //再次用null替换，仍然覆盖

        map.put("num3",null);

        System.out.println("map="+map);
    }
}
