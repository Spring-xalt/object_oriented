package Object_.inherit.exercise;

public class A {
    A(){
        System.out.println("a");
    }
    A(String name){
        System.out.println("a_name");
    }
    public static void main(String[] args) {
        B b=new B();
    }
}
class B extends A{

    B(){
        this("abc");
        System.out.println("b");
    }
    B(String name){
        System.out.println("b_name");
    }
}