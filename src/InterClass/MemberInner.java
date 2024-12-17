package InterClass;

public class MemberInner {
    public static void main(String[] args) {
        MemberInner memberInner = new MemberInner();
        memberInner.t1();
    }
    private int n1=10;
    public String name="张三";
    //成员内部类可以用各种修饰符修饰,因为他本身是一个成员
    class Inner01{
        public void say(){
            //可以直接访问访问外部类所有成员，包括私有的；
            System.out.println("Outer01的n1="+n1+"，Outer的name="+name);
        }
    }
    public void t1(){
        Inner01 inner01 = new Inner01();
    }
}
