package InterClass;

public class StaticInner {
    private int n1=50;
    private static double n2=5.0;

    public static void main(String[] args) {
        Inner inner = new Inner();
        System.out.println(inner.n1);//外部类访问内部类需要创建对象
    }
    static class Inner{
        int n1=10;
        public void getN(){//内部类访问外部类，直接访问
            System.out.println(n2);//staitc 只能访问静态的成员,包含私有的
        }
    }
}
