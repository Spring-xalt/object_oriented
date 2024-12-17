package Gather.Collection.List;

import java.util.Collections;
import java.util.LinkedList;

/**
 * 我亦无他，惟手熟尔
 */

//LinkedList底层实现了双向链表和双端队列
    //可以添加任何元素，且元素可以重复，包括null
    //线程不安全，没有实现同步

//LinkedList底层维护了一个一个双向链表
    //维护了一个 first和last属性分别对应首节点和尾节点
    //又在每个节点中维护了prev ，next ，item三个属性，prev指向前一个，next指向后一个，实现双向链表
    //LinkedList中的元素增加与删除不是通过数组实现的，相对效率较高
public class LinkedList1 {
    public static void main(String[] args) {
//        LinkedList linkedList=new LinkedList();
//        linkedList.add("cao");
//        linkedList.add(new Student(20,"dzy"));


        //模拟链表
            //三个节点
            Node jack = new Node("jack");
            Node tom = new Node("tom");
            Node steve = new Node("steve");

            //节点连接,实现双向链表
            jack.next=tom;
            tom.next=steve;

            steve.prev=tom;
            tom.prev=jack;

            //定义头尾
            Node first=jack;
            Node last=steve;


            //遍历数组
            while(first!=null){
                System.out.println(first.item);//输出的是真正存放数据的item
                first=first.next;
            }
    }
}
//class Student{
//    private int age;
//    private String name;
//
//    public Student(int age,String name) {
//        this.age = age;
//        this.name=name;
//    }
//}
//模拟双向链表：定义一个Node类，实例化为对象代表每一个节点
class Node{
    public  Object item;//实际存放对象数据
    public  Node prev;
    public  Node next;

    public Node(Object item) {
        this.item = item;
    }
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", prev=" + prev +
                ", next=" + next +
                '}';
    }
}