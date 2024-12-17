package Gather;

/**
 * 我亦无他，惟手熟尔
 */
/*
(1)先判断存储的数据类型(一组对象还是一组键值对);
(2)一组对象：Collection接口：
            1.元素允许重复：List
                a.增删多：LinkedList(底层双向链表)
                b.改查多：ArrayLiat (底层可变数组)
                        //链表和数组对于增删和改查的效率为何不同?
                        //数组时顺序存储，是连续的内存，可以被cpu寄存器缓存


                plus：Vector线程安全
            2.元素不允许重复：Set
                a：无序：HashSet(底层是HashMap,数组+链表+红黑树)
                b：有序：TreeSet
                插入和取出顺序一致：LinkedHashSet(数组+双向链表)
(3)一组键值对：Map
            1.HashMap(底层是哈希表数组链表红黑树)
            2.TreMap
            插入和取出顺序一致：LinkedHashMap
            读取文件Propertiies

* */
public class GatherChoice {
    public static void main(String[] args) {

    }
}
