package Gather.Collection.Set.HashSet;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 我亦无他，惟手熟尔
 */

//hashSet的子类底层是linkedhashMap，维护了一个数组+双向链表,用链表维护元素次序，
// 看起来像是有序的，不允许添加重复元素，插入顺序和遍历顺序一致
public class LinkedHashSet1 {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add("dzy");
        set.add("dzy");
        set.add(145);
        set.add(145);
        set.add(new Student("dzy",19));
        set.add(new Student("dzy",19));
        System.out.println("set="+set);
    }


    /*
    源码解读：
    1.先构造器进入
         public LinkedHashSet() {
                super(16, .75f, true);
            }
    2.接着进入底层linkedhashMap
        HashSet(int initialCapacity, float loadFactor, boolean dummy) {
                map = new LinkedHashMap<>(initialCapacity, loadFactor);
            }
    3.接着进入hashSet的扩容机制（未开始）
    HashSet(int initialCapacity, float loadFactor, boolean dummy) {
        map = new LinkedHashMap<>(initialCapacity, loadFactor);
    }
    4.添加第一次时，直接将数组扩容,节点类型时LinkedHashMapEntry
    数组是HashMapNode,存放的数据是LinkedHashMapEntry(数组多态)
    public HashMap(int initialCapacity, float loadFactor) {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal initial capacity: " +
                                               initialCapacity);
        if (initialCapacity > MAXIMUM_CAPACITY)
            initialCapacity = MAXIMUM_CAPACITY;
        if (loadFactor <= 0 || Float.isNaN(loadFactor))
            throw new IllegalArgumentException("Illegal load factor: " +
                                               loadFactor);
        this.loadFactor = loadFactor;
        this.threshold = tableSizeFor(initialCapacity);
    }








     */


}
class Student{
    private String name;
    private int age;

    public Student(String name,int age) {
        this.name = name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}