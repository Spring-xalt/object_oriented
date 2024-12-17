package AlwaysUsedClass;

/**
 * 我亦无他，惟手熟尔
 */
public class StringHomework {
    public static void main(String[] args) {
        String s1="dzy";
        Animal  a=new Animal(s1);
        Animal  b=new Animal(s1);
        System.out.println(a==b);           //f不同对象在堆中的地址不同
        System.out.println(a.equals(b));    //t? --->f
        System.out.println(a.name==b.name); //t
    }
}
class Animal{
    String name;
    public Animal(String name){
        this.name=name;
    }
}