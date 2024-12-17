package Gather.Collection.Set.TreeSet;

import java.io.FilterOutputStream;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * 我亦无他，惟手熟尔
 */
//可以排序
public class TreeSet1 {
    public static void main(String[] args) {
        //用无参构造器则仍然是无序的，需要调用comparator方法，重写里面的compare方法
        //TreeSet treeSet = new TreeSet();
        TreeSet treeSet =new TreeSet(new Comparator(){
            @Override
            public int compare(Object o1,Object o2){
                return ((String)o1).compareTo((String)o2);
                //此处可以指定排序规则
                //调用字符串的compareTo方法，比较两个字符串大小
                //字符串比较复习：从第一位开始每一位分别比较ascii码大小
            }
        });
        treeSet.add("hk");
        treeSet.add("aack");
        treeSet.add("tom");
        System.out.println("treeSet="+treeSet);

        //解释：
        /*
        1.把构造器传入比较器对象,赋给了treeset底层的treemap属性
            public TreeMap(Comparator<? super K>comparator){
                   this.comparator=comparator;
            }
        2.再调用treeSet.add()方法时,底层关键点
            cpr即为我们的匿名内部类的对象
            Comparator<? super K> cpr = comparator;
                if (cpr != null) {
                    do {
                            parent = t;
                            cmp = cpr.compare(key, t.key);
                                         // 注意此处会动态绑定到new Comparator()匿名内部类的compare方法
                            if (cmp < 0)
                                t = t.left;
                            else if (cmp > 0)
                                t = t.right;
                            else {       // cmp=0,相等，则不加入
                                V oldValue = t.value;
                                if (replaceOld || oldValue == null) {
                                    t.value = value;
                                }
                                return oldValue;
                            }
                    } while (t != null);            //一直进行t和传进来的数据比较
                }
        */
    }
}
