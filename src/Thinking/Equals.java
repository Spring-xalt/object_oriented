package Thinking;

/**
 * 我亦无他，惟手熟尔
 */
public class Equals {
    public static void main(String[] args) {


        Student stu1 = new Student(20);
        Student stu2= new Student(20);
        System.out.println(stu1.equals(stu2));
                    //在没有重写的情况下，即使内容相同，stu1和stu2分别存在堆区的不同位置(地址),false
        String str1="dzy";
        String str2="dzy";
        System.out.println(str1.equals(str2));
                   /*直接指向常量池的同一位置,对应于if (this == anObject) {
                                                      return true;
                                                  }
                    */
        String str3=new String("hk");
        String str4=new String ("hk");
        System.out.println(str3.equals(str4));
                    //不同地址对应于String equals的第二判断,true
    }
}
class Student{
    private int age;
    public Student(int age) {
        this.age=age;
    }

    public int getAge() {
        return age;
    }
}