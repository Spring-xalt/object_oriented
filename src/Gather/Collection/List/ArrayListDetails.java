package Gather.Collection.List;

/*
 * 我亦无他，惟手熟尔
 */
import java.util.ArrayList;
//ArrayList允许所有成员加入，包括null，并允许多个null
//利用数组实现数据存储
//ArrayList（效率高）基本等同于Vector，但是线程不安全，多线程基本选择Vector
public class ArrayListDetails {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        //增删改查
        arrayList.add(null);
        arrayList.add("cay");
        arrayList.add(null);
        System.out.println("arrayList="+arrayList);

        arrayList.remove(null);
        System.out.println(arrayList);

        arrayList.set(1,"dzy");
        System.out.println(arrayList);

        arrayList.get(2);
        System.out.println(arrayList.get(2));
    }
}
