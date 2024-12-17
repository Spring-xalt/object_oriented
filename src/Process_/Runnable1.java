package Process_;

/**
 * 我亦无他，惟手熟尔
 */

//plus:静态代理的设计模式

//由于java的单继承机制，如果一个类已经继承了某个类，就不能再继承thread类了，所以要使用runnable方法创建进程
public class Runnable1 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        //  dog.start();此时dog直接实现runnable方法，没有实现start无法调用
        Thread thread =new Thread(dog);                         //Thread有一个构造器可以传入实现了runnable接口的类
                                                                    /*public Thread(Runnable target) {
                                                                        this(null, target, "Thread-" + nextThreadNum(), 0);
                                                                    }*/
        thread.start();
        for (int i = 1; i < 11; i++) {
            System.out.println("主线程被第"+i+"次调用");
        }
    }
}
class Dog implements Runnable {
    int left=25;
    @Override
    public void run() {
        while(left>0){
            System.out.println("你还有"+left+"天时间...");
            left--;
            try {
                Thread.sleep(500);                                   //毫秒
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}