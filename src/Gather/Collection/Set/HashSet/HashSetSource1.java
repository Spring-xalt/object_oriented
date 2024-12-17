package Gather.Collection.Set.HashSet;

import java.util.HashSet;

/**
 * 我亦无他，惟手熟尔
 */
//hash值是内存地址转换为10进制的结果(因而具有随机性)
// Tips:左移：<< 表示乘以 ；左移n位，即乘以 2^n (2的n次幂)   右移：表示除以 ； 右移n位，即除以2^n （2的n次幂）
// <<左移乘2 >>右移乘2移位运算更加满足二进制，效率更高   左移【3<<1表示3*2（乘了2的1次方）,4<<2(4*2的2次(即4*2*2))】
                                                // 右移：32 >> 3  等价于 32/(2^3)

/*
    总结：1.底层是hashmap，先得到一个hash值(由内存地址转换)，会转换成一个索引值
         2.找到对应的table表的相应位置，确定是否有相同元素已经在此位置
         3.如果没有则加入，如果有则调用equals方法判断（每个类以后都有可能重写，要仔细分析）


         对于扩容机制：第一次直接将table，临界值时16*0.75（加载因子，安全系数）为12（称为阈值,界）
                    到了12后自动将16扩容2倍至32，新临界值是32*0.75=24，后面以此类推
         在java8中，如果一条链表的长度达到TREEFY_THRESHOLD(8),并且table大小大于MIN_TREEFY_CAPACITY(64),就会进行树化（红黑树），否则依然是数组扩容机制


 */


public class HashSetSource1 {
    @SuppressWarnings("{all}")
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();

        hashSet.add("john");                //第一次add分析完毕
        hashSet.add("tom");
        hashSet.add("john");
        System.out.println("hashSet="+hashSet);
        /*
        1.底层执行hashSet()的构造器：
                                public HashSet() {
                                    map = new HashMap<>();
                                }
        2.执行hashSet里的add（）方法：将传入数据添加到object
                        public boolean add(E e) {                       //E是泛型,e此时已是字符串常量john
                            return map.put(e, PRESENT)==null;           //PRESENT是private static final Object
                        }
        3.执行put()方法，该方法会执行hash(key),返回一个hash值（不是hashCode） 具体算法是：h=key.hashCode()^(h>>>16);避免不同数据碰撞
            public V put(K key,V value){                                    //value和PRESENT是共享的
                return putVal(hash(key)),key,value,false,true);
            }
        4.进入最难的final V putVal()方法
            final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                           boolean evict) {
                Node<K,V>[] tab; Node<K,V> p; int n, i;                     //定义辅助变量
                if ((tab = table) == null || (n = tab.length) == 0)         //table是hashMap的一个数组 Node<>类型,如果table为null或大小为0
                    n = (tab = resize()).length;                            //table为空时，进入此，赋16个长度
                                                                            //将resize值付给tab并返回tab长度(其中resize方法利用缓冲系数完成了经典的缓冲机制)
                    if ((p = tab[i = (n - 1) & hash]) == null)                  //根据key得到hash值，并计算key应该存放hash表的哪个位置,并把这个位置的对象赋给辅助变量p

                        tab[i] = newNode(hash, key, value, null);               //如果p为空，则创建一个Node节点,此时key=john，value=PRESENT;
                                                                                //同时此处传入的hash值，防止与下一个相等

                    else {
                        Node<K,V> e; K k;
                        if (p.hash == hash &&                                   //p指向链表中的一个元素（对象）
                                                                                //如果当前索引位置对应的链表对应的链表第一个元素和准备添加的key的hash值相同(大条件)
                        ((k = p.key) == key || (key != null && key.equals(k))))     //&&之后的表示p要传进来的key和原有的key指向同一个对象(地址相同)
                                                                                    //或者 key与p赋的位置k的内容(内容相同)相同
                                                                                //此处这样设置是为了防止将来传入的数据是类的实例化(对象),那二者的地址一定不同，要判断其内容是否相同
                        e = p;

                                                                                //接着判断p后面是不是红黑树
                                                                                //如果是一颗红黑树就调用treeputVal来进行添加
                        else if (p instanceof TreeNode)
                            e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);         //此处红黑树是数据结构的大boos
                        else {
                            for (int binCount = 0; ; ++binCount) {                      //如果table对应位置已经是一个索引，就用for循环比较
                                                                                            //依次和每个元素比较
                                if ((e = p.next) == null) {                                 //如果都没有，加到链表最后
                                    p.next = newNode(hash, key, value, null);
                                    if (binCount >= TREEIFY_THRESHOLD(8) - 1) // -1 for 1st     //在将对象放在最后后，立即判断链表是否达到8个节点
                                                                                                //达到8个节点后，调用treeifyBin()准备当前链表进行树化
                                                                                                          //细节注意：
                                                                                                          //if(table==null||(n=tab.length)<MIN_TREEFY_CAPACITY(64)){
                                                                                                                     resize();
                                                                                                            }
                                                                                                          //如果上面条件成立，先扩容table
                                                                                                          //扩容机制是对于size而言的
                                                                                                          //只有上面不成立时，才进行树化
                                        treeifyBin(tab, hash);
                                    break;                                                  //如果有相同情况，break
                                }
                                if (e.hash == hash &&
                                    ((k = e.key) == key || (key != null && key.equals(k))))
                                    break;
                                p = e;
                            }
                        }
                    if (e != null) { // existing mapping for key
                        V oldValue = e.value;
                        if (!onlyIfAbsent || oldValue == null)
                            e.value = value;
                        afterNodeAccess(e);
                        return oldValue;
                    }
                }
                ++modCount;
                if (++size > threshold)
                    resize();
                afterNodeInsertion(evict);
                return null;
            }

















        */
    }
}
