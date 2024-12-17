package Gather.Map.HashMap;

import java.util.HashMap;

/**
 * 我亦无他，惟手熟尔
 */
//Hashmap是map接口使用频率最高的实现类
//key-val实现数据存储
//key不能重复，但value可以重复允许使用null
//不保证hash值的顺序，因为是以hash表的形式存储的，没有实现同步，线程不安全


    //底层结构和hashset相同
public class HashMapSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        hashMap.put(1,"dzy");
        hashMap.put(2,"zxy");
        hashMap.put(2,"fjm");
        System.out.println("hashMap="+hashMap);

        //1.
        /*
            public HashMap() {
               this.loadFactor = DEFAULT_LOAD_FACTOR; // all other fields defaulted
            }直接先给初始化一个加载因子
            */
        //2.
        /*
            public static Integer valueOf(int i) {
                 if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
                      return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
                  return new Integer(i);
            }
            这段代码的作用是检查一个整数是否在 Integer 对象缓存的范围内，
             以便确定是否可以直接使用缓存中的 Integer 对象，而无需重新创建一个新的对象
            */
        //3.
        /*
            public V put(K key, V value) {
                return putVal(hash(key), key, value, false, true);
            }
            根据hash值获取索引，确定put的对象再table表的位置

        */
        //4.进入putVal方法
        /*
                final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                    boolean evict) {
                    Node<K,V>[] tab; Node<K,V> p; int n, i;                         //添加一些辅助变量
                    if ((tab = table) == null || (n = tab.length) == 0)
                        n = (tab = resize()).length;                                //若tab表长度为0,直接给赋给一个16初始值
                                                                                        （resize扩容机制）
                    if ((p = tab[i = (n - 1) & hash]) == null)                      //如果是空则newNode放在tab表中
                                        (n - 1) & hash 是一种位运算的操作，通常用于计算一个哈希值在数组中的索引位置。
                                        这种操作通常出现在与哈希表相关的数据结构中，例如散列表。
                                        n 是数组的长度，通常是2的幂次方，比如 16、32、64 等。
                                        (n - 1) 将二进制中所有位设置为1，长度为 n 位。这是因为数组的索引是从0到n-1。
                                        & 是位与操作符，它会对两个二进制数的对应位进行与操作。只有在两个相应位都是1的情况下，结果的相应位才为1。
                                        因此，(n - 1) & hash 的结果是将哈希值 hash 映射到数组索引的操作。这是通过将哈希值与 (n - 1) 进行位与操作，
                                        确保结果落在数组索引的有效范围内，即从0到n-1。
                                        这个操作在散列表的实现中经常被使用，可以有效地将哈希值映射到数组的索引位置，实现快速的查找和插入操作
                        tab[i] = newNode(hash, key, value, null);                   //如果是空则newNode放在tab表中
                    else {                                                     //该处集合不是null时的添加操作
                        Node<K,V> e; K k;
                        if (p.hash == hash &&
                                                                                //p指向一个元素
                            ((k = p.key) == key || (key != null && key.equals(k))))
                                                                                //p指向的元素地址相同或者内容相同
                            e = p;
                        else if (p instanceof TreeNode)                                     //判断是否树化了
                            e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);//如果是就调用putTreeval添加元素
                        else {                                                             //若未树化,添加元素的操作
                            for (int binCount = 0; ; ++binCount) {                         //for循环一个个比较
                                if ((e = p.next) == null) {
                                    p.next = newNode(hash, key, value, null);               //下一项为空则p为末尾，新建一个Node节点
                                    if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                        treeifyBin(tab, hash);
                                    break;
                                                                                    //在将对象放在最后后，立即判断链表是否达到8个节点
                                                                                    //链表达到8个节点后，调用treeifyBin()准备当前链表进行树化
                                                                                              //细节注意：
                                                                                              //if(table==null||(n=tab.length)<MIN_TREEFY_CAPACITY(64)){
                                                                                                         resize();              //暂时不树化，先进行扩容
                                                                                                }
                                                                                              //如果上面条件成立，先扩容table
                                                                                              //扩容机制是对于size而言的
                                                                                              //只有上面不成立时，才进行树化
                                }
                                if (e.hash == hash &&
                                    ((k = e.key) == key || (key != null && key.equals(k))))
                                    break;                                                      //同上69到71操作
                                p = e;
                            }
                        }
                        if (e != null) { // existing mapping for key    //若该带你对象为空
                            V oldValue = e.value;                       //把e的值传给oldValue
                            if (!onlyIfAbsent || oldValue == null)      //如果前者为假或者传进阿里的映射值为null
                                e.value = value;                        //即可替换映射值
                            afterNodeAccess(e);
                            return oldValue;
                        }       //查找hash表中给定键位的映射
                    }
                    ++modCount;                         //每增加一个Node，size++；
                    if (++size > threshold)                 //size大于临界值就扩容
                        resize();
                    afterNodeInsertion(evict);
                    return null;
            }

        */
    }
}
