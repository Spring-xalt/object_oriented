package Homework2;

/**
 * 我亦无他，惟手熟尔
 */
public class Hw3 {
    public static void main(String[] args) {
        A ab=new A("jack");
        ab.B();
    }
}
class A{
    private String name;
    public A(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void B(){
        class B{
            private String name;
            public void showName(){
                System.out.println("内部名字为"+name);;
            }
            public void shouOuterName(){
                A a = new A("dzy");
                System.out.println("外部名字为"+this.name);
            }
        }
    }
}