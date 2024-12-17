package Gather.Collection.Set.HashSet;

/**
 * 我亦无他，惟手熟尔
 */

//HashSet--->HashMap--->数组+链表+红黑树
public class HashSetStructure {
    public static void main(String[] args) {
        //模拟hashmap的底层
        Node[] node=new Node[16];       //Node数组也叫表

        Node john = new Node("john", null);
        Node jack = new Node("jack", null);
        Node jenny = new Node("jenny", null);

        node[2]=john;
        john.next=jack;         //将john结点挂到jack上
        jack.next=jenny;        //将jack挂到jenny上



    }
}
class Node{
    public Object item;//元素实际存放位置
    public Node next;

    public Node(Object item,Node next) {
        this.item = item;
        this.next=next;
    }
}