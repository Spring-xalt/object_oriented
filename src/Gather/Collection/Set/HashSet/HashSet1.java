package Gather.Collection.Set.HashSet;

import java.util.HashSet;

/**
 * 我亦无他，惟手熟尔
 */

//实现了Set接口,HashSet实现了HashMap
    /*
    public HashSet{
        map=new HashMap<>();
    }
    */
//HashSet不保证元素有序，取决于hash后，才确定索引结果
public class HashSet1 {
    public static void main(String[] args) {
        HashSet hashset=new HashSet();
        hashset.add("john");//ok
        hashset.add("john");                    //john处 指向常量池的同一地址
        hashset.add(new Dog("jack"));//ok
        hashset.add(new Dog("jack"));       //在堆区创建了两个不同的对象实例（地址）  ????不确定
        System.out.println(hashset);            //[Dog{name='jack'}, john, Dog{name='jack'}]  不保证元素有序（进出一致）


        //经典的面试题
        hashset.add(new String("dzy"));//ok
        hashset.add(new String("dzy"));//加入不了-->看源码具体分析后面会分析
        System.out.println(hashset);
    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}