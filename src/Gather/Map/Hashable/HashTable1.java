package Gather.Map.Hashable;

import java.util.Hashtable;

/**
 * 我亦无他，惟手熟尔
 */
//存放的元素也是键值对
//hashtable的key和value都不能是null
//使用方法基本和hashmap一样，但是是线程安全的(synchronized)

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1,15);

        ht.put(2,"dzy");
        ht.put(2,"hk");                                                             //替换
        ht.put(3,"null");
        ht.put(4,"null");
        ht.put(5,"null");
        ht.put(6,"null");
        ht.put(7,"null");
        ht.put(8,"null");
        ht.put(9,"null");
        ht.put(10,"null");
        //        ht.put(null,1);异常NullPointerException
        //        ht.put(2,null);异常NullPointerException
        System.out.println("ht="+ht);//[1,15][2,"hk"]
    }
}

        //A$B表示B是A的一个内部类
    //1.底层有Hashtable$Entry[]数组,初始化容量为11, threshold 临界值(阈值)是8(11*0.75)
        /*
         public Hashtable() {
                this(11, 0.75f);
                }
        */
    //2.扩容机制,再存完第8个元素要开始插入第九个元素时触发扩容机制
        /*
        int newCapacity = (oldCapacity << 1) + 1;
        旧的11*2+1；11-->23；
         */

    //plus：判断是否扩容的全过程：
        /*
            public synchronized V put(K key, V value) {
                // Make sure the value is not null
                if (value == null) {                                            //hashtable特有的防止value为null
                    throw new NullPointerException();
                }

                // Makes sure the key is not already in the hashtable.
                Entry<?,?> tab[] = table;
                int hash = key.hashCode();                                      //根据key得到hash值
                int index = (hash & 0x7FFFFFFF) % tab.length;                   //由hash值得到hash表内的索引
                @SuppressWarnings("unchecked")
                Entry<K,V> entry = (Entry<K,V>)tab[index];
                for(; entry != null ; entry = entry.next) {
                    if ((entry.hash == hash) && entry.key.equals(key)) {        //内容与地址均相同
                        V old = entry.value;
                        entry.value = value;
                        return old;
                    }
                }

                addEntry(hash, key, value, index);                          //添加entry节点
                return null;
            }

            private void addEntry(int hash, K key, V value, int index) {
                Entry<?,?> tab[] = table;
                if (count >= threshold) {                                   //若大于阈值，rehash
                    // Rehash the table if the threshold is exceeded
                    rehash();

                    tab = table;                                        //赋表
                    hash = key.hashCode();                              //由key得到哈市值
                    index = (hash & 0x7FFFFFFF) % tab.length;
                }

                // Creates the new entry.
                @SuppressWarnings("unchecked")
                Entry<K,V> e = (Entry<K,V>) tab[index];
                tab[index] = new Entry<>(hash, key, value, e);      //创建新的entry节点
                count++;
                modCount++;
            }

            protected void rehash() {
                int oldCapacity = table.length;
                Entry<?,?>[] oldMap = table;

                // overflow-conscious code
                int newCapacity = (oldCapacity << 1) + 1;               //if(count>threshold)，2倍+1
                if (newCapacity - MAX_ARRAY_SIZE > 0) {
                    if (oldCapacity == MAX_ARRAY_SIZE)
                        // Keep running with MAX_ARRAY_SIZE buckets
                        return;
                    newCapacity = MAX_ARRAY_SIZE;
                }
                Entry<?,?>[] newMap = new Entry<?,?>[newCapacity];

                modCount++;
                threshold = (int)Math.min(newCapacity * loadFactor, MAX_ARRAY_SIZE + 1);
                table = newMap;

                for (int i = oldCapacity ; i-- > 0 ;) {
                    for (Entry<K,V> old = (Entry<K,V>)oldMap[i] ; old != null ; ) {
                        Entry<K,V> e = old;
                        old = old.next;

                        int index = (e.hash & 0x7FFFFFFF) % newCapacity;
                        e.next = (Entry<K,V>)newMap[index];
                        newMap[index] = e;
                    }
                }
            }
        * */