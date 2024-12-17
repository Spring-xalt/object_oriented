package InterClass;

public class UnnamedInnerDetails {
    public static void main(String[] args) {
        Outer3 outer3=new Outer3();
        outer3.f1();
    }
}
class Outer3{
    private int n1=90;
    public void f1(){
        Person p=new Person(){
            public void hi(){
                System.out.println("匿名内部类重写了hi方法...");
            }
        };
        p.hi();//动态绑定机制----匿名内部类重写了hi方法...
    }
}
 class Person{
        public void hi(){
            System.out.println("Person 类的hi实现...");
        }
 }