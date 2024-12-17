package Gather.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 我亦无他，惟手熟尔
 */
//ArrayList,Vector,LinkedList
    /*
        ArrayList 底层是可变数组  ，    增删效率低，          改查效率高    线程不安全位未同步
        Vector   底层也是可变数组       增删改查效率比arraylist低         线程安全
        LinkedlIST 双向链表（双端队列）  增删效率高（通过链表）  改查效率低   线程不安全
     */
    /*
    若改查 操作多  用ArrayList
     增删操作多   用LinkedList
     */
    //List集合元素有序，进入顺序与取出顺序相同，且可以重复
    //支持顺序索引
    //每个元素都有序号对应

public class List1 {
    public static void main(String[] args) {
        //List集合元素有序，进入顺序与取出顺序相同，且可以重复
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("jenny");
        //System.out.println("list=" + list);

        //支持顺序索引
        //System.out.println(list.get(2));

        //每个元素都有序号对应



        List list0=new ArrayList();
        list0.add("gun");
        list0.add(111);
        list0.add(1.0);
        //Summary:List三种遍历方式
            //1.利用iterator遍历
            Iterator ite=list0.iterator();
            while(ite.hasNext()){
                Object obj=ite.next();
                System.out.println("obj="+obj);
            }

            //2.增强for
            for(Object obj1:list0){
                System.out.println("obj1="+obj1);
            }

            //3.普通for
            for(int i=0;i<list.size();i++){
                Object obj2=list.get(i);
                System.out.println("obj2="+obj2);
            }
    }
}
