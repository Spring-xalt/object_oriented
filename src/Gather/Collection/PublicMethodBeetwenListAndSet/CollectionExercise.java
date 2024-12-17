package Gather.Collection.PublicMethodBeetwenListAndSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 我亦无他，惟手熟尔
 */
public class CollectionExercise {
    public static void main(String[] args) {
        Collection list=new ArrayList();
        list.add(new Dog("jack",2));
        list.add(new Dog("jenny",1));

        Iterator iterator= list.iterator();             //list集合调用iterator迭代器
        //System.out.println(list);                     //直接输出集合
        for(Object obj:list){                           //集合内每个元素的类型
            System.out.println(obj);                    //obj
        }
    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name,int age) {
        this.name = name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}