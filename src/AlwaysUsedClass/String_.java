package AlwaysUsedClass;

/**
 * 我亦无他，惟手熟尔
 */
public class String_ {
    public static void main(String[] args) {
        String name="jack";
        //先从常量池中查找是否有“jack”的常量空间，如果有直接指向，如果没有则创建后指向,name最终指向常量池中的空间地址
        String name1=new String("tom");     //略显冗余
        //先在堆中创建空间，里面有value方法，指向常量池中的tom空间，没有则创建，最后指向其地址

        //字符串是不可变的，一旦字符串对象被分配，内容不可变
        String a="hap";     //将常量池中的hap指向a
        a="haha";           //一共创建了两个对象,在常量池中

    }
}