package Process_;

/**
 * 我亦无他，惟手熟尔
 */
public class Runnable2 {
    public static void main(String[] args) {            //双线程
        T t1=new T();
        T t2=new T();
        Thread thread = new Thread(t1);
        Thread thread2=new Thread(t2);
        thread.start();
        thread2.start();
        for (int i = 1; i < 6; i++) {
            System.out.println("主线程被调用"+i+"次");
        }
    }
}
class T implements Runnable{
    int count=0;
    @Override
    public void run() {
        while(count<5){
            System.out.println("hi  "+(++count)+"次");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}