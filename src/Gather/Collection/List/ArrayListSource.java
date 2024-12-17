package Gather.Collection.List;

import java.util.ArrayList;

/**
 * 我亦无他，惟手熟尔
 */

//ArrayList维护了一个elementData的数组 transient Object[]elementData//transient表示瞬间
    //使用ArrayList创建对象时，如果是无参构造器,elementData初始容量是0，第一次添加时容量为扩容为10，
                                        //如需再次扩容，则1.5倍,每次添加元素都1.5倍
    //使用指定大小的构造器时，elementData初始容量为指定大小，然后(每次添加)要扩容则为1.5倍

public class ArrayListSource {
    public static void main(String[] args) {
        //使用ArrayList创建对象时，如果是无参构造器,elementData初始容量是0，第一次添加时容量为扩容为10，
        //如需再次扩容，则1.5倍,每次添加元素都1.5倍
        ArrayList arrayList = new ArrayList();              //无参构造器

        //protected transient int modCount = 0;// modCount记录对 List 操作的次数
        /*public ArrayList() {
            this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;       //elementData=0；
            }
        */
        for (int i = 1; i <=10; i++) {
            arrayList.add(i);
            //第一次赋值后：   return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];   //括号minCapacity = 1;使得elementData=10;
            //准备第二次之前： 先判断容量是否足够，准备扩容return grow(size + 1);
        }

        for(int i=11;i<=15;i++){
            arrayList.add(i);
        }
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(null);



        //ArrayList arrayList1 = new ArrayList(8);           //指定大小构造器
        //指定大小的构造器则初始大小为指定,接着的每次扩容变为1.5倍
    }
}






