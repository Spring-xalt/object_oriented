package Gather.Collection.PublicMethodBeetwenListAndSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 我亦无他，惟手熟尔
 */

//Iterator对象称为迭代器,仅仅用于遍历collection集合中的元素
    //所有实现了colection接口的集合类都有一个itertor方法，用于返回一个iterator对象，即一个迭代器
    //iterator本身并不存放对象
public class Iterator_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Collection col = new ArrayList();

//        Iterator iterator= col.iterator();//得到一个迭代器
          //执行原理：链表与栈
//        while(iterator.hasNext()){ //判断集合下一个位置是否有元素:(源码)true} if the iteration has more elements
//            iterator.next();      //将指针下移，并返回下移后的集合位置元素
//            System.out.println(iterator.next());
//        }

        //在执行iterator.next()之前要进行hasNext()检验，否则会抛出NoSuchElementException

        col.add(new Book("红楼梦","曹雪芹",10.0));
        col.add(new Book("西游记","吴承恩",120.0));
        col.add(new Book("三国演义","罗贯中",15.2));

//        Iterator iterator=col.iterator();  //col对象调用iterator方法完成遍历
//        System.out.println("col="+col);

//        while(iterator.hasNext()){
//            Object obj=iterator.next();         //col.add方法里传入参数是object的
//            System.out.println("obj=["+obj+"]");
//        }
        /**增强for遍历
        for(元素数据类型 元素名:集合名或数组名){
         System.out.println(元素名);
         }*/
        for(Object obj:col){
            System.out.println(obj);
        }
    }
}
class Book{
    private String bookName;
    private String name;
    private double prices;

    public Book(String bookName,String name,double prices) {
        this.bookName = bookName;
        this.name=name;
        this.prices=prices;
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", name='" + name + '\'' +
                ", prices=" + prices +
                '}';
    }
}