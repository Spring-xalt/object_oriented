package Gather.Map.TreeMap;

import java.util.TreeMap;

/**
 * 我亦无他，惟手熟尔
 */
public class TreeMap1 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //默认构造器也是无序的
        TreeMap treeMap = new TreeMap();
        treeMap.put(1,"jack");
        treeMap.put(2,"tom");
        treeMap.put(3,"hk");
        System.out.println("treeMap="+treeMap);

    }
}
