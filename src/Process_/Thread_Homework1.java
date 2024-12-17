package Process_;

import java.util.Scanner;

/**
 * 我亦无他，惟手熟尔
 */
public class Thread_Homework1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程正在执行中"+i);
        }
        A a=new A();
        Thread th1=new Thread(a);
        th1.start();
        //C c=new C(new A());       此处传入的a必须是同一个对象才能够得以控制(多个线程的锁为同一个才能互相通知)
        C c=new C(a);
        c.start();
    }
}

class A implements Runnable{
    private boolean loop=true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while(loop){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println((int)(Math.random()*100+1));
        }
        System.out.println("a线程退出...");
    }
}
class C extends Thread{
    private A a;                                //引入一个A的对象，通过该对象实现线程之间的通知
    private Scanner s=new Scanner(System.in);
    public C(A a) {
        this.a = a;
    }


    @Override
    public void run() {
        while(true) {
            System.out.println("请输入信息");
            char key = s.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                a.setLoop(false);
                System.out.println("b线程退出...");
                break;
            }
        }
    }
}