package Gather.Map.MapIn;

import java.util.HashMap;
import java.util.Map;

/**
 * 我亦无他，惟手熟尔
 */
public class MapMethod {
    public static void main(String[] args) {
        //put添加元素
        //get获取元素
        //size获取元素个数
        //containsKey含有某个元素
        //entrySet()获取所有关系
        //values()获取所有值
        Map map1 = new HashMap();

        map1.put(1,null);       //被覆盖
        map1.put(1,1);
        map1.put("dzy","sl");
        map1.put(null,null);

        System.out.println(map1.get(1)); //根据索引key
        map1.remove("dzy");         //根据索引key remove

        System.out.println(map1.containsKey(null));
        System.out.println(map1.size());
        System.out.println(map1.entrySet());
        System.out.println(map1.values());

    }
}
