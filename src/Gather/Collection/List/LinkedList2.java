package Gather.Collection.List;

import java.util.LinkedList;

/**
 * 我亦无他，惟手熟尔
 */
public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        /*
        1.先进入构造器，再一步步进入父类,接口
            protected transient int modCount = 0;
            transient int size = 0;
        2.此时节点 first=null，last=null
        3.接着添加
            public boolean add(E e){
                linkedList(e);
                return true;
            }
        4.再将新的节点放在末尾
          void linkLast(E e) {
                final Node<E> l = last;
                final Node<E> newNode = new Node<>(l, e, null);
                last = newNode;
                if (l == null)
                    first = newNode;
                else
                    l.next = newNode;
                size++;
                modCount++;
            }


        */

        //增删改查
        linkedList.add("str");
        linkedList.add(10);
        linkedList.add("javk");

        linkedList.remove("str");//linkedList.remove(0);
        System.out.println(linkedList); //[10,javk]

        linkedList.set(1,"jack");
        System.out.println(linkedList);//[10,jack]
        for(Object obj:linkedList){
            System.out.println(obj);//10 [Enter] jack
        }

        System.out.println(linkedList.get(1));//jack
    }
}
